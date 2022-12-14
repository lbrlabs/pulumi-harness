// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

export function getGitopsCluster(args: GetGitopsClusterArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsClusterResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getGitopsCluster:getGitopsCluster", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "identifier": args.identifier,
        "orgId": args.orgId,
        "projectId": args.projectId,
        "queries": args.queries,
        "requests": args.requests,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsCluster.
 */
export interface GetGitopsClusterArgs {
    accountId: string;
    agentId?: string;
    identifier: string;
    orgId?: string;
    projectId: string;
    queries?: inputs.platform.GetGitopsClusterQuery[];
    requests?: inputs.platform.GetGitopsClusterRequest[];
}

/**
 * A collection of values returned by getGitopsCluster.
 */
export interface GetGitopsClusterResult {
    readonly accountId: string;
    readonly agentId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly identifier: string;
    readonly orgId?: string;
    readonly projectId: string;
    readonly queries?: outputs.platform.GetGitopsClusterQuery[];
    readonly requests?: outputs.platform.GetGitopsClusterRequest[];
}

export function getGitopsClusterOutput(args: GetGitopsClusterOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitopsClusterResult> {
    return pulumi.output(args).apply(a => getGitopsCluster(a, opts))
}

/**
 * A collection of arguments for invoking getGitopsCluster.
 */
export interface GetGitopsClusterOutputArgs {
    accountId: pulumi.Input<string>;
    agentId?: pulumi.Input<string>;
    identifier: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    projectId: pulumi.Input<string>;
    queries?: pulumi.Input<pulumi.Input<inputs.platform.GetGitopsClusterQueryArgs>[]>;
    requests?: pulumi.Input<pulumi.Input<inputs.platform.GetGitopsClusterRequestArgs>[]>;
}
