// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetAzureCloudProviderConnectorCredentialAzureInheritFromDelegateDetail;
import com.pulumi.harness.platform.outputs.GetAzureCloudProviderConnectorCredentialAzureManualDetail;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAzureCloudProviderConnectorCredential {
    private List<GetAzureCloudProviderConnectorCredentialAzureInheritFromDelegateDetail> azureInheritFromDelegateDetails;
    private List<GetAzureCloudProviderConnectorCredentialAzureManualDetail> azureManualDetails;
    private String type;

    private GetAzureCloudProviderConnectorCredential() {}
    public List<GetAzureCloudProviderConnectorCredentialAzureInheritFromDelegateDetail> azureInheritFromDelegateDetails() {
        return this.azureInheritFromDelegateDetails;
    }
    public List<GetAzureCloudProviderConnectorCredentialAzureManualDetail> azureManualDetails() {
        return this.azureManualDetails;
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzureCloudProviderConnectorCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetAzureCloudProviderConnectorCredentialAzureInheritFromDelegateDetail> azureInheritFromDelegateDetails;
        private List<GetAzureCloudProviderConnectorCredentialAzureManualDetail> azureManualDetails;
        private String type;
        public Builder() {}
        public Builder(GetAzureCloudProviderConnectorCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureInheritFromDelegateDetails = defaults.azureInheritFromDelegateDetails;
    	      this.azureManualDetails = defaults.azureManualDetails;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder azureInheritFromDelegateDetails(List<GetAzureCloudProviderConnectorCredentialAzureInheritFromDelegateDetail> azureInheritFromDelegateDetails) {
            this.azureInheritFromDelegateDetails = Objects.requireNonNull(azureInheritFromDelegateDetails);
            return this;
        }
        public Builder azureInheritFromDelegateDetails(GetAzureCloudProviderConnectorCredentialAzureInheritFromDelegateDetail... azureInheritFromDelegateDetails) {
            return azureInheritFromDelegateDetails(List.of(azureInheritFromDelegateDetails));
        }
        @CustomType.Setter
        public Builder azureManualDetails(List<GetAzureCloudProviderConnectorCredentialAzureManualDetail> azureManualDetails) {
            this.azureManualDetails = Objects.requireNonNull(azureManualDetails);
            return this;
        }
        public Builder azureManualDetails(GetAzureCloudProviderConnectorCredentialAzureManualDetail... azureManualDetails) {
            return azureManualDetails(List.of(azureManualDetails));
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAzureCloudProviderConnectorCredential build() {
            final var o = new GetAzureCloudProviderConnectorCredential();
            o.azureInheritFromDelegateDetails = azureInheritFromDelegateDetails;
            o.azureManualDetails = azureManualDetails;
            o.type = type;
            return o;
        }
    }
}
