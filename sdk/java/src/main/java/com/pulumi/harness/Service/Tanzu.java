// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.service;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.service.TanzuArgs;
import com.pulumi.harness.service.inputs.TanzuState;
import com.pulumi.harness.service.outputs.TanzuVariable;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Tanzu (PCF) service. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.Application;
 * import com.pulumi.harness.service.Tanzu;
 * import com.pulumi.harness.service.TanzuArgs;
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
 *         var exampleApplication = new Application(&#34;exampleApplication&#34;);
 * 
 *         var exampleTanzu = new Tanzu(&#34;exampleTanzu&#34;, TanzuArgs.builder()        
 *             .appId(exampleApplication.id())
 *             .description(&#34;A service for deploying Tanzu applications.&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Import using the Harness application id and service id
 * 
 * ```sh
 *  $ pulumi import harness:service/tanzu:Tanzu example &lt;app_id&gt;/&lt;svc_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:service/tanzu:Tanzu")
public class Tanzu extends com.pulumi.resources.CustomResource {
    /**
     * The id of the application the service belongs to
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return The id of the application the service belongs to
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * Description of th service
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of th service
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Name of the service
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the service
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Variables to be used in the service
     * 
     */
    @Export(name="variables", type=List.class, parameters={TanzuVariable.class})
    private Output</* @Nullable */ List<TanzuVariable>> variables;

    /**
     * @return Variables to be used in the service
     * 
     */
    public Output<Optional<List<TanzuVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Tanzu(String name) {
        this(name, TanzuArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Tanzu(String name, TanzuArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Tanzu(String name, TanzuArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:service/tanzu:Tanzu", name, args == null ? TanzuArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Tanzu(String name, Output<String> id, @Nullable TanzuState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:service/tanzu:Tanzu", name, state, makeResourceOptions(options, id));
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
    public static Tanzu get(String name, Output<String> id, @Nullable TanzuState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Tanzu(name, id, state, options);
    }
}
