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
    public sealed class GetGitopsRepositoryUpdateMaskResult
    {
        /// <summary>
        /// The set of field mask paths.
        /// </summary>
        public readonly ImmutableArray<string> Paths;

        [OutputConstructor]
        private GetGitopsRepositoryUpdateMaskResult(ImmutableArray<string> paths)
        {
            Paths = paths;
        }
    }
}
