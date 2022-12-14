// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.outputs.SshCredentialKerberosAuthenticationTgtGenerationMethod;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SshCredentialKerberosAuthentication {
    /**
     * @return Port to use for Kerberos authentication
     * 
     */
    private Integer port;
    /**
     * @return Name of the principal for authentication
     * 
     */
    private String principal;
    /**
     * @return Realm associated with the Kerberos authentication
     * 
     */
    private String realm;
    /**
     * @return TGT generation method
     * 
     */
    private @Nullable SshCredentialKerberosAuthenticationTgtGenerationMethod tgtGenerationMethod;

    private SshCredentialKerberosAuthentication() {}
    /**
     * @return Port to use for Kerberos authentication
     * 
     */
    public Integer port() {
        return this.port;
    }
    /**
     * @return Name of the principal for authentication
     * 
     */
    public String principal() {
        return this.principal;
    }
    /**
     * @return Realm associated with the Kerberos authentication
     * 
     */
    public String realm() {
        return this.realm;
    }
    /**
     * @return TGT generation method
     * 
     */
    public Optional<SshCredentialKerberosAuthenticationTgtGenerationMethod> tgtGenerationMethod() {
        return Optional.ofNullable(this.tgtGenerationMethod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SshCredentialKerberosAuthentication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer port;
        private String principal;
        private String realm;
        private @Nullable SshCredentialKerberosAuthenticationTgtGenerationMethod tgtGenerationMethod;
        public Builder() {}
        public Builder(SshCredentialKerberosAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.principal = defaults.principal;
    	      this.realm = defaults.realm;
    	      this.tgtGenerationMethod = defaults.tgtGenerationMethod;
        }

        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        @CustomType.Setter
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        @CustomType.Setter
        public Builder realm(String realm) {
            this.realm = Objects.requireNonNull(realm);
            return this;
        }
        @CustomType.Setter
        public Builder tgtGenerationMethod(@Nullable SshCredentialKerberosAuthenticationTgtGenerationMethod tgtGenerationMethod) {
            this.tgtGenerationMethod = tgtGenerationMethod;
            return this;
        }
        public SshCredentialKerberosAuthentication build() {
            final var o = new SshCredentialKerberosAuthentication();
            o.port = port;
            o.principal = principal;
            o.realm = realm;
            o.tgtGenerationMethod = tgtGenerationMethod;
            return o;
        }
    }
}
