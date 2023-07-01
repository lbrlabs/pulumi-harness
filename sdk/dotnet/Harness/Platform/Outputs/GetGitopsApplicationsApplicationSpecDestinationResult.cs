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
    public sealed class GetGitopsApplicationsApplicationSpecDestinationResult
    {
        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        public readonly string? Name;
        public readonly string? Namespace;
        public readonly string? Server;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecDestinationResult(
            string? name,

            string? @namespace,

            string? server)
        {
            Name = name;
            Namespace = @namespace;
            Server = server;
        }
    }
}
