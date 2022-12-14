// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetAppDynamicsConnectorApiToken {
    private String clientId;
    private String clientSecretRef;

    private GetAppDynamicsConnectorApiToken() {}
    public String clientId() {
        return this.clientId;
    }
    public String clientSecretRef() {
        return this.clientSecretRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAppDynamicsConnectorApiToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String clientId;
        private String clientSecretRef;
        public Builder() {}
        public Builder(GetAppDynamicsConnectorApiToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretRef = defaults.clientSecretRef;
        }

        @CustomType.Setter
        public Builder clientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }
        @CustomType.Setter
        public Builder clientSecretRef(String clientSecretRef) {
            this.clientSecretRef = Objects.requireNonNull(clientSecretRef);
            return this;
        }
        public GetAppDynamicsConnectorApiToken build() {
            final var o = new GetAppDynamicsConnectorApiToken();
            o.clientId = clientId;
            o.clientSecretRef = clientSecretRef;
            return o;
        }
    }
}
