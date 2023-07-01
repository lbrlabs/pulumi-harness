// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitoredServiceRequestDependencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitoredServiceRequestDependencyArgs Empty = new MonitoredServiceRequestDependencyArgs();

    @Import(name="dependencyMetadata")
    private @Nullable Output<String> dependencyMetadata;

    public Optional<Output<String>> dependencyMetadata() {
        return Optional.ofNullable(this.dependencyMetadata);
    }

    @Import(name="monitoredServiceIdentifier", required=true)
    private Output<String> monitoredServiceIdentifier;

    public Output<String> monitoredServiceIdentifier() {
        return this.monitoredServiceIdentifier;
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private MonitoredServiceRequestDependencyArgs() {}

    private MonitoredServiceRequestDependencyArgs(MonitoredServiceRequestDependencyArgs $) {
        this.dependencyMetadata = $.dependencyMetadata;
        this.monitoredServiceIdentifier = $.monitoredServiceIdentifier;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoredServiceRequestDependencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoredServiceRequestDependencyArgs $;

        public Builder() {
            $ = new MonitoredServiceRequestDependencyArgs();
        }

        public Builder(MonitoredServiceRequestDependencyArgs defaults) {
            $ = new MonitoredServiceRequestDependencyArgs(Objects.requireNonNull(defaults));
        }

        public Builder dependencyMetadata(@Nullable Output<String> dependencyMetadata) {
            $.dependencyMetadata = dependencyMetadata;
            return this;
        }

        public Builder dependencyMetadata(String dependencyMetadata) {
            return dependencyMetadata(Output.of(dependencyMetadata));
        }

        public Builder monitoredServiceIdentifier(Output<String> monitoredServiceIdentifier) {
            $.monitoredServiceIdentifier = monitoredServiceIdentifier;
            return this;
        }

        public Builder monitoredServiceIdentifier(String monitoredServiceIdentifier) {
            return monitoredServiceIdentifier(Output.of(monitoredServiceIdentifier));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public MonitoredServiceRequestDependencyArgs build() {
            $.monitoredServiceIdentifier = Objects.requireNonNull($.monitoredServiceIdentifier, "expected parameter 'monitoredServiceIdentifier' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}