// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetKubernetesConnectorServiceAccount {
    private String masterUrl;
    private String serviceAccountTokenRef;

    private GetKubernetesConnectorServiceAccount() {}
    public String masterUrl() {
        return this.masterUrl;
    }
    public String serviceAccountTokenRef() {
        return this.serviceAccountTokenRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKubernetesConnectorServiceAccount defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String masterUrl;
        private String serviceAccountTokenRef;
        public Builder() {}
        public Builder(GetKubernetesConnectorServiceAccount defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterUrl = defaults.masterUrl;
    	      this.serviceAccountTokenRef = defaults.serviceAccountTokenRef;
        }

        @CustomType.Setter
        public Builder masterUrl(String masterUrl) {
            this.masterUrl = Objects.requireNonNull(masterUrl);
            return this;
        }
        @CustomType.Setter
        public Builder serviceAccountTokenRef(String serviceAccountTokenRef) {
            this.serviceAccountTokenRef = Objects.requireNonNull(serviceAccountTokenRef);
            return this;
        }
        public GetKubernetesConnectorServiceAccount build() {
            final var o = new GetKubernetesConnectorServiceAccount();
            o.masterUrl = masterUrl;
            o.serviceAccountTokenRef = serviceAccountTokenRef;
            return o;
        }
    }
}
