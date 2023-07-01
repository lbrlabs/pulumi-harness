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
    public static class GetJenkinsConnector
    {
        /// <summary>
        /// Datasource for looking up a Jenkins connector.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetJenkinsConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetJenkinsConnectorResult> InvokeAsync(GetJenkinsConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetJenkinsConnectorResult>("harness:platform/getJenkinsConnector:getJenkinsConnector", args ?? new GetJenkinsConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Datasource for looking up a Jenkins connector.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Harness.Platform.GetJenkinsConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetJenkinsConnectorResult> Invoke(GetJenkinsConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetJenkinsConnectorResult>("harness:platform/getJenkinsConnector:getJenkinsConnector", args ?? new GetJenkinsConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetJenkinsConnectorArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public string Identifier { get; set; } = null!;

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

        public GetJenkinsConnectorArgs()
        {
        }
        public static new GetJenkinsConnectorArgs Empty => new GetJenkinsConnectorArgs();
    }

    public sealed class GetJenkinsConnectorInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

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

        public GetJenkinsConnectorInvokeArgs()
        {
        }
        public static new GetJenkinsConnectorInvokeArgs Empty => new GetJenkinsConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetJenkinsConnectorResult
    {
        /// <summary>
        /// This entity contains the details for Jenkins Authentication.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetJenkinsConnectorAuthResult> Auths;
        /// <summary>
        /// Tags to filter delegates for connection.
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
        public readonly string Identifier;
        /// <summary>
        /// Jenkins Url.
        /// </summary>
        public readonly string JenkinsUrl;
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
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;

        [OutputConstructor]
        private GetJenkinsConnectorResult(
            ImmutableArray<Outputs.GetJenkinsConnectorAuthResult> auths,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string identifier,

            string jenkinsUrl,

            string? name,

            string? orgId,

            string? projectId,

            ImmutableArray<string> tags)
        {
            Auths = auths;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            JenkinsUrl = jenkinsUrl;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
        }
    }
}
