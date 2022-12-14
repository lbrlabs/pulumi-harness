// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServiceResult {
    /**
     * @return The id of the application the service belongs to
     * 
     */
    private String appId;
    /**
     * @return The type of artifact deployed by the service
     * 
     */
    private String artifactType;
    /**
     * @return The application description
     * 
     */
    private String description;
    /**
     * @return The version of Helm being used by the service.
     * 
     */
    private String helmVersion;
    /**
     * @return Unique identifier of the application
     * 
     */
    private String id;
    /**
     * @return The name of the service
     * 
     */
    private String name;
    /**
     * @return Tags for the service
     * 
     */
    private Map<String,String> tags;
    /**
     * @return The path of the template used for the custom deployment
     * 
     */
    private String templateUri;
    /**
     * @return The type of the deployment
     * 
     */
    private String type;

    private GetServiceResult() {}
    /**
     * @return The id of the application the service belongs to
     * 
     */
    public String appId() {
        return this.appId;
    }
    /**
     * @return The type of artifact deployed by the service
     * 
     */
    public String artifactType() {
        return this.artifactType;
    }
    /**
     * @return The application description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The version of Helm being used by the service.
     * 
     */
    public String helmVersion() {
        return this.helmVersion;
    }
    /**
     * @return Unique identifier of the application
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the service
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Tags for the service
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The path of the template used for the custom deployment
     * 
     */
    public String templateUri() {
        return this.templateUri;
    }
    /**
     * @return The type of the deployment
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String appId;
        private String artifactType;
        private String description;
        private String helmVersion;
        private String id;
        private String name;
        private Map<String,String> tags;
        private String templateUri;
        private String type;
        public Builder() {}
        public Builder(GetServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.artifactType = defaults.artifactType;
    	      this.description = defaults.description;
    	      this.helmVersion = defaults.helmVersion;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.templateUri = defaults.templateUri;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        @CustomType.Setter
        public Builder artifactType(String artifactType) {
            this.artifactType = Objects.requireNonNull(artifactType);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder helmVersion(String helmVersion) {
            this.helmVersion = Objects.requireNonNull(helmVersion);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder templateUri(String templateUri) {
            this.templateUri = Objects.requireNonNull(templateUri);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetServiceResult build() {
            final var o = new GetServiceResult();
            o.appId = appId;
            o.artifactType = artifactType;
            o.description = description;
            o.helmVersion = helmVersion;
            o.id = id;
            o.name = name;
            o.tags = tags;
            o.templateUri = templateUri;
            o.type = type;
            return o;
        }
    }
}
