// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.inputs.GetEnvironmentVariableOverride;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEnvironmentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentPlainArgs Empty = new GetEnvironmentPlainArgs();

    /**
     * The id of the application.
     * 
     */
    @Import(name="appId", required=true)
    private String appId;

    /**
     * @return The id of the application.
     * 
     */
    public String appId() {
        return this.appId;
    }

    /**
     * The id of the environment.
     * 
     */
    @Import(name="environmentId")
    private @Nullable String environmentId;

    /**
     * @return The id of the environment.
     * 
     */
    public Optional<String> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    /**
     * The name of the environment.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the environment.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Override for a service variable
     * 
     */
    @Import(name="variableOverrides")
    private @Nullable List<GetEnvironmentVariableOverride> variableOverrides;

    /**
     * @return Override for a service variable
     * 
     */
    public Optional<List<GetEnvironmentVariableOverride>> variableOverrides() {
        return Optional.ofNullable(this.variableOverrides);
    }

    private GetEnvironmentPlainArgs() {}

    private GetEnvironmentPlainArgs(GetEnvironmentPlainArgs $) {
        this.appId = $.appId;
        this.environmentId = $.environmentId;
        this.name = $.name;
        this.variableOverrides = $.variableOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEnvironmentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEnvironmentPlainArgs $;

        public Builder() {
            $ = new GetEnvironmentPlainArgs();
        }

        public Builder(GetEnvironmentPlainArgs defaults) {
            $ = new GetEnvironmentPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param environmentId The id of the environment.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable String environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param name The name of the environment.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(@Nullable List<GetEnvironmentVariableOverride> variableOverrides) {
            $.variableOverrides = variableOverrides;
            return this;
        }

        /**
         * @param variableOverrides Override for a service variable
         * 
         * @return builder
         * 
         */
        public Builder variableOverrides(GetEnvironmentVariableOverride... variableOverrides) {
            return variableOverrides(List.of(variableOverrides));
        }

        public GetEnvironmentPlainArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
