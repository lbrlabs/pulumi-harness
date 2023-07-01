// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for looking up a Git connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGitConnector(args: GetGitConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetGitConnectorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGitConnector:getGitConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGitConnector.
 */
export interface GetGitConnectorArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getGitConnector.
 */
export interface GetGitConnectorResult {
    /**
     * Whether the connection we're making is to a git repository or a git account. Valid values are Account, Repo.
     */
    readonly connectionType: string;
    /**
     * Credentials to use for the connection.
     */
    readonly credentials: outputs.platform.GetGitConnectorCredential[];
    /**
     * Tags to filter delegates for connection.
     */
    readonly delegateSelectors: string[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource.
     */
    readonly tags: string[];
    /**
     * URL of the git repository or account.
     */
    readonly url: string;
    /**
     * Repository to test the connection with. This is only used when `connectionType` is `Account`.
     */
    readonly validationRepo: string;
}
/**
 * Datasource for looking up a Git connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGitConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGitConnectorOutput(args: GetGitConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGitConnectorResult> {
    return pulumi.output(args).apply((a: any) => getGitConnector(a, opts))
}

/**
 * A collection of arguments for invoking getGitConnector.
 */
export interface GetGitConnectorOutputArgs {
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
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
}
