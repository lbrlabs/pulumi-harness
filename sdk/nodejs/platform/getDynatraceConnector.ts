// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Datasource for looking up a Dynatrace connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getDynatraceConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getDynatraceConnector(args: GetDynatraceConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetDynatraceConnectorResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getDynatraceConnector:getDynatraceConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getDynatraceConnector.
 */
export interface GetDynatraceConnectorArgs {
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
 * A collection of values returned by getDynatraceConnector.
 */
export interface GetDynatraceConnectorResult {
    /**
     * The reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
     */
    readonly apiTokenRef: string;
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
     * URL of the Dynatrace server.
     */
    readonly url: string;
}
/**
 * Datasource for looking up a Dynatrace connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = harness.platform.getDynatraceConnector({
 *     identifier: "identifier",
 * });
 * ```
 */
export function getDynatraceConnectorOutput(args: GetDynatraceConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetDynatraceConnectorResult> {
    return pulumi.output(args).apply((a: any) => getDynatraceConnector(a, opts))
}

/**
 * A collection of arguments for invoking getDynatraceConnector.
 */
export interface GetDynatraceConnectorOutputArgs {
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
