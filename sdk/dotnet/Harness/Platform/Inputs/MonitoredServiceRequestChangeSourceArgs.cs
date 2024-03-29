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

    public sealed class MonitoredServiceRequestChangeSourceArgs : global::Pulumi.ResourceArgs
    {
        [Input("category", required: true)]
        public Input<string> Category { get; set; } = null!;

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Identifier of the monitored service.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("spec")]
        public Input<string>? Spec { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public MonitoredServiceRequestChangeSourceArgs()
        {
        }
        public static new MonitoredServiceRequestChangeSourceArgs Empty => new MonitoredServiceRequestChangeSourceArgs();
    }
}
