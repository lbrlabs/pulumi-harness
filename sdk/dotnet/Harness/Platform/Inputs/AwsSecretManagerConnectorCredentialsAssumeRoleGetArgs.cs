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

    public sealed class AwsSecretManagerConnectorCredentialsAssumeRoleGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("duration", required: true)]
        public Input<int> Duration { get; set; } = null!;

        [Input("externalId")]
        public Input<string>? ExternalId { get; set; }

        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        public AwsSecretManagerConnectorCredentialsAssumeRoleGetArgs()
        {
        }
        public static new AwsSecretManagerConnectorCredentialsAssumeRoleGetArgs Empty => new AwsSecretManagerConnectorCredentialsAssumeRoleGetArgs();
    }
}
