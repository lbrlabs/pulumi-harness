// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientSecretKey {
    private String secretRef;

    private GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientSecretKey() {}
    public String secretRef() {
        return this.secretRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientSecretKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String secretRef;
        public Builder() {}
        public Builder(GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientSecretKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretRef = defaults.secretRef;
        }

        @CustomType.Setter
        public Builder secretRef(String secretRef) {
            this.secretRef = Objects.requireNonNull(secretRef);
            return this;
        }
        public GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientSecretKey build() {
            final var o = new GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthAzureClientSecretKey();
            o.secretRef = secretRef;
            return o;
        }
    }
}
