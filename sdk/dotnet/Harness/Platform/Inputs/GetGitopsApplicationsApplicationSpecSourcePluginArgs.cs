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

    public sealed class GetGitopsApplicationsApplicationSpecSourcePluginInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("envs")]
        private InputList<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvInputArgs>? _envs;
        public InputList<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvInputArgs> Envs
        {
            get => _envs ?? (_envs = new InputList<Inputs.GetGitopsApplicationsApplicationSpecSourcePluginEnvInputArgs>());
            set => _envs = value;
        }

        /// <summary>
        /// Name of the GitOps application.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetGitopsApplicationsApplicationSpecSourcePluginInputArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSourcePluginInputArgs Empty => new GetGitopsApplicationsApplicationSpecSourcePluginInputArgs();
    }
}
