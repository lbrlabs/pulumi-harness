// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnvironmentServiceOverridesResult {
    /**
     * @return The env Id associated with the overrides. To reference an environment at the organization scope, prefix &#39;org&#39; to the expression: org.{env*id}. To reference an environment at the account scope, prefix &#39;account&#39; to the expression: account.{env*id}).
     * 
     */
    private String envId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return identifier of the service overrides.
     * 
     */
    private String identifier;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return The service Id associated with the overrides. To reference a service at the organization scope, prefix &#39;org&#39; to the expression: org.{service*id}. To reference a service at the account scope, prefix &#39;account&#39; to the expression: account.{service*id}).
     * 
     */
    private @Nullable String serviceId;
    /**
     * @return Environment Service Overrides YAML
     * 
     */
    private String yaml;

    private GetEnvironmentServiceOverridesResult() {}
    /**
     * @return The env Id associated with the overrides. To reference an environment at the organization scope, prefix &#39;org&#39; to the expression: org.{env*id}. To reference an environment at the account scope, prefix &#39;account&#39; to the expression: account.{env*id}).
     * 
     */
    public String envId() {
        return this.envId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return identifier of the service overrides.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return The service Id associated with the overrides. To reference a service at the organization scope, prefix &#39;org&#39; to the expression: org.{service*id}. To reference a service at the account scope, prefix &#39;account&#39; to the expression: account.{service*id}).
     * 
     */
    public Optional<String> serviceId() {
        return Optional.ofNullable(this.serviceId);
    }
    /**
     * @return Environment Service Overrides YAML
     * 
     */
    public String yaml() {
        return this.yaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentServiceOverridesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String envId;
        private String id;
        private String identifier;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private @Nullable String serviceId;
        private String yaml;
        public Builder() {}
        public Builder(GetEnvironmentServiceOverridesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envId = defaults.envId;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.serviceId = defaults.serviceId;
    	      this.yaml = defaults.yaml;
        }

        @CustomType.Setter
        public Builder envId(String envId) {
            this.envId = Objects.requireNonNull(envId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder serviceId(@Nullable String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        @CustomType.Setter
        public Builder yaml(String yaml) {
            this.yaml = Objects.requireNonNull(yaml);
            return this;
        }
        public GetEnvironmentServiceOverridesResult build() {
            final var o = new GetEnvironmentServiceOverridesResult();
            o.envId = envId;
            o.id = id;
            o.identifier = identifier;
            o.orgId = orgId;
            o.projectId = projectId;
            o.serviceId = serviceId;
            o.yaml = yaml;
            return o;
        }
    }
}