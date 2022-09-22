// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Kubernetes Helm service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const exampleApplication = new harness.Application("exampleApplication", {});
 * const exampleHelm = new harness.service.Helm("exampleHelm", {
 *     appId: exampleApplication.id,
 *     description: "Service for deploying native Helm application.s",
 * });
 * ```
 *
 * ## Import
 *
 * # Import using the Harness application id and service id
 *
 * ```sh
 *  $ pulumi import harness:service/helm:Helm example <app_id>/<svc_id>
 * ```
 */
export class Helm extends pulumi.CustomResource {
    /**
     * Get an existing Helm resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: HelmState, opts?: pulumi.CustomResourceOptions): Helm {
        return new Helm(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:service/helm:Helm';

    /**
     * Returns true if the given object is an instance of Helm.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Helm {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Helm.__pulumiType;
    }

    /**
     * The id of the application the service belongs to
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * Description of th service
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Name of the service
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Variables to be used in the service
     */
    public readonly variables!: pulumi.Output<outputs.service.HelmVariable[] | undefined>;

    /**
     * Create a Helm resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: HelmArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: HelmArgs | HelmState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as HelmState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["variables"] = state ? state.variables : undefined;
        } else {
            const args = argsOrState as HelmArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["variables"] = args ? args.variables : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Helm.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Helm resources.
 */
export interface HelmState {
    /**
     * The id of the application the service belongs to
     */
    appId?: pulumi.Input<string>;
    /**
     * Description of th service
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the service
     */
    name?: pulumi.Input<string>;
    /**
     * Variables to be used in the service
     */
    variables?: pulumi.Input<pulumi.Input<inputs.service.HelmVariable>[]>;
}

/**
 * The set of arguments for constructing a Helm resource.
 */
export interface HelmArgs {
    /**
     * The id of the application the service belongs to
     */
    appId: pulumi.Input<string>;
    /**
     * Description of th service
     */
    description?: pulumi.Input<string>;
    /**
     * Name of the service
     */
    name?: pulumi.Input<string>;
    /**
     * Variables to be used in the service
     */
    variables?: pulumi.Input<pulumi.Input<inputs.service.HelmVariable>[]>;
}
