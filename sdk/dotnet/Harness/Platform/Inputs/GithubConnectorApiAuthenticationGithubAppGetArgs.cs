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

    public sealed class GithubConnectorApiAuthenticationGithubAppGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        [Input("applicationIdRef")]
        public Input<string>? ApplicationIdRef { get; set; }

        [Input("installationId")]
        public Input<string>? InstallationId { get; set; }

        [Input("installationIdRef")]
        public Input<string>? InstallationIdRef { get; set; }

        [Input("privateKeyRef", required: true)]
        public Input<string> PrivateKeyRef { get; set; } = null!;

        public GithubConnectorApiAuthenticationGithubAppGetArgs()
        {
        }
        public static new GithubConnectorApiAuthenticationGithubAppGetArgs Empty => new GithubConnectorApiAuthenticationGithubAppGetArgs();
    }
}
