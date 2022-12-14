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
    public sealed class GetKubernetesConnectorClientKeyCertResult
    {
        public readonly string CaCertRef;
        public readonly string ClientCertRef;
        public readonly string ClientKeyAlgorithm;
        public readonly string ClientKeyPassphraseRef;
        public readonly string ClientKeyRef;
        public readonly string MasterUrl;

        [OutputConstructor]
        private GetKubernetesConnectorClientKeyCertResult(
            string caCertRef,

            string clientCertRef,

            string clientKeyAlgorithm,

            string clientKeyPassphraseRef,

            string clientKeyRef,

            string masterUrl)
        {
            CaCertRef = caCertRef;
            ClientCertRef = clientCertRef;
            ClientKeyAlgorithm = clientKeyAlgorithm;
            ClientKeyPassphraseRef = clientKeyPassphraseRef;
            ClientKeyRef = clientKeyRef;
            MasterUrl = masterUrl;
        }
    }
}
