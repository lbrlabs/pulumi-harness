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
    public sealed class GetManualFreezeFreezeWindowRecurrenceRecurrenceSpecResult
    {
        public readonly string Until;
        public readonly int Value;

        [OutputConstructor]
        private GetManualFreezeFreezeWindowRecurrenceRecurrenceSpecResult(
            string until,

            int value)
        {
            Until = until;
            Value = value;
        }
    }
}
