// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKey {
    private @Nullable String secretRef;

    private AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKey() {}
    public Optional<String> secretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String secretRef;
        public Builder() {}
        public Builder(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretRef = defaults.secretRef;
        }

        @CustomType.Setter
        public Builder secretRef(@Nullable String secretRef) {
            this.secretRef = secretRef;
            return this;
        }
        public AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKey build() {
            final var o = new AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKey();
            o.secretRef = secretRef;
            return o;
        }
    }
}
