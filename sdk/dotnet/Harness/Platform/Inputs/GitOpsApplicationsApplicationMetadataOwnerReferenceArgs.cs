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

    public sealed class GitOpsApplicationsApplicationMetadataOwnerReferenceArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiVersion")]
        public Input<string>? ApiVersion { get; set; }

        [Input("blockOwnerDeletion")]
        public Input<bool>? BlockOwnerDeletion { get; set; }

        [Input("controller")]
        public Input<bool>? Controller { get; set; }

        /// <summary>
        /// Kind of the GitOps application.
        /// </summary>
        [Input("kind")]
        public Input<string>? Kind { get; set; }

        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("uid")]
        public Input<string>? Uid { get; set; }

        public GitOpsApplicationsApplicationMetadataOwnerReferenceArgs()
        {
        }
        public static new GitOpsApplicationsApplicationMetadataOwnerReferenceArgs Empty => new GitOpsApplicationsApplicationMetadataOwnerReferenceArgs();
    }
}