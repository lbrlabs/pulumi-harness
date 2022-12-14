// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GithubConnectorCredentialsHttp {
    private String tokenRef;
    private @Nullable String username;
    private @Nullable String usernameRef;

    private GithubConnectorCredentialsHttp() {}
    public String tokenRef() {
        return this.tokenRef;
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }
    public Optional<String> usernameRef() {
        return Optional.ofNullable(this.usernameRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GithubConnectorCredentialsHttp defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String tokenRef;
        private @Nullable String username;
        private @Nullable String usernameRef;
        public Builder() {}
        public Builder(GithubConnectorCredentialsHttp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tokenRef = defaults.tokenRef;
    	      this.username = defaults.username;
    	      this.usernameRef = defaults.usernameRef;
        }

        @CustomType.Setter
        public Builder tokenRef(String tokenRef) {
            this.tokenRef = Objects.requireNonNull(tokenRef);
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        @CustomType.Setter
        public Builder usernameRef(@Nullable String usernameRef) {
            this.usernameRef = usernameRef;
            return this;
        }
        public GithubConnectorCredentialsHttp build() {
            final var o = new GithubConnectorCredentialsHttp();
            o.tokenRef = tokenRef;
            o.username = username;
            o.usernameRef = usernameRef;
            return o;
        }
    }
}
