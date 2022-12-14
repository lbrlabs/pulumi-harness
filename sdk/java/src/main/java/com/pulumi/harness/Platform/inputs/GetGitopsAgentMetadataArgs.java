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


public final class GetGitopsAgentMetadataArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsAgentMetadataArgs Empty = new GetGitopsAgentMetadataArgs();

    @Import(name="highAvailability")
    private @Nullable Output<Boolean> highAvailability;

    public Optional<Output<Boolean>> highAvailability() {
        return Optional.ofNullable(this.highAvailability);
    }

    @Import(name="namespace", required=true)
    private Output<String> namespace;

    public Output<String> namespace() {
        return this.namespace;
    }

    private GetGitopsAgentMetadataArgs() {}

    private GetGitopsAgentMetadataArgs(GetGitopsAgentMetadataArgs $) {
        this.highAvailability = $.highAvailability;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsAgentMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsAgentMetadataArgs $;

        public Builder() {
            $ = new GetGitopsAgentMetadataArgs();
        }

        public Builder(GetGitopsAgentMetadataArgs defaults) {
            $ = new GetGitopsAgentMetadataArgs(Objects.requireNonNull(defaults));
        }

        public Builder highAvailability(@Nullable Output<Boolean> highAvailability) {
            $.highAvailability = highAvailability;
            return this;
        }

        public Builder highAvailability(Boolean highAvailability) {
            return highAvailability(Output.of(highAvailability));
        }

        public Builder namespace(Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        public GetGitopsAgentMetadataArgs build() {
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
