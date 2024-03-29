// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetApiKeyResult {
    private String accountId;
    private String apikeyType;
    private @Nullable Integer defaultTimeToExpireToken;
    private @Nullable String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String identifier;
    private String name;
    private @Nullable String orgId;
    private String parentId;
    private @Nullable String projectId;
    private @Nullable Map<String,String> tags;

    private GetApiKeyResult() {}
    public String accountId() {
        return this.accountId;
    }
    public String apikeyType() {
        return this.apikeyType;
    }
    public Optional<Integer> defaultTimeToExpireToken() {
        return Optional.ofNullable(this.defaultTimeToExpireToken);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String identifier() {
        return this.identifier;
    }
    public String name() {
        return this.name;
    }
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    public String parentId() {
        return this.parentId;
    }
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiKeyResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String apikeyType;
        private @Nullable Integer defaultTimeToExpireToken;
        private @Nullable String description;
        private String id;
        private String identifier;
        private String name;
        private @Nullable String orgId;
        private String parentId;
        private @Nullable String projectId;
        private @Nullable Map<String,String> tags;
        public Builder() {}
        public Builder(GetApiKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.apikeyType = defaults.apikeyType;
    	      this.defaultTimeToExpireToken = defaults.defaultTimeToExpireToken;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.parentId = defaults.parentId;
    	      this.projectId = defaults.projectId;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder apikeyType(String apikeyType) {
            this.apikeyType = Objects.requireNonNull(apikeyType);
            return this;
        }
        @CustomType.Setter
        public Builder defaultTimeToExpireToken(@Nullable Integer defaultTimeToExpireToken) {
            this.defaultTimeToExpireToken = defaultTimeToExpireToken;
            return this;
        }
        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
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
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder parentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetApiKeyResult build() {
            final var o = new GetApiKeyResult();
            o.accountId = accountId;
            o.apikeyType = apikeyType;
            o.defaultTimeToExpireToken = defaultTimeToExpireToken;
            o.description = description;
            o.id = id;
            o.identifier = identifier;
            o.name = name;
            o.orgId = orgId;
            o.parentId = parentId;
            o.projectId = projectId;
            o.tags = tags;
            return o;
        }
    }
}
