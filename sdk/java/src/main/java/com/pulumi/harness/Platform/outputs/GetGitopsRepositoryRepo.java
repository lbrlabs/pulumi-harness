// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsRepositoryRepo {
    private @Nullable String connectionType;
    private @Nullable Boolean enableLfs;
    private @Nullable Boolean enableOci;
    private @Nullable String githubAppEnterpriseBaseUrl;
    private @Nullable String githubAppId;
    private @Nullable String githubAppInstallationId;
    private @Nullable String githubAppPrivateKey;
    private @Nullable Boolean inheritedCreds;
    private @Nullable Boolean insecure;
    private @Nullable Boolean insecureIgnoreHostKey;
    private @Nullable String name;
    private @Nullable String password;
    private String project;
    private @Nullable String proxy;
    /**
     * @return Repo details holding application configurations.
     * 
     */
    private @Nullable String repo;
    private @Nullable String sshPrivateKey;
    private @Nullable String tlsClientCertData;
    private @Nullable String tlsClientCertKey;
    private String type_;
    private @Nullable String username;

    private GetGitopsRepositoryRepo() {}
    public Optional<String> connectionType() {
        return Optional.ofNullable(this.connectionType);
    }
    public Optional<Boolean> enableLfs() {
        return Optional.ofNullable(this.enableLfs);
    }
    public Optional<Boolean> enableOci() {
        return Optional.ofNullable(this.enableOci);
    }
    public Optional<String> githubAppEnterpriseBaseUrl() {
        return Optional.ofNullable(this.githubAppEnterpriseBaseUrl);
    }
    public Optional<String> githubAppId() {
        return Optional.ofNullable(this.githubAppId);
    }
    public Optional<String> githubAppInstallationId() {
        return Optional.ofNullable(this.githubAppInstallationId);
    }
    public Optional<String> githubAppPrivateKey() {
        return Optional.ofNullable(this.githubAppPrivateKey);
    }
    public Optional<Boolean> inheritedCreds() {
        return Optional.ofNullable(this.inheritedCreds);
    }
    public Optional<Boolean> insecure() {
        return Optional.ofNullable(this.insecure);
    }
    public Optional<Boolean> insecureIgnoreHostKey() {
        return Optional.ofNullable(this.insecureIgnoreHostKey);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> password() {
        return Optional.ofNullable(this.password);
    }
    public String project() {
        return this.project;
    }
    public Optional<String> proxy() {
        return Optional.ofNullable(this.proxy);
    }
    /**
     * @return Repo details holding application configurations.
     * 
     */
    public Optional<String> repo() {
        return Optional.ofNullable(this.repo);
    }
    public Optional<String> sshPrivateKey() {
        return Optional.ofNullable(this.sshPrivateKey);
    }
    public Optional<String> tlsClientCertData() {
        return Optional.ofNullable(this.tlsClientCertData);
    }
    public Optional<String> tlsClientCertKey() {
        return Optional.ofNullable(this.tlsClientCertKey);
    }
    public String type_() {
        return this.type_;
    }
    public Optional<String> username() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsRepositoryRepo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String connectionType;
        private @Nullable Boolean enableLfs;
        private @Nullable Boolean enableOci;
        private @Nullable String githubAppEnterpriseBaseUrl;
        private @Nullable String githubAppId;
        private @Nullable String githubAppInstallationId;
        private @Nullable String githubAppPrivateKey;
        private @Nullable Boolean inheritedCreds;
        private @Nullable Boolean insecure;
        private @Nullable Boolean insecureIgnoreHostKey;
        private @Nullable String name;
        private @Nullable String password;
        private String project;
        private @Nullable String proxy;
        private @Nullable String repo;
        private @Nullable String sshPrivateKey;
        private @Nullable String tlsClientCertData;
        private @Nullable String tlsClientCertKey;
        private String type_;
        private @Nullable String username;
        public Builder() {}
        public Builder(GetGitopsRepositoryRepo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionType = defaults.connectionType;
    	      this.enableLfs = defaults.enableLfs;
    	      this.enableOci = defaults.enableOci;
    	      this.githubAppEnterpriseBaseUrl = defaults.githubAppEnterpriseBaseUrl;
    	      this.githubAppId = defaults.githubAppId;
    	      this.githubAppInstallationId = defaults.githubAppInstallationId;
    	      this.githubAppPrivateKey = defaults.githubAppPrivateKey;
    	      this.inheritedCreds = defaults.inheritedCreds;
    	      this.insecure = defaults.insecure;
    	      this.insecureIgnoreHostKey = defaults.insecureIgnoreHostKey;
    	      this.name = defaults.name;
    	      this.password = defaults.password;
    	      this.project = defaults.project;
    	      this.proxy = defaults.proxy;
    	      this.repo = defaults.repo;
    	      this.sshPrivateKey = defaults.sshPrivateKey;
    	      this.tlsClientCertData = defaults.tlsClientCertData;
    	      this.tlsClientCertKey = defaults.tlsClientCertKey;
    	      this.type_ = defaults.type_;
    	      this.username = defaults.username;
        }

        @CustomType.Setter
        public Builder connectionType(@Nullable String connectionType) {
            this.connectionType = connectionType;
            return this;
        }
        @CustomType.Setter
        public Builder enableLfs(@Nullable Boolean enableLfs) {
            this.enableLfs = enableLfs;
            return this;
        }
        @CustomType.Setter
        public Builder enableOci(@Nullable Boolean enableOci) {
            this.enableOci = enableOci;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppEnterpriseBaseUrl(@Nullable String githubAppEnterpriseBaseUrl) {
            this.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppId(@Nullable String githubAppId) {
            this.githubAppId = githubAppId;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppInstallationId(@Nullable String githubAppInstallationId) {
            this.githubAppInstallationId = githubAppInstallationId;
            return this;
        }
        @CustomType.Setter
        public Builder githubAppPrivateKey(@Nullable String githubAppPrivateKey) {
            this.githubAppPrivateKey = githubAppPrivateKey;
            return this;
        }
        @CustomType.Setter
        public Builder inheritedCreds(@Nullable Boolean inheritedCreds) {
            this.inheritedCreds = inheritedCreds;
            return this;
        }
        @CustomType.Setter
        public Builder insecure(@Nullable Boolean insecure) {
            this.insecure = insecure;
            return this;
        }
        @CustomType.Setter
        public Builder insecureIgnoreHostKey(@Nullable Boolean insecureIgnoreHostKey) {
            this.insecureIgnoreHostKey = insecureIgnoreHostKey;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        @CustomType.Setter
        public Builder project(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        @CustomType.Setter
        public Builder proxy(@Nullable String proxy) {
            this.proxy = proxy;
            return this;
        }
        @CustomType.Setter
        public Builder repo(@Nullable String repo) {
            this.repo = repo;
            return this;
        }
        @CustomType.Setter
        public Builder sshPrivateKey(@Nullable String sshPrivateKey) {
            this.sshPrivateKey = sshPrivateKey;
            return this;
        }
        @CustomType.Setter
        public Builder tlsClientCertData(@Nullable String tlsClientCertData) {
            this.tlsClientCertData = tlsClientCertData;
            return this;
        }
        @CustomType.Setter
        public Builder tlsClientCertKey(@Nullable String tlsClientCertKey) {
            this.tlsClientCertKey = tlsClientCertKey;
            return this;
        }
        @CustomType.Setter
        public Builder type_(String type_) {
            this.type_ = Objects.requireNonNull(type_);
            return this;
        }
        @CustomType.Setter
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }
        public GetGitopsRepositoryRepo build() {
            final var o = new GetGitopsRepositoryRepo();
            o.connectionType = connectionType;
            o.enableLfs = enableLfs;
            o.enableOci = enableOci;
            o.githubAppEnterpriseBaseUrl = githubAppEnterpriseBaseUrl;
            o.githubAppId = githubAppId;
            o.githubAppInstallationId = githubAppInstallationId;
            o.githubAppPrivateKey = githubAppPrivateKey;
            o.inheritedCreds = inheritedCreds;
            o.insecure = insecure;
            o.insecureIgnoreHostKey = insecureIgnoreHostKey;
            o.name = name;
            o.password = password;
            o.project = project;
            o.proxy = proxy;
            o.repo = repo;
            o.sshPrivateKey = sshPrivateKey;
            o.tlsClientCertData = tlsClientCertData;
            o.tlsClientCertKey = tlsClientCertKey;
            o.type_ = type_;
            o.username = username;
            return o;
        }
    }
}
