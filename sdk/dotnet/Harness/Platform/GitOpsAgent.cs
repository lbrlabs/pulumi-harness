// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform
{
    [HarnessResourceType("harness:platform/gitOpsAgent:GitOpsAgent")]
    public partial class GitOpsAgent : global::Pulumi.CustomResource
    {
        /// <summary>
        /// account identifier of the agent.
        /// </summary>
        [Output("accountId")]
        public Output<string> AccountId { get; private set; } = null!;

        /// <summary>
        /// description of the agent.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// identifier of the agent.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// tags for the agent.
        /// </summary>
        [Output("metadatas")]
        public Output<ImmutableArray<Outputs.GitOpsAgentMetadata>> Metadatas { get; private set; } = null!;

        /// <summary>
        /// name of the agent.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// org identifier of the agent.
        /// </summary>
        [Output("orgId")]
        public Output<string> OrgId { get; private set; } = null!;

        /// <summary>
        /// org identifier of the agent.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;

        /// <summary>
        /// tags for the agent.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// type of the agent.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a GitOpsAgent resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GitOpsAgent(string name, GitOpsAgentArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/gitOpsAgent:GitOpsAgent", name, args ?? new GitOpsAgentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GitOpsAgent(string name, Input<string> id, GitOpsAgentState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/gitOpsAgent:GitOpsAgent", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GitOpsAgent resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GitOpsAgent Get(string name, Input<string> id, GitOpsAgentState? state = null, CustomResourceOptions? options = null)
        {
            return new GitOpsAgent(name, id, state, options);
        }
    }

    public sealed class GitOpsAgentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// account identifier of the agent.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<string> AccountId { get; set; } = null!;

        /// <summary>
        /// description of the agent.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// identifier of the agent.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("metadatas")]
        private InputList<Inputs.GitOpsAgentMetadataArgs>? _metadatas;

        /// <summary>
        /// tags for the agent.
        /// </summary>
        public InputList<Inputs.GitOpsAgentMetadataArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.GitOpsAgentMetadataArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// name of the agent.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// org identifier of the agent.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// org identifier of the agent.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// tags for the agent.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// type of the agent.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GitOpsAgentArgs()
        {
        }
        public static new GitOpsAgentArgs Empty => new GitOpsAgentArgs();
    }

    public sealed class GitOpsAgentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// account identifier of the agent.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// description of the agent.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// identifier of the agent.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        [Input("metadatas")]
        private InputList<Inputs.GitOpsAgentMetadataGetArgs>? _metadatas;

        /// <summary>
        /// tags for the agent.
        /// </summary>
        public InputList<Inputs.GitOpsAgentMetadataGetArgs> Metadatas
        {
            get => _metadatas ?? (_metadatas = new InputList<Inputs.GitOpsAgentMetadataGetArgs>());
            set => _metadatas = value;
        }

        /// <summary>
        /// name of the agent.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// org identifier of the agent.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// org identifier of the agent.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// tags for the agent.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// type of the agent.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public GitOpsAgentState()
        {
        }
        public static new GitOpsAgentState Empty => new GitOpsAgentState();
    }
}
