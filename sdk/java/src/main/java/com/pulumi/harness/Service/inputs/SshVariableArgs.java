// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SshVariableArgs extends com.pulumi.resources.ResourceArgs {

    public static final SshVariableArgs Empty = new SshVariableArgs();

    /**
     * Name of the variable
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the variable
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of the variable. Options are &#39;TEXT&#39; and &#39;ENCRYPTED_TEXT&#39;
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return Type of the variable. Options are &#39;TEXT&#39; and &#39;ENCRYPTED_TEXT&#39;
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * Value of the variable
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of the variable
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private SshVariableArgs() {}

    private SshVariableArgs(SshVariableArgs $) {
        this.name = $.name;
        this.type = $.type;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SshVariableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SshVariableArgs $;

        public Builder() {
            $ = new SshVariableArgs();
        }

        public Builder(SshVariableArgs defaults) {
            $ = new SshVariableArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the variable
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of the variable. Options are &#39;TEXT&#39; and &#39;ENCRYPTED_TEXT&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the variable. Options are &#39;TEXT&#39; and &#39;ENCRYPTED_TEXT&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param value Value of the variable
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the variable
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SshVariableArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
