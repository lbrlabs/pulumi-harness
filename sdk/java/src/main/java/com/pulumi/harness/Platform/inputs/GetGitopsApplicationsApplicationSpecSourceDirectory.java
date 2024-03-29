// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceDirectory extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceDirectory Empty = new GetGitopsApplicationsApplicationSpecSourceDirectory();

    @Import(name="exclude")
    private @Nullable String exclude;

    public Optional<String> exclude() {
        return Optional.ofNullable(this.exclude);
    }

    @Import(name="include")
    private @Nullable String include;

    public Optional<String> include() {
        return Optional.ofNullable(this.include);
    }

    @Import(name="jsonnets")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet>> jsonnets() {
        return Optional.ofNullable(this.jsonnets);
    }

    @Import(name="recurse")
    private @Nullable Boolean recurse;

    public Optional<Boolean> recurse() {
        return Optional.ofNullable(this.recurse);
    }

    private GetGitopsApplicationsApplicationSpecSourceDirectory() {}

    private GetGitopsApplicationsApplicationSpecSourceDirectory(GetGitopsApplicationsApplicationSpecSourceDirectory $) {
        this.exclude = $.exclude;
        this.include = $.include;
        this.jsonnets = $.jsonnets;
        this.recurse = $.recurse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceDirectory defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceDirectory $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceDirectory();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceDirectory defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceDirectory(Objects.requireNonNull(defaults));
        }

        public Builder exclude(@Nullable String exclude) {
            $.exclude = exclude;
            return this;
        }

        public Builder include(@Nullable String include) {
            $.include = include;
            return this;
        }

        public Builder jsonnets(@Nullable List<GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet> jsonnets) {
            $.jsonnets = jsonnets;
            return this;
        }

        public Builder jsonnets(GetGitopsApplicationsApplicationSpecSourceDirectoryJsonnet... jsonnets) {
            return jsonnets(List.of(jsonnets));
        }

        public Builder recurse(@Nullable Boolean recurse) {
            $.recurse = recurse;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSourceDirectory build() {
            return $;
        }
    }

}
