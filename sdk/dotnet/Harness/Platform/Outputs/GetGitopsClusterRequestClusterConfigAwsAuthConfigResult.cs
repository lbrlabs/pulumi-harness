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
    public sealed class GetGitopsClusterRequestClusterConfigAwsAuthConfigResult
    {
        public readonly string? ClusterName;
        public readonly string? RoleARN;

        [OutputConstructor]
        private GetGitopsClusterRequestClusterConfigAwsAuthConfigResult(
            string? clusterName,

            string? roleARN)
        {
            ClusterName = clusterName;
            RoleARN = roleARN;
        }
    }
}
