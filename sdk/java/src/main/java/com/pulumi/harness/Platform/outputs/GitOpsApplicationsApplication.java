// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplicationMetadata;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplicationSpec;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsApplicationsApplication {
    /**
     * @return Metadata corresponding to the resources. This includes all the objects a user must create.
     * 
     */
    private List<GitOpsApplicationsApplicationMetadata> metadatas;
    /**
     * @return Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
     * 
     */
    private @Nullable List<GitOpsApplicationsApplicationSpec> specs;

    private GitOpsApplicationsApplication() {}
    /**
     * @return Metadata corresponding to the resources. This includes all the objects a user must create.
     * 
     */
    public List<GitOpsApplicationsApplicationMetadata> metadatas() {
        return this.metadatas;
    }
    /**
     * @return Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
     * 
     */
    public List<GitOpsApplicationsApplicationSpec> specs() {
        return this.specs == null ? List.of() : this.specs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsApplicationsApplication defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GitOpsApplicationsApplicationMetadata> metadatas;
        private @Nullable List<GitOpsApplicationsApplicationSpec> specs;
        public Builder() {}
        public Builder(GitOpsApplicationsApplication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadatas = defaults.metadatas;
    	      this.specs = defaults.specs;
        }

        @CustomType.Setter
        public Builder metadatas(List<GitOpsApplicationsApplicationMetadata> metadatas) {
            this.metadatas = Objects.requireNonNull(metadatas);
            return this;
        }
        public Builder metadatas(GitOpsApplicationsApplicationMetadata... metadatas) {
            return metadatas(List.of(metadatas));
        }
        @CustomType.Setter
        public Builder specs(@Nullable List<GitOpsApplicationsApplicationSpec> specs) {
            this.specs = specs;
            return this;
        }
        public Builder specs(GitOpsApplicationsApplicationSpec... specs) {
            return specs(List.of(specs));
        }
        public GitOpsApplicationsApplication build() {
            final var o = new GitOpsApplicationsApplication();
            o.metadatas = metadatas;
            o.specs = specs;
            return o;
        }
    }
}
