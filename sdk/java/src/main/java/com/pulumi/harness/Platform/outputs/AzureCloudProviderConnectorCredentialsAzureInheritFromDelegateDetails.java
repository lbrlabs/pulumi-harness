// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetails {
    private @Nullable AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth auth;

    private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetails() {}
    public Optional<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth> auth() {
        return Optional.ofNullable(this.auth);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetails defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth auth;
        public Builder() {}
        public Builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
        }

        @CustomType.Setter
        public Builder auth(@Nullable AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuth auth) {
            this.auth = auth;
            return this;
        }
        public AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetails build() {
            final var o = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetails();
            o.auth = auth;
            return o;
        }
    }
}
