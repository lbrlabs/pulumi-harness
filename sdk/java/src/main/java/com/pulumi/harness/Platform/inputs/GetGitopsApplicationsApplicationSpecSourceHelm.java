// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceHelmFileParameter;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecSourceHelmParameter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceHelm extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceHelm Empty = new GetGitopsApplicationsApplicationSpecSourceHelm();

    @Import(name="fileParameters")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceHelmFileParameter> fileParameters;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceHelmFileParameter>> fileParameters() {
        return Optional.ofNullable(this.fileParameters);
    }

    @Import(name="parameters")
    private @Nullable List<GetGitopsApplicationsApplicationSpecSourceHelmParameter> parameters;

    public Optional<List<GetGitopsApplicationsApplicationSpecSourceHelmParameter>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    @Import(name="passCredentials")
    private @Nullable Boolean passCredentials;

    public Optional<Boolean> passCredentials() {
        return Optional.ofNullable(this.passCredentials);
    }

    @Import(name="releaseName")
    private @Nullable String releaseName;

    public Optional<String> releaseName() {
        return Optional.ofNullable(this.releaseName);
    }

    @Import(name="valueFiles")
    private @Nullable List<String> valueFiles;

    public Optional<List<String>> valueFiles() {
        return Optional.ofNullable(this.valueFiles);
    }

    @Import(name="values")
    private @Nullable String values;

    public Optional<String> values() {
        return Optional.ofNullable(this.values);
    }

    @Import(name="version")
    private @Nullable String version;

    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    private GetGitopsApplicationsApplicationSpecSourceHelm() {}

    private GetGitopsApplicationsApplicationSpecSourceHelm(GetGitopsApplicationsApplicationSpecSourceHelm $) {
        this.fileParameters = $.fileParameters;
        this.parameters = $.parameters;
        this.passCredentials = $.passCredentials;
        this.releaseName = $.releaseName;
        this.valueFiles = $.valueFiles;
        this.values = $.values;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceHelm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceHelm $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceHelm();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceHelm defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceHelm(Objects.requireNonNull(defaults));
        }

        public Builder fileParameters(@Nullable List<GetGitopsApplicationsApplicationSpecSourceHelmFileParameter> fileParameters) {
            $.fileParameters = fileParameters;
            return this;
        }

        public Builder fileParameters(GetGitopsApplicationsApplicationSpecSourceHelmFileParameter... fileParameters) {
            return fileParameters(List.of(fileParameters));
        }

        public Builder parameters(@Nullable List<GetGitopsApplicationsApplicationSpecSourceHelmParameter> parameters) {
            $.parameters = parameters;
            return this;
        }

        public Builder parameters(GetGitopsApplicationsApplicationSpecSourceHelmParameter... parameters) {
            return parameters(List.of(parameters));
        }

        public Builder passCredentials(@Nullable Boolean passCredentials) {
            $.passCredentials = passCredentials;
            return this;
        }

        public Builder releaseName(@Nullable String releaseName) {
            $.releaseName = releaseName;
            return this;
        }

        public Builder valueFiles(@Nullable List<String> valueFiles) {
            $.valueFiles = valueFiles;
            return this;
        }

        public Builder valueFiles(String... valueFiles) {
            return valueFiles(List.of(valueFiles));
        }

        public Builder values(@Nullable String values) {
            $.values = values;
            return this;
        }

        public Builder version(@Nullable String version) {
            $.version = version;
            return this;
        }

        public GetGitopsApplicationsApplicationSpecSourceHelm build() {
            return $;
        }
    }

}
