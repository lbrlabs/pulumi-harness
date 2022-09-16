// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.cloudprovider.GcpArgs;
import com.pulumi.harness.cloudprovider.inputs.GcpState;
import com.pulumi.harness.cloudprovider.outputs.GcpUsageScope;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a GCP cloud provider. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
 * 
 */
@ResourceType(type="harness:cloudprovider/gcp:Gcp")
public class Gcp extends com.pulumi.resources.CustomResource {
    /**
     * Delegate selectors to use for this provider.
     * 
     */
    @Export(name="delegateSelectors", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Delegate selectors to use for this provider.
     * 
     */
    public Output<Optional<List<String>>> delegateSelectors() {
        return Codegen.optional(this.delegateSelectors);
    }
    /**
     * The name of the cloud provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cloud provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The id of the secret containing the GCP credentials
     * 
     */
    @Export(name="secretFileId", type=String.class, parameters={})
    private Output</* @Nullable */ String> secretFileId;

    /**
     * @return The id of the secret containing the GCP credentials
     * 
     */
    public Output<Optional<String>> secretFileId() {
        return Codegen.optional(this.secretFileId);
    }
    /**
     * Skip validation of GCP configuration.
     * 
     */
    @Export(name="skipValidation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> skipValidation;

    /**
     * @return Skip validation of GCP configuration.
     * 
     */
    public Output<Optional<Boolean>> skipValidation() {
        return Codegen.optional(this.skipValidation);
    }
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Export(name="usageScopes", type=List.class, parameters={GcpUsageScope.class})
    private Output</* @Nullable */ List<GcpUsageScope>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Output<Optional<List<GcpUsageScope>>> usageScopes() {
        return Codegen.optional(this.usageScopes);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Gcp(String name) {
        this(name, GcpArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Gcp(String name, @Nullable GcpArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Gcp(String name, @Nullable GcpArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:cloudprovider/gcp:Gcp", name, args == null ? GcpArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Gcp(String name, Output<String> id, @Nullable GcpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:cloudprovider/gcp:Gcp", name, state, makeResourceOptions(options, id));
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
    public static Gcp get(String name, Output<String> id, @Nullable GcpState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Gcp(name, id, state, options);
    }
}
