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
    public static class GetArtifactoryConnector
    {
        /// <summary>
        /// Resource for looking up an App Dynamics connector.
        /// </summary>
        public static Task<GetArtifactoryConnectorResult> InvokeAsync(GetArtifactoryConnectorArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetArtifactoryConnectorResult>("harness:platform/getArtifactoryConnector:getArtifactoryConnector", args ?? new GetArtifactoryConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Resource for looking up an App Dynamics connector.
        /// </summary>
        public static Output<GetArtifactoryConnectorResult> Invoke(GetArtifactoryConnectorInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetArtifactoryConnectorResult>("harness:platform/getArtifactoryConnector:getArtifactoryConnector", args ?? new GetArtifactoryConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetArtifactoryConnectorArgs : global::Pulumi.InvokeArgs
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

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public string? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public string? ProjectId { get; set; }

        public GetArtifactoryConnectorArgs()
        {
        }
        public static new GetArtifactoryConnectorArgs Empty => new GetArtifactoryConnectorArgs();
    }

    public sealed class GetArtifactoryConnectorInvokeArgs : global::Pulumi.InvokeArgs
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

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId")]
        public Input<string>? OrgId { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GetArtifactoryConnectorInvokeArgs()
        {
        }
        public static new GetArtifactoryConnectorInvokeArgs Empty => new GetArtifactoryConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetArtifactoryConnectorResult
    {
        /// <summary>
        /// Credentials to use for authentication.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetArtifactoryConnectorCredentialResult> Credentials;
        /// <summary>
        /// Connect using only the delegates which have these tags.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
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
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// URL of the Artifactory server.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetArtifactoryConnectorResult(
            ImmutableArray<Outputs.GetArtifactoryConnectorCredentialResult> credentials,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string? identifier,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags,

            string url)
        {
            Credentials = credentials;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
            Url = url;
        }
    }
}
