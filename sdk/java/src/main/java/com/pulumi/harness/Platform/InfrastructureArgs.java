// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InfrastructureArgs extends com.pulumi.resources.ResourceArgs {

    public static final InfrastructureArgs Empty = new InfrastructureArgs();

    /**
     * Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    @Import(name="deploymentType")
    private @Nullable Output<String> deploymentType;

    /**
     * @return Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    public Optional<Output<String>> deploymentType() {
        return Optional.ofNullable(this.deploymentType);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * environment identifier.
     * 
     */
    @Import(name="envId", required=true)
    private Output<String> envId;

    /**
     * @return environment identifier.
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the Organization.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Unique identifier of the Project.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Infrastructure YAML
     * 
     */
    @Import(name="yaml", required=true)
    private Output<String> yaml;

    /**
     * @return Infrastructure YAML
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    private InfrastructureArgs() {}

    private InfrastructureArgs(InfrastructureArgs $) {
        this.deploymentType = $.deploymentType;
        this.description = $.description;
        this.envId = $.envId;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tags = $.tags;
        this.type = $.type;
        this.yaml = $.yaml;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InfrastructureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InfrastructureArgs $;

        public Builder() {
            $ = new InfrastructureArgs();
        }

        public Builder(InfrastructureArgs defaults) {
            $ = new InfrastructureArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param deploymentType Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(@Nullable Output<String> deploymentType) {
            $.deploymentType = deploymentType;
            return this;
        }

        /**
         * @param deploymentType Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
         * 
         * @return builder
         * 
         */
        public Builder deploymentType(String deploymentType) {
            return deploymentType(Output.of(deploymentType));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param envId environment identifier.
         * 
         * @return builder
         * 
         */
        public Builder envId(Output<String> envId) {
            $.envId = envId;
            return this;
        }

        /**
         * @param envId environment identifier.
         * 
         * @return builder
         * 
         */
        public Builder envId(String envId) {
            return envId(Output.of(envId));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the Organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the Project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param yaml Infrastructure YAML
         * 
         * @return builder
         * 
         */
        public Builder yaml(Output<String> yaml) {
            $.yaml = yaml;
            return this;
        }

        /**
         * @param yaml Infrastructure YAML
         * 
         * @return builder
         * 
         */
        public Builder yaml(String yaml) {
            return yaml(Output.of(yaml));
        }

        public InfrastructureArgs build() {
            $.envId = Objects.requireNonNull($.envId, "expected parameter 'envId' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.yaml = Objects.requireNonNull($.yaml, "expected parameter 'yaml' to be non-null");
            return $;
        }
    }

}
