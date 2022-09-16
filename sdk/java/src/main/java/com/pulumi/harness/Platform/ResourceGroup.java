// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.ResourceGroupArgs;
import com.pulumi.harness.platform.inputs.ResourceGroupState;
import com.pulumi.harness.platform.outputs.ResourceGroupIncludedScope;
import com.pulumi.harness.platform.outputs.ResourceGroupResourceFilter;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness Resource Group
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.ResourceGroup;
 * import com.pulumi.harness.platform.ResourceGroupArgs;
 * import com.pulumi.harness.platform.inputs.ResourceGroupIncludedScopeArgs;
 * import com.pulumi.harness.platform.inputs.ResourceGroupResourceFilterArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new ResourceGroup(&#34;test&#34;, ResourceGroupArgs.builder()        
 *             .accountId(&#34;account_id&#34;)
 *             .allowedScopeLevels(&#34;account&#34;)
 *             .description(&#34;test&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .includedScopes(ResourceGroupIncludedScopeArgs.builder()
 *                 .accountId(&#34;account_id&#34;)
 *                 .filter(&#34;EXCLUDING_CHILD_SCOPES&#34;)
 *                 .build())
 *             .resourceFilters(ResourceGroupResourceFilterArgs.builder()
 *                 .includeAllResources(false)
 *                 .resources(ResourceGroupResourceFilterResourceArgs.builder()
 *                     .attributeFilter(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .resourceType(&#34;CONNECTOR&#34;)
 *                     .build())
 *                 .build())
 *             .tags(&#34;foo:bar&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Import using resource group id
 * 
 * ```sh
 *  $ pulumi import harness:platform/resourceGroup:ResourceGroup example &lt;resource_group_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/resourceGroup:ResourceGroup")
public class ResourceGroup extends com.pulumi.resources.CustomResource {
    /**
     * Account Identifier of the account
     * 
     */
    @Export(name="accountId", type=String.class, parameters={})
    private Output<String> accountId;

    /**
     * @return Account Identifier of the account
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The scope levels at which this resource group can be used
     * 
     */
    @Export(name="allowedScopeLevels", type=List.class, parameters={String.class})
    private Output<List<String>> allowedScopeLevels;

    /**
     * @return The scope levels at which this resource group can be used
     * 
     */
    public Output<List<String>> allowedScopeLevels() {
        return this.allowedScopeLevels;
    }
    /**
     * Color of the environment.
     * 
     */
    @Export(name="color", type=String.class, parameters={})
    private Output<String> color;

    /**
     * @return Color of the environment.
     * 
     */
    public Output<String> color() {
        return this.color;
    }
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", type=String.class, parameters={})
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Included scopes
     * 
     */
    @Export(name="includedScopes", type=List.class, parameters={ResourceGroupIncludedScope.class})
    private Output</* @Nullable */ List<ResourceGroupIncludedScope>> includedScopes;

    /**
     * @return Included scopes
     * 
     */
    public Output<Optional<List<ResourceGroupIncludedScope>>> includedScopes() {
        return Codegen.optional(this.includedScopes);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier of the organization.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
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
    @Export(name="projectId", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Contains resource filter for a resource group
     * 
     */
    @Export(name="resourceFilters", type=List.class, parameters={ResourceGroupResourceFilter.class})
    private Output</* @Nullable */ List<ResourceGroupResourceFilter>> resourceFilters;

    /**
     * @return Contains resource filter for a resource group
     * 
     */
    public Output<Optional<List<ResourceGroupResourceFilter>>> resourceFilters() {
        return Codegen.optional(this.resourceFilters);
    }
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResourceGroup(String name) {
        this(name, ResourceGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResourceGroup(String name, ResourceGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResourceGroup(String name, ResourceGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/resourceGroup:ResourceGroup", name, args == null ? ResourceGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResourceGroup(String name, Output<String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/resourceGroup:ResourceGroup", name, state, makeResourceOptions(options, id));
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
    public static ResourceGroup get(String name, Output<String> id, @Nullable ResourceGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResourceGroup(name, id, state, options);
    }
}
