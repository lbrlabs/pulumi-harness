// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesAuthenticationUsernamePassword {
    private String masterUrl;
    private String passwordSecretName;
    private @Nullable String username;
    private @Nullable String usernameSecretName;

    private KubernetesAuthenticationUsernamePassword() {}
    public String masterUrl() {
        return this.masterUrl;
    }
    public String passwordSecretName() {
        return this.passwordSecretName;
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    public Optional<String> usernameSecretName() {
        return Optional.ofNullable(this.usernameSecretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesAuthenticationUsernamePassword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String masterUrl;
        private String passwordSecretName;
        private @Nullable String username;
        private @Nullable String usernameSecretName;
        public Builder() {}
        public Builder(KubernetesAuthenticationUsernamePassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterUrl = defaults.masterUrl;
    	      this.passwordSecretName = defaults.passwordSecretName;
    	      this.username = defaults.username;
    	      this.usernameSecretName = defaults.usernameSecretName;
        }

        @CustomType.Setter
        public Builder masterUrl(String masterUrl) {
            this.masterUrl = Objects.requireNonNull(masterUrl);
            return this;
        }
        @CustomType.Setter
        public Builder passwordSecretName(String passwordSecretName) {
            this.passwordSecretName = Objects.requireNonNull(passwordSecretName);
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameSecretName(@Nullable String usernameSecretName) {
            this.usernameSecretName = usernameSecretName;
            return this;
        }
        public KubernetesAuthenticationUsernamePassword build() {
            final var o = new KubernetesAuthenticationUsernamePassword();
            o.masterUrl = masterUrl;
            o.passwordSecretName = passwordSecretName;
            o.username = username;
            o.usernameSecretName = usernameSecretName;
            return o;
        }
    }
}
