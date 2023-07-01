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

    public sealed class GetInputSetGitDetailsInputArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the default branch (this checks out a new branch titled by branch_name).
        /// </summary>
        [Input("baseBranch", required: true)]
        public Input<string> BaseBranch { get; set; } = null!;

        /// <summary>
        /// Name of the branch.
        /// </summary>
        [Input("branchName", required: true)]
        public Input<string> BranchName { get; set; } = null!;

        /// <summary>
        /// Commit message used for the merge commit.
        /// </summary>
        [Input("commitMessage", required: true)]
        public Input<string> CommitMessage { get; set; } = null!;

        /// <summary>
        /// Identifier of the Harness Connector used for CRUD operations on the Entity.
        /// </summary>
        [Input("connectorRef", required: true)]
        public Input<string> ConnectorRef { get; set; } = null!;

        /// <summary>
        /// File path of the Entity in the repository.
        /// </summary>
        [Input("filePath", required: true)]
        public Input<string> FilePath { get; set; } = null!;

        /// <summary>
        /// Last commit identifier (for Git Repositories other than Github). To be provided only when updating Pipeline.
        /// </summary>
        [Input("lastCommitId", required: true)]
        public Input<string> LastCommitId { get; set; } = null!;

        /// <summary>
        /// Last object identifier (for Github). To be provided only when updating Pipeline.
        /// </summary>
        [Input("lastObjectId", required: true)]
        public Input<string> LastObjectId { get; set; } = null!;

        /// <summary>
        /// Connector reference for Parent Entity (Pipeline).
        /// </summary>
        [Input("parentEntityConnectorRef", required: true)]
        public Input<string> ParentEntityConnectorRef { get; set; } = null!;

        /// <summary>
        /// Repository name for Parent Entity (Pipeline).
        /// </summary>
        [Input("parentEntityRepoName", required: true)]
        public Input<string> ParentEntityRepoName { get; set; } = null!;

        /// <summary>
        /// Name of the repository.
        /// </summary>
        [Input("repoName", required: true)]
        public Input<string> RepoName { get; set; } = null!;

        /// <summary>
        /// Specifies whether the Entity is to be stored in Git or not. Possible values: INLINE, REMOTE.
        /// </summary>
        [Input("storeType", required: true)]
        public Input<string> StoreType { get; set; } = null!;

        public GetInputSetGitDetailsInputArgs()
        {
        }
        public static new GetInputSetGitDetailsInputArgs Empty => new GetInputSetGitDetailsInputArgs();
    }
}
