// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceNowConnectorAuthAdfsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNowConnectorAuthAdfsArgs Empty = new ServiceNowConnectorAuthAdfsArgs();

    @Import(name="adfsUrl", required=true)
    private Output<String> adfsUrl;

    public Output<String> adfsUrl() {
        return this.adfsUrl;
    }

    @Import(name="certificateRef", required=true)
    private Output<String> certificateRef;

    public Output<String> certificateRef() {
        return this.certificateRef;
    }

    @Import(name="clientIdRef", required=true)
    private Output<String> clientIdRef;

    public Output<String> clientIdRef() {
        return this.clientIdRef;
    }

    @Import(name="privateKeyRef", required=true)
    private Output<String> privateKeyRef;

    public Output<String> privateKeyRef() {
        return this.privateKeyRef;
    }

    @Import(name="resourceIdRef", required=true)
    private Output<String> resourceIdRef;

    public Output<String> resourceIdRef() {
        return this.resourceIdRef;
    }

    private ServiceNowConnectorAuthAdfsArgs() {}

    private ServiceNowConnectorAuthAdfsArgs(ServiceNowConnectorAuthAdfsArgs $) {
        this.adfsUrl = $.adfsUrl;
        this.certificateRef = $.certificateRef;
        this.clientIdRef = $.clientIdRef;
        this.privateKeyRef = $.privateKeyRef;
        this.resourceIdRef = $.resourceIdRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNowConnectorAuthAdfsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNowConnectorAuthAdfsArgs $;

        public Builder() {
            $ = new ServiceNowConnectorAuthAdfsArgs();
        }

        public Builder(ServiceNowConnectorAuthAdfsArgs defaults) {
            $ = new ServiceNowConnectorAuthAdfsArgs(Objects.requireNonNull(defaults));
        }

        public Builder adfsUrl(Output<String> adfsUrl) {
            $.adfsUrl = adfsUrl;
            return this;
        }

        public Builder adfsUrl(String adfsUrl) {
            return adfsUrl(Output.of(adfsUrl));
        }

        public Builder certificateRef(Output<String> certificateRef) {
            $.certificateRef = certificateRef;
            return this;
        }

        public Builder certificateRef(String certificateRef) {
            return certificateRef(Output.of(certificateRef));
        }

        public Builder clientIdRef(Output<String> clientIdRef) {
            $.clientIdRef = clientIdRef;
            return this;
        }

        public Builder clientIdRef(String clientIdRef) {
            return clientIdRef(Output.of(clientIdRef));
        }

        public Builder privateKeyRef(Output<String> privateKeyRef) {
            $.privateKeyRef = privateKeyRef;
            return this;
        }

        public Builder privateKeyRef(String privateKeyRef) {
            return privateKeyRef(Output.of(privateKeyRef));
        }

        public Builder resourceIdRef(Output<String> resourceIdRef) {
            $.resourceIdRef = resourceIdRef;
            return this;
        }

        public Builder resourceIdRef(String resourceIdRef) {
            return resourceIdRef(Output.of(resourceIdRef));
        }

        public ServiceNowConnectorAuthAdfsArgs build() {
            $.adfsUrl = Objects.requireNonNull($.adfsUrl, "expected parameter 'adfsUrl' to be non-null");
            $.certificateRef = Objects.requireNonNull($.certificateRef, "expected parameter 'certificateRef' to be non-null");
            $.clientIdRef = Objects.requireNonNull($.clientIdRef, "expected parameter 'clientIdRef' to be non-null");
            $.privateKeyRef = Objects.requireNonNull($.privateKeyRef, "expected parameter 'privateKeyRef' to be non-null");
            $.resourceIdRef = Objects.requireNonNull($.resourceIdRef, "expected parameter 'resourceIdRef' to be non-null");
            return $;
        }
    }

}