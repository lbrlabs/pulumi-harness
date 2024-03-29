// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a GitOps RepoCert.
 */
export function getGitopsRepoCert(args: GetGitopsRepoCertArgs, opts?: pulumi.InvokeOptions): Promise<GetGitopsRepoCertResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitopsRepoCert:getGitopsRepoCert", {
        "accountId": args.accountId,
        "agentId": args.agentId,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitopsRepoCert.
 */
export interface GetGitopsRepoCertArgs {
    /**
     * account identifier of the Repository Certificates.
     */
    accountId: string;
    /**
     * agent identifier of the Repository Certificates.
     */
    agentId?: string;
    /**
     * organization identifier of the Repository Certificates.
     */
    orgId?: string;
    /**
     * project identifier of the Repository Certificates.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getGitopsRepoCert.
 */
export interface GetGitopsRepoCertResult {
    /**
     * account identifier of the Repository Certificates.
     */
    readonly accountId: string;
    /**
     * agent identifier of the Repository Certificates.
     */
    readonly agentId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * organization identifier of the Repository Certificates.
     */
    readonly orgId?: string;
    /**
     * project identifier of the Repository Certificates.
     */
    readonly projectId?: string;
}
/**
 * Data source for retrieving a GitOps RepoCert.
 */
export function getGitopsRepoCertOutput(args: GetGitopsRepoCertOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitopsRepoCertResult> {
    return pulumi.output(args).apply((a: any) => getGitopsRepoCert(a, opts))
}

/**
 * A collection of arguments for invoking getGitopsRepoCert.
 */
export interface GetGitopsRepoCertOutputArgs {
    /**
     * account identifier of the Repository Certificates.
     */
    accountId: pulumi.Input<string>;
    /**
     * agent identifier of the Repository Certificates.
     */
    agentId?: pulumi.Input<string>;
    /**
     * organization identifier of the Repository Certificates.
     */
    orgId?: pulumi.Input<string>;
    /**
     * project identifier of the Repository Certificates.
     */
    projectId?: pulumi.Input<string>;
}
