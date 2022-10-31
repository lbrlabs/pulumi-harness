// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetRoleAssignmentsPrincipal;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRoleAssignmentsResult {
    /**
     * @return Disabled or not.
     * 
     */
    private Boolean disabled;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifier for role assignment.
     * 
     */
    private String identifier;
    /**
     * @return Managed or not.
     * 
     */
    private Boolean managed;
    /**
     * @return Org identifier.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Principal.
     * 
     */
    private @Nullable List<GetRoleAssignmentsPrincipal> principals;
    /**
     * @return Project Identifier
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Resource group identifier.
     * 
     */
    private String resourceGroupIdentifier;
    /**
     * @return Role identifier.
     * 
     */
    private String roleIdentifier;

    private GetRoleAssignmentsResult() {}
    /**
     * @return Disabled or not.
     * 
     */
    public Boolean disabled() {
        return this.disabled;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier for role assignment.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Managed or not.
     * 
     */
    public Boolean managed() {
        return this.managed;
    }
    /**
     * @return Org identifier.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Principal.
     * 
     */
    public List<GetRoleAssignmentsPrincipal> principals() {
        return this.principals == null ? List.of() : this.principals;
    }
    /**
     * @return Project Identifier
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Resource group identifier.
     * 
     */
    public String resourceGroupIdentifier() {
        return this.resourceGroupIdentifier;
    }
    /**
     * @return Role identifier.
     * 
     */
    public String roleIdentifier() {
        return this.roleIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean disabled;
        private String id;
        private String identifier;
        private Boolean managed;
        private @Nullable String orgId;
        private @Nullable List<GetRoleAssignmentsPrincipal> principals;
        private @Nullable String projectId;
        private String resourceGroupIdentifier;
        private String roleIdentifier;
        public Builder() {}
        public Builder(GetRoleAssignmentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.managed = defaults.managed;
    	      this.orgId = defaults.orgId;
    	      this.principals = defaults.principals;
    	      this.projectId = defaults.projectId;
    	      this.resourceGroupIdentifier = defaults.resourceGroupIdentifier;
    	      this.roleIdentifier = defaults.roleIdentifier;
        }

        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
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
        public Builder managed(Boolean managed) {
            this.managed = Objects.requireNonNull(managed);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder principals(@Nullable List<GetRoleAssignmentsPrincipal> principals) {
            this.principals = principals;
            return this;
        }
        public Builder principals(GetRoleAssignmentsPrincipal... principals) {
            return principals(List.of(principals));
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            this.resourceGroupIdentifier = Objects.requireNonNull(resourceGroupIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder roleIdentifier(String roleIdentifier) {
            this.roleIdentifier = Objects.requireNonNull(roleIdentifier);
            return this;
        }
        public GetRoleAssignmentsResult build() {
            final var o = new GetRoleAssignmentsResult();
            o.disabled = disabled;
            o.id = id;
            o.identifier = identifier;
            o.managed = managed;
            o.orgId = orgId;
            o.principals = principals;
            o.projectId = projectId;
            o.resourceGroupIdentifier = resourceGroupIdentifier;
            o.roleIdentifier = roleIdentifier;
            return o;
        }
    }
}