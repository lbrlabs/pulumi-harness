// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet Empty = new GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet();

    @Import(name="extVars")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar> extVars;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar>> extVars() {
        return Optional.ofNullable(this.extVars);
    }

    @Import(name="libs")
    private @Nullable List<String> libs;

    public Optional<List<String>> libs() {
        return Optional.ofNullable(this.libs);
    }

    @Import(name="tlas")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla> tlas;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla>> tlas() {
        return Optional.ofNullable(this.tlas);
    }

    private GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet() {}

    private GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet $) {
        this.extVars = $.extVars;
        this.libs = $.libs;
        this.tlas = $.tlas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet(Objects.requireNonNull(defaults));
        }

        public Builder extVars(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar> extVars) {
            $.extVars = extVars;
            return this;
        }

        public Builder extVars(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetExtVar... extVars) {
            return extVars(List.of(extVars));
        }

        public Builder libs(@Nullable List<String> libs) {
            $.libs = libs;
            return this;
        }

        public Builder libs(String... libs) {
            return libs(List.of(libs));
        }

        public Builder tlas(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla> tlas) {
            $.tlas = tlas;
            return this;
        }

        public Builder tlas(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnetTla... tlas) {
            return tlas(List.of(tlas));
        }

        public GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet build() {
            return $;
        }
    }

}