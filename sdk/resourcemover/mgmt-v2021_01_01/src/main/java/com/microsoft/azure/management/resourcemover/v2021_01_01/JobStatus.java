/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcemover.v2021_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines the job status.
 */
public class JobStatus {
    /**
     * Possible values include: 'InitialSync'.
     */
    @JsonProperty(value = "jobName")
    private JobName jobName;

    /**
     * Gets or sets the monitoring job percentage.
     */
    @JsonProperty(value = "jobProgress", access = JsonProperty.Access.WRITE_ONLY)
    private String jobProgress;

    /**
     * Get possible values include: 'InitialSync'.
     *
     * @return the jobName value
     */
    public JobName jobName() {
        return this.jobName;
    }

    /**
     * Set possible values include: 'InitialSync'.
     *
     * @param jobName the jobName value to set
     * @return the JobStatus object itself.
     */
    public JobStatus withJobName(JobName jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * Get gets or sets the monitoring job percentage.
     *
     * @return the jobProgress value
     */
    public String jobProgress() {
        return this.jobProgress;
    }

}
