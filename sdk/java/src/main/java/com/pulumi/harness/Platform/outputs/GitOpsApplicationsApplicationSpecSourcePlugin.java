// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplicationSpecSourcePluginEnv;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsApplicationsApplicationSpecSourcePlugin {
    private @Nullable List<GitOpsApplicationsApplicationSpecSourcePluginEnv> envs;
    /**
     * @return Name of the GitOps application.
     * 
     */
    private @Nullable String name;

    private GitOpsApplicationsApplicationSpecSourcePlugin() {}
    public List<GitOpsApplicationsApplicationSpecSourcePluginEnv> envs() {
        return this.envs == null ? List.of() : this.envs;
    }
    /**
     * @return Name of the GitOps application.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsApplicationsApplicationSpecSourcePlugin defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitOpsApplicationsApplicationSpecSourcePluginEnv> envs;
        private @Nullable String name;
        public Builder() {}
        public Builder(GitOpsApplicationsApplicationSpecSourcePlugin defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.envs = defaults.envs;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder envs(@Nullable List<GitOpsApplicationsApplicationSpecSourcePluginEnv> envs) {
            this.envs = envs;
            return this;
        }
        public Builder envs(GitOpsApplicationsApplicationSpecSourcePluginEnv... envs) {
            return envs(List.of(envs));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public GitOpsApplicationsApplicationSpecSourcePlugin build() {
            final var o = new GitOpsApplicationsApplicationSpecSourcePlugin();
            o.envs = envs;
            o.name = name;
            return o;
        }
    }
}
