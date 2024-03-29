// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar;
import com.pulumi.harness.platform.outputs.GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet {
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar> extVars;
    private @Nullable List<String> libs;
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla> tlas;

    private GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet() {}
    public List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar> extVars() {
        return this.extVars == null ? List.of() : this.extVars;
    }
    public List<String> libs() {
        return this.libs == null ? List.of() : this.libs;
    }
    public List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla> tlas() {
        return this.tlas == null ? List.of() : this.tlas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar> extVars;
        private @Nullable List<String> libs;
        private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla> tlas;
        public Builder() {}
        public Builder(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extVars = defaults.extVars;
    	      this.libs = defaults.libs;
    	      this.tlas = defaults.tlas;
        }

        @CustomType.Setter
        public Builder extVars(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar> extVars) {
            this.extVars = extVars;
            return this;
        }
        public Builder extVars(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar... extVars) {
            return extVars(List.of(extVars));
        }
        @CustomType.Setter
        public Builder libs(@Nullable List<String> libs) {
            this.libs = libs;
            return this;
        }
        public Builder libs(String... libs) {
            return libs(List.of(libs));
        }
        @CustomType.Setter
        public Builder tlas(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla> tlas) {
            this.tlas = tlas;
            return this;
        }
        public Builder tlas(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla... tlas) {
            return tlas(List.of(tlas));
        }
        public GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet build() {
            final var o = new GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet();
            o.extVars = extVars;
            o.libs = libs;
            o.tlas = tlas;
            return o;
        }
    }
}
