// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GcpUsageScopeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpUsageScopeArgs Empty = new GcpUsageScopeArgs();

    /**
     * Id of the application to scope to. If empty then this scope applies to all applications.
     * 
     */
    @Import(name="applicationId")
    private @Nullable Output<String> applicationId;

    /**
     * @return Id of the application to scope to. If empty then this scope applies to all applications.
     * 
     */
    public Optional<Output<String>> applicationId() {
        return Optional.ofNullable(this.applicationId);
    }

    /**
     * Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    @Import(name="environmentFilterType")
    private @Nullable Output<String> environmentFilterType;

    /**
     * @return Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
     * 
     */
    public Optional<Output<String>> environmentFilterType() {
        return Optional.ofNullable(this.environmentFilterType);
    }

    /**
     * Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
     * 
     */
    @Import(name="environmentId")
    private @Nullable Output<String> environmentId;

    /**
     * @return Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
     * 
     */
    public Optional<Output<String>> environmentId() {
        return Optional.ofNullable(this.environmentId);
    }

    private GcpUsageScopeArgs() {}

    private GcpUsageScopeArgs(GcpUsageScopeArgs $) {
        this.applicationId = $.applicationId;
        this.environmentFilterType = $.environmentFilterType;
        this.environmentId = $.environmentId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpUsageScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpUsageScopeArgs $;

        public Builder() {
            $ = new GcpUsageScopeArgs();
        }

        public Builder(GcpUsageScopeArgs defaults) {
            $ = new GcpUsageScopeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param applicationId Id of the application to scope to. If empty then this scope applies to all applications.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(@Nullable Output<String> applicationId) {
            $.applicationId = applicationId;
            return this;
        }

        /**
         * @param applicationId Id of the application to scope to. If empty then this scope applies to all applications.
         * 
         * @return builder
         * 
         */
        public Builder applicationId(String applicationId) {
            return applicationId(Output.of(applicationId));
        }

        /**
         * @param environmentFilterType Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
         * 
         * @return builder
         * 
         */
        public Builder environmentFilterType(@Nullable Output<String> environmentFilterType) {
            $.environmentFilterType = environmentFilterType;
            return this;
        }

        /**
         * @param environmentFilterType Type of environment filter applied. Cannot be used with `environment_id`. Valid options are NON*PRODUCTION*ENVIRONMENTS, PRODUCTION_ENVIRONMENTS.
         * 
         * @return builder
         * 
         */
        public Builder environmentFilterType(String environmentFilterType) {
            return environmentFilterType(Output.of(environmentFilterType));
        }

        /**
         * @param environmentId Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(@Nullable Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId Id of the id of the specific environment to scope to. Cannot be used with `environment_filter_type`.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        public GcpUsageScopeArgs build() {
            return $;
        }
    }

}
