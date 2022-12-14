// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Outputs
{

    [OutputType]
    public sealed class GetGitConnectorCommitDetailResult
    {
        public readonly string AuthorEmailId;
        public readonly string AuthorName;
        public readonly string Message;

        [OutputConstructor]
        private GetGitConnectorCommitDetailResult(
            string authorEmailId,

            string authorName,

            string message)
        {
            AuthorEmailId = authorEmailId;
            AuthorName = authorName;
            Message = message;
        }
    }
}
