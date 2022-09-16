// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AmiVariable {
    /**
     * @return Name of the variable
     * 
     */
    private String name;
    /**
     * @return Type of the variable. Options are &#39;TEXT&#39; and &#39;ENCRYPTED_TEXT&#39;
     * 
     */
    private String type;
    /**
     * @return Value of the variable
     * 
     */
    private String value;

    private AmiVariable() {}
    /**
     * @return Name of the variable
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Type of the variable. Options are &#39;TEXT&#39; and &#39;ENCRYPTED_TEXT&#39;
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Value of the variable
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AmiVariable defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String type;
        private String value;
        public Builder() {}
        public Builder(AmiVariable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
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
        public AmiVariable build() {
            final var o = new AmiVariable();
            o.name = name;
            o.type = type;
            o.value = value;
            return o;
        }
    }
}
