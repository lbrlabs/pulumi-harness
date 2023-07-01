// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a physical data center cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const example = new harness.cloudprovider.Datacenter("example", {});
 * ```
 *
 * ## Import
 *
 * Import using the Harness datacenter cloud provider id.
 *
 * ```sh
 *  $ pulumi import harness:cloudprovider/datacenter:Datacenter example <provider_id>
 * ```
 */
export class Datacenter extends pulumi.CustomResource {
    /**
     * Get an existing Datacenter resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DatacenterState, opts?: pulumi.CustomResourceOptions): Datacenter {
        return new Datacenter(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:cloudprovider/datacenter:Datacenter';

    /**
     * Returns true if the given object is an instance of Datacenter.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Datacenter {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Datacenter.__pulumiType;
    }

    /**
     * The name of the cloud provider.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    public readonly usageScopes!: pulumi.Output<outputs.cloudprovider.DatacenterUsageScope[] | undefined>;

    /**
     * Create a Datacenter resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: DatacenterArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DatacenterArgs | DatacenterState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DatacenterState | undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["usageScopes"] = state ? state.usageScopes : undefined;
        } else {
            const args = argsOrState as DatacenterArgs | undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["usageScopes"] = args ? args.usageScopes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Datacenter.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Datacenter resources.
 */
export interface DatacenterState {
    /**
     * The name of the cloud provider.
     */
    name?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.cloudprovider.DatacenterUsageScope>[]>;
}

/**
 * The set of arguments for constructing a Datacenter resource.
 */
export interface DatacenterArgs {
    /**
     * The name of the cloud provider.
     */
    name?: pulumi.Input<string>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.cloudprovider.DatacenterUsageScope>[]>;
}
