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
    public static class GetSlo
    {
        /// <summary>
        /// Data source for retrieving an SLO.
        /// </summary>
        public static Task<GetSloResult> InvokeAsync(GetSloArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSloResult>("harness:platform/getSlo:getSlo", args ?? new GetSloArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving an SLO.
        /// </summary>
        public static Output<GetSloResult> Invoke(GetSloInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSloResult>("harness:platform/getSlo:getSlo", args ?? new GetSloInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSloArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the SLO.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization in which the SLO is configured.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Identifier of the project in which the SLO is configured.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        public GetSloArgs()
        {
        }
        public static new GetSloArgs Empty => new GetSloArgs();
    }

    public sealed class GetSloInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the SLO.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Identifier of the organization in which the SLO is configured.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Identifier of the project in which the SLO is configured.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GetSloInvokeArgs()
        {
        }
        public static new GetSloInvokeArgs Empty => new GetSloInvokeArgs();
    }


    [OutputType]
    public sealed class GetSloResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Identifier of the SLO.
        /// </summary>
        public readonly string Identifier;
        /// <summary>
        /// Identifier of the organization in which the SLO is configured.
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// Identifier of the project in which the SLO is configured.
        /// </summary>
        public readonly string ProjectId;

        [OutputConstructor]
        private GetSloResult(
            string id,

            string identifier,

            string orgId,

            string projectId)
        {
            Id = id;
            Identifier = identifier;
            OrgId = orgId;
            ProjectId = projectId;
        }
    }
}
