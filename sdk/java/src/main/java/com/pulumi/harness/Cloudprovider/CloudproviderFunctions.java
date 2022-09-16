// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.cloudprovider;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.cloudprovider.inputs.GetDelegateIdsArgs;
import com.pulumi.harness.cloudprovider.inputs.GetDelegateIdsPlainArgs;
import com.pulumi.harness.cloudprovider.outputs.GetDelegateIdsResult;
import java.util.concurrent.CompletableFuture;

public final class CloudproviderFunctions {
    /**
     * Use this data source to get a list of delegate ID&#39;s matching the specified search criteria.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDelegateIdsResult> getDelegateIds() {
        return getDelegateIds(GetDelegateIdsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get a list of delegate ID&#39;s matching the specified search criteria.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDelegateIdsResult> getDelegateIdsPlain() {
        return getDelegateIdsPlain(GetDelegateIdsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get a list of delegate ID&#39;s matching the specified search criteria.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDelegateIdsResult> getDelegateIds(GetDelegateIdsArgs args) {
        return getDelegateIds(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get a list of delegate ID&#39;s matching the specified search criteria.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDelegateIdsResult> getDelegateIdsPlain(GetDelegateIdsPlainArgs args) {
        return getDelegateIdsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Use this data source to get a list of delegate ID&#39;s matching the specified search criteria.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDelegateIdsResult> getDelegateIds(GetDelegateIdsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("harness:cloudprovider/getDelegateIds:getDelegateIds", TypeShape.of(GetDelegateIdsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get a list of delegate ID&#39;s matching the specified search criteria.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDelegateIdsResult> getDelegateIdsPlain(GetDelegateIdsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("harness:cloudprovider/getDelegateIds:getDelegateIds", TypeShape.of(GetDelegateIdsResult.class), args, Utilities.withVersion(options));
    }
}
