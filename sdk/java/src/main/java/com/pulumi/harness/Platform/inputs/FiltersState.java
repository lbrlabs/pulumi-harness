// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.FiltersFilterPropertiesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FiltersState extends com.pulumi.resources.ResourceArgs {

    public static final FiltersState Empty = new FiltersState();

    /**
     * Properties of the filter entity defined in Harness.
     * 
     */
    @Import(name="filterProperties")
    private @Nullable Output<FiltersFilterPropertiesArgs> filterProperties;

    /**
     * @return Properties of the filter entity defined in Harness.
     * 
     */
    public Optional<Output<FiltersFilterPropertiesArgs>> filterProperties() {
        return Optional.ofNullable(this.filterProperties);
    }

    /**
     * This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
     * 
     */
    @Import(name="filterVisibility")
    private @Nullable Output<String> filterVisibility;

    /**
     * @return This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
     * 
     */
    public Optional<Output<String>> filterVisibility() {
        return Optional.ofNullable(this.filterVisibility);
    }

    /**
     * Unique identifier of the resource
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier of the resource
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Name of the Filter
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Filter
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * organization Identifier for the Entity
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return organization Identifier for the Entity
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * project Identifier for the Entity
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return project Identifier for the Entity
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private FiltersState() {}

    private FiltersState(FiltersState $) {
        this.filterProperties = $.filterProperties;
        this.filterVisibility = $.filterVisibility;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FiltersState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FiltersState $;

        public Builder() {
            $ = new FiltersState();
        }

        public Builder(FiltersState defaults) {
            $ = new FiltersState(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterProperties Properties of the filter entity defined in Harness.
         * 
         * @return builder
         * 
         */
        public Builder filterProperties(@Nullable Output<FiltersFilterPropertiesArgs> filterProperties) {
            $.filterProperties = filterProperties;
            return this;
        }

        /**
         * @param filterProperties Properties of the filter entity defined in Harness.
         * 
         * @return builder
         * 
         */
        public Builder filterProperties(FiltersFilterPropertiesArgs filterProperties) {
            return filterProperties(Output.of(filterProperties));
        }

        /**
         * @param filterVisibility This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
         * 
         * @return builder
         * 
         */
        public Builder filterVisibility(@Nullable Output<String> filterVisibility) {
            $.filterVisibility = filterVisibility;
            return this;
        }

        /**
         * @param filterVisibility This indicates visibility of filter. By default, everyone can view this filter. Can either be EveryOne or OnlyCreator
         * 
         * @return builder
         * 
         */
        public Builder filterVisibility(String filterVisibility) {
            return filterVisibility(Output.of(filterVisibility));
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the Filter
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Filter
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param type Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of filter. Currently supported types are {Connector, DelegateProfile, Delegate, EnvironmentGroup, FileStore, Environment}
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public FiltersState build() {
            return $;
        }
    }

}
