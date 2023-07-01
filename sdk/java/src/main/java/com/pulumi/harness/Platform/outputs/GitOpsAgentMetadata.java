// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsAgentMetadata {
    /**
     * @return Indicates if the deployment should be deployed using the deploy-ha.yaml
     * 
     */
    private @Nullable Boolean highAvailability;
    /**
     * @return The k8s namespace that this agent resides in.
     * 
     */
    private @Nullable String namespace;

    private GitOpsAgentMetadata() {}
    /**
     * @return Indicates if the deployment should be deployed using the deploy-ha.yaml
     * 
     */
    public Optional<Boolean> highAvailability() {
        return Optional.ofNullable(this.highAvailability);
    }
    /**
     * @return The k8s namespace that this agent resides in.
     * 
     */
    public Optional<String> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsAgentMetadata defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean highAvailability;
        private @Nullable String namespace;
        public Builder() {}
        public Builder(GitOpsAgentMetadata defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.highAvailability = defaults.highAvailability;
    	      this.namespace = defaults.namespace;
        }

        @CustomType.Setter
        public Builder highAvailability(@Nullable Boolean highAvailability) {
            this.highAvailability = highAvailability;
            return this;
        }
        @CustomType.Setter
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public GitOpsAgentMetadata build() {
            final var o = new GitOpsAgentMetadata();
            o.highAvailability = highAvailability;
            o.namespace = namespace;
            return o;
        }
    }
}
