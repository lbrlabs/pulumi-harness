// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getEnvironmentClustersMapping({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getEnvironmentClustersMapping(args: GetEnvironmentClustersMappingArgs, opts?: pulumi.InvokeOptions): Promise<GetEnvironmentClustersMappingResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getEnvironmentClustersMapping:getEnvironmentClustersMapping", {
        "envId": args.envId,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getEnvironmentClustersMapping.
 */
export interface GetEnvironmentClustersMappingArgs {
    /**
     * environment identifier of the cluster.
     */
    envId: string;
    /**
     * identifier of the cluster.
     */
    identifier: string;
    /**
     * org_id of the cluster.
     */
    orgId?: string;
    /**
     * project_id of the cluster.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getEnvironmentClustersMapping.
 */
export interface GetEnvironmentClustersMappingResult {
    /**
     * environment identifier of the cluster.
     */
    readonly envId: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * identifier of the cluster.
     */
    readonly identifier: string;
    /**
     * org_id of the cluster.
     */
    readonly orgId?: string;
    /**
     * project_id of the cluster.
     */
    readonly projectId?: string;
    /**
     * scope at which the cluster exists in harness gitops
     */
    readonly scope: string;
}
/**
 * Data source for retrieving a Harness Cluster.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getEnvironmentClustersMapping({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * });
 * ```
 */
export function getEnvironmentClustersMappingOutput(args: GetEnvironmentClustersMappingOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetEnvironmentClustersMappingResult> {
    return pulumi.output(args).apply((a: any) => getEnvironmentClustersMapping(a, opts))
}

/**
 * A collection of arguments for invoking getEnvironmentClustersMapping.
 */
export interface GetEnvironmentClustersMappingOutputArgs {
    /**
     * environment identifier of the cluster.
     */
    envId: pulumi.Input<string>;
    /**
     * identifier of the cluster.
     */
    identifier: pulumi.Input<string>;
    /**
     * org_id of the cluster.
     */
    orgId?: pulumi.Input<string>;
    /**
     * project_id of the cluster.
     */
    projectId?: pulumi.Input<string>;
}
