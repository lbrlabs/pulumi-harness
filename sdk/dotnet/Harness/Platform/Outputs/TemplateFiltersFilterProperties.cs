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
    public sealed class TemplateFiltersFilterProperties
    {
        /// <summary>
        /// Corresponding Entity of the filters. Currently supported types are {TemplateSetup, TemplateExecution, Template}.
        /// </summary>
        public readonly string FilterType;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private TemplateFiltersFilterProperties(
            string filterType,

            ImmutableArray<string> tags)
        {
            FilterType = filterType;
            Tags = tags;
        }
    }
}
