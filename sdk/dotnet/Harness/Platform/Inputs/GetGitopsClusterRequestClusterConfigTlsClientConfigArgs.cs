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

    public sealed class GetGitopsClusterRequestClusterConfigTlsClientConfigInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("caData")]
        public Input<string>? CaData { get; set; }

        [Input("certData")]
        public Input<string>? CertData { get; set; }

        [Input("insecure")]
        public Input<bool>? Insecure { get; set; }

        [Input("keyData")]
        public Input<string>? KeyData { get; set; }

        [Input("serverName")]
        public Input<string>? ServerName { get; set; }

        public GetGitopsClusterRequestClusterConfigTlsClientConfigInputArgs()
        {
        }
        public static new GetGitopsClusterRequestClusterConfigTlsClientConfigInputArgs Empty => new GetGitopsClusterRequestClusterConfigTlsClientConfigInputArgs();
    }
}
