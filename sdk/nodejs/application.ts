// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Resource for creating a Harness application
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 *
 * const myapp = new harness.Application("myapp", {
 *     description: "This is my first Harness application",
 *     tags: [
 *         "mytag:myvalue",
 *         "team:development",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Import using the Harness application id
 *
 * ```sh
 *  $ pulumi import harness:index/application:Application myapp Xyz123
 * ```
 */
export class Application extends pulumi.CustomResource {
    /**
     * Get an existing Application resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApplicationState, opts?: pulumi.CustomResourceOptions): Application {
        return new Application(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:index/application:Application';

    /**
     * Returns true if the given object is an instance of Application.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Application {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Application.__pulumiType;
    }

    /**
     * The application description
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The id of the git sync connector
     */
    public /*out*/ readonly gitSyncConnectorId!: pulumi.Output<string>;
    /**
     * True if git sync is enabled on this application
     */
    public /*out*/ readonly gitSyncEnabled!: pulumi.Output<boolean>;
    /**
     * When this is set to true, all manual triggers will require API Key authorization
     */
    public readonly isManualTriggerAuthorized!: pulumi.Output<boolean | undefined>;
    /**
     * The name of the application
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Tags to associate with the resource.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a Application resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApplicationArgs | ApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApplicationState | undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["gitSyncConnectorId"] = state ? state.gitSyncConnectorId : undefined;
            resourceInputs["gitSyncEnabled"] = state ? state.gitSyncEnabled : undefined;
            resourceInputs["isManualTriggerAuthorized"] = state ? state.isManualTriggerAuthorized : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ApplicationArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["isManualTriggerAuthorized"] = args ? args.isManualTriggerAuthorized : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["gitSyncConnectorId"] = undefined /*out*/;
            resourceInputs["gitSyncEnabled"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Application.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Application resources.
 */
export interface ApplicationState {
    /**
     * The application description
     */
    description?: pulumi.Input<string>;
    /**
     * The id of the git sync connector
     */
    gitSyncConnectorId?: pulumi.Input<string>;
    /**
     * True if git sync is enabled on this application
     */
    gitSyncEnabled?: pulumi.Input<boolean>;
    /**
     * When this is set to true, all manual triggers will require API Key authorization
     */
    isManualTriggerAuthorized?: pulumi.Input<boolean>;
    /**
     * The name of the application
     */
    name?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a Application resource.
 */
export interface ApplicationArgs {
    /**
     * The application description
     */
    description?: pulumi.Input<string>;
    /**
     * When this is set to true, all manual triggers will require API Key authorization
     */
    isManualTriggerAuthorized?: pulumi.Input<boolean>;
    /**
     * The name of the application
     */
    name?: pulumi.Input<string>;
    /**
     * Tags to associate with the resource.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
