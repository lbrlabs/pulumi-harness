// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPrometheusConnectorHeader {
    private String encryptedValueRef;
    private String key;
    private String value;
    private Boolean valueEncrypted;

    private GetPrometheusConnectorHeader() {}
    public String encryptedValueRef() {
        return this.encryptedValueRef;
    }
    public String key() {
        return this.key;
    }
    public String value() {
        return this.value;
    }
    public Boolean valueEncrypted() {
        return this.valueEncrypted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrometheusConnectorHeader defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encryptedValueRef;
        private String key;
        private String value;
        private Boolean valueEncrypted;
        public Builder() {}
        public Builder(GetPrometheusConnectorHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedValueRef = defaults.encryptedValueRef;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
    	      this.valueEncrypted = defaults.valueEncrypted;
        }

        @CustomType.Setter
        public Builder encryptedValueRef(String encryptedValueRef) {
            this.encryptedValueRef = Objects.requireNonNull(encryptedValueRef);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        @CustomType.Setter
        public Builder valueEncrypted(Boolean valueEncrypted) {
            this.valueEncrypted = Objects.requireNonNull(valueEncrypted);
            return this;
        }
        public GetPrometheusConnectorHeader build() {
            final var o = new GetPrometheusConnectorHeader();
            o.encryptedValueRef = encryptedValueRef;
            o.key = key;
            o.value = value;
            o.valueEncrypted = valueEncrypted;
            return o;
        }
    }
}
