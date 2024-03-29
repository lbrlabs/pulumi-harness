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

    public sealed class ServiceNowConnectorAuthAdfsArgs : global::Pulumi.ResourceArgs
    {
        [Input("adfsUrl", required: true)]
        public Input<string> AdfsUrl { get; set; } = null!;

        [Input("certificateRef", required: true)]
        public Input<string> CertificateRef { get; set; } = null!;

        [Input("clientIdRef", required: true)]
        public Input<string> ClientIdRef { get; set; } = null!;

        [Input("privateKeyRef", required: true)]
        public Input<string> PrivateKeyRef { get; set; } = null!;

        [Input("resourceIdRef", required: true)]
        public Input<string> ResourceIdRef { get; set; } = null!;

        public ServiceNowConnectorAuthAdfsArgs()
        {
        }
        public static new ServiceNowConnectorAuthAdfsArgs Empty => new ServiceNowConnectorAuthAdfsArgs();
    }
}
