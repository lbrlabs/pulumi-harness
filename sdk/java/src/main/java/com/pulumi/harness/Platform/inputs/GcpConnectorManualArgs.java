// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GcpConnectorManualArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcpConnectorManualArgs Empty = new GcpConnectorManualArgs();

    /**
     * The delegates to connect with.
     * 
     */
    @Import(name="delegateSelectors", required=true)
    private Output<List<String>> delegateSelectors;

    /**
     * @return The delegates to connect with.
     * 
     */
    public Output<List<String>> delegateSelectors() {
        return this.delegateSelectors;
    }

    /**
     * Reference to the Harness secret containing the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    @Import(name="secretKeyRef", required=true)
    private Output<String> secretKeyRef;

    /**
     * @return Reference to the Harness secret containing the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
     * 
     */
    public Output<String> secretKeyRef() {
        return this.secretKeyRef;
    }

    private GcpConnectorManualArgs() {}

    private GcpConnectorManualArgs(GcpConnectorManualArgs $) {
        this.delegateSelectors = $.delegateSelectors;
        this.secretKeyRef = $.secretKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcpConnectorManualArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcpConnectorManualArgs $;

        public Builder() {
            $ = new GcpConnectorManualArgs();
        }

        public Builder(GcpConnectorManualArgs defaults) {
            $ = new GcpConnectorManualArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param delegateSelectors The delegates to connect with.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors The delegates to connect with.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors The delegates to connect with.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param secretKeyRef Reference to the Harness secret containing the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(Output<String> secretKeyRef) {
            $.secretKeyRef = secretKeyRef;
            return this;
        }

        /**
         * @param secretKeyRef Reference to the Harness secret containing the secret key. To reference a secret at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference a secret at the account scope, prefix &#39;account` to the expression: account.{identifier}.
         * 
         * @return builder
         * 
         */
        public Builder secretKeyRef(String secretKeyRef) {
            return secretKeyRef(Output.of(secretKeyRef));
        }

        public GcpConnectorManualArgs build() {
            $.delegateSelectors = Objects.requireNonNull($.delegateSelectors, "expected parameter 'delegateSelectors' to be non-null");
            $.secretKeyRef = Objects.requireNonNull($.secretKeyRef, "expected parameter 'secretKeyRef' to be non-null");
            return $;
        }
    }

}
