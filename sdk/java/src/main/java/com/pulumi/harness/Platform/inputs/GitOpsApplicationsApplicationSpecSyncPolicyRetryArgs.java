// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs Empty = new GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs();

    @Import(name="backoffs")
    private @Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs>> backoffs;

    public Optional<Output<List<GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs>>> backoffs() {
        return Optional.ofNullable(this.backoffs);
    }

    @Import(name="limit")
    private @Nullable Output<String> limit;

    public Optional<Output<String>> limit() {
        return Optional.ofNullable(this.limit);
    }

    private GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs() {}

    private GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs(GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs $) {
        this.backoffs = $.backoffs;
        this.limit = $.limit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs $;

        public Builder() {
            $ = new GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs();
        }

        public Builder(GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs defaults) {
            $ = new GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs(Objects.requireNonNull(defaults));
        }

        public Builder backoffs(@Nullable Output<List<GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs>> backoffs) {
            $.backoffs = backoffs;
            return this;
        }

        public Builder backoffs(List<GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs> backoffs) {
            return backoffs(Output.of(backoffs));
        }

        public Builder backoffs(GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffArgs... backoffs) {
            return backoffs(List.of(backoffs));
        }

        public Builder limit(@Nullable Output<String> limit) {
            $.limit = limit;
            return this;
        }

        public Builder limit(String limit) {
            return limit(Output.of(limit));
        }

        public GitOpsApplicationsApplicationSpecSyncPolicyRetryArgs build() {
            return $;
        }
    }

}
