// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPolicyResult {
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private @Nullable String identifier;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
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
     * @return Rego code for the policy.
     * 
     */
    private String rego;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;

    private GetPolicyResult() {}
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
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
     * @return Rego code for the policy.
     * 
     */
    public String rego() {
        return this.rego;
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPolicyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String description;
        private String id;
        private @Nullable String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private String rego;
        private List<String> tags;
        public Builder() {}
        public Builder(GetPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.rego = defaults.rego;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
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
        public Builder rego(String rego) {
            this.rego = Objects.requireNonNull(rego);
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public GetPolicyResult build() {
            final var o = new GetPolicyResult();
            o.description = description;
            o.id = id;
            o.identifier = identifier;
            o.name = name;
            o.orgId = orgId;
            o.projectId = projectId;
            o.rego = rego;
            o.tags = tags;
            return o;
        }
    }
}
