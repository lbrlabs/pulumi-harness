// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetRoleAssignmentsPrincipal {
    /**
     * @return Identifier for role assignment.
     * 
     */
    private String identifier;
    private String scopeLevel;
    private String type;

    private GetRoleAssignmentsPrincipal() {}
    /**
     * @return Identifier for role assignment.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    public String scopeLevel() {
        return this.scopeLevel;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRoleAssignmentsPrincipal defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String identifier;
        private String scopeLevel;
        private String type;
        public Builder() {}
        public Builder(GetRoleAssignmentsPrincipal defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identifier = defaults.identifier;
    	      this.scopeLevel = defaults.scopeLevel;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        @CustomType.Setter
        public Builder scopeLevel(String scopeLevel) {
            this.scopeLevel = Objects.requireNonNull(scopeLevel);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetRoleAssignmentsPrincipal build() {
            final var o = new GetRoleAssignmentsPrincipal();
            o.identifier = identifier;
            o.scopeLevel = scopeLevel;
            o.type = type;
            return o;
        }
    }
}
