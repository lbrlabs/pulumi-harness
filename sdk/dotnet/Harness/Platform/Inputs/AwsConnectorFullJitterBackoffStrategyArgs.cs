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

    public sealed class AwsConnectorFullJitterBackoffStrategyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Base delay.
        /// </summary>
        [Input("baseDelay")]
        public Input<int>? BaseDelay { get; set; }

        /// <summary>
        /// Max BackOff Time.
        /// </summary>
        [Input("maxBackoffTime")]
        public Input<int>? MaxBackoffTime { get; set; }

        /// <summary>
        /// Retry Count.
        /// </summary>
        [Input("retryCount")]
        public Input<int>? RetryCount { get; set; }

        public AwsConnectorFullJitterBackoffStrategyArgs()
        {
        }
        public static new AwsConnectorFullJitterBackoffStrategyArgs Empty => new AwsConnectorFullJitterBackoffStrategyArgs();
    }
}
