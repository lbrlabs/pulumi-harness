// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get a list of delegate ID's matching the specified search criteria.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = pulumi.output(harness.DelegateDs({
 *     name: "harness-delegate",
 * }));
 * ```
 */
export function getDelegateIds(args?: GetDelegateIdsArgs, opts?: pulumi.InvokeOptions): Promise<GetDelegateIdsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:cloudprovider/getDelegateIds:getDelegateIds", {
        "name": args.name,
        "status": args.status,
        "type": args.type,
    }, opts);
}

/**
 * A collection of arguments for invoking getDelegateIds.
 */
export interface GetDelegateIdsArgs {
    /**
     * The name of the delegate to query for.
     */
    name?: string;
    /**
     * The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     */
    status?: string;
    /**
     * The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     */
    type?: string;
}

/**
 * A collection of values returned by getDelegateIds.
 */
export interface GetDelegateIdsResult {
    /**
     * A list of delegate ID's matching the specified search criteria.
     */
    readonly delegateIds: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The name of the delegate to query for.
     */
    readonly name?: string;
    /**
     * The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     */
    readonly status?: string;
    /**
     * The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     */
    readonly type?: string;
}

export function getDelegateIdsOutput(args?: GetDelegateIdsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDelegateIdsResult> {
    return pulumi.output(args).apply(a => getDelegateIds(a, opts))
}

/**
 * A collection of arguments for invoking getDelegateIds.
 */
export interface GetDelegateIdsOutputArgs {
    /**
     * The name of the delegate to query for.
     */
    name?: pulumi.Input<string>;
    /**
     * The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     */
    status?: pulumi.Input<string>;
    /**
     * The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     */
    type?: pulumi.Input<string>;
}
