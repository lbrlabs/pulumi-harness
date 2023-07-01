// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Datasource for looking up GCP Secret Manager connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGcpSecretManagerConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGcpSecretManagerConnector(args: GetGcpSecretManagerConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetGcpSecretManagerConnectorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getGcpSecretManagerConnector:getGcpSecretManagerConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getGcpSecretManagerConnector.
 */
export interface GetGcpSecretManagerConnectorArgs {
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
 * A collection of values returned by getGcpSecretManagerConnector.
 */
export interface GetGcpSecretManagerConnectorResult {
    /**
     * Reference to the secret containing credentials of IAM service account for Google Secret Manager. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    readonly credentialsRef: string;
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
     * Indicative if this is default Secret manager for secrets.
     */
    readonly isDefault: boolean;
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
}
/**
 * Datasource for looking up GCP Secret Manager connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getGcpSecretManagerConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getGcpSecretManagerConnectorOutput(args: GetGcpSecretManagerConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetGcpSecretManagerConnectorResult> {
    return pulumi.output(args).apply((a: any) => getGcpSecretManagerConnector(a, opts))
}

/**
 * A collection of arguments for invoking getGcpSecretManagerConnector.
 */
export interface GetGcpSecretManagerConnectorOutputArgs {
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
