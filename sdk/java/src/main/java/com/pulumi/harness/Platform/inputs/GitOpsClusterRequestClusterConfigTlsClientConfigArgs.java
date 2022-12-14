// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsClusterRequestClusterConfigTlsClientConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsClusterRequestClusterConfigTlsClientConfigArgs Empty = new GitOpsClusterRequestClusterConfigTlsClientConfigArgs();

    @Import(name="caData")
    private @Nullable Output<String> caData;

    public Optional<Output<String>> caData() {
        return Optional.ofNullable(this.caData);
    }

    @Import(name="certData")
    private @Nullable Output<String> certData;

    public Optional<Output<String>> certData() {
        return Optional.ofNullable(this.certData);
    }

    @Import(name="insecure")
    private @Nullable Output<Boolean> insecure;

    public Optional<Output<Boolean>> insecure() {
        return Optional.ofNullable(this.insecure);
    }

    @Import(name="keyData")
    private @Nullable Output<String> keyData;

    public Optional<Output<String>> keyData() {
        return Optional.ofNullable(this.keyData);
    }

    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    private GitOpsClusterRequestClusterConfigTlsClientConfigArgs() {}

    private GitOpsClusterRequestClusterConfigTlsClientConfigArgs(GitOpsClusterRequestClusterConfigTlsClientConfigArgs $) {
        this.caData = $.caData;
        this.certData = $.certData;
        this.insecure = $.insecure;
        this.keyData = $.keyData;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsClusterRequestClusterConfigTlsClientConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsClusterRequestClusterConfigTlsClientConfigArgs $;

        public Builder() {
            $ = new GitOpsClusterRequestClusterConfigTlsClientConfigArgs();
        }

        public Builder(GitOpsClusterRequestClusterConfigTlsClientConfigArgs defaults) {
            $ = new GitOpsClusterRequestClusterConfigTlsClientConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder caData(@Nullable Output<String> caData) {
            $.caData = caData;
            return this;
        }

        public Builder caData(String caData) {
            return caData(Output.of(caData));
        }

        public Builder certData(@Nullable Output<String> certData) {
            $.certData = certData;
            return this;
        }

        public Builder certData(String certData) {
            return certData(Output.of(certData));
        }

        public Builder insecure(@Nullable Output<Boolean> insecure) {
            $.insecure = insecure;
            return this;
        }

        public Builder insecure(Boolean insecure) {
            return insecure(Output.of(insecure));
        }

        public Builder keyData(@Nullable Output<String> keyData) {
            $.keyData = keyData;
            return this;
        }

        public Builder keyData(String keyData) {
            return keyData(Output.of(keyData));
        }

        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public GitOpsClusterRequestClusterConfigTlsClientConfigArgs build() {
            return $;
        }
    }

}
