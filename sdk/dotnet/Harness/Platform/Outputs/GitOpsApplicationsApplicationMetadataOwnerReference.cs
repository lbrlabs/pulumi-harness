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
    public sealed class GitOpsApplicationsApplicationMetadataOwnerReference
    {
        public readonly string? ApiVersion;
        public readonly bool? BlockOwnerDeletion;
        public readonly bool? Controller;
        /// <summary>
        /// Kind of the GitOps application.
        /// </summary>
        public readonly string? Kind;
        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        public readonly string? Name;
        public readonly string? Uid;

        [OutputConstructor]
        private GitOpsApplicationsApplicationMetadataOwnerReference(
            string? apiVersion,

            bool? blockOwnerDeletion,

            bool? controller,

            string? kind,

            string? name,

            string? uid)
        {
            ApiVersion = apiVersion;
            BlockOwnerDeletion = blockOwnerDeletion;
            Controller = controller;
            Kind = kind;
            Name = name;
            Uid = uid;
        }
    }
}
