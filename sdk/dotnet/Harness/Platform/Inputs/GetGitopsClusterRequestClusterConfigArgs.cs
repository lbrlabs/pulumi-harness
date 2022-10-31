// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GetGitopsClusterRequestClusterConfigInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("awsAuthConfigs")]
        private InputList<Inputs.GetGitopsClusterRequestClusterConfigAwsAuthConfigInputArgs>? _awsAuthConfigs;
        public InputList<Inputs.GetGitopsClusterRequestClusterConfigAwsAuthConfigInputArgs> AwsAuthConfigs
        {
            get => _awsAuthConfigs ?? (_awsAuthConfigs = new InputList<Inputs.GetGitopsClusterRequestClusterConfigAwsAuthConfigInputArgs>());
            set => _awsAuthConfigs = value;
        }

        [Input("bearerToken")]
        public Input<string>? BearerToken { get; set; }

        [Input("clusterConnectionType")]
        public Input<string>? ClusterConnectionType { get; set; }

        [Input("execProviderConfigs")]
        private InputList<Inputs.GetGitopsClusterRequestClusterConfigExecProviderConfigInputArgs>? _execProviderConfigs;
        public InputList<Inputs.GetGitopsClusterRequestClusterConfigExecProviderConfigInputArgs> ExecProviderConfigs
        {
            get => _execProviderConfigs ?? (_execProviderConfigs = new InputList<Inputs.GetGitopsClusterRequestClusterConfigExecProviderConfigInputArgs>());
            set => _execProviderConfigs = value;
        }

        [Input("password")]
        public Input<string>? Password { get; set; }

        [Input("tlsClientConfigs")]
        private InputList<Inputs.GetGitopsClusterRequestClusterConfigTlsClientConfigInputArgs>? _tlsClientConfigs;
        public InputList<Inputs.GetGitopsClusterRequestClusterConfigTlsClientConfigInputArgs> TlsClientConfigs
        {
            get => _tlsClientConfigs ?? (_tlsClientConfigs = new InputList<Inputs.GetGitopsClusterRequestClusterConfigTlsClientConfigInputArgs>());
            set => _tlsClientConfigs = value;
        }

        [Input("username")]
        public Input<string>? Username { get; set; }

        public GetGitopsClusterRequestClusterConfigInputArgs()
        {
        }
        public static new GetGitopsClusterRequestClusterConfigInputArgs Empty => new GetGitopsClusterRequestClusterConfigInputArgs();
    }
}