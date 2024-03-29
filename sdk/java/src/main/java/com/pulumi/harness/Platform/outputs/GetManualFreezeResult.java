// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetManualFreezeCurrentOrUpcomingWindow;
import com.pulumi.harness.platform.outputs.GetManualFreezeFreezeWindow;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManualFreezeResult {
    /**
     * @return Account Identifier of the freeze
     * 
     */
    private String accountId;
    /**
     * @return Current or upcoming windows
     * 
     */
    private List<GetManualFreezeCurrentOrUpcomingWindow> currentOrUpcomingWindows;
    /**
     * @return Description of the freeze
     * 
     */
    private String description;
    /**
     * @return Freeze windows in the freeze response
     * 
     */
    private List<GetManualFreezeFreezeWindow> freezeWindows;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Identifier of the freeze
     * 
     */
    private String identifier;
    /**
     * @return Name of the freeze
     * 
     */
    private String name;
    /**
     * @return Organization identifier of the freeze
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Project identifier of the freeze
     * 
     */
    private @Nullable String projectId;
    /**
     * @return Scope of the freeze
     * 
     */
    private String scope;
    /**
     * @return Status of the freeze
     * 
     */
    private String status;
    /**
     * @return Tags associated with the freeze
     * 
     */
    private List<String> tags;
    /**
     * @return Type of freeze
     * 
     */
    private String type;
    /**
     * @return Yaml of the freeze
     * 
     */
    private String yaml;

    private GetManualFreezeResult() {}
    /**
     * @return Account Identifier of the freeze
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return Current or upcoming windows
     * 
     */
    public List<GetManualFreezeCurrentOrUpcomingWindow> currentOrUpcomingWindows() {
        return this.currentOrUpcomingWindows;
    }
    /**
     * @return Description of the freeze
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Freeze windows in the freeze response
     * 
     */
    public List<GetManualFreezeFreezeWindow> freezeWindows() {
        return this.freezeWindows;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Identifier of the freeze
     * 
     */
    public String identifier() {
        return this.identifier;
    }
    /**
     * @return Name of the freeze
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Organization identifier of the freeze
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Project identifier of the freeze
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return Scope of the freeze
     * 
     */
    public String scope() {
        return this.scope;
    }
    /**
     * @return Status of the freeze
     * 
     */
    public String status() {
        return this.status;
    }
    /**
     * @return Tags associated with the freeze
     * 
     */
    public List<String> tags() {
        return this.tags;
    }
    /**
     * @return Type of freeze
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Yaml of the freeze
     * 
     */
    public String yaml() {
        return this.yaml;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManualFreezeResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private List<GetManualFreezeCurrentOrUpcomingWindow> currentOrUpcomingWindows;
        private String description;
        private List<GetManualFreezeFreezeWindow> freezeWindows;
        private String id;
        private String identifier;
        private String name;
        private @Nullable String orgId;
        private @Nullable String projectId;
        private String scope;
        private String status;
        private List<String> tags;
        private String type;
        private String yaml;
        public Builder() {}
        public Builder(GetManualFreezeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.currentOrUpcomingWindows = defaults.currentOrUpcomingWindows;
    	      this.description = defaults.description;
    	      this.freezeWindows = defaults.freezeWindows;
    	      this.id = defaults.id;
    	      this.identifier = defaults.identifier;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.scope = defaults.scope;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.yaml = defaults.yaml;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder currentOrUpcomingWindows(List<GetManualFreezeCurrentOrUpcomingWindow> currentOrUpcomingWindows) {
            this.currentOrUpcomingWindows = Objects.requireNonNull(currentOrUpcomingWindows);
            return this;
        }
        public Builder currentOrUpcomingWindows(GetManualFreezeCurrentOrUpcomingWindow... currentOrUpcomingWindows) {
            return currentOrUpcomingWindows(List.of(currentOrUpcomingWindows));
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder freezeWindows(List<GetManualFreezeFreezeWindow> freezeWindows) {
            this.freezeWindows = Objects.requireNonNull(freezeWindows);
            return this;
        }
        public Builder freezeWindows(GetManualFreezeFreezeWindow... freezeWindows) {
            return freezeWindows(List.of(freezeWindows));
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
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        @CustomType.Setter
        public Builder scope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
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
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder yaml(String yaml) {
            this.yaml = Objects.requireNonNull(yaml);
            return this;
        }
        public GetManualFreezeResult build() {
            final var o = new GetManualFreezeResult();
            o.accountId = accountId;
            o.currentOrUpcomingWindows = currentOrUpcomingWindows;
            o.description = description;
            o.freezeWindows = freezeWindows;
            o.id = id;
            o.identifier = identifier;
            o.name = name;
            o.orgId = orgId;
            o.projectId = projectId;
            o.scope = scope;
            o.status = status;
            o.tags = tags;
            o.type = type;
            o.yaml = yaml;
            return o;
        }
    }
}
