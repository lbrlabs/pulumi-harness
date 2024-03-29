// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationMetadataArgs;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationSpecArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsApplicationsApplicationArgs Empty = new GetGitopsApplicationsApplicationArgs();

    /**
     * Metadata corresponding to the resources. This includes all the objects a user must create.
     * 
     */
    @Import(name="metadatas")
    private @Nullable Output<List<GetGitopsApplicationsApplicationMetadataArgs>> metadatas;

    /**
     * @return Metadata corresponding to the resources. This includes all the objects a user must create.
     * 
     */
    public Optional<Output<List<GetGitopsApplicationsApplicationMetadataArgs>>> metadatas() {
        return Optional.ofNullable(this.metadatas);
    }

    /**
     * Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
     * 
     */
    @Import(name="specs")
    private @Nullable Output<List<GetGitopsApplicationsApplicationSpecArgs>> specs;

    /**
     * @return Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
     * 
     */
    public Optional<Output<List<GetGitopsApplicationsApplicationSpecArgs>>> specs() {
        return Optional.ofNullable(this.specs);
    }

    private GetGitopsApplicationsApplicationArgs() {}

    private GetGitopsApplicationsApplicationArgs(GetGitopsApplicationsApplicationArgs $) {
        this.metadatas = $.metadatas;
        this.specs = $.specs;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationArgs $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationArgs();
        }

        public Builder(GetGitopsApplicationsApplicationArgs defaults) {
            $ = new GetGitopsApplicationsApplicationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param metadatas Metadata corresponding to the resources. This includes all the objects a user must create.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(@Nullable Output<List<GetGitopsApplicationsApplicationMetadataArgs>> metadatas) {
            $.metadatas = metadatas;
            return this;
        }

        /**
         * @param metadatas Metadata corresponding to the resources. This includes all the objects a user must create.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(List<GetGitopsApplicationsApplicationMetadataArgs> metadatas) {
            return metadatas(Output.of(metadatas));
        }

        /**
         * @param metadatas Metadata corresponding to the resources. This includes all the objects a user must create.
         * 
         * @return builder
         * 
         */
        public Builder metadatas(GetGitopsApplicationsApplicationMetadataArgs... metadatas) {
            return metadatas(List.of(metadatas));
        }

        /**
         * @param specs Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
         * 
         * @return builder
         * 
         */
        public Builder specs(@Nullable Output<List<GetGitopsApplicationsApplicationSpecArgs>> specs) {
            $.specs = specs;
            return this;
        }

        /**
         * @param specs Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
         * 
         * @return builder
         * 
         */
        public Builder specs(List<GetGitopsApplicationsApplicationSpecArgs> specs) {
            return specs(Output.of(specs));
        }

        /**
         * @param specs Specifications of the GitOps application. This includes the repository URL, application definition, source, destination and sync policy.
         * 
         * @return builder
         * 
         */
        public Builder specs(GetGitopsApplicationsApplicationSpecArgs... specs) {
            return specs(List.of(specs));
        }

        public GetGitopsApplicationsApplicationArgs build() {
            return $;
        }
    }

}
