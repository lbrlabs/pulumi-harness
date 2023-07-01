// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.SloArgs;
import com.pulumi.harness.platform.inputs.SloState;
import com.pulumi.harness.platform.outputs.SloRequest;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an SLO.
 * 
 * ## Example Usage
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Slo;
 * import com.pulumi.harness.platform.SloArgs;
 * import com.pulumi.harness.platform.inputs.SloRequestArgs;
 * import com.pulumi.harness.platform.inputs.SloRequestSloTargetArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new Slo(&#34;example&#34;, SloArgs.builder()        
 *             .accountId(&#34;account_id&#34;)
 *             .orgId(&#34;default&#34;)
 *             .projectId(&#34;default_project&#34;)
 *             .identifier(&#34;TerraformSLO&#34;)
 *             .request(SloRequestArgs.builder()
 *                 .name(&#34;TSLO&#34;)
 *                 .description(&#34;description&#34;)
 *                 .tags(                
 *                     &#34;foo:bar&#34;,
 *                     &#34;bar:foo&#34;)
 *                 .userJourneyRefs(                
 *                     &#34;one&#34;,
 *                     &#34;two&#34;)
 *                 .sloTarget(SloRequestSloTargetArgs.builder()
 *                     .type(&#34;Rolling&#34;)
 *                     .sloTargetPercentage(10)
 *                     .spec(serializeJson(
 *                         jsonObject(
 *                             jsonProperty(&#34;periodLength&#34;, &#34;28d&#34;)
 *                         )))
 *                     .build())
 *                 .type(&#34;Simple&#34;)
 *                 .spec(serializeJson(
 *                     jsonObject(
 *                         jsonProperty(&#34;monitoredServiceRef&#34;, &#34;monitoredServiceRef&#34;),
 *                         jsonProperty(&#34;healthSourceRef&#34;, &#34;healthSourceRef&#34;),
 *                         jsonProperty(&#34;serviceLevelIndicatorType&#34;, &#34;serviceLevelIndicatorType&#34;)
 *                     )))
 *                 .notificationRuleRefs(SloRequestNotificationRuleRefArgs.builder()
 *                     .notificationRuleRef(&#34;notification_rule_ref&#34;)
 *                     .enabled(true)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import account level SLO
 * 
 * ```sh
 *  $ pulumi import harness:platform/slo:Slo example &lt;slo_id&gt;
 * ```
 * 
 *  Import organization level SLO
 * 
 * ```sh
 *  $ pulumi import harness:platform/slo:Slo example &lt;org_id&gt;/&lt;slo_id&gt;
 * ```
 * 
 *  Import project level SLO
 * 
 * ```sh
 *  $ pulumi import harness:platform/slo:Slo example &lt;org_id&gt;/&lt;project_id&gt;/&lt;slo_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/slo:Slo")
public class Slo extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the SLO.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier of the SLO.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Identifier of the organization in which the SLO is configured.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Identifier of the organization in which the SLO is configured.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Identifier of the project in which the SLO is configured.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Identifier of the project in which the SLO is configured.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Request for creating or updating SLO.
     * 
     */
    @Export(name="request", refs={SloRequest.class}, tree="[0]")
    private Output</* @Nullable */ SloRequest> request;

    /**
     * @return Request for creating or updating SLO.
     * 
     */
    public Output<Optional<SloRequest>> request() {
        return Codegen.optional(this.request);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Slo(String name) {
        this(name, SloArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Slo(String name, SloArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Slo(String name, SloArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/slo:Slo", name, args == null ? SloArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Slo(String name, Output<String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/slo:Slo", name, state, makeResourceOptions(options, id));
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
    public static Slo get(String name, Output<String> id, @Nullable SloState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Slo(name, id, state, options);
    }
}