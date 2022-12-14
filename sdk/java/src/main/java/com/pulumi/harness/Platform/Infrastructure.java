// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.InfrastructureArgs;
import com.pulumi.harness.platform.inputs.InfrastructureState;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Data source for retrieving a Harness Infrastructure.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Infrastructure;
 * import com.pulumi.harness.platform.InfrastructureArgs;
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
 *         var example = new Infrastructure(&#34;example&#34;, InfrastructureArgs.builder()        
 *             .deploymentType(&#34;Kubernetes&#34;)
 *             .envId(&#34;environmentIdentifier&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .orgId(&#34;orgIdentifer&#34;)
 *             .projectId(&#34;projectIdentifier&#34;)
 *             .type(&#34;KubernetesDirect&#34;)
 *             .yaml(&#34;&#34;&#34;
 * 			   infrastructureDefinition:
 *          name: name
 *          identifier: identifier
 *          description: &#34;&#34;
 *          tags:
 *            asda: &#34;&#34;
 *          orgIdentifier: orgIdentifer
 *          projectIdentifier: projectIdentifier
 *          environmentRef: environmentIdentifier
 *          deploymentType: Kubernetes
 *          type: KubernetesDirect
 *          spec:
 *           connectorRef: account.gfgf
 *           namespace: asdasdsa
 *           releaseName: release-&lt;+INFRA_KEY&gt;
 *           allowSimultaneousDeployments: false
 * 
 *             &#34;&#34;&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using infrastructure id
 * 
 * ```sh
 *  $ pulumi import harness:platform/infrastructure:Infrastructure example &lt;infrastructure_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/infrastructure:Infrastructure")
public class Infrastructure extends com.pulumi.resources.CustomResource {
    /**
     * Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    @Export(name="deploymentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> deploymentType;

    /**
     * @return Infrastructure deployment type. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    public Output<Optional<String>> deploymentType() {
        return Codegen.optional(this.deploymentType);
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
     * environment identifier.
     * 
     */
    @Export(name="envId", type=String.class, parameters={})
    private Output<String> envId;

    /**
     * @return environment identifier.
     * 
     */
    public Output<String> envId() {
        return this.envId;
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
     * Unique identifier of the Organization.
     * 
     */
    @Export(name="orgId", type=String.class, parameters={})
    private Output<String> orgId;

    /**
     * @return Unique identifier of the Organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Unique identifier of the Project.
     * 
     */
    @Export(name="projectId", type=String.class, parameters={})
    private Output<String> projectId;

    /**
     * @return Unique identifier of the Project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
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
     * Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of Infrastructure. Valid values are KUBERNETES*DIRECT, KUBERNETES*GCP, SERVERLESS*AWS*LAMBDA, PDC, KUBERNETES*AZURE, SSH*WINRM*AZURE, SSH*WINRM*AWS, AZURE*WEB*APP, ECS, GITOPS, CUSTOM*DEPLOYMENT.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Infrastructure YAML
     * 
     */
    @Export(name="yaml", type=String.class, parameters={})
    private Output<String> yaml;

    /**
     * @return Infrastructure YAML
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Infrastructure(String name) {
        this(name, InfrastructureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Infrastructure(String name, InfrastructureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Infrastructure(String name, InfrastructureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/infrastructure:Infrastructure", name, args == null ? InfrastructureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Infrastructure(String name, Output<String> id, @Nullable InfrastructureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/infrastructure:Infrastructure", name, state, makeResourceOptions(options, id));
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
    public static Infrastructure get(String name, Output<String> id, @Nullable InfrastructureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Infrastructure(name, id, state, options);
    }
}
