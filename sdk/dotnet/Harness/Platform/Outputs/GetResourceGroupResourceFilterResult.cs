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
    public sealed class GetResourceGroupResourceFilterResult
    {
        public readonly bool IncludeAllResources;
        public readonly ImmutableArray<Outputs.GetResourceGroupResourceFilterResourceResult> Resources;

        [OutputConstructor]
        private GetResourceGroupResourceFilterResult(
            bool includeAllResources,

            ImmutableArray<Outputs.GetResourceGroupResourceFilterResourceResult> resources)
        {
            IncludeAllResources = includeAllResources;
            Resources = resources;
        }
    }
}
