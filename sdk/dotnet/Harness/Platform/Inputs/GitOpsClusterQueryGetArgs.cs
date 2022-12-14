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

    public sealed class GitOpsClusterQueryGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("ids")]
        private InputList<Inputs.GitOpsClusterQueryIdGetArgs>? _ids;
        public InputList<Inputs.GitOpsClusterQueryIdGetArgs> Ids
        {
            get => _ids ?? (_ids = new InputList<Inputs.GitOpsClusterQueryIdGetArgs>());
            set => _ids = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("server")]
        public Input<string>? Server { get; set; }

        public GitOpsClusterQueryGetArgs()
        {
        }
        public static new GitOpsClusterQueryGetArgs Empty => new GitOpsClusterQueryGetArgs();
    }
}
