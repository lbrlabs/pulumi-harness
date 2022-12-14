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
    public sealed class GitOpsClusterRequestClusterConfig
    {
        public readonly ImmutableArray<Outputs.GitOpsClusterRequestClusterConfigAwsAuthConfig> AwsAuthConfigs;
        public readonly string? BearerToken;
        public readonly string? ClusterConnectionType;
        public readonly ImmutableArray<Outputs.GitOpsClusterRequestClusterConfigExecProviderConfig> ExecProviderConfigs;
        public readonly string? Password;
        public readonly ImmutableArray<Outputs.GitOpsClusterRequestClusterConfigTlsClientConfig> TlsClientConfigs;
        public readonly string? Username;

        [OutputConstructor]
        private GitOpsClusterRequestClusterConfig(
            ImmutableArray<Outputs.GitOpsClusterRequestClusterConfigAwsAuthConfig> awsAuthConfigs,

            string? bearerToken,

            string? clusterConnectionType,

            ImmutableArray<Outputs.GitOpsClusterRequestClusterConfigExecProviderConfig> execProviderConfigs,

            string? password,

            ImmutableArray<Outputs.GitOpsClusterRequestClusterConfigTlsClientConfig> tlsClientConfigs,

            string? username)
        {
            AwsAuthConfigs = awsAuthConfigs;
            BearerToken = bearerToken;
            ClusterConnectionType = clusterConnectionType;
            ExecProviderConfigs = execProviderConfigs;
            Password = password;
            TlsClientConfigs = tlsClientConfigs;
            Username = username;
        }
    }
}
