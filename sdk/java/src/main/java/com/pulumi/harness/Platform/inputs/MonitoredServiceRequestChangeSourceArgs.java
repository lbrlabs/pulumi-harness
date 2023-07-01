// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoredServiceRequestChangeSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredServiceRequestChangeSourceArgs Empty = new MonitoredServiceRequestChangeSourceArgs();

    @Import(name="category", required=true)
    private Output<String> category;

    public Output<String> category() {
        return this.category;
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Identifier of the monitored service.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the monitored service.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="spec")
    private @Nullable Output<String> spec;

    public Optional<Output<String>> spec() {
        return Optional.ofNullable(this.spec);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private MonitoredServiceRequestChangeSourceArgs() {}

    private MonitoredServiceRequestChangeSourceArgs(MonitoredServiceRequestChangeSourceArgs $) {
        this.category = $.category;
        this.enabled = $.enabled;
        this.identifier = $.identifier;
        this.name = $.name;
        this.spec = $.spec;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredServiceRequestChangeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredServiceRequestChangeSourceArgs $;

        public Builder() {
            $ = new MonitoredServiceRequestChangeSourceArgs();
        }

        public Builder(MonitoredServiceRequestChangeSourceArgs defaults) {
            $ = new MonitoredServiceRequestChangeSourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder category(Output<String> category) {
            $.category = category;
            return this;
        }

        public Builder category(String category) {
            return category(Output.of(category));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param identifier Identifier of the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the monitored service.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder spec(@Nullable Output<String> spec) {
            $.spec = spec;
            return this;
        }

        public Builder spec(String spec) {
            return spec(Output.of(spec));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MonitoredServiceRequestChangeSourceArgs build() {
            $.category = Objects.requireNonNull($.category, "expected parameter 'category' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
