// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AwsCCConnectorCrossAccountAccess {
    /**
     * @return The external id of the role to use for cross-account access. This is a random unique value to provide additional secure authentication.
     * 
     */
    private String externalId;
    /**
     * @return The ARN of the role to use for cross-account access.
     * 
     */
    private String roleArn;

    private AwsCCConnectorCrossAccountAccess() {}
    /**
     * @return The external id of the role to use for cross-account access. This is a random unique value to provide additional secure authentication.
     * 
     */
    public String externalId() {
        return this.externalId;
    }
    /**
     * @return The ARN of the role to use for cross-account access.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsCCConnectorCrossAccountAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String externalId;
        private String roleArn;
        public Builder() {}
        public Builder(AwsCCConnectorCrossAccountAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public AwsCCConnectorCrossAccountAccess build() {
            final var o = new AwsCCConnectorCrossAccountAccess();
            o.externalId = externalId;
            o.roleArn = roleArn;
            return o;
        }
    }
}
