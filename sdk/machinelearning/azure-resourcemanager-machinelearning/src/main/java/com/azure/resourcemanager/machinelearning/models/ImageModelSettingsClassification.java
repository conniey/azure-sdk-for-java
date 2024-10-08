// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Settings used for training the model.
 * For more information on the available settings please visit the official documentation:
 * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
 */
@Fluent
public final class ImageModelSettingsClassification extends ImageModelSettings {
    /*
     * Image crop size that is input to the neural network for the training dataset. Must be a positive integer.
     */
    private Integer trainingCropSize;

    /*
     * Image crop size that is input to the neural network for the validation dataset. Must be a positive integer.
     */
    private Integer validationCropSize;

    /*
     * Image size to which to resize before cropping for validation dataset. Must be a positive integer.
     */
    private Integer validationResizeSize;

    /*
     * Weighted loss. The accepted values are 0 for no weighted loss.
     * 1 for weighted loss with sqrt.(class_weights). 2 for weighted loss with class_weights. Must be 0 or 1 or 2.
     */
    private Integer weightedLoss;

    /**
     * Creates an instance of ImageModelSettingsClassification class.
     */
    public ImageModelSettingsClassification() {
    }

    /**
     * Get the trainingCropSize property: Image crop size that is input to the neural network for the training dataset.
     * Must be a positive integer.
     * 
     * @return the trainingCropSize value.
     */
    public Integer trainingCropSize() {
        return this.trainingCropSize;
    }

    /**
     * Set the trainingCropSize property: Image crop size that is input to the neural network for the training dataset.
     * Must be a positive integer.
     * 
     * @param trainingCropSize the trainingCropSize value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withTrainingCropSize(Integer trainingCropSize) {
        this.trainingCropSize = trainingCropSize;
        return this;
    }

    /**
     * Get the validationCropSize property: Image crop size that is input to the neural network for the validation
     * dataset. Must be a positive integer.
     * 
     * @return the validationCropSize value.
     */
    public Integer validationCropSize() {
        return this.validationCropSize;
    }

    /**
     * Set the validationCropSize property: Image crop size that is input to the neural network for the validation
     * dataset. Must be a positive integer.
     * 
     * @param validationCropSize the validationCropSize value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withValidationCropSize(Integer validationCropSize) {
        this.validationCropSize = validationCropSize;
        return this;
    }

    /**
     * Get the validationResizeSize property: Image size to which to resize before cropping for validation dataset. Must
     * be a positive integer.
     * 
     * @return the validationResizeSize value.
     */
    public Integer validationResizeSize() {
        return this.validationResizeSize;
    }

    /**
     * Set the validationResizeSize property: Image size to which to resize before cropping for validation dataset. Must
     * be a positive integer.
     * 
     * @param validationResizeSize the validationResizeSize value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withValidationResizeSize(Integer validationResizeSize) {
        this.validationResizeSize = validationResizeSize;
        return this;
    }

    /**
     * Get the weightedLoss property: Weighted loss. The accepted values are 0 for no weighted loss.
     * 1 for weighted loss with sqrt.(class_weights). 2 for weighted loss with class_weights. Must be 0 or 1 or 2.
     * 
     * @return the weightedLoss value.
     */
    public Integer weightedLoss() {
        return this.weightedLoss;
    }

    /**
     * Set the weightedLoss property: Weighted loss. The accepted values are 0 for no weighted loss.
     * 1 for weighted loss with sqrt.(class_weights). 2 for weighted loss with class_weights. Must be 0 or 1 or 2.
     * 
     * @param weightedLoss the weightedLoss value to set.
     * @return the ImageModelSettingsClassification object itself.
     */
    public ImageModelSettingsClassification withWeightedLoss(Integer weightedLoss) {
        this.weightedLoss = weightedLoss;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withAmsGradient(Boolean amsGradient) {
        super.withAmsGradient(amsGradient);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withAdvancedSettings(String advancedSettings) {
        super.withAdvancedSettings(advancedSettings);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withAugmentations(String augmentations) {
        super.withAugmentations(augmentations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withBeta1(Float beta1) {
        super.withBeta1(beta1);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withBeta2(Float beta2) {
        super.withBeta2(beta2);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withCheckpointFrequency(Integer checkpointFrequency) {
        super.withCheckpointFrequency(checkpointFrequency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withCheckpointRunId(String checkpointRunId) {
        super.withCheckpointRunId(checkpointRunId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withCheckpointModel(MLFlowModelJobInput checkpointModel) {
        super.withCheckpointModel(checkpointModel);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withDistributed(Boolean distributed) {
        super.withDistributed(distributed);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withEarlyStopping(Boolean earlyStopping) {
        super.withEarlyStopping(earlyStopping);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withEarlyStoppingDelay(Integer earlyStoppingDelay) {
        super.withEarlyStoppingDelay(earlyStoppingDelay);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withEarlyStoppingPatience(Integer earlyStoppingPatience) {
        super.withEarlyStoppingPatience(earlyStoppingPatience);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withEvaluationFrequency(Integer evaluationFrequency) {
        super.withEvaluationFrequency(evaluationFrequency);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withEnableOnnxNormalization(Boolean enableOnnxNormalization) {
        super.withEnableOnnxNormalization(enableOnnxNormalization);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withGradientAccumulationStep(Integer gradientAccumulationStep) {
        super.withGradientAccumulationStep(gradientAccumulationStep);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withLayersToFreeze(Integer layersToFreeze) {
        super.withLayersToFreeze(layersToFreeze);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withLearningRate(Float learningRate) {
        super.withLearningRate(learningRate);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withLearningRateScheduler(LearningRateScheduler learningRateScheduler) {
        super.withLearningRateScheduler(learningRateScheduler);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withModelName(String modelName) {
        super.withModelName(modelName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withMomentum(Float momentum) {
        super.withMomentum(momentum);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withNesterov(Boolean nesterov) {
        super.withNesterov(nesterov);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withNumberOfEpochs(Integer numberOfEpochs) {
        super.withNumberOfEpochs(numberOfEpochs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withNumberOfWorkers(Integer numberOfWorkers) {
        super.withNumberOfWorkers(numberOfWorkers);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withOptimizer(StochasticOptimizer optimizer) {
        super.withOptimizer(optimizer);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withRandomSeed(Integer randomSeed) {
        super.withRandomSeed(randomSeed);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withStepLRGamma(Float stepLRGamma) {
        super.withStepLRGamma(stepLRGamma);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withStepLRStepSize(Integer stepLRStepSize) {
        super.withStepLRStepSize(stepLRStepSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withTrainingBatchSize(Integer trainingBatchSize) {
        super.withTrainingBatchSize(trainingBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withValidationBatchSize(Integer validationBatchSize) {
        super.withValidationBatchSize(validationBatchSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withWarmupCosineLRCycles(Float warmupCosineLRCycles) {
        super.withWarmupCosineLRCycles(warmupCosineLRCycles);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withWarmupCosineLRWarmupEpochs(Integer warmupCosineLRWarmupEpochs) {
        super.withWarmupCosineLRWarmupEpochs(warmupCosineLRWarmupEpochs);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ImageModelSettingsClassification withWeightDecay(Float weightDecay) {
        super.withWeightDecay(weightDecay);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("amsGradient", amsGradient());
        jsonWriter.writeStringField("advancedSettings", advancedSettings());
        jsonWriter.writeStringField("augmentations", augmentations());
        jsonWriter.writeNumberField("beta1", beta1());
        jsonWriter.writeNumberField("beta2", beta2());
        jsonWriter.writeNumberField("checkpointFrequency", checkpointFrequency());
        jsonWriter.writeStringField("checkpointRunId", checkpointRunId());
        jsonWriter.writeJsonField("checkpointModel", checkpointModel());
        jsonWriter.writeBooleanField("distributed", distributed());
        jsonWriter.writeBooleanField("earlyStopping", earlyStopping());
        jsonWriter.writeNumberField("earlyStoppingDelay", earlyStoppingDelay());
        jsonWriter.writeNumberField("earlyStoppingPatience", earlyStoppingPatience());
        jsonWriter.writeNumberField("evaluationFrequency", evaluationFrequency());
        jsonWriter.writeBooleanField("enableOnnxNormalization", enableOnnxNormalization());
        jsonWriter.writeNumberField("gradientAccumulationStep", gradientAccumulationStep());
        jsonWriter.writeNumberField("layersToFreeze", layersToFreeze());
        jsonWriter.writeNumberField("learningRate", learningRate());
        jsonWriter.writeStringField("learningRateScheduler",
            learningRateScheduler() == null ? null : learningRateScheduler().toString());
        jsonWriter.writeStringField("modelName", modelName());
        jsonWriter.writeNumberField("momentum", momentum());
        jsonWriter.writeBooleanField("nesterov", nesterov());
        jsonWriter.writeNumberField("numberOfEpochs", numberOfEpochs());
        jsonWriter.writeNumberField("numberOfWorkers", numberOfWorkers());
        jsonWriter.writeStringField("optimizer", optimizer() == null ? null : optimizer().toString());
        jsonWriter.writeNumberField("randomSeed", randomSeed());
        jsonWriter.writeNumberField("stepLRGamma", stepLRGamma());
        jsonWriter.writeNumberField("stepLRStepSize", stepLRStepSize());
        jsonWriter.writeNumberField("trainingBatchSize", trainingBatchSize());
        jsonWriter.writeNumberField("validationBatchSize", validationBatchSize());
        jsonWriter.writeNumberField("warmupCosineLRCycles", warmupCosineLRCycles());
        jsonWriter.writeNumberField("warmupCosineLRWarmupEpochs", warmupCosineLRWarmupEpochs());
        jsonWriter.writeNumberField("weightDecay", weightDecay());
        jsonWriter.writeNumberField("trainingCropSize", this.trainingCropSize);
        jsonWriter.writeNumberField("validationCropSize", this.validationCropSize);
        jsonWriter.writeNumberField("validationResizeSize", this.validationResizeSize);
        jsonWriter.writeNumberField("weightedLoss", this.weightedLoss);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ImageModelSettingsClassification from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ImageModelSettingsClassification if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ImageModelSettingsClassification.
     */
    public static ImageModelSettingsClassification fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ImageModelSettingsClassification deserializedImageModelSettingsClassification
                = new ImageModelSettingsClassification();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("amsGradient".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withAmsGradient(reader.getNullable(JsonReader::getBoolean));
                } else if ("advancedSettings".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withAdvancedSettings(reader.getString());
                } else if ("augmentations".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withAugmentations(reader.getString());
                } else if ("beta1".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withBeta1(reader.getNullable(JsonReader::getFloat));
                } else if ("beta2".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withBeta2(reader.getNullable(JsonReader::getFloat));
                } else if ("checkpointFrequency".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withCheckpointFrequency(reader.getNullable(JsonReader::getInt));
                } else if ("checkpointRunId".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withCheckpointRunId(reader.getString());
                } else if ("checkpointModel".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withCheckpointModel(MLFlowModelJobInput.fromJson(reader));
                } else if ("distributed".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withDistributed(reader.getNullable(JsonReader::getBoolean));
                } else if ("earlyStopping".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withEarlyStopping(reader.getNullable(JsonReader::getBoolean));
                } else if ("earlyStoppingDelay".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withEarlyStoppingDelay(reader.getNullable(JsonReader::getInt));
                } else if ("earlyStoppingPatience".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withEarlyStoppingPatience(reader.getNullable(JsonReader::getInt));
                } else if ("evaluationFrequency".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withEvaluationFrequency(reader.getNullable(JsonReader::getInt));
                } else if ("enableOnnxNormalization".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withEnableOnnxNormalization(reader.getNullable(JsonReader::getBoolean));
                } else if ("gradientAccumulationStep".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withGradientAccumulationStep(reader.getNullable(JsonReader::getInt));
                } else if ("layersToFreeze".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withLayersToFreeze(reader.getNullable(JsonReader::getInt));
                } else if ("learningRate".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withLearningRate(reader.getNullable(JsonReader::getFloat));
                } else if ("learningRateScheduler".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withLearningRateScheduler(LearningRateScheduler.fromString(reader.getString()));
                } else if ("modelName".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withModelName(reader.getString());
                } else if ("momentum".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withMomentum(reader.getNullable(JsonReader::getFloat));
                } else if ("nesterov".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withNesterov(reader.getNullable(JsonReader::getBoolean));
                } else if ("numberOfEpochs".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withNumberOfEpochs(reader.getNullable(JsonReader::getInt));
                } else if ("numberOfWorkers".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withNumberOfWorkers(reader.getNullable(JsonReader::getInt));
                } else if ("optimizer".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withOptimizer(StochasticOptimizer.fromString(reader.getString()));
                } else if ("randomSeed".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.withRandomSeed(reader.getNullable(JsonReader::getInt));
                } else if ("stepLRGamma".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withStepLRGamma(reader.getNullable(JsonReader::getFloat));
                } else if ("stepLRStepSize".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withStepLRStepSize(reader.getNullable(JsonReader::getInt));
                } else if ("trainingBatchSize".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withTrainingBatchSize(reader.getNullable(JsonReader::getInt));
                } else if ("validationBatchSize".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withValidationBatchSize(reader.getNullable(JsonReader::getInt));
                } else if ("warmupCosineLRCycles".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withWarmupCosineLRCycles(reader.getNullable(JsonReader::getFloat));
                } else if ("warmupCosineLRWarmupEpochs".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withWarmupCosineLRWarmupEpochs(reader.getNullable(JsonReader::getInt));
                } else if ("weightDecay".equals(fieldName)) {
                    deserializedImageModelSettingsClassification
                        .withWeightDecay(reader.getNullable(JsonReader::getFloat));
                } else if ("trainingCropSize".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.trainingCropSize
                        = reader.getNullable(JsonReader::getInt);
                } else if ("validationCropSize".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.validationCropSize
                        = reader.getNullable(JsonReader::getInt);
                } else if ("validationResizeSize".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.validationResizeSize
                        = reader.getNullable(JsonReader::getInt);
                } else if ("weightedLoss".equals(fieldName)) {
                    deserializedImageModelSettingsClassification.weightedLoss = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedImageModelSettingsClassification;
        });
    }
}
