// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterConfig;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterInfo;
import com.pulumi.harness.platform.inputs.GetGitopsClusterRequestClusterRefreshRequestedAt;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterRequestCluster extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsClusterRequestCluster Empty = new GetGitopsClusterRequestCluster();

    @Import(name="annotations")
    private @Nullable Map<String,String> annotations;

    public Optional<Map<String,String>> annotations() {
        return Optional.ofNullable(this.annotations);
    }

    @Import(name="clusterResources")
    private @Nullable Boolean clusterResources;

    public Optional<Boolean> clusterResources() {
        return Optional.ofNullable(this.clusterResources);
    }

    @Import(name="configs")
    private @Nullable List<GetGitopsClusterRequestClusterConfig> configs;

    public Optional<List<GetGitopsClusterRequestClusterConfig>> configs() {
        return Optional.ofNullable(this.configs);
    }

    @Import(name="infos")
    private @Nullable List<GetGitopsClusterRequestClusterInfo> infos;

    public Optional<List<GetGitopsClusterRequestClusterInfo>> infos() {
        return Optional.ofNullable(this.infos);
    }

    @Import(name="labels")
    private @Nullable Map<String,String> labels;

    public Optional<Map<String,String>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="namespaces")
    private @Nullable List<String> namespaces;

    public Optional<List<String>> namespaces() {
        return Optional.ofNullable(this.namespaces);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="refreshRequestedAts")
    private @Nullable List<GetGitopsClusterRequestClusterRefreshRequestedAt> refreshRequestedAts;

    public Optional<List<GetGitopsClusterRequestClusterRefreshRequestedAt>> refreshRequestedAts() {
        return Optional.ofNullable(this.refreshRequestedAts);
    }

    @Import(name="server", required=true)
    private String server;

    public String server() {
        return this.server;
    }

    @Import(name="shard")
    private @Nullable String shard;

    public Optional<String> shard() {
        return Optional.ofNullable(this.shard);
    }

    private GetGitopsClusterRequestCluster() {}

    private GetGitopsClusterRequestCluster(GetGitopsClusterRequestCluster $) {
        this.annotations = $.annotations;
        this.clusterResources = $.clusterResources;
        this.configs = $.configs;
        this.infos = $.infos;
        this.labels = $.labels;
        this.name = $.name;
        this.namespaces = $.namespaces;
        this.project = $.project;
        this.refreshRequestedAts = $.refreshRequestedAts;
        this.server = $.server;
        this.shard = $.shard;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterRequestCluster defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterRequestCluster $;

        public Builder() {
            $ = new GetGitopsClusterRequestCluster();
        }

        public Builder(GetGitopsClusterRequestCluster defaults) {
            $ = new GetGitopsClusterRequestCluster(Objects.requireNonNull(defaults));
        }

        public Builder annotations(@Nullable Map<String,String> annotations) {
            $.annotations = annotations;
            return this;
        }

        public Builder clusterResources(@Nullable Boolean clusterResources) {
            $.clusterResources = clusterResources;
            return this;
        }

        public Builder configs(@Nullable List<GetGitopsClusterRequestClusterConfig> configs) {
            $.configs = configs;
            return this;
        }

        public Builder configs(GetGitopsClusterRequestClusterConfig... configs) {
            return configs(List.of(configs));
        }

        public Builder infos(@Nullable List<GetGitopsClusterRequestClusterInfo> infos) {
            $.infos = infos;
            return this;
        }

        public Builder infos(GetGitopsClusterRequestClusterInfo... infos) {
            return infos(List.of(infos));
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            $.labels = labels;
            return this;
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder namespaces(@Nullable List<String> namespaces) {
            $.namespaces = namespaces;
            return this;
        }

        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder refreshRequestedAts(@Nullable List<GetGitopsClusterRequestClusterRefreshRequestedAt> refreshRequestedAts) {
            $.refreshRequestedAts = refreshRequestedAts;
            return this;
        }

        public Builder refreshRequestedAts(GetGitopsClusterRequestClusterRefreshRequestedAt... refreshRequestedAts) {
            return refreshRequestedAts(List.of(refreshRequestedAts));
        }

        public Builder server(String server) {
            $.server = server;
            return this;
        }

        public Builder shard(@Nullable String shard) {
            $.shard = shard;
            return this;
        }

        public GetGitopsClusterRequestCluster build() {
            $.server = Objects.requireNonNull($.server, "expected parameter 'server' to be non-null");
            return $;
        }
    }

}
