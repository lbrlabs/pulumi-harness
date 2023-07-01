// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesConnectorClientKeyCertArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesConnectorClientKeyCertArgs Empty = new KubernetesConnectorClientKeyCertArgs();

    /**
     * Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="caCertRef")
    private @Nullable Output<String> caCertRef;

    /**
     * @return Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> caCertRef() {
        return Optional.ofNullable(this.caCertRef);
    }

    /**
     * Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="clientCertRef", required=true)
    private Output<String> clientCertRef;

    /**
     * @return Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> clientCertRef() {
        return this.clientCertRef;
    }

    /**
     * The algorithm used to generate the client key for the connector. Valid values are RSA, EC
     * 
     */
    @Import(name="clientKeyAlgorithm", required=true)
    private Output<String> clientKeyAlgorithm;

    /**
     * @return The algorithm used to generate the client key for the connector. Valid values are RSA, EC
     * 
     */
    public Output<String> clientKeyAlgorithm() {
        return this.clientKeyAlgorithm;
    }

    /**
     * Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="clientKeyPassphraseRef")
    private @Nullable Output<String> clientKeyPassphraseRef;

    /**
     * @return Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Optional<Output<String>> clientKeyPassphraseRef() {
        return Optional.ofNullable(this.clientKeyPassphraseRef);
    }

    /**
     * Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="clientKeyRef", required=true)
    private Output<String> clientKeyRef;

    /**
     * @return Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> clientKeyRef() {
        return this.clientKeyRef;
    }

    /**
     * The URL of the Kubernetes cluster.
     * 
     */
    @Import(name="masterUrl", required=true)
    private Output<String> masterUrl;

    /**
     * @return The URL of the Kubernetes cluster.
     * 
     */
    public Output<String> masterUrl() {
        return this.masterUrl;
    }

    private KubernetesConnectorClientKeyCertArgs() {}

    private KubernetesConnectorClientKeyCertArgs(KubernetesConnectorClientKeyCertArgs $) {
        this.caCertRef = $.caCertRef;
        this.clientCertRef = $.clientCertRef;
        this.clientKeyAlgorithm = $.clientKeyAlgorithm;
        this.clientKeyPassphraseRef = $.clientKeyPassphraseRef;
        this.clientKeyRef = $.clientKeyRef;
        this.masterUrl = $.masterUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesConnectorClientKeyCertArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesConnectorClientKeyCertArgs $;

        public Builder() {
            $ = new KubernetesConnectorClientKeyCertArgs();
        }

        public Builder(KubernetesConnectorClientKeyCertArgs defaults) {
            $ = new KubernetesConnectorClientKeyCertArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCertRef Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder caCertRef(@Nullable Output<String> caCertRef) {
            $.caCertRef = caCertRef;
            return this;
        }

        /**
         * @param caCertRef Reference to the secret containing the CA certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder caCertRef(String caCertRef) {
            return caCertRef(Output.of(caCertRef));
        }

        /**
         * @param clientCertRef Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder clientCertRef(Output<String> clientCertRef) {
            $.clientCertRef = clientCertRef;
            return this;
        }

        /**
         * @param clientCertRef Reference to the secret containing the client certificate for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder clientCertRef(String clientCertRef) {
            return clientCertRef(Output.of(clientCertRef));
        }

        /**
         * @param clientKeyAlgorithm The algorithm used to generate the client key for the connector. Valid values are RSA, EC
         * 
         * @return builder
         * 
         */
        public Builder clientKeyAlgorithm(Output<String> clientKeyAlgorithm) {
            $.clientKeyAlgorithm = clientKeyAlgorithm;
            return this;
        }

        /**
         * @param clientKeyAlgorithm The algorithm used to generate the client key for the connector. Valid values are RSA, EC
         * 
         * @return builder
         * 
         */
        public Builder clientKeyAlgorithm(String clientKeyAlgorithm) {
            return clientKeyAlgorithm(Output.of(clientKeyAlgorithm));
        }

        /**
         * @param clientKeyPassphraseRef Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder clientKeyPassphraseRef(@Nullable Output<String> clientKeyPassphraseRef) {
            $.clientKeyPassphraseRef = clientKeyPassphraseRef;
            return this;
        }

        /**
         * @param clientKeyPassphraseRef Reference to the secret containing the client key passphrase for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder clientKeyPassphraseRef(String clientKeyPassphraseRef) {
            return clientKeyPassphraseRef(Output.of(clientKeyPassphraseRef));
        }

        /**
         * @param clientKeyRef Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder clientKeyRef(Output<String> clientKeyRef) {
            $.clientKeyRef = clientKeyRef;
            return this;
        }

        /**
         * @param clientKeyRef Reference to the secret containing the client key for the connector. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder clientKeyRef(String clientKeyRef) {
            return clientKeyRef(Output.of(clientKeyRef));
        }

        /**
         * @param masterUrl The URL of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder masterUrl(Output<String> masterUrl) {
            $.masterUrl = masterUrl;
            return this;
        }

        /**
         * @param masterUrl The URL of the Kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder masterUrl(String masterUrl) {
            return masterUrl(Output.of(masterUrl));
        }

        public KubernetesConnectorClientKeyCertArgs build() {
            $.clientCertRef = Objects.requireNonNull($.clientCertRef, "expected parameter 'clientCertRef' to be non-null");
            $.clientKeyAlgorithm = Objects.requireNonNull($.clientKeyAlgorithm, "expected parameter 'clientKeyAlgorithm' to be non-null");
            $.clientKeyRef = Objects.requireNonNull($.clientKeyRef, "expected parameter 'clientKeyRef' to be non-null");
            $.masterUrl = Objects.requireNonNull($.masterUrl, "expected parameter 'masterUrl' to be non-null");
            return $;
        }
    }

}
