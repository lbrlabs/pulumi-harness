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

    public sealed class GetGitopsClusterRequestClusterArgs : global::Pulumi.InvokeArgs
    {
        [Input("annotations")]
        private Dictionary<string, string>? _annotations;
        public Dictionary<string, string> Annotations
        {
            get => _annotations ?? (_annotations = new Dictionary<string, string>());
            set => _annotations = value;
        }

        [Input("clusterResources")]
        public bool? ClusterResources { get; set; }

        [Input("configs")]
        private List<Inputs.GetGitopsClusterRequestClusterConfigArgs>? _configs;
        public List<Inputs.GetGitopsClusterRequestClusterConfigArgs> Configs
        {
            get => _configs ?? (_configs = new List<Inputs.GetGitopsClusterRequestClusterConfigArgs>());
            set => _configs = value;
        }

        [Input("infos")]
        private List<Inputs.GetGitopsClusterRequestClusterInfoArgs>? _infos;
        public List<Inputs.GetGitopsClusterRequestClusterInfoArgs> Infos
        {
            get => _infos ?? (_infos = new List<Inputs.GetGitopsClusterRequestClusterInfoArgs>());
            set => _infos = value;
        }

        [Input("labels")]
        private Dictionary<string, string>? _labels;
        public Dictionary<string, string> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, string>());
            set => _labels = value;
        }

        [Input("name")]
        public string? Name { get; set; }

        [Input("namespaces")]
        private List<string>? _namespaces;
        public List<string> Namespaces
        {
            get => _namespaces ?? (_namespaces = new List<string>());
            set => _namespaces = value;
        }

        [Input("project")]
        public string? Project { get; set; }

        [Input("refreshRequestedAts")]
        private List<Inputs.GetGitopsClusterRequestClusterRefreshRequestedAtArgs>? _refreshRequestedAts;
        public List<Inputs.GetGitopsClusterRequestClusterRefreshRequestedAtArgs> RefreshRequestedAts
        {
            get => _refreshRequestedAts ?? (_refreshRequestedAts = new List<Inputs.GetGitopsClusterRequestClusterRefreshRequestedAtArgs>());
            set => _refreshRequestedAts = value;
        }

        [Input("server", required: true)]
        public string Server { get; set; } = null!;

        [Input("shard")]
        public string? Shard { get; set; }

        public GetGitopsClusterRequestClusterArgs()
        {
        }
        public static new GetGitopsClusterRequestClusterArgs Empty => new GetGitopsClusterRequestClusterArgs();
    }
}
