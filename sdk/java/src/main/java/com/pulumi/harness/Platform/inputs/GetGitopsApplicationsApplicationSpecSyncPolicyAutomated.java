// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSyncPolicyAutomated extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSyncPolicyAutomated Empty = new GetGitopsApplicationsApplicationSpecSyncPolicyAutomated();

    @Import(name="allowEmpty")
    private @Nullable Boolean allowEmpty;

    public Optional<Boolean> allowEmpty() {
        return Optional.ofNullable(this.allowEmpty);
    }

    @Import(name="prune")
    private @Nullable Boolean prune;

    public Optional<Boolean> prune() {
        return Optional.ofNullable(this.prune);
    }

    @Import(name="selfHeal")
    private @Nullable Boolean selfHeal;

    public Optional<Boolean> selfHeal() {
        return Optional.ofNullable(this.selfHeal);
    }

    private GetGitopsApplicationsApplicationSpecSyncPolicyAutomated() {}

    private GetGitopsApplicationsApplicationSpecSyncPolicyAutomated(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated $) {
        this.allowEmpty = $.allowEmpty;
        this.prune = $.prune;
        this.selfHeal = $.selfHeal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSyncPolicyAutomated $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyAutomated();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSyncPolicyAutomated defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSyncPolicyAutomated(Objects.requireNonNull(defaults));
        }

        public Builder allowEmpty(@Nullable Boolean allowEmpty) {
            $.allowEmpty = allowEmpty;
            return this;
        }

        public Builder prune(@Nullable Boolean prune) {
            $.prune = prune;
            return this;
        }

        public Builder selfHeal(@Nullable Boolean selfHeal) {
            $.selfHeal = selfHeal;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSyncPolicyAutomated build() {
            return $;
        }
    }

}
