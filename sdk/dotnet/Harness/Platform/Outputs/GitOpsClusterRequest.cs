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
    public sealed class GitOpsClusterRequest
    {
        public readonly ImmutableArray<Outputs.GitOpsClusterRequestCluster> Clusters;
        public readonly ImmutableArray<Outputs.GitOpsClusterRequestId> Ids;
        public readonly ImmutableArray<Outputs.GitOpsClusterRequestUpdateMask> UpdateMasks;
        public readonly ImmutableArray<string> UpdatedFields;
        public readonly bool? Upsert;

        [OutputConstructor]
        private GitOpsClusterRequest(
            ImmutableArray<Outputs.GitOpsClusterRequestCluster> clusters,

            ImmutableArray<Outputs.GitOpsClusterRequestId> ids,

            ImmutableArray<Outputs.GitOpsClusterRequestUpdateMask> updateMasks,

            ImmutableArray<string> updatedFields,

            bool? upsert)
        {
            Clusters = clusters;
            Ids = ids;
            UpdateMasks = updateMasks;
            UpdatedFields = updatedFields;
            Upsert = upsert;
        }
    }
}
