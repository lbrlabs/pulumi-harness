// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JenkinsConnectorAuthJenkinsUserNamePassword {
    private String passwordRef;
    private @Nullable String username;
    private @Nullable String usernameRef;

    private JenkinsConnectorAuthJenkinsUserNamePassword() {}
    public String passwordRef() {
        return this.passwordRef;
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

    public static Builder builder(JenkinsConnectorAuthJenkinsUserNamePassword defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String passwordRef;
        private @Nullable String username;
        private @Nullable String usernameRef;
        public Builder() {}
        public Builder(JenkinsConnectorAuthJenkinsUserNamePassword defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.passwordRef = defaults.passwordRef;
    	      this.username = defaults.username;
    	      this.usernameRef = defaults.usernameRef;
        }

        @CustomType.Setter
        public Builder passwordRef(String passwordRef) {
            this.passwordRef = Objects.requireNonNull(passwordRef);
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
        public JenkinsConnectorAuthJenkinsUserNamePassword build() {
            final var o = new JenkinsConnectorAuthJenkinsUserNamePassword();
            o.passwordRef = passwordRef;
            o.username = username;
            o.usernameRef = usernameRef;
            return o;
        }
    }
}
