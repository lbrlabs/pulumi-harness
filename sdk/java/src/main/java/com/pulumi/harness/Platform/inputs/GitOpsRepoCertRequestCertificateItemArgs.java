// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsRepoCertRequestCertificateItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsRepoCertRequestCertificateItemArgs Empty = new GitOpsRepoCertRequestCertificateItemArgs();

    @Import(name="certData")
    private @Nullable Output<String> certData;

    public Optional<Output<String>> certData() {
        return Optional.ofNullable(this.certData);
    }

    @Import(name="certInfo")
    private @Nullable Output<String> certInfo;

    public Optional<Output<String>> certInfo() {
        return Optional.ofNullable(this.certInfo);
    }

    @Import(name="certSubType")
    private @Nullable Output<String> certSubType;

    public Optional<Output<String>> certSubType() {
        return Optional.ofNullable(this.certSubType);
    }

    @Import(name="certType")
    private @Nullable Output<String> certType;

    public Optional<Output<String>> certType() {
        return Optional.ofNullable(this.certType);
    }

    @Import(name="serverName")
    private @Nullable Output<String> serverName;

    public Optional<Output<String>> serverName() {
        return Optional.ofNullable(this.serverName);
    }

    private GitOpsRepoCertRequestCertificateItemArgs() {}

    private GitOpsRepoCertRequestCertificateItemArgs(GitOpsRepoCertRequestCertificateItemArgs $) {
        this.certData = $.certData;
        this.certInfo = $.certInfo;
        this.certSubType = $.certSubType;
        this.certType = $.certType;
        this.serverName = $.serverName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsRepoCertRequestCertificateItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsRepoCertRequestCertificateItemArgs $;

        public Builder() {
            $ = new GitOpsRepoCertRequestCertificateItemArgs();
        }

        public Builder(GitOpsRepoCertRequestCertificateItemArgs defaults) {
            $ = new GitOpsRepoCertRequestCertificateItemArgs(Objects.requireNonNull(defaults));
        }

        public Builder certData(@Nullable Output<String> certData) {
            $.certData = certData;
            return this;
        }

        public Builder certData(String certData) {
            return certData(Output.of(certData));
        }

        public Builder certInfo(@Nullable Output<String> certInfo) {
            $.certInfo = certInfo;
            return this;
        }

        public Builder certInfo(String certInfo) {
            return certInfo(Output.of(certInfo));
        }

        public Builder certSubType(@Nullable Output<String> certSubType) {
            $.certSubType = certSubType;
            return this;
        }

        public Builder certSubType(String certSubType) {
            return certSubType(Output.of(certSubType));
        }

        public Builder certType(@Nullable Output<String> certType) {
            $.certType = certType;
            return this;
        }

        public Builder certType(String certType) {
            return certType(Output.of(certType));
        }

        public Builder serverName(@Nullable Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public GitOpsRepoCertRequestCertificateItemArgs build() {
            return $;
        }
    }

}
