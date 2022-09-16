// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness pipeline.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const example = new harness.platform.Pipeline("example", {
 *     identifier: "identifier",
 *     orgId: harness_platform_project.test.org_id,
 *     projectId: harness_platform_project.test.id,
 *     yaml: `pipeline:
 *     name: name
 *     identifier: identifier
 *     allowStageExecutions: false
 *     projectIdentifier: projectIdentifier
 *     orgIdentifier: orgIdentifier
 *     tags: {}
 *     stages:
 *         - stage:
 *             name: dep
 *             identifier: dep
 *             description: ""
 *             type: Deployment
 *             spec:
 *                 serviceConfig:
 *                     serviceRef: service
 *                     serviceDefinition:
 *                         type: Kubernetes
 *                         spec:
 *                             variables: []
 *                 infrastructure:
 *                     environmentRef: testenv
 *                     infrastructureDefinition:
 *                         type: KubernetesDirect
 *                         spec:
 *                             connectorRef: testconf
 *                             namespace: test
 *                             releaseName: release-<+INFRA_KEY>
 *                     allowSimultaneousDeployments: false
 *                 execution:
 *                     steps:
 *                         - stepGroup:
 *                                 name: Canary Deployment
 *                                 identifier: canaryDepoyment
 *                                 steps:
 *                                     - step:
 *                                         name: Canary Deployment
 *                                         identifier: canaryDeployment
 *                                         type: K8sCanaryDeploy
 *                                         timeout: 10m
 *                                         spec:
 *                                             instanceSelection:
 *                                                 type: Count
 *                                                 spec:
 *                                                     count: 1
 *                                             skipDryRun: false
 *                                     - step:
 *                                         name: Canary Delete
 *                                         identifier: canaryDelete
 *                                         type: K8sCanaryDelete
 *                                         timeout: 10m
 *                                         spec: {}
 *                                 rollbackSteps:
 *                                     - step:
 *                                         name: Canary Delete
 *                                         identifier: rollbackCanaryDelete
 *                                         type: K8sCanaryDelete
 *                                         timeout: 10m
 *                                         spec: {}
 *                         - stepGroup:
 *                                 name: Primary Deployment
 *                                 identifier: primaryDepoyment
 *                                 steps:
 *                                     - step:
 *                                         name: Rolling Deployment
 *                                         identifier: rollingDeployment
 *                                         type: K8sRollingDeploy
 *                                         timeout: 10m
 *                                         spec:
 *                                             skipDryRun: false
 *                                 rollbackSteps:
 *                                     - step:
 *                                         name: Rolling Rollback
 *                                         identifier: rollingRollback
 *                                         type: K8sRollingRollback
 *                                         timeout: 10m
 *                                         spec: {}
 *                     rollbackSteps: []
 *             tags: {}
 *             failureStrategies:
 *                 - onFailure:
 *                         errors:
 *                             - AllErrors
 *                         action:
 *                             type: StageRollback
 * `,
 * });
 * ```
 */
export class Pipeline extends pulumi.CustomResource {
    /**
     * Get an existing Pipeline resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PipelineState, opts?: pulumi.CustomResourceOptions): Pipeline {
        return new Pipeline(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/pipeline:Pipeline';

    /**
     * Returns true if the given object is an instance of Pipeline.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Pipeline {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Pipeline.__pulumiType;
    }

    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * YAML of the pipeline.
     */
    public readonly yaml!: pulumi.Output<string>;

    /**
     * Create a Pipeline resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: PipelineArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PipelineArgs | PipelineState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PipelineState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["yaml"] = state ? state.yaml : undefined;
        } else {
            const args = argsOrState as PipelineArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.orgId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'orgId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            if ((!args || args.yaml === undefined) && !opts.urn) {
                throw new Error("Missing required property 'yaml'");
            }
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["yaml"] = args ? args.yaml : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Pipeline.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Pipeline resources.
 */
export interface PipelineState {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * YAML of the pipeline.
     */
    yaml?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Pipeline resource.
 */
export interface PipelineArgs {
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId: pulumi.Input<string>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * YAML of the pipeline.
     */
    yaml: pulumi.Input<string>;
}
