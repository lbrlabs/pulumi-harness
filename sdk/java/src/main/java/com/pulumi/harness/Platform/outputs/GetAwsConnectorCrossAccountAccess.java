// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAwsConnectorCrossAccountAccess {
    /**
     * @return If the administrator of the account to which the role belongs provided you with an external ID, then enter that value.
     * 
     */
    private String externalId;
    /**
     * @return The Amazon Resource Name (ARN) of the role that you want to assume. This is an IAM role in the target AWS account.
     * 
     */
    private String roleArn;

    private GetAwsConnectorCrossAccountAccess() {}
    /**
     * @return If the administrator of the account to which the role belongs provided you with an external ID, then enter that value.
     * 
     */
    public String externalId() {
        return this.externalId;
    }
    /**
     * @return The Amazon Resource Name (ARN) of the role that you want to assume. This is an IAM role in the target AWS account.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsConnectorCrossAccountAccess defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String externalId;
        private String roleArn;
        public Builder() {}
        public Builder(GetAwsConnectorCrossAccountAccess defaults) {
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
        public GetAwsConnectorCrossAccountAccess build() {
            final var o = new GetAwsConnectorCrossAccountAccess();
            o.externalId = externalId;
            o.roleArn = roleArn;
            return o;
        }
    }
}
