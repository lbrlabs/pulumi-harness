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
    public static class GetServiceOverridesV2
    {
        public static Task<GetServiceOverridesV2Result> InvokeAsync(GetServiceOverridesV2Args args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetServiceOverridesV2Result>("harness:platform/getServiceOverridesV2:getServiceOverridesV2", args ?? new GetServiceOverridesV2Args(), options.WithDefaults());

        public static Output<GetServiceOverridesV2Result> Invoke(GetServiceOverridesV2InvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetServiceOverridesV2Result>("harness:platform/getServiceOverridesV2:getServiceOverridesV2", args ?? new GetServiceOverridesV2InvokeArgs(), options.WithDefaults());
    }


    public sealed class GetServiceOverridesV2Args : global::Pulumi.InvokeArgs
    {
        [Input("clusterId")]
        public string? ClusterId { get; set; }

        [Input("envId", required: true)]
        public string EnvId { get; set; } = null!;

        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        [Input("infraId")]
        public string? InfraId { get; set; }

        [Input("orgId")]
        public string? OrgId { get; set; }

        [Input("projectId")]
        public string? ProjectId { get; set; }

        [Input("serviceId")]
        public string? ServiceId { get; set; }

        [Input("spec", required: true)]
        public string Spec { get; set; } = null!;

        [Input("type", required: true)]
        public string Type { get; set; } = null!;

        public GetServiceOverridesV2Args()
        {
        }
        public static new GetServiceOverridesV2Args Empty => new GetServiceOverridesV2Args();
    }

    public sealed class GetServiceOverridesV2InvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("clusterId")]
        public Input<string>? ClusterId { get; set; }

        [Input("envId", required: true)]
        public Input<string> EnvId { get; set; } = null!;

        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        [Input("infraId")]
        public Input<string>? InfraId { get; set; }

        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        [Input("serviceId")]
        public Input<string>? ServiceId { get; set; }

        [Input("spec", required: true)]
        public Input<string> Spec { get; set; } = null!;

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public GetServiceOverridesV2InvokeArgs()
        {
        }
        public static new GetServiceOverridesV2InvokeArgs Empty => new GetServiceOverridesV2InvokeArgs();
    }


    [OutputType]
    public sealed class GetServiceOverridesV2Result
    {
        public readonly string ClusterId;
        public readonly string EnvId;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Identifier;
        public readonly string InfraId;
        public readonly string? OrgId;
        public readonly string? ProjectId;
        public readonly string ServiceId;
        public readonly string Spec;
        public readonly string Type;

        [OutputConstructor]
        private GetServiceOverridesV2Result(
            string clusterId,

            string envId,

            string id,

            string identifier,

            string infraId,

            string? orgId,

            string? projectId,

            string serviceId,

            string spec,

            string type)
        {
            ClusterId = clusterId;
            EnvId = envId;
            Id = id;
            Identifier = identifier;
            InfraId = infraId;
            OrgId = orgId;
            ProjectId = projectId;
            ServiceId = serviceId;
            Spec = spec;
            Type = type;
        }
    }
}
