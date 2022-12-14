// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BitbucketConnectorCredentialsSshArgs extends com.pulumi.resources.ResourceArgs {

    public static final BitbucketConnectorCredentialsSshArgs Empty = new BitbucketConnectorCredentialsSshArgs();

    @Import(name="sshKeyRef", required=true)
    private Output<String> sshKeyRef;

    public Output<String> sshKeyRef() {
        return this.sshKeyRef;
    }

    private BitbucketConnectorCredentialsSshArgs() {}

    private BitbucketConnectorCredentialsSshArgs(BitbucketConnectorCredentialsSshArgs $) {
        this.sshKeyRef = $.sshKeyRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BitbucketConnectorCredentialsSshArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BitbucketConnectorCredentialsSshArgs $;

        public Builder() {
            $ = new BitbucketConnectorCredentialsSshArgs();
        }

        public Builder(BitbucketConnectorCredentialsSshArgs defaults) {
            $ = new BitbucketConnectorCredentialsSshArgs(Objects.requireNonNull(defaults));
        }

        public Builder sshKeyRef(Output<String> sshKeyRef) {
            $.sshKeyRef = sshKeyRef;
            return this;
        }

        public Builder sshKeyRef(String sshKeyRef) {
            return sshKeyRef(Output.of(sshKeyRef));
        }

        public BitbucketConnectorCredentialsSshArgs build() {
            $.sshKeyRef = Objects.requireNonNull($.sshKeyRef, "expected parameter 'sshKeyRef' to be non-null");
            return $;
        }
    }

}
