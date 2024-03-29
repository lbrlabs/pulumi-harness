// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

export function getApiKey(args: GetApiKeyArgs, opts?: pulumi.InvokeOptions): Promise<GetApiKeyResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("harness:platform/getApiKey:getApiKey", {
        "accountId": args.accountId,
        "apikeyType": args.apikeyType,
        "defaultTimeToExpireToken": args.defaultTimeToExpireToken,
        "description": args.description,
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "parentId": args.parentId,
        "projectId": args.projectId,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getApiKey.
 */
export interface GetApiKeyArgs {
    accountId: string;
    apikeyType: string;
    defaultTimeToExpireToken?: number;
    description?: string;
    identifier: string;
    name: string;
    orgId?: string;
    parentId: string;
    projectId?: string;
    tags?: {[key: string]: string};
}

/**
 * A collection of values returned by getApiKey.
 */
export interface GetApiKeyResult {
    readonly accountId: string;
    readonly apikeyType: string;
    readonly defaultTimeToExpireToken?: number;
    readonly description?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly identifier: string;
    readonly name: string;
    readonly orgId?: string;
    readonly parentId: string;
    readonly projectId?: string;
    readonly tags?: {[key: string]: string};
}
export function getApiKeyOutput(args: GetApiKeyOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetApiKeyResult> {
    return pulumi.output(args).apply((a: any) => getApiKey(a, opts))
}

/**
 * A collection of arguments for invoking getApiKey.
 */
export interface GetApiKeyOutputArgs {
    accountId: pulumi.Input<string>;
    apikeyType: pulumi.Input<string>;
    defaultTimeToExpireToken?: pulumi.Input<number>;
    description?: pulumi.Input<string>;
    identifier: pulumi.Input<string>;
    name: pulumi.Input<string>;
    orgId?: pulumi.Input<string>;
    parentId: pulumi.Input<string>;
    projectId?: pulumi.Input<string>;
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
