// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationMetadataOwnerReference extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationMetadataOwnerReference Empty = new GetGitopsApplicationsApplicationMetadataOwnerReference();

    @Import(name="apiVersion")
    private @Nullable String apiVersion;

    public Optional<String> apiVersion() {
        return Optional.ofNullable(this.apiVersion);
    }

    @Import(name="blockOwnerDeletion")
    private @Nullable Boolean blockOwnerDeletion;

    public Optional<Boolean> blockOwnerDeletion() {
        return Optional.ofNullable(this.blockOwnerDeletion);
    }

    @Import(name="controller")
    private @Nullable Boolean controller;

    public Optional<Boolean> controller() {
        return Optional.ofNullable(this.controller);
    }

    /**
     * Kind of the GitOps application.
     * 
     */
    @Import(name="kind")
    private @Nullable String kind;

    /**
     * @return Kind of the GitOps application.
     * 
     */
    public Optional<String> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the GitOps application.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the GitOps application.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="uid")
    private @Nullable String uid;

    public Optional<String> uid() {
        return Optional.ofNullable(this.uid);
    }

    private GetGitopsApplicationsApplicationMetadataOwnerReference() {}

    private GetGitopsApplicationsApplicationMetadataOwnerReference(GetGitopsApplicationsApplicationMetadataOwnerReference $) {
        this.apiVersion = $.apiVersion;
        this.blockOwnerDeletion = $.blockOwnerDeletion;
        this.controller = $.controller;
        this.kind = $.kind;
        this.name = $.name;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationMetadataOwnerReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationMetadataOwnerReference $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationMetadataOwnerReference();
        }

        public Builder(GetGitopsApplicationsApplicationMetadataOwnerReference defaults) {
            $ = new GetGitopsApplicationsApplicationMetadataOwnerReference(Objects.requireNonNull(defaults));
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            $.apiVersion = apiVersion;
            return this;
        }

        public Builder blockOwnerDeletion(@Nullable Boolean blockOwnerDeletion) {
            $.blockOwnerDeletion = blockOwnerDeletion;
            return this;
        }

        public Builder controller(@Nullable Boolean controller) {
            $.controller = controller;
            return this;
        }

        /**
         * @param kind Kind of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable String kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param name Name of the GitOps application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder uid(@Nullable String uid) {
            $.uid = uid;
            return this;
        }

        public GetGitopsApplicationsApplicationMetadataOwnerReference build() {
            return $;
        }
    }

}
