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
    public sealed class GetFiltersFilterPropertyResult
    {
        public readonly string FilterType;
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetFiltersFilterPropertyResult(
            string filterType,

            ImmutableArray<string> tags)
        {
            FilterType = filterType;
            Tags = tags;
        }
    }
}
