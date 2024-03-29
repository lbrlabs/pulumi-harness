// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitopsClusterRequestClusterInfoCacheInfo;
import com.pulumi.harness.platform.outputs.GetGitopsClusterRequestClusterInfoConnectionState;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsClusterRequestClusterInfo {
    private @Nullable List<String> apiVersions;
    private @Nullable String applicationsCount;
    private List<GetGitopsClusterRequestClusterInfoCacheInfo> cacheInfos;
    private List<GetGitopsClusterRequestClusterInfoConnectionState> connectionStates;
    private String serverVersion;

    private GetGitopsClusterRequestClusterInfo() {}
    public List<String> apiVersions() {
        return this.apiVersions == null ? List.of() : this.apiVersions;
    }
    public Optional<String> applicationsCount() {
        return Optional.ofNullable(this.applicationsCount);
    }
    public List<GetGitopsClusterRequestClusterInfoCacheInfo> cacheInfos() {
        return this.cacheInfos;
    }
    public List<GetGitopsClusterRequestClusterInfoConnectionState> connectionStates() {
        return this.connectionStates;
    }
    public String serverVersion() {
        return this.serverVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsClusterRequestClusterInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> apiVersions;
        private @Nullable String applicationsCount;
        private List<GetGitopsClusterRequestClusterInfoCacheInfo> cacheInfos;
        private List<GetGitopsClusterRequestClusterInfoConnectionState> connectionStates;
        private String serverVersion;
        public Builder() {}
        public Builder(GetGitopsClusterRequestClusterInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiVersions = defaults.apiVersions;
    	      this.applicationsCount = defaults.applicationsCount;
    	      this.cacheInfos = defaults.cacheInfos;
    	      this.connectionStates = defaults.connectionStates;
    	      this.serverVersion = defaults.serverVersion;
        }

        @CustomType.Setter
        public Builder apiVersions(@Nullable List<String> apiVersions) {
            this.apiVersions = apiVersions;
            return this;
        }
        public Builder apiVersions(String... apiVersions) {
            return apiVersions(List.of(apiVersions));
        }
        @CustomType.Setter
        public Builder applicationsCount(@Nullable String applicationsCount) {
            this.applicationsCount = applicationsCount;
            return this;
        }
        @CustomType.Setter
        public Builder cacheInfos(List<GetGitopsClusterRequestClusterInfoCacheInfo> cacheInfos) {
            this.cacheInfos = Objects.requireNonNull(cacheInfos);
            return this;
        }
        public Builder cacheInfos(GetGitopsClusterRequestClusterInfoCacheInfo... cacheInfos) {
            return cacheInfos(List.of(cacheInfos));
        }
        @CustomType.Setter
        public Builder connectionStates(List<GetGitopsClusterRequestClusterInfoConnectionState> connectionStates) {
            this.connectionStates = Objects.requireNonNull(connectionStates);
            return this;
        }
        public Builder connectionStates(GetGitopsClusterRequestClusterInfoConnectionState... connectionStates) {
            return connectionStates(List.of(connectionStates));
        }
        @CustomType.Setter
        public Builder serverVersion(String serverVersion) {
            this.serverVersion = Objects.requireNonNull(serverVersion);
            return this;
        }
        public GetGitopsClusterRequestClusterInfo build() {
            final var o = new GetGitopsClusterRequestClusterInfo();
            o.apiVersions = apiVersions;
            o.applicationsCount = applicationsCount;
            o.cacheInfos = cacheInfos;
            o.connectionStates = connectionStates;
            o.serverVersion = serverVersion;
            return o;
        }
    }
}
