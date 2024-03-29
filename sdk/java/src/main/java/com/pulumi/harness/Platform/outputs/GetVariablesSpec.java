// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetVariablesSpec {
    private String fixedValue;
    private String valueType;

    private GetVariablesSpec() {}
    public String fixedValue() {
        return this.fixedValue;
    }
    public String valueType() {
        return this.valueType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVariablesSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String fixedValue;
        private String valueType;
        public Builder() {}
        public Builder(GetVariablesSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedValue = defaults.fixedValue;
    	      this.valueType = defaults.valueType;
        }

        @CustomType.Setter
        public Builder fixedValue(String fixedValue) {
            this.fixedValue = Objects.requireNonNull(fixedValue);
            return this;
        }
        @CustomType.Setter
        public Builder valueType(String valueType) {
            this.valueType = Objects.requireNonNull(valueType);
            return this;
        }
        public GetVariablesSpec build() {
            final var o = new GetVariablesSpec();
            o.fixedValue = fixedValue;
            o.valueType = valueType;
            return o;
        }
    }
}
