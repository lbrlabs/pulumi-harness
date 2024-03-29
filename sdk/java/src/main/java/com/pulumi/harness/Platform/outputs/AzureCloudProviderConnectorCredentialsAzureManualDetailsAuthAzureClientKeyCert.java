// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert {
    private @Nullable String certificateRef;

    private AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert() {}
    public Optional<String> certificateRef() {
        return Optional.ofNullable(this.certificateRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String certificateRef;
        public Builder() {}
        public Builder(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateRef = defaults.certificateRef;
        }

        @CustomType.Setter
        public Builder certificateRef(@Nullable String certificateRef) {
            this.certificateRef = certificateRef;
            return this;
        }
        public AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert build() {
            final var o = new AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCert();
            o.certificateRef = certificateRef;
            return o;
        }
    }
}
