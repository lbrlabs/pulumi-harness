// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplicationSpecSourceHelmFileParameter;
import com.pulumi.harness.platform.outputs.GitOpsApplicationsApplicationSpecSourceHelmParameter;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsApplicationsApplicationSpecSourceHelm {
    private @Nullable List<GitOpsApplicationsApplicationSpecSourceHelmFileParameter> fileParameters;
    private @Nullable List<GitOpsApplicationsApplicationSpecSourceHelmParameter> parameters;
    private @Nullable Boolean passCredentials;
    private @Nullable String releaseName;
    private @Nullable List<String> valueFiles;
    private @Nullable String values;
    private @Nullable String version;

    private GitOpsApplicationsApplicationSpecSourceHelm() {}
    public List<GitOpsApplicationsApplicationSpecSourceHelmFileParameter> fileParameters() {
        return this.fileParameters == null ? List.of() : this.fileParameters;
    }
    public List<GitOpsApplicationsApplicationSpecSourceHelmParameter> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }
    public Optional<Boolean> passCredentials() {
        return Optional.ofNullable(this.passCredentials);
    }
    public Optional<String> releaseName() {
        return Optional.ofNullable(this.releaseName);
    }
    public List<String> valueFiles() {
        return this.valueFiles == null ? List.of() : this.valueFiles;
    }
    public Optional<String> values() {
        return Optional.ofNullable(this.values);
    }
    public Optional<String> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsApplicationsApplicationSpecSourceHelm defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<GitOpsApplicationsApplicationSpecSourceHelmFileParameter> fileParameters;
        private @Nullable List<GitOpsApplicationsApplicationSpecSourceHelmParameter> parameters;
        private @Nullable Boolean passCredentials;
        private @Nullable String releaseName;
        private @Nullable List<String> valueFiles;
        private @Nullable String values;
        private @Nullable String version;
        public Builder() {}
        public Builder(GitOpsApplicationsApplicationSpecSourceHelm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileParameters = defaults.fileParameters;
    	      this.parameters = defaults.parameters;
    	      this.passCredentials = defaults.passCredentials;
    	      this.releaseName = defaults.releaseName;
    	      this.valueFiles = defaults.valueFiles;
    	      this.values = defaults.values;
    	      this.version = defaults.version;
        }

        @CustomType.Setter
        public Builder fileParameters(@Nullable List<GitOpsApplicationsApplicationSpecSourceHelmFileParameter> fileParameters) {
            this.fileParameters = fileParameters;
            return this;
        }
        public Builder fileParameters(GitOpsApplicationsApplicationSpecSourceHelmFileParameter... fileParameters) {
            return fileParameters(List.of(fileParameters));
        }
        @CustomType.Setter
        public Builder parameters(@Nullable List<GitOpsApplicationsApplicationSpecSourceHelmParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(GitOpsApplicationsApplicationSpecSourceHelmParameter... parameters) {
            return parameters(List.of(parameters));
        }
        @CustomType.Setter
        public Builder passCredentials(@Nullable Boolean passCredentials) {
            this.passCredentials = passCredentials;
            return this;
        }
        @CustomType.Setter
        public Builder releaseName(@Nullable String releaseName) {
            this.releaseName = releaseName;
            return this;
        }
        @CustomType.Setter
        public Builder valueFiles(@Nullable List<String> valueFiles) {
            this.valueFiles = valueFiles;
            return this;
        }
        public Builder valueFiles(String... valueFiles) {
            return valueFiles(List.of(valueFiles));
        }
        @CustomType.Setter
        public Builder values(@Nullable String values) {
            this.values = values;
            return this;
        }
        @CustomType.Setter
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }
        public GitOpsApplicationsApplicationSpecSourceHelm build() {
            final var o = new GitOpsApplicationsApplicationSpecSourceHelm();
            o.fileParameters = fileParameters;
            o.parameters = parameters;
            o.passCredentials = passCredentials;
            o.releaseName = releaseName;
            o.valueFiles = valueFiles;
            o.values = values;
            o.version = version;
            return o;
        }
    }
}
