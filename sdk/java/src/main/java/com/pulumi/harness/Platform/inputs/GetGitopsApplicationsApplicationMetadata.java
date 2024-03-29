// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsApplicationsApplicationMetadataOwnerReference;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsApplicationsApplicationMetadata extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsApplicationsApplicationMetadata Empty = new GetGitopsApplicationsApplicationMetadata();

    @Import(name="annotations", required=true)
    private Map<String,String> annotations;

    public Map<String,String> annotations() {
        return this.annotations;
    }

    @Import(name="clusterName")
    private @Nullable String clusterName;

    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    @Import(name="finalizers", required=true)
    private List<String> finalizers;

    public List<String> finalizers() {
        return this.finalizers;
    }

    @Import(name="generateName")
    private @Nullable String generateName;

    public Optional<String> generateName() {
        return Optional.ofNullable(this.generateName);
    }

    @Import(name="generation", required=true)
    private String generation;

    public String generation() {
        return this.generation;
    }

    @Import(name="labels", required=true)
    private Map<String,String> labels;

    public Map<String,String> labels() {
        return this.labels;
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

    @Import(name="namespace", required=true)
    private String namespace;

    public String namespace() {
        return this.namespace;
    }

    @Import(name="ownerReferences")
    private @Nullable List<GetGitopsApplicationsApplicationMetadataOwnerReference> ownerReferences;

    public Optional<List<GetGitopsApplicationsApplicationMetadataOwnerReference>> ownerReferences() {
        return Optional.ofNullable(this.ownerReferences);
    }

    @Import(name="uid", required=true)
    private String uid;

    public String uid() {
        return this.uid;
    }

    private GetGitopsApplicationsApplicationMetadata() {}

    private GetGitopsApplicationsApplicationMetadata(GetGitopsApplicationsApplicationMetadata $) {
        this.annotations = $.annotations;
        this.clusterName = $.clusterName;
        this.finalizers = $.finalizers;
        this.generateName = $.generateName;
        this.generation = $.generation;
        this.labels = $.labels;
        this.name = $.name;
        this.namespace = $.namespace;
        this.ownerReferences = $.ownerReferences;
        this.uid = $.uid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsApplicationsApplicationMetadata defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsApplicationsApplicationMetadata $;

        public Builder() {
            $ = new GetGitopsApplicationsApplicationMetadata();
        }

        public Builder(GetGitopsApplicationsApplicationMetadata defaults) {
            $ = new GetGitopsApplicationsApplicationMetadata(Objects.requireNonNull(defaults));
        }

        public Builder annotations(Map<String,String> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder clusterName(@Nullable String clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder finalizers(List<String> finalizers) {
            $.finalizers = finalizers;
            return this;
        }

        public Builder finalizers(String... finalizers) {
            return finalizers(List.of(finalizers));
        }

        public Builder generateName(@Nullable String generateName) {
            $.generateName = generateName;
            return this;
        }

        public Builder generation(String generation) {
            $.generation = generation;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            $.labels = labels;
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

        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public Builder ownerReferences(@Nullable List<GetGitopsApplicationsApplicationMetadataOwnerReference> ownerReferences) {
            $.ownerReferences = ownerReferences;
            return this;
        }

        public Builder ownerReferences(GetGitopsApplicationsApplicationMetadataOwnerReference... ownerReferences) {
            return ownerReferences(List.of(ownerReferences));
        }

        public Builder uid(String uid) {
            $.uid = uid;
            return this;
        }

        public GetGitopsApplicationsApplicationMetadata build() {
            $.annotations = Objects.requireNonNull($.annotations, "expected parameter 'annotations' to be non-null");
            $.finalizers = Objects.requireNonNull($.finalizers, "expected parameter 'finalizers' to be non-null");
            $.generation = Objects.requireNonNull($.generation, "expected parameter 'generation' to be non-null");
            $.labels = Objects.requireNonNull($.labels, "expected parameter 'labels' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            $.uid = Objects.requireNonNull($.uid, "expected parameter 'uid' to be non-null");
            return $;
        }
    }

}
