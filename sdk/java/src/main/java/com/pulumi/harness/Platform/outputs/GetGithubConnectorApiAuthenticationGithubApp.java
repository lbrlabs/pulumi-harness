// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGithubConnectorApiAuthenticationGithubApp {
    private String applicationId;
    private String installationId;
    private String privateKeyRef;

    private GetGithubConnectorApiAuthenticationGithubApp() {}
    public String applicationId() {
        return this.applicationId;
    }
    public String installationId() {
        return this.installationId;
    }
    public String privateKeyRef() {
        return this.privateKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGithubConnectorApiAuthenticationGithubApp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String applicationId;
        private String installationId;
        private String privateKeyRef;
        public Builder() {}
        public Builder(GetGithubConnectorApiAuthenticationGithubApp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
    	      this.installationId = defaults.installationId;
    	      this.privateKeyRef = defaults.privateKeyRef;
        }

        @CustomType.Setter
        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        @CustomType.Setter
        public Builder installationId(String installationId) {
            this.installationId = Objects.requireNonNull(installationId);
            return this;
        }
        @CustomType.Setter
        public Builder privateKeyRef(String privateKeyRef) {
            this.privateKeyRef = Objects.requireNonNull(privateKeyRef);
            return this;
        }
        public GetGithubConnectorApiAuthenticationGithubApp build() {
            final var o = new GetGithubConnectorApiAuthenticationGithubApp();
            o.applicationId = applicationId;
            o.installationId = installationId;
            o.privateKeyRef = privateKeyRef;
            return o;
        }
    }
}
