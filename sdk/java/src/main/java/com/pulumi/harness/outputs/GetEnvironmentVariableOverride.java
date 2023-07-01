// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentVariableOverride {
    /**
     * @return The name of the variable
     * 
     */
    private String name;
    /**
     * @return The name of the service
     * 
     */
    private String serviceName;
    /**
     * @return The type of the service variable. Valid values are `TEXT` and `ENCRYPTED_TEXT`
     * 
     */
    private String type;
    /**
     * @return The value of the service variable
     * 
     */
    private String value;

    private GetEnvironmentVariableOverride() {}
    /**
     * @return The name of the variable
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The name of the service
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return The type of the service variable. Valid values are `TEXT` and `ENCRYPTED_TEXT`
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The value of the service variable
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentVariableOverride defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String serviceName;
        private String type;
        private String value;
        public Builder() {}
        public Builder(GetEnvironmentVariableOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.serviceName = defaults.serviceName;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GetEnvironmentVariableOverride build() {
            final var o = new GetEnvironmentVariableOverride();
            o.name = name;
            o.serviceName = serviceName;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}