// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecDestinationArgs;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceArgs;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSyncPolicyArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsApplicationsApplicationSpecArgs Empty = new GetGitopsApplicationsApplicationSpecArgs();

    @Import(name="destinations")
    private @Nullable Output<List<GetGitopsApplicationsApplicationSpecDestinationArgs>> destinations;

    public Optional<Output<List<GetGitopsApplicationsApplicationSpecDestinationArgs>>> destinations() {
        return Optional.ofNullable(this.destinations);
    }

    @Import(name="sources")
    private @Nullable Output<List<GetGitopsApplicationsApplicationSpecSourceArgs>> sources;

    public Optional<Output<List<GetGitopsApplicationsApplicationSpecSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    @Import(name="syncPolicies")
    private @Nullable Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyArgs>> syncPolicies;

    public Optional<Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyArgs>>> syncPolicies() {
        return Optional.ofNullable(this.syncPolicies);
    }

    private GetGitopsApplicationsApplicationSpecArgs() {}

    private GetGitopsApplicationsApplicationSpecArgs(GetGitopsApplicationsApplicationSpecArgs $) {
        this.destinations = $.destinations;
        this.sources = $.sources;
        this.syncPolicies = $.syncPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecArgs $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecArgs();
        }

        public Builder(GetGitopsApplicationsApplicationSpecArgs defaults) {
            $ = new GetGitopsApplicationsApplicationSpecArgs(Objects.requireNonNull(defaults));
        }

        public Builder destinations(@Nullable Output<List<GetGitopsApplicationsApplicationSpecDestinationArgs>> destinations) {
            $.destinations = destinations;
            return this;
        }

        public Builder destinations(List<GetGitopsApplicationsApplicationSpecDestinationArgs> destinations) {
            return destinations(Output.of(destinations));
        }

        public Builder destinations(GetGitopsApplicationsApplicationSpecDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }

        public Builder sources(@Nullable Output<List<GetGitopsApplicationsApplicationSpecSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        public Builder sources(List<GetGitopsApplicationsApplicationSpecSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        public Builder sources(GetGitopsApplicationsApplicationSpecSourceArgs... sources) {
            return sources(List.of(sources));
        }

        public Builder syncPolicies(@Nullable Output<List<GetGitopsApplicationsApplicationSpecSyncPolicyArgs>> syncPolicies) {
            $.syncPolicies = syncPolicies;
            return this;
        }

        public Builder syncPolicies(List<GetGitopsApplicationsApplicationSpecSyncPolicyArgs> syncPolicies) {
            return syncPolicies(Output.of(syncPolicies));
        }

        public Builder syncPolicies(GetGitopsApplicationsApplicationSpecSyncPolicyArgs... syncPolicies) {
            return syncPolicies(List.of(syncPolicies));
        }

        public GetGitopsApplicationsApplicationSpecArgs build() {
            return $;
        }
    }

}
