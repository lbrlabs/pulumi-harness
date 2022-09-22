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
    public static class GetOrganization
    {
        /// <summary>
        /// Data source for retrieving a Harness organization
        /// </summary>
        public static Task<GetOrganizationResult> InvokeAsync(GetOrganizationArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetOrganizationResult>("harness:platform/getOrganization:getOrganization", args ?? new GetOrganizationArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness organization
        /// </summary>
        public static Output<GetOrganizationResult> Invoke(GetOrganizationInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetOrganizationResult>("harness:platform/getOrganization:getOrganization", args ?? new GetOrganizationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetOrganizationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        public GetOrganizationArgs()
        {
        }
        public static new GetOrganizationArgs Empty => new GetOrganizationArgs();
    }

    public sealed class GetOrganizationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public GetOrganizationInvokeArgs()
        {
        }
        public static new GetOrganizationInvokeArgs Empty => new GetOrganizationInvokeArgs();
    }


    [OutputType]
    public sealed class GetOrganizationResult
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        public readonly string? Identifier;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetOrganizationResult(
            string description,

            string id,

            string? identifier,

            string? name,

            ImmutableArray<string> tags)
        {
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            Tags = tags;
        }
    }
}
