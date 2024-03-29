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
    public sealed class GetAzureCloudProviderConnectorCredentialAzureManualDetailResult
    {
        public readonly string ApplicationId;
        public readonly ImmutableArray<Outputs.GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthResult> Auths;
        public readonly string TenantId;

        [OutputConstructor]
        private GetAzureCloudProviderConnectorCredentialAzureManualDetailResult(
            string applicationId,

            ImmutableArray<Outputs.GetAzureCloudProviderConnectorCredentialAzureManualDetailAuthResult> auths,

            string tenantId)
        {
            ApplicationId = applicationId;
            Auths = auths;
            TenantId = tenantId;
        }
    }
}
