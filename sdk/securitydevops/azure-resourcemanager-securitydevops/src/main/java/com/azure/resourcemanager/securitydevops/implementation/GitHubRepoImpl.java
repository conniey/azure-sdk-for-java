// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securitydevops.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.securitydevops.fluent.models.GitHubRepoInner;
import com.azure.resourcemanager.securitydevops.models.GitHubRepo;
import com.azure.resourcemanager.securitydevops.models.GitHubRepoProperties;

public final class GitHubRepoImpl implements GitHubRepo, GitHubRepo.Definition, GitHubRepo.Update {
    private GitHubRepoInner innerObject;

    private final com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public GitHubRepoProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public GitHubRepoInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.securitydevops.SecurityDevOpsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String gitHubConnectorName;

    private String gitHubOwnerName;

    private String gitHubRepoName;

    public GitHubRepoImpl withExistingOwner(String resourceGroupName, String gitHubConnectorName,
        String gitHubOwnerName) {
        this.resourceGroupName = resourceGroupName;
        this.gitHubConnectorName = gitHubConnectorName;
        this.gitHubOwnerName = gitHubOwnerName;
        return this;
    }

    public GitHubRepo create() {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubRepoes()
            .createOrUpdate(resourceGroupName, gitHubConnectorName, gitHubOwnerName, gitHubRepoName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public GitHubRepo create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubRepoes()
            .createOrUpdate(resourceGroupName, gitHubConnectorName, gitHubOwnerName, gitHubRepoName, this.innerModel(),
                context);
        return this;
    }

    GitHubRepoImpl(String name, com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerObject = new GitHubRepoInner();
        this.serviceManager = serviceManager;
        this.gitHubRepoName = name;
    }

    public GitHubRepoImpl update() {
        return this;
    }

    public GitHubRepo apply() {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubRepoes()
            .update(resourceGroupName, gitHubConnectorName, gitHubOwnerName, gitHubRepoName, this.innerModel(),
                Context.NONE);
        return this;
    }

    public GitHubRepo apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubRepoes()
            .update(resourceGroupName, gitHubConnectorName, gitHubOwnerName, gitHubRepoName, this.innerModel(),
                context);
        return this;
    }

    GitHubRepoImpl(GitHubRepoInner innerObject,
        com.azure.resourcemanager.securitydevops.SecurityDevOpsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.gitHubConnectorName = Utils.getValueFromIdByName(innerObject.id(), "gitHubConnectors");
        this.gitHubOwnerName = Utils.getValueFromIdByName(innerObject.id(), "owners");
        this.gitHubRepoName = Utils.getValueFromIdByName(innerObject.id(), "repos");
    }

    public GitHubRepo refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubRepoes()
            .getWithResponse(resourceGroupName, gitHubConnectorName, gitHubOwnerName, gitHubRepoName, Context.NONE)
            .getValue();
        return this;
    }

    public GitHubRepo refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getGitHubRepoes()
            .getWithResponse(resourceGroupName, gitHubConnectorName, gitHubOwnerName, gitHubRepoName, context)
            .getValue();
        return this;
    }

    public GitHubRepoImpl withProperties(GitHubRepoProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
