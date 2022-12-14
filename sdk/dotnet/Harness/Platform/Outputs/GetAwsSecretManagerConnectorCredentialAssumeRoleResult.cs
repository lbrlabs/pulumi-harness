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
    public sealed class GetAwsSecretManagerConnectorCredentialAssumeRoleResult
    {
        public readonly int Duration;
        public readonly string ExternalId;
        public readonly string RoleArn;

        [OutputConstructor]
        private GetAwsSecretManagerConnectorCredentialAssumeRoleResult(
            int duration,

            string externalId,

            string roleArn)
        {
            Duration = duration;
            ExternalId = externalId;
            RoleArn = roleArn;
        }
    }
}
