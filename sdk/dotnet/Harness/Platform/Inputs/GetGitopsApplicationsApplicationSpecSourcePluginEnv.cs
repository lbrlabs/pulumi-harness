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

    public sealed class GetGitopsApplicationsApplicationSpecSourcePluginEnvArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        [Input("value")]
        public string? Value { get; set; }

        public GetGitopsApplicationsApplicationSpecSourcePluginEnvArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourcePluginEnvArgs Empty => new GetGitopsApplicationsApplicationSpecSourcePluginEnvArgs();
    }
}
