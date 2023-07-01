// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationSpecSourceKustomizeArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsApplicationsApplicationSpecSourceKustomizeArgs Empty = new GetGitopsApplicationsApplicationSpecSourceKustomizeArgs();

    @Import(name="commonAnnotations")
    private @Nullable Output<Map<String,String>> commonAnnotations;

    public Optional<Output<Map<String,String>>> commonAnnotations() {
        return Optional.ofNullable(this.commonAnnotations);
    }

    @Import(name="commonLabels")
    private @Nullable Output<Map<String,String>> commonLabels;

    public Optional<Output<Map<String,String>>> commonLabels() {
        return Optional.ofNullable(this.commonLabels);
    }

    @Import(name="forceCommonAnnotations")
    private @Nullable Output<Boolean> forceCommonAnnotations;

    public Optional<Output<Boolean>> forceCommonAnnotations() {
        return Optional.ofNullable(this.forceCommonAnnotations);
    }

    @Import(name="forceCommonLabels")
    private @Nullable Output<Boolean> forceCommonLabels;

    public Optional<Output<Boolean>> forceCommonLabels() {
        return Optional.ofNullable(this.forceCommonLabels);
    }

    @Import(name="images")
    private @Nullable Output<List<String>> images;

    public Optional<Output<List<String>>> images() {
        return Optional.ofNullable(this.images);
    }

    @Import(name="namePrefix")
    private @Nullable Output<String> namePrefix;

    public Optional<Output<String>> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    @Import(name="nameSuffix")
    private @Nullable Output<String> nameSuffix;

    public Optional<Output<String>> nameSuffix() {
        return Optional.ofNullable(this.nameSuffix);
    }

    @Import(name="version")
    private @Nullable Output<String> version;

    public Optional<Output<String>> version() {
        return Optional.ofNullable(this.version);
    }

    private GetGitopsApplicationsApplicationSpecSourceKustomizeArgs() {}

    private GetGitopsApplicationsApplicationSpecSourceKustomizeArgs(GetGitopsApplicationsApplicationSpecSourceKustomizeArgs $) {
        this.commonAnnotations = $.commonAnnotations;
        this.commonLabels = $.commonLabels;
        this.forceCommonAnnotations = $.forceCommonAnnotations;
        this.forceCommonLabels = $.forceCommonLabels;
        this.images = $.images;
        this.namePrefix = $.namePrefix;
        this.nameSuffix = $.nameSuffix;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationSpecSourceKustomizeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationSpecSourceKustomizeArgs $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationSpecSourceKustomizeArgs();
        }

        public Builder(GetGitopsApplicationsApplicationSpecSourceKustomizeArgs defaults) {
            $ = new GetGitopsApplicationsApplicationSpecSourceKustomizeArgs(Objects.requireNonNull(defaults));
        }

        public Builder commonAnnotations(@Nullable Output<Map<String,String>> commonAnnotations) {
            $.commonAnnotations = commonAnnotations;
            return this;
        }

        public Builder commonAnnotations(Map<String,String> commonAnnotations) {
            return commonAnnotations(Output.of(commonAnnotations));
        }

        public Builder commonLabels(@Nullable Output<Map<String,String>> commonLabels) {
            $.commonLabels = commonLabels;
            return this;
        }

        public Builder commonLabels(Map<String,String> commonLabels) {
            return commonLabels(Output.of(commonLabels));
        }

        public Builder forceCommonAnnotations(@Nullable Output<Boolean> forceCommonAnnotations) {
            $.forceCommonAnnotations = forceCommonAnnotations;
            return this;
        }

        public Builder forceCommonAnnotations(Boolean forceCommonAnnotations) {
            return forceCommonAnnotations(Output.of(forceCommonAnnotations));
        }

        public Builder forceCommonLabels(@Nullable Output<Boolean> forceCommonLabels) {
            $.forceCommonLabels = forceCommonLabels;
            return this;
        }

        public Builder forceCommonLabels(Boolean forceCommonLabels) {
            return forceCommonLabels(Output.of(forceCommonLabels));
        }

        public Builder images(@Nullable Output<List<String>> images) {
            $.images = images;
            return this;
        }

        public Builder images(List<String> images) {
            return images(Output.of(images));
        }

        public Builder images(String... images) {
            return images(List.of(images));
        }

        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        public Builder namePrefix(String namePrefix) {
            return namePrefix(Output.of(namePrefix));
        }

        public Builder nameSuffix(@Nullable Output<String> nameSuffix) {
            $.nameSuffix = nameSuffix;
            return this;
        }

        public Builder nameSuffix(String nameSuffix) {
            return nameSuffix(Output.of(nameSuffix));
        }

        public Builder version(@Nullable Output<String> version) {
            $.version = version;
            return this;
        }

        public Builder version(String version) {
            return version(Output.of(version));
        }

        public GetGitopsApplicationsApplicationSpecSourceKustomizeArgs build() {
            return $;
        }
    }

}