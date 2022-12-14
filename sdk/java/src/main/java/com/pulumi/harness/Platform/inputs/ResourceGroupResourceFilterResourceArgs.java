// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.ResourceGroupResourceFilterResourceAttributeFilterArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceGroupResourceFilterResourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourceGroupResourceFilterResourceArgs Empty = new ResourceGroupResourceFilterResourceArgs();

    @Import(name="attributeFilters")
    private @Nullable Output<List<ResourceGroupResourceFilterResourceAttributeFilterArgs>> attributeFilters;

    public Optional<Output<List<ResourceGroupResourceFilterResourceAttributeFilterArgs>>> attributeFilters() {
        return Optional.ofNullable(this.attributeFilters);
    }

    @Import(name="identifiers")
    private @Nullable Output<List<String>> identifiers;

    public Optional<Output<List<String>>> identifiers() {
        return Optional.ofNullable(this.identifiers);
    }

    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    private ResourceGroupResourceFilterResourceArgs() {}

    private ResourceGroupResourceFilterResourceArgs(ResourceGroupResourceFilterResourceArgs $) {
        this.attributeFilters = $.attributeFilters;
        this.identifiers = $.identifiers;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceGroupResourceFilterResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceGroupResourceFilterResourceArgs $;

        public Builder() {
            $ = new ResourceGroupResourceFilterResourceArgs();
        }

        public Builder(ResourceGroupResourceFilterResourceArgs defaults) {
            $ = new ResourceGroupResourceFilterResourceArgs(Objects.requireNonNull(defaults));
        }

        public Builder attributeFilters(@Nullable Output<List<ResourceGroupResourceFilterResourceAttributeFilterArgs>> attributeFilters) {
            $.attributeFilters = attributeFilters;
            return this;
        }

        public Builder attributeFilters(List<ResourceGroupResourceFilterResourceAttributeFilterArgs> attributeFilters) {
            return attributeFilters(Output.of(attributeFilters));
        }

        public Builder attributeFilters(ResourceGroupResourceFilterResourceAttributeFilterArgs... attributeFilters) {
            return attributeFilters(List.of(attributeFilters));
        }

        public Builder identifiers(@Nullable Output<List<String>> identifiers) {
            $.identifiers = identifiers;
            return this;
        }

        public Builder identifiers(List<String> identifiers) {
            return identifiers(Output.of(identifiers));
        }

        public Builder identifiers(String... identifiers) {
            return identifiers(List.of(identifiers));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public ResourceGroupResourceFilterResourceArgs build() {
            $.resourceType = Objects.requireNonNull($.resourceType, "expected parameter 'resourceType' to be non-null");
            return $;
        }
    }

}
