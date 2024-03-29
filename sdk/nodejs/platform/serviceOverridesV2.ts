// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export class ServiceOverridesV2 extends pulumi.CustomResource {
    /**
     * Get an existing ServiceOverridesV2 resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceOverridesV2State, opts?: pulumi.CustomResourceOptions): ServiceOverridesV2 {
        return new ServiceOverridesV2(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/serviceOverridesV2:ServiceOverridesV2';

    /**
     * Returns true if the given object is an instance of ServiceOverridesV2.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceOverridesV2 {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceOverridesV2.__pulumiType;
    }

    /**
     * The cluster ID to which the overrides are associated
     */
    public readonly clusterId!: pulumi.Output<string>;
    /**
     * The env ID to which the overrides are associated.
     */
    public readonly envId!: pulumi.Output<string>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * The infrastructure ID to which the overrides are associated
     */
    public readonly infraId!: pulumi.Output<string>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * The service ID to which the overrides applies.
     */
    public readonly serviceId!: pulumi.Output<string>;
    /**
     * The overrides specification for the service.
     */
    public readonly spec!: pulumi.Output<string>;
    /**
     * The type of the overrides
     */
    public readonly type!: pulumi.Output<string>;

    /**
     * Create a ServiceOverridesV2 resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceOverridesV2Args, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceOverridesV2Args | ServiceOverridesV2State, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceOverridesV2State | undefined;
            resourceInputs["clusterId"] = state ? state.clusterId : undefined;
            resourceInputs["envId"] = state ? state.envId : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["infraId"] = state ? state.infraId : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["serviceId"] = state ? state.serviceId : undefined;
            resourceInputs["spec"] = state ? state.spec : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
        } else {
            const args = argsOrState as ServiceOverridesV2Args | undefined;
            if ((!args || args.envId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'envId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            if ((!args || args.spec === undefined) && !opts.urn) {
                throw new Error("Missing required property 'spec'");
            }
            if ((!args || args.type === undefined) && !opts.urn) {
                throw new Error("Missing required property 'type'");
            }
            resourceInputs["clusterId"] = args ? args.clusterId : undefined;
            resourceInputs["envId"] = args ? args.envId : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["infraId"] = args ? args.infraId : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["serviceId"] = args ? args.serviceId : undefined;
            resourceInputs["spec"] = args ? args.spec : undefined;
            resourceInputs["type"] = args ? args.type : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ServiceOverridesV2.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceOverridesV2 resources.
 */
export interface ServiceOverridesV2State {
    /**
     * The cluster ID to which the overrides are associated
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The env ID to which the overrides are associated.
     */
    envId?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * The infrastructure ID to which the overrides are associated
     */
    infraId?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The service ID to which the overrides applies.
     */
    serviceId?: pulumi.Input<string>;
    /**
     * The overrides specification for the service.
     */
    spec?: pulumi.Input<string>;
    /**
     * The type of the overrides
     */
    type?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceOverridesV2 resource.
 */
export interface ServiceOverridesV2Args {
    /**
     * The cluster ID to which the overrides are associated
     */
    clusterId?: pulumi.Input<string>;
    /**
     * The env ID to which the overrides are associated.
     */
    envId: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * The infrastructure ID to which the overrides are associated
     */
    infraId?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * The service ID to which the overrides applies.
     */
    serviceId?: pulumi.Input<string>;
    /**
     * The overrides specification for the service.
     */
    spec: pulumi.Input<string>;
    /**
     * The type of the overrides
     */
    type: pulumi.Input<string>;
}
