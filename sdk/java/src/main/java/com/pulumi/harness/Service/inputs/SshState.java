// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.service.inputs.SshVariableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SshState extends com.pulumi.resources.ResourceArgs {

    public static final SshState Empty = new SshState();

    /**
     * The id of the application the service belongs to
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The id of the application the service belongs to
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The type of artifact to deploy.
     * 
     */
    @Import(name="artifactType")
    private @Nullable Output<String> artifactType;

    /**
     * @return The type of artifact to deploy.
     * 
     */
    public Optional<Output<String>> artifactType() {
        return Optional.ofNullable(this.artifactType);
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
    private @Nullable Output<List<SshVariableArgs>> variables;

    /**
     * @return Variables to be used in the service
     * 
     */
    public Optional<Output<List<SshVariableArgs>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private SshState() {}

    private SshState(SshState $) {
        this.appId = $.appId;
        this.artifactType = $.artifactType;
        this.description = $.description;
        this.name = $.name;
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshState $;

        public Builder() {
            $ = new SshState();
        }

        public Builder(SshState defaults) {
            $ = new SshState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application the service belongs to
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
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
        public Builder artifactType(@Nullable Output<String> artifactType) {
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
        public Builder variables(@Nullable Output<List<SshVariableArgs>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(List<SshVariableArgs> variables) {
            return variables(Output.of(variables));
        }

        /**
         * @param variables Variables to be used in the service
         * 
         * @return builder
         * 
         */
        public Builder variables(SshVariableArgs... variables) {
            return variables(List.of(variables));
        }

        public SshState build() {
            return $;
        }
    }

}
