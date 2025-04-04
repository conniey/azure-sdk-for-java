// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.monitor;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpPipeline;
import com.azure.resourcemanager.monitor.fluent.MonitorClient;
import com.azure.resourcemanager.monitor.implementation.MonitorClientBuilder;
import com.azure.resourcemanager.monitor.implementation.ActionGroupsImpl;
import com.azure.resourcemanager.monitor.implementation.ActivityLogsImpl;
import com.azure.resourcemanager.monitor.implementation.AlertRulesImpl;
import com.azure.resourcemanager.monitor.implementation.AutoscaleSettingsImpl;
import com.azure.resourcemanager.monitor.implementation.DiagnosticSettingsImpl;
import com.azure.resourcemanager.monitor.implementation.MetricDefinitionsImpl;
import com.azure.resourcemanager.monitor.models.ActionGroups;
import com.azure.resourcemanager.monitor.models.ActivityLogs;
import com.azure.resourcemanager.monitor.models.AlertRules;
import com.azure.resourcemanager.monitor.models.AutoscaleSettings;
import com.azure.resourcemanager.monitor.models.DiagnosticSettings;
import com.azure.resourcemanager.monitor.models.MetricDefinitions;
import com.azure.resourcemanager.resources.fluentcore.arm.AzureConfigurable;
import com.azure.resourcemanager.resources.fluentcore.arm.Manager;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.azure.resourcemanager.resources.fluentcore.utils.HttpPipelineProvider;

import java.util.Objects;

/** Entry point to Azure Monitor. */
public final class MonitorManager extends Manager<MonitorClient> {
    // Collections
    private ActivityLogs activityLogs;
    private MetricDefinitions metricDefinitions;
    private DiagnosticSettings diagnosticSettings;
    private ActionGroups actionGroups;
    private AlertRules alerts;
    private AutoscaleSettings autoscaleSettings;

    /**
     * Get a Configurable instance that can be used to create MonitorManager with optional configuration.
     *
     * @return the instance allowing configurations
     */
    public static Configurable configure() {
        return new MonitorManager.ConfigurableImpl();
    }

    /**
     * Creates an instance of MonitorManager that exposes Monitor API entry points.
     *
     * @param credential the credential to use
     * @param profile the profile to use
     * @return the MonitorManager
     */
    public static MonitorManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return authenticate(HttpPipelineProvider.buildHttpPipeline(credential, profile), profile);
    }

    /**
     * Creates an instance of MonitorManager that exposes Monitor API entry points.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the profile to use
     * @return the MonitorManager
     */
    public static MonitorManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new MonitorManager(httpPipeline, profile);
    }

    /** The interface allowing configurations to be set. */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
         * Creates an instance of MonitorManager that exposes Monitor API entry points.
         *
         * @param credential the credential to use
         * @param profile the profile to use
         * @return the interface exposing monitor API entry points that work across subscriptions
         */
        MonitorManager authenticate(TokenCredential credential, AzureProfile profile);
    }

    /**
     * Gets the Azure Activity Logs API entry point.
     *
     * @return the Azure Activity Logs API entry point
     */
    public ActivityLogs activityLogs() {
        if (this.activityLogs == null) {
            this.activityLogs = new ActivityLogsImpl(this);
        }
        return this.activityLogs;
    }

    /**
     * Gets the Azure Metric Definitions API entry point.
     *
     * @return the Azure Metric Definitions API entry point
     */
    public MetricDefinitions metricDefinitions() {
        if (this.metricDefinitions == null) {
            this.metricDefinitions = new MetricDefinitionsImpl(this);
        }
        return this.metricDefinitions;
    }

    /**
     * Gets the Azure Diagnostic Settings API entry point.
     *
     * @return the Azure Diagnostic Settings API entry point
     */
    public DiagnosticSettings diagnosticSettings() {
        if (this.diagnosticSettings == null) {
            this.diagnosticSettings = new DiagnosticSettingsImpl(this);
        }
        return this.diagnosticSettings;
    }

    /**
     * Gets the Azure Action Groups API entry point.
     *
     * @return the Azure Action Groups API entry point
     */
    public ActionGroups actionGroups() {
        if (this.actionGroups == null) {
            this.actionGroups = new ActionGroupsImpl(this);
        }
        return this.actionGroups;
    }

    /**
     * Gets the Azure AlertRules API entry point.
     *
     * @return the Azure AlertRules API entry point
     */
    public AlertRules alertRules() {
        if (this.alerts == null) {
            this.alerts = new AlertRulesImpl(this);
        }
        return this.alerts;
    }

    /**
     * Gets the Azure AutoscaleSettings API entry point.
     *
     * @return the Azure AutoscaleSettings API entry point
     */
    public AutoscaleSettings autoscaleSettings() {
        if (this.autoscaleSettings == null) {
            this.autoscaleSettings = new AutoscaleSettingsImpl(this);
        }
        return this.autoscaleSettings;
    }

    /** The implementation for Configurable interface. */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements Configurable {
        public MonitorManager authenticate(TokenCredential credential, AzureProfile profile) {
            return MonitorManager.authenticate(buildHttpPipeline(credential, profile), profile);
        }
    }

    private MonitorManager(HttpPipeline httpPipeline, AzureProfile profile) {
        super(httpPipeline, profile,
            new MonitorClientBuilder().pipeline(httpPipeline)
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .subscriptionId(profile.getSubscriptionId())
                .buildClient());
    }
}
