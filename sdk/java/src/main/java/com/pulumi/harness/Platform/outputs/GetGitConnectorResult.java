// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetGitConnectorCredential;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitConnectorResult {
    /**
     * @return Whether the connection we&#39;re making is to a git repository or a git account. Valid values are Account, Repo.
     * 
     */
    private String connectionType;
    /**
     * @return Credentials to use for the connection.
     * 
     */
    private List<GetGitConnectorCredential> credentials;
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    private List<String> delegateSelectors;
    /**
     * @return Description of the resource.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Unique identifier of the resource.
     * 
     */
    private String identifier;
    /**
     * @return Name of the resource.
     * 
     */
    private @Nullable String name;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Tags to associate with the resource.
     * 
     */
    private List<String> tags;
    /**
     * @return URL of the git repository or account.
     * 
     */
    private String url;
    /**
     * @return Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    private String validationRepo;

    private GetGitConnectorResult() {}
    /**
     * @return Whether the connection we&#39;re making is to a git repository or a git account. Valid values are Account, Repo.
     * 
     */
    public String connectionType() {
        return this.connectionType;
    }
    /**
     * @return Credentials to use for the connection.
     * 
     */
    public List<GetGitConnectorCredential> credentials() {
        return this.credentials;
    }
    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors;
    }
    /**
     * @return Description of the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Unique identifier of the resource.
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Tags to associate with the resource.
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return URL of the git repository or account.
     * 
     */
    public String url() {
        return this.url;
    }
    /**
     * @return Repository to test the connection with. This is only used when `connection_type` is `Account`.
     * 
     */
    public String validationRepo() {
        return this.validationRepo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitConnectorResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String connectionType;
        private List<GetGitConnectorCredential> credentials;
        private List<String> delegateSelectors;
        private String description;
        private String id;
        private String identifier;
        private @Nullable String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private List<String> tags;
        private String url;
        private String validationRepo;
        public Builder() {}
        public Builder(GetGitConnectorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionType = defaults.connectionType;
    	      this.credentials = defaults.credentials;
    	      this.delegateSelectors = defaults.delegateSelectors;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
    	      this.url = defaults.url;
    	      this.validationRepo = defaults.validationRepo;
        }

        @CustomType.Setter
        public Builder connectionType(String connectionType) {
            this.connectionType = Objects.requireNonNull(connectionType);
            return this;
        }
        @CustomType.Setter
        public Builder credentials(List<GetGitConnectorCredential> credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }
        public Builder credentials(GetGitConnectorCredential... credentials) {
            return credentials(List.of(credentials));
        }
        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            this.delegateSelectors = Objects.requireNonNull(delegateSelectors);
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder identifier(String identifier) {
            this.identifier = Objects.requireNonNull(identifier);
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(List<String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        @CustomType.Setter
        public Builder url(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        @CustomType.Setter
        public Builder validationRepo(String validationRepo) {
            this.validationRepo = Objects.requireNonNull(validationRepo);
            return this;
        }
        public GetGitConnectorResult build() {
            final var o = new GetGitConnectorResult();
            o.connectionType = connectionType;
            o.credentials = credentials;
            o.delegateSelectors = delegateSelectors;
            o.description = description;
            o.id = id;
            o.identifier = identifier;
            o.name = name;
            o.orgId = orgId;
            o.projectId = projectId;
            o.tags = tags;
            o.url = url;
            o.validationRepo = validationRepo;
            return o;
        }
    }
}
