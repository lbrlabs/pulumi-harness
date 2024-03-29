// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.PipelineArgs;
import com.pulumi.harness.platform.inputs.PipelineState;
import com.pulumi.harness.platform.outputs.PipelineGitDetails;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness pipeline.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.Pipeline;
 * import com.pulumi.harness.platform.PipelineArgs;
 * import com.pulumi.harness.platform.inputs.PipelineGitDetailsArgs;
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
 *         var example = new Pipeline(&#34;example&#34;, PipelineArgs.builder()        
 *             .gitDetails(PipelineGitDetailsArgs.builder()
 *                 .branchName(&#34;branchName&#34;)
 *                 .commitMessage(&#34;commitMessage&#34;)
 *                 .connectorRef(&#34;connectorRef&#34;)
 *                 .filePath(&#34;filePath&#34;)
 *                 .repoName(&#34;repoName&#34;)
 *                 .storeType(&#34;REMOTE&#34;)
 *                 .build())
 *             .identifier(&#34;identifier&#34;)
 *             .orgId(&#34;orgIdentifier&#34;)
 *             .projectId(&#34;projectIdentifier&#34;)
 *             .yaml(&#34;&#34;&#34;
 *     pipeline:
 *         name: name
 *         identifier: identifier
 *         allowStageExecutions: false
 *         projectIdentifier: projectIdentifier
 *         orgIdentifier: orgIdentifier
 *         tags: {}
 *         stages:
 *             - stage:
 *                 name: dep
 *                 identifier: dep
 *                 description: &#34;&#34;
 *                 type: Deployment
 *                 spec:
 *                     serviceConfig:
 *                         serviceRef: service
 *                         serviceDefinition:
 *                             type: Kubernetes
 *                             spec:
 *                                 variables: []
 *                     infrastructure:
 *                         environmentRef: testenv
 *                         infrastructureDefinition:
 *                             type: KubernetesDirect
 *                             spec:
 *                                 connectorRef: testconf
 *                                 namespace: test
 *                                 releaseName: release-&lt;+INFRA_KEY&gt;
 *                         allowSimultaneousDeployments: false
 *                     execution:
 *                         steps:
 *                             - stepGroup:
 *                                     name: Canary Deployment
 *                                     identifier: canaryDepoyment
 *                                     steps:
 *                                         - step:
 *                                             name: Canary Deployment
 *                                             identifier: canaryDeployment
 *                                             type: K8sCanaryDeploy
 *                                             timeout: 10m
 *                                             spec:
 *                                                 instanceSelection:
 *                                                     type: Count
 *                                                     spec:
 *                                                         count: 1
 *                                                 skipDryRun: false
 *                                         - step:
 *                                             name: Canary Delete
 *                                             identifier: canaryDelete
 *                                             type: K8sCanaryDelete
 *                                             timeout: 10m
 *                                             spec: {}
 *                                     rollbackSteps:
 *                                         - step:
 *                                             name: Canary Delete
 *                                             identifier: rollbackCanaryDelete
 *                                             type: K8sCanaryDelete
 *                                             timeout: 10m
 *                                             spec: {}
 *                             - stepGroup:
 *                                     name: Primary Deployment
 *                                     identifier: primaryDepoyment
 *                                     steps:
 *                                         - step:
 *                                             name: Rolling Deployment
 *                                             identifier: rollingDeployment
 *                                             type: K8sRollingDeploy
 *                                             timeout: 10m
 *                                             spec:
 *                                                 skipDryRun: false
 *                                     rollbackSteps:
 *                                         - step:
 *                                             name: Rolling Rollback
 *                                             identifier: rollingRollback
 *                                             type: K8sRollingRollback
 *                                             timeout: 10m
 *                                             spec: {}
 *                         rollbackSteps: []
 *                 tags: {}
 *                 failureStrategies:
 *                     - onFailure:
 *                             errors:
 *                                 - AllErrors
 *                             action:
 *                                 type: StageRollback
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
 * Import pipeline
 * 
 * ```sh
 *  $ pulumi import harness:platform/pipeline:Pipeline example &lt;org_id&gt;/&lt;project_id&gt;/&lt;pipeline_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/pipeline:Pipeline")
public class Pipeline extends com.pulumi.resources.CustomResource {
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    @Export(name="gitDetails", refs={PipelineGitDetails.class}, tree="[0]")
    private Output</* @Nullable */ PipelineGitDetails> gitDetails;

    /**
     * @return Contains parameters related to creating an Entity for Git Experience.
     * 
     */
    public Output<Optional<PipelineGitDetails>> gitDetails() {
        return Codegen.optional(this.gitDetails);
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
     * Name of the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
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
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }
    /**
     * Tags to associate with the resource.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * If true, returns Pipeline YAML with Templates applied on it.
     * 
     */
    @Export(name="templateApplied", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> templateApplied;

    /**
     * @return If true, returns Pipeline YAML with Templates applied on it.
     * 
     */
    public Output<Optional<Boolean>> templateApplied() {
        return Codegen.optional(this.templateApplied);
    }
    /**
     * Pipeline YAML after resolving Templates (returned as a String).
     * 
     */
    @Export(name="templateAppliedPipelineYaml", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> templateAppliedPipelineYaml;

    /**
     * @return Pipeline YAML after resolving Templates (returned as a String).
     * 
     */
    public Output<Optional<String>> templateAppliedPipelineYaml() {
        return Codegen.optional(this.templateAppliedPipelineYaml);
    }
    /**
     * YAML of the pipeline. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    @Export(name="yaml", refs={String.class}, tree="[0]")
    private Output<String> yaml;

    /**
     * @return YAML of the pipeline. In YAML, to reference an entity at the organization scope, prefix &#39;org&#39; to the expression: org.{identifier}. To reference an entity at the account scope, prefix &#39;account` to the expression: account.{identifier}. For eg, to reference a connector with identifier &#39;connectorId&#39; at the organization scope in a stage mention it as connectorRef: org.connectorId.
     * 
     */
    public Output<String> yaml() {
        return this.yaml;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Pipeline(String name) {
        this(name, PipelineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Pipeline(String name, PipelineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Pipeline(String name, PipelineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/pipeline:Pipeline", name, args == null ? PipelineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Pipeline(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/pipeline:Pipeline", name, state, makeResourceOptions(options, id));
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
    public static Pipeline get(String name, Output<String> id, @Nullable PipelineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Pipeline(name, id, state, options);
    }
}
