// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.service.inputs.WinrmVariableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WinrmArgs extends com.pulumi.resources.ResourceArgs {

    public static final WinrmArgs Empty = new WinrmArgs();

    /**
     * The id of the application the service belongs to
     * 
     */
    @Import(name="appId", required=true)
    private Output<String> appId;

    /**
     * @return The id of the application the service belongs to
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The type of artifact to deploy.
     * 
     */
    @Import(name="artifactType", required=true)
    private Output<String> artifactType;

    /**
     * @return The type of artifact to deploy.
     * 
     */
    public Output<String> artifactType() {
        return this.artifactType;
    }

    /**
     * Description of th service
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of th service
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the service
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Variables to be used in the service
     * 
     */
    @Import(name="variables")
    private @Nullable Output<List<WinrmVariableArgs>> variables;

    /**
     * @return Variables to be used in the service
     * 
     */
    public Optional<Output<List<WinrmVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private WinrmArgs() {}

    private WinrmArgs(WinrmArgs $) {
        this.appId = $.appId;
        this.artifactType = $.artifactType;
        this.description = $.description;
        this.name = $.name;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WinrmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WinrmArgs $;

        public Builder() {
            $ = new WinrmArgs();
        }

        public Builder(WinrmArgs defaults) {
            $ = new WinrmArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application the service belongs to
         * 
         * @return builder
         * 
         */
        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The id of the application the service belongs to
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param artifactType The type of artifact to deploy.
         * 
         * @return builder
         * 
         */
        public Builder artifactType(Output<String> artifactType) {
            $.artifactType = artifactType;
            return this;
        }

        /**
         * @param artifactType The type of artifact to deploy.
         * 
         * @return builder
         * 
         */
        public Builder artifactType(String artifactType) {
            return artifactType(Output.of(artifactType));
        }

        /**
         * @param description Description of th service
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of th service
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Name of the service
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the service
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<List<WinrmVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(List<WinrmVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(WinrmVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public WinrmArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            $.artifactType = Objects.requireNonNull($.artifactType, "expected parameter 'artifactType' to be non-null");
            return $;
        }
    }

}
