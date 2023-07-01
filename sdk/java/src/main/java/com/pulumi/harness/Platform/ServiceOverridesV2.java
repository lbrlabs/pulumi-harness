// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ServiceOverridesV2Args;
import com.pulumi.harness.platform.inputs.ServiceOverridesV2State;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="harness:platform/serviceOverridesV2:ServiceOverridesV2")
public class ServiceOverridesV2 extends com.pulumi.resources.CustomResource {
    /**
     * The cluster ID to which the overrides are associated
     * 
     */
    @Export(name="clusterId", refs={String.class}, tree="[0]")
    private Output<String> clusterId;

    /**
     * @return The cluster ID to which the overrides are associated
     * 
     */
    public Output<String> clusterId() {
        return this.clusterId;
    }
    /**
     * The env ID to which the overrides are associated.
     * 
     */
    @Export(name="envId", refs={String.class}, tree="[0]")
    private Output<String> envId;

    /**
     * @return The env ID to which the overrides are associated.
     * 
     */
    public Output<String> envId() {
        return this.envId;
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * The infrastructure ID to which the overrides are associated
     * 
     */
    @Export(name="infraId", refs={String.class}, tree="[0]")
    private Output<String> infraId;

    /**
     * @return The infrastructure ID to which the overrides are associated
     * 
     */
    public Output<String> infraId() {
        return this.infraId;
    }
    /**
     * Unique identifier of the organization.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * The service ID to which the overrides applies.
     * 
     */
    @Export(name="serviceId", refs={String.class}, tree="[0]")
    private Output<String> serviceId;

    /**
     * @return The service ID to which the overrides applies.
     * 
     */
    public Output<String> serviceId() {
        return this.serviceId;
    }
    /**
     * The overrides specification for the service.
     * 
     */
    @Export(name="spec", refs={String.class}, tree="[0]")
    private Output<String> spec;

    /**
     * @return The overrides specification for the service.
     * 
     */
    public Output<String> spec() {
        return this.spec;
    }
    /**
     * The type of the overrides
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of the overrides
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceOverridesV2(String name) {
        this(name, ServiceOverridesV2Args.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceOverridesV2(String name, ServiceOverridesV2Args args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceOverridesV2(String name, ServiceOverridesV2Args args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, args == null ? ServiceOverridesV2Args.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceOverridesV2(String name, Output<String> id, @Nullable ServiceOverridesV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/serviceOverridesV2:ServiceOverridesV2", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static ServiceOverridesV2 get(String name, Output<String> id, @Nullable ServiceOverridesV2State state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceOverridesV2(name, id, state, options);
    }
}