// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretSshkeySshSshkeyPathCredential {
    private @Nullable String encryptedPassphrase;
    private String keyPath;
    private String userName;

    private SecretSshkeySshSshkeyPathCredential() {}
    public Optional<String> encryptedPassphrase() {
        return Optional.ofNullable(this.encryptedPassphrase);
    }
    public String keyPath() {
        return this.keyPath;
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretSshkeySshSshkeyPathCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String encryptedPassphrase;
        private String keyPath;
        private String userName;
        public Builder() {}
        public Builder(SecretSshkeySshSshkeyPathCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedPassphrase = defaults.encryptedPassphrase;
    	      this.keyPath = defaults.keyPath;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder encryptedPassphrase(@Nullable String encryptedPassphrase) {
            this.encryptedPassphrase = encryptedPassphrase;
            return this;
        }
        @CustomType.Setter
        public Builder keyPath(String keyPath) {
            this.keyPath = Objects.requireNonNull(keyPath);
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public SecretSshkeySshSshkeyPathCredential build() {
            final var o = new SecretSshkeySshSshkeyPathCredential();
            o.encryptedPassphrase = encryptedPassphrase;
            o.keyPath = keyPath;
            o.userName = userName;
            return o;
        }
    }
}
