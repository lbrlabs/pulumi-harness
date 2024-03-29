// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GitOpsClusterRequestClusterConfig;
import com.pulumi.harness.platform.outputs.GitOpsClusterRequestClusterInfo;
import com.pulumi.harness.platform.outputs.GitOpsClusterRequestClusterRefreshRequestedAt;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GitOpsClusterRequestCluster {
    private @Nullable Map<String,String> annotations;
    private @Nullable Boolean clusterResources;
    private List<GitOpsClusterRequestClusterConfig> configs;
    private @Nullable List<GitOpsClusterRequestClusterInfo> infos;
    private @Nullable Map<String,String> labels;
    private @Nullable String name;
    private @Nullable List<String> namespaces;
    private @Nullable String project;
    private @Nullable List<GitOpsClusterRequestClusterRefreshRequestedAt> refreshRequestedAts;
    private String server;
    private @Nullable String shard;

    private GitOpsClusterRequestCluster() {}
    public Map<String,String> annotations() {
        return this.annotations == null ? Map.of() : this.annotations;
    }
    public Optional<Boolean> clusterResources() {
        return Optional.ofNullable(this.clusterResources);
    }
    public List<GitOpsClusterRequestClusterConfig> configs() {
        return this.configs;
    }
    public List<GitOpsClusterRequestClusterInfo> infos() {
        return this.infos == null ? List.of() : this.infos;
    }
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<String> namespaces() {
        return this.namespaces == null ? List.of() : this.namespaces;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public List<GitOpsClusterRequestClusterRefreshRequestedAt> refreshRequestedAts() {
        return this.refreshRequestedAts == null ? List.of() : this.refreshRequestedAts;
    }
    public String server() {
        return this.server;
    }
    public Optional<String> shard() {
        return Optional.ofNullable(this.shard);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitOpsClusterRequestCluster defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Map<String,String> annotations;
        private @Nullable Boolean clusterResources;
        private List<GitOpsClusterRequestClusterConfig> configs;
        private @Nullable List<GitOpsClusterRequestClusterInfo> infos;
        private @Nullable Map<String,String> labels;
        private @Nullable String name;
        private @Nullable List<String> namespaces;
        private @Nullable String project;
        private @Nullable List<GitOpsClusterRequestClusterRefreshRequestedAt> refreshRequestedAts;
        private String server;
        private @Nullable String shard;
        public Builder() {}
        public Builder(GitOpsClusterRequestCluster defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotations = defaults.annotations;
    	      this.clusterResources = defaults.clusterResources;
    	      this.configs = defaults.configs;
    	      this.infos = defaults.infos;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.namespaces = defaults.namespaces;
    	      this.project = defaults.project;
    	      this.refreshRequestedAts = defaults.refreshRequestedAts;
    	      this.server = defaults.server;
    	      this.shard = defaults.shard;
        }

        @CustomType.Setter
        public Builder annotations(@Nullable Map<String,String> annotations) {
            this.annotations = annotations;
            return this;
        }
        @CustomType.Setter
        public Builder clusterResources(@Nullable Boolean clusterResources) {
            this.clusterResources = clusterResources;
            return this;
        }
        @CustomType.Setter
        public Builder configs(List<GitOpsClusterRequestClusterConfig> configs) {
            this.configs = Objects.requireNonNull(configs);
            return this;
        }
        public Builder configs(GitOpsClusterRequestClusterConfig... configs) {
            return configs(List.of(configs));
        }
        @CustomType.Setter
        public Builder infos(@Nullable List<GitOpsClusterRequestClusterInfo> infos) {
            this.infos = infos;
            return this;
        }
        public Builder infos(GitOpsClusterRequestClusterInfo... infos) {
            return infos(List.of(infos));
        }
        @CustomType.Setter
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespaces(@Nullable List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public Builder namespaces(String... namespaces) {
            return namespaces(List.of(namespaces));
        }
        @CustomType.Setter
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        @CustomType.Setter
        public Builder refreshRequestedAts(@Nullable List<GitOpsClusterRequestClusterRefreshRequestedAt> refreshRequestedAts) {
            this.refreshRequestedAts = refreshRequestedAts;
            return this;
        }
        public Builder refreshRequestedAts(GitOpsClusterRequestClusterRefreshRequestedAt... refreshRequestedAts) {
            return refreshRequestedAts(List.of(refreshRequestedAts));
        }
        @CustomType.Setter
        public Builder server(String server) {
            this.server = Objects.requireNonNull(server);
            return this;
        }
        @CustomType.Setter
        public Builder shard(@Nullable String shard) {
            this.shard = shard;
            return this;
        }
        public GitOpsClusterRequestCluster build() {
            final var o = new GitOpsClusterRequestCluster();
            o.annotations = annotations;
            o.clusterResources = clusterResources;
            o.configs = configs;
            o.infos = infos;
            o.labels = labels;
            o.name = name;
            o.namespaces = namespaces;
            o.project = project;
            o.refreshRequestedAts = refreshRequestedAts;
            o.server = server;
            o.shard = shard;
            return o;
        }
    }
}
