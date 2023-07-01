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

    public sealed class GitOpsApplicationsApplicationSpecSourcePluginArgs : global::Pulumi.ResourceArgs
    {
        [Input("envs")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginEnvArgs>? _envs;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginEnvArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourcePluginEnvArgs>());
            set => _envs = value;
        }

        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GitOpsApplicationsApplicationSpecSourcePluginArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecSourcePluginArgs Empty => new GitOpsApplicationsApplicationSpecSourcePluginArgs();
    }
}