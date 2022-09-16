// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SecretSshkeySshSshPasswordCredential {
    private String password;
    private String userName;

    private SecretSshkeySshSshPasswordCredential() {}
    public String password() {
        return this.password;
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretSshkeySshSshPasswordCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        private String userName;
        public Builder() {}
        public Builder(SecretSshkeySshSshPasswordCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public SecretSshkeySshSshPasswordCredential build() {
            final var o = new SecretSshkeySshSshPasswordCredential();
            o.password = password;
            o.userName = userName;
            return o;
        }
    }
}
