// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.spring.data.cosmos.repository.integration;

import com.azure.cosmos.models.CosmosPatchItemRequestOptions;
import com.azure.cosmos.models.CosmosPatchOperations;
import com.azure.cosmos.models.PartitionKey;
import com.azure.spring.data.cosmos.ReactiveIntegrationTestCollectionManager;
import com.azure.spring.data.cosmos.common.ResponseDiagnosticsTestUtils;
import com.azure.spring.data.cosmos.common.TestConstants;
import com.azure.spring.data.cosmos.config.CosmosConfig;
import com.azure.spring.data.cosmos.core.ReactiveCosmosTemplate;
import com.azure.spring.data.cosmos.domain.Course;
import com.azure.spring.data.cosmos.exception.CosmosAccessException;
import com.azure.spring.data.cosmos.exception.CosmosNotFoundException;
import com.azure.spring.data.cosmos.exception.CosmosPreconditionFailedException;
import com.azure.spring.data.cosmos.repository.TestRepositoryConfig;
import com.azure.spring.data.cosmos.repository.repository.ReactiveCourseRepository;
import com.azure.spring.data.cosmos.repository.support.CosmosEntityInformation;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestRepositoryConfig.class)
public class ReactiveCourseRepositoryIT {

    private static final String COURSE_ID_1 = "1";
    private static final String COURSE_ID_2 = "2";
    private static final String COURSE_ID_3 = "3";
    private static final String COURSE_ID_4 = "4";
    private static final String COURSE_ID_5 = "5";

    private static final String COURSE_NAME_1 = "Course1";
    private static final String COURSE_NAME_2 = "Course2";
    private static final String COURSE_NAME_3 = "Course3";
    private static final String COURSE_NAME_4 = "Course4";
    private static final String COURSE_NAME_5 = "Course5";
    private static final String PATCH_COURSE_NAME_1 = "PathedCourse1";

    private static final String DEPARTMENT_NAME_1 = "Department1";
    private static final String DEPARTMENT_NAME_2 = "Department2";
    private static final String DEPARTMENT_NAME_3 = "Department3";

    private static final Course COURSE_1 = new Course(COURSE_ID_1, COURSE_NAME_1, DEPARTMENT_NAME_3);
    private static final Course COURSE_2 = new Course(COURSE_ID_2, COURSE_NAME_2, DEPARTMENT_NAME_2);
    private static final Course COURSE_3 = new Course(COURSE_ID_3, COURSE_NAME_3, DEPARTMENT_NAME_2);
    private static final Course COURSE_4 = new Course(COURSE_ID_4, COURSE_NAME_4, DEPARTMENT_NAME_1);
    private static final Course COURSE_5 = new Course(COURSE_ID_5, COURSE_NAME_5, DEPARTMENT_NAME_1);

    @ClassRule
    public static final ReactiveIntegrationTestCollectionManager collectionManager = new ReactiveIntegrationTestCollectionManager();

    @Autowired
    private ReactiveCosmosTemplate template;

    @Autowired
    private ReactiveCourseRepository repository;

    @Autowired
    private CosmosConfig cosmosConfig;

    @Autowired
    private ResponseDiagnosticsTestUtils responseDiagnosticsTestUtils;

    private CosmosEntityInformation<Course, ?> entityInformation;

    CosmosPatchOperations patchSetOperation = CosmosPatchOperations
        .create()
        .set("/name", PATCH_COURSE_NAME_1);

    CosmosPatchOperations patchReplaceOperation = CosmosPatchOperations
        .create()
        .replace("/name", PATCH_COURSE_NAME_1);

    CosmosPatchOperations patchRemoveOperation = CosmosPatchOperations
        .create()
        .remove("/name");

    private static final CosmosPatchItemRequestOptions options = new CosmosPatchItemRequestOptions();

    @Before
    public void setUp() {
        collectionManager.ensureContainersCreatedAndEmpty(template, Course.class);
        entityInformation = collectionManager.getEntityInformation(Course.class);
        final Flux<Course> savedFlux = repository.saveAll(Arrays.asList(COURSE_1, COURSE_2,
            COURSE_3, COURSE_4));
        StepVerifier.create(savedFlux).thenConsumeWhile(course -> true).expectComplete().verify();
    }

    @Test
    public void testFindById() {
        final Mono<Course> idMono = repository.findById(COURSE_ID_4);
        StepVerifier.create(idMono).expectNext(COURSE_4).expectComplete().verify();
    }

    @Test
    public void testFindByIdAndPartitionKey() {
        final Mono<Course> idMono = repository.findById(COURSE_ID_4,
            new PartitionKey(entityInformation.getPartitionKeyFieldValue(COURSE_4)));
        StepVerifier.create(idMono).expectNext(COURSE_4).expectComplete().verify();
    }

    @Test
    public void testFindByIdAsPublisher() {
        final Mono<Course> byId = repository.findById(Mono.just(COURSE_ID_1));
        StepVerifier.create(byId).expectNext(COURSE_1).verifyComplete();
    }

    @Test
    public void testFindAllWithSort() {
        final Flux<Course> sortAll = repository.findAll(Sort.by(Sort.Order.desc("name")));
        StepVerifier.create(sortAll).expectNext(COURSE_4, COURSE_3, COURSE_2, COURSE_1).verifyComplete();
    }

    @Test
    public void testFindByIdNotFound() {
        final Mono<Course> idMono = repository.findById("10");
        //  Expect an empty mono as return value
        StepVerifier.create(idMono).expectComplete().verify();
    }

    @Test
    public void testFindByIdAndPartitionKeyNotFound() {
        final Mono<Course> idMono = repository.findById("10",
            new PartitionKey(entityInformation.getPartitionKeyFieldValue(COURSE_1)));
        //  Expect an empty mono as return value
        StepVerifier.create(idMono).expectComplete().verify();
    }

    @Test
    public void testFindAll() {
        final Flux<Course> allFlux = repository.findAll();
        StepVerifier.create(allFlux).expectNextCount(4).verifyComplete();
    }

    @Test
    public void testFindOneShouldFailIfMultipleResultsReturned() {
        final Course course = new Course("unusedId", COURSE_1.getName(), COURSE_1.getDepartment());
        final Mono<Course> saveSecond = repository.save(course);
        StepVerifier.create(saveSecond).expectNext(course).verifyComplete();

        final Mono<Course> find = repository.findOneByName(COURSE_1.getName());
        StepVerifier.create(find).expectError(CosmosAccessException.class).verify();
    }

    @Test
    public void testShouldFindSingleEntity() {
        final Mono<Course> find = repository.findOneByName(COURSE_1.getName());
        StepVerifier.create(find).expectNext(COURSE_1).expectComplete().verify();
    }

    @Test
    public void testShouldReturnEmptyMonoWhenNoResults() {
        final Mono<Course> find = repository.findOneByName("unusedName");
        StepVerifier.create(find).verifyComplete();
    }

    @Test
    public void testInsert() {
        final Mono<Course> save = repository.save(COURSE_5);
        StepVerifier.create(save).expectNext(COURSE_5).verifyComplete();
    }

    @Test
    public void testUpsert() {
        Mono<Course> save = repository.save(COURSE_1);
        StepVerifier.create(save).expectNext(COURSE_1).expectComplete().verify();

        save = repository.save(COURSE_1);
        StepVerifier.create(save).expectNext(COURSE_1).expectComplete().verify();
    }

    @Test
    public void testDeleteByIdWithoutPartitionKey() {
        final Mono<Void> deleteMono = repository.deleteById(COURSE_1.getCourseId());
        StepVerifier.create(deleteMono).expectError(CosmosNotFoundException.class).verify();
    }

    @Test
    public void testDeleteByIdAndPartitionKey() {
        final Mono<Void> deleteMono = repository.deleteById(COURSE_1.getCourseId(),
            new PartitionKey(entityInformation.getPartitionKeyFieldValue(COURSE_1)));
        StepVerifier.create(deleteMono).verifyComplete();

        final Mono<Course> byId = repository.findById(COURSE_ID_1,
            new PartitionKey(entityInformation.getPartitionKeyFieldValue(COURSE_1)));
        //  Expect an empty mono as return value
        StepVerifier.create(byId).verifyComplete();
    }

    @Test
    public void testDeleteByEntity() {
        final Mono<Void> deleteMono = repository.delete(COURSE_4);
        StepVerifier.create(deleteMono).verifyComplete();

        final Mono<Course> byId = repository.findById(COURSE_ID_4);
        //  Expect an empty mono as return value
        StepVerifier.create(byId).expectComplete().verify();
    }

    @Test
    public void testDeleteByIdNotFound() {
        final Mono<Void> deleteMono = repository.deleteById(COURSE_ID_5);
        StepVerifier.create(deleteMono).expectError(CosmosNotFoundException.class).verify();
    }

    @Test
    public void testDeleteByEntityNotFound() {
        final Mono<Void> deleteMono = repository.delete(COURSE_5);
        StepVerifier.create(deleteMono).expectError(CosmosNotFoundException.class).verify();
    }

    @Test
    public void testCountAll() {
        final Mono<Long> countMono = repository.count();
        StepVerifier.create(countMono).expectNext(4L).verifyComplete();
    }

    @Test
    public void testFindByDepartmentIn() {
        final Flux<Course> byDepartmentIn =
            repository.findByDepartmentIn(Collections.singletonList(DEPARTMENT_NAME_2));
        StepVerifier.create(byDepartmentIn).expectNextCount(2).verifyComplete();
    }

    @Test
    public void testFindAllByPartitionKey() {
        final Mono<Course> save = repository.save(COURSE_5);
        StepVerifier.create(save).expectNext(COURSE_5).verifyComplete();

        Flux<Course> findAll = repository.findAll(new PartitionKey(DEPARTMENT_NAME_1));
        //  Since there are two courses with department_1
        final AtomicBoolean courseFound = new AtomicBoolean(false);
        StepVerifier.create(findAll).expectNextCount(2).verifyComplete();
        StepVerifier.create(findAll)
                    .expectNextMatches(course -> {
                        if (course.equals(COURSE_4)) {
                            courseFound.set(true);
                        } else if (course.equals(COURSE_5)) {
                            courseFound.set(false);
                        } else {
                            return false;
                        }
                        return true;
                    })
                    .expectNextMatches(course -> {
                        if (courseFound.get()) {
                            return course.equals(COURSE_5);
                        } else {
                            return course.equals(COURSE_4);
                        }
                    })
                    .verifyComplete();

        findAll = repository.findAll(new PartitionKey(DEPARTMENT_NAME_3));
        //  Since there are two courses with department_3
        StepVerifier.create(findAll).expectNext(COURSE_1).verifyComplete();

        findAll = repository.findAll(new PartitionKey(DEPARTMENT_NAME_2));
        //  Since there are two courses with department_2
        StepVerifier.create(findAll).expectNextCount(2).verifyComplete();
        StepVerifier.create(findAll)
                    .expectNextMatches(course -> {
                        if (course.equals(COURSE_2)) {
                            courseFound.set(true);
                        } else if (course.equals(COURSE_3)) {
                            courseFound.set(false);
                        } else {
                            return false;
                        }
                        return true;
                    })
                    .expectNextMatches(course -> {
                        if (courseFound.get()) {
                            return course.equals(COURSE_3);
                        } else {
                            return course.equals(COURSE_2);
                        }
                    })
                    .verifyComplete();
    }

    @Test
    public void testFindByNameIgnoreCase() {
        final Flux<Course> findResult = repository.findByNameIgnoreCase(COURSE_NAME_1.toLowerCase());
        StepVerifier.create(findResult).expectNext(COURSE_1).verifyComplete();
    }

    @Test
    public void testFindByNameAndDepartmentAllIgnoreCase() {
        final Flux<Course> findResult = repository.findByNameAndDepartmentAllIgnoreCase(
            COURSE_NAME_1.toLowerCase(), DEPARTMENT_NAME_3.toLowerCase());
        StepVerifier.create(findResult).expectNext(COURSE_1).verifyComplete();
    }

    @Test
    public void testFindByNameAndDepartmentOrNameAndDepartment() {
        final Flux<Course> findResult = repository.findByNameAndDepartmentOrNameAndDepartment(
            COURSE_NAME_1, DEPARTMENT_NAME_3, COURSE_NAME_2, DEPARTMENT_NAME_2);
        final Set<Course> courseResultSet = new HashSet<>();
        courseResultSet.add(COURSE_1);
        courseResultSet.add(COURSE_2);
        StepVerifier.create(findResult).expectNextCount(2).thenConsumeWhile(value -> {
            Assertions.assertThat(courseResultSet.contains(value)).isTrue();
            return true;
        }).verifyComplete();
    }

    @Test
    public void testFindByNameOrDepartmentAllIgnoreCase() {
        final Flux<Course> findResult = repository.findByNameOrDepartmentAllIgnoreCase(
            COURSE_NAME_1.toLowerCase(), DEPARTMENT_NAME_3.toLowerCase());
        StepVerifier.create(findResult).expectNext(COURSE_1).verifyComplete();
    }

    @Test
    public void testFindByNameJsonNode() {
        final Flux<JsonNode> findResult = repository.annotatedFindByName(COURSE_NAME_1);
        StepVerifier.create(findResult).consumeNextWith(result -> {
            Assert.assertEquals(result.findValue("courseId").asText(), COURSE_1.getCourseId());
            Assert.assertEquals(result.findValue("name").asText(), COURSE_1.getName());
            Assert.assertEquals(result.findValue("department").asText(), COURSE_1.getDepartment());
        }).verifyComplete();
    }

    @Test
    public void testAnnotatedQueries() {
        Flux<Course> courseFlux = repository.getCoursesWithNameDepartment(COURSE_NAME_1, DEPARTMENT_NAME_3);
        StepVerifier.create(courseFlux).expectNext(COURSE_1).verifyComplete();

        Flux<ObjectNode> courseGroupBy = repository.getCoursesGroupByDepartment();
        StepVerifier.create(courseGroupBy).expectComplete();
        StepVerifier.create(courseGroupBy).expectNextCount(1);
    }

    @Test
    public void testPatchEntitySet() {
        Mono<Course> patch = repository.save(COURSE_ID_1, new PartitionKey(DEPARTMENT_NAME_3), Course.class, patchSetOperation);
        StepVerifier.create(patch).expectNextCount(1).verifyComplete();
        Mono<Course> patchedCourse = repository.findById(COURSE_ID_1);
        StepVerifier.create(patchedCourse).expectNextMatches(course -> course.getName().equals(PATCH_COURSE_NAME_1)).verifyComplete();
    }

    @Test
    public void testPatchEntityReplace() {
        Mono<Course> patch = repository.save(COURSE_ID_2, new PartitionKey(DEPARTMENT_NAME_2), Course.class, patchReplaceOperation);
        StepVerifier.create(patch).expectNextCount(1).verifyComplete();
        Mono<Course> patchedCourse = repository.findById(COURSE_ID_2);
        StepVerifier.create(patchedCourse).expectNextMatches(course -> course.getName().equals(PATCH_COURSE_NAME_1)).verifyComplete();
    }

    @Test
    public void testPatchEntityRemove() {
        Mono<Course> patch = repository.save(COURSE_ID_1, new PartitionKey(DEPARTMENT_NAME_3), Course.class, patchRemoveOperation);
        StepVerifier.create(patch).expectNextCount(1).verifyComplete();
        Mono<Course> patchedCourse = repository.findById(COURSE_ID_1);
        StepVerifier.create(patchedCourse).expectNextMatches(course -> course.getName() == null).verifyComplete();
    }
    @Test
    public void testPatchPreConditionSuccess() {
        options.setFilterPredicate("FROM course a WHERE a.department = '"+DEPARTMENT_NAME_3+"'");
        Mono<Course> patchedCourse = repository.save(COURSE_ID_1, new PartitionKey(DEPARTMENT_NAME_3), Course.class, patchSetOperation, options);
        StepVerifier.create(patchedCourse).expectNextMatches(course -> course.getName().equals(PATCH_COURSE_NAME_1)).verifyComplete();
    }

    @Test
    public void testPatchPreConditionFail() {
        options.setFilterPredicate("FROM course a WHERE a.department = 'dummy'");
        Mono<Course> patchedCourse = repository.save(COURSE_ID_1, new PartitionKey(DEPARTMENT_NAME_3), Course.class, patchSetOperation, options);
        StepVerifier.create(patchedCourse).expectErrorMatches(ex -> ex instanceof CosmosPreconditionFailedException &&
            ((CosmosAccessException) ex).getCosmosException().getStatusCode() == TestConstants.PRECONDITION_FAILED_STATUS_CODE).verify();
    }

    @Test
    public void queryDatabaseWithQueryMetricsEnabled() {
        // Test flag is true
        assertThat(cosmosConfig.isQueryMetricsEnabled()).isTrue();

        // Make sure a query runs
        final Flux<Course> allFlux = repository.findAll();
        StepVerifier.create(allFlux).expectNextCount(4).verifyComplete();

        String queryDiagnostics = responseDiagnosticsTestUtils.getCosmosDiagnostics().toString();
        assertThat(queryDiagnostics).contains("retrievedDocumentCount");
        assertThat(queryDiagnostics).contains("queryPreparationTimes");
        assertThat(queryDiagnostics).contains("runtimeExecutionTimes");
        assertThat(queryDiagnostics).contains("fetchExecutionRanges");
    }

    @Test
    public void queryDatabaseWithIndexMetricsEnabled() {
        // Test flag is true
        assertThat(cosmosConfig.isIndexMetricsEnabled()).isTrue();

        // Make sure a query runs
        final Flux<Course> allFlux = repository.findAll();
        StepVerifier.create(allFlux).expectNextCount(4).verifyComplete();

        String queryDiagnostics = responseDiagnosticsTestUtils.getCosmosDiagnostics().toString();

        assertThat(queryDiagnostics).contains("\"indexUtilizationInfo\"");
        assertThat(queryDiagnostics).contains("\"UtilizedSingleIndexes\"");
        assertThat(queryDiagnostics).contains("\"PotentialSingleIndexes\"");
        assertThat(queryDiagnostics).contains("\"UtilizedCompositeIndexes\"");
        assertThat(queryDiagnostics).contains("\"PotentialCompositeIndexes\"");
    }

    @Test
    public void testFindAllByStreetNotNull() {
        Course TEST_COURSE_TEMP = new Course(COURSE_ID_5, null, DEPARTMENT_NAME_1);
        final Mono<Course> saveFlux = repository.save(TEST_COURSE_TEMP);
        StepVerifier.create(saveFlux).expectNextMatches(course -> {
            if (course.getCourseId().equals(COURSE_ID_5)) {
                return true;
            }
            return false;
        }).verifyComplete();
        final Flux<Course> result = repository.findAllByNameNotNull();
        StepVerifier.create(result)
            .expectNext(COURSE_1)
            .expectNext(COURSE_2)
            .expectNext(COURSE_3)
            .expectNext(COURSE_4).verifyComplete();

    }

    @Test
    public void testCountByStreetNotNull() {
        Course TEST_COURSE_TEMP = new Course(COURSE_ID_5, null, DEPARTMENT_NAME_1);
        final Mono<Course> saveFlux = repository.save(TEST_COURSE_TEMP);
        StepVerifier.create(saveFlux).expectNextMatches(course -> {
            if (course.getCourseId().equals(COURSE_ID_5)) {
                return true;
            }
            return false;
        }).verifyComplete();
        final Mono<Long> result = repository.countByNameNotNull();
        StepVerifier.create(result).expectNext(4L).verifyComplete();
    }
}
