// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Datasource for looking up an AWS Cloud Cost connector.
 */
export function getAwsCCConnector(args?: GetAwsCCConnectorArgs, opts?: pulumi.InvokeOptions): Promise<GetAwsCCConnectorResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getAwsCCConnector:getAwsCCConnector", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getAwsCCConnector.
 */
export interface GetAwsCCConnectorArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
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
 * A collection of values returned by getAwsCCConnector.
 */
export interface GetAwsCCConnectorResult {
    /**
     * The AWS account id.
     */
    readonly accountId: string;
    /**
     * Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
     */
    readonly crossAccountAccesses: outputs.platform.GetAwsCCConnectorCrossAccountAccess[];
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
     */
    readonly featuresEnableds: string[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier?: string;
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
     * The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
     */
    readonly reportName: string;
    /**
     * The name of s3 bucket.
     */
    readonly s3Bucket: string;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
}

export function getAwsCCConnectorOutput(args?: GetAwsCCConnectorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetAwsCCConnectorResult> {
    return pulumi.output(args).apply(a => getAwsCCConnector(a, opts))
}

/**
 * A collection of arguments for invoking getAwsCCConnector.
 */
export interface GetAwsCCConnectorOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
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
