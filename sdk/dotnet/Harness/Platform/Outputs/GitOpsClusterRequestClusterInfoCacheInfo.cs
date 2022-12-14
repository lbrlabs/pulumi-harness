// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitOpsClusterRequestClusterInfoCacheInfo
    {
        public readonly string? ApisCount;
        public readonly string? LastCacheSyncTime;
        public readonly string? ResourcesCount;

        [OutputConstructor]
        private GitOpsClusterRequestClusterInfoCacheInfo(
            string? apisCount,

            string? lastCacheSyncTime,

            string? resourcesCount)
        {
            ApisCount = apisCount;
            LastCacheSyncTime = lastCacheSyncTime;
            ResourcesCount = resourcesCount;
        }
    }
}
