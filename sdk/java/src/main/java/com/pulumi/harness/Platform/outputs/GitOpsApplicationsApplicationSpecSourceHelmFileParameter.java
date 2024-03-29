// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsApplicationsApplicationSpecSourceHelmFileParameter {
    /**
     * @return Name of the GitOps application.
     * 
     */
    private @Nullable String name;
    private @Nullable String path;

    private GitOpsApplicationsApplicationSpecSourceHelmFileParameter() {}
    /**
     * @return Name of the GitOps application.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsApplicationsApplicationSpecSourceHelmFileParameter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String name;
        private @Nullable String path;
        public Builder() {}
        public Builder(GitOpsApplicationsApplicationSpecSourceHelmFileParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        public GitOpsApplicationsApplicationSpecSourceHelmFileParameter build() {
            final var o = new GitOpsApplicationsApplicationSpecSourceHelmFileParameter();
            o.name = name;
            o.path = path;
            return o;
        }
    }
}
