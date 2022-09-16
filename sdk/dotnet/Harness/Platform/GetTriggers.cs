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
    public static class GetTriggers
    {
        /// <summary>
        /// Data source for retrieving a Harness trigger.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetTriggers.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         TargetId = "pipeline_id",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetTriggersResult> InvokeAsync(GetTriggersArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetTriggersResult>("harness:platform/getTriggers:getTriggers", args ?? new GetTriggersArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for retrieving a Harness trigger.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Harness = Pulumi.Harness;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var test = Harness.Platform.GetTriggers.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///         OrgId = "org_id",
        ///         ProjectId = "project_id",
        ///         TargetId = "pipeline_id",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetTriggersResult> Invoke(GetTriggersInvokeArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetTriggersResult>("harness:platform/getTriggers:getTriggers", args ?? new GetTriggersInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetTriggersArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public string? Identifier { get; set; }

        /// <summary>
        /// ignore error default false
        /// </summary>
        [Input("ignoreError")]
        public bool? IgnoreError { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public string? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public string OrgId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId", required: true)]
        public string ProjectId { get; set; } = null!;

        /// <summary>
        /// Identifier of the target pipeline
        /// </summary>
        [Input("targetId", required: true)]
        public string TargetId { get; set; } = null!;

        public GetTriggersArgs()
        {
        }
        public static new GetTriggersArgs Empty => new GetTriggersArgs();
    }

    public sealed class GetTriggersInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// ignore error default false
        /// </summary>
        [Input("ignoreError")]
        public Input<bool>? IgnoreError { get; set; }

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Input("orgId", required: true)]
        public Input<string> OrgId { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        /// <summary>
        /// Identifier of the target pipeline
        /// </summary>
        [Input("targetId", required: true)]
        public Input<string> TargetId { get; set; } = null!;

        public GetTriggersInvokeArgs()
        {
        }
        public static new GetTriggersInvokeArgs Empty => new GetTriggersInvokeArgs();
    }


    [OutputType]
    public sealed class GetTriggersResult
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
        /// ignore error default false
        /// </summary>
        public readonly bool? IgnoreError;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string OrgId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string ProjectId;
        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Identifier of the target pipeline
        /// </summary>
        public readonly string TargetId;
        /// <summary>
        /// trigger yaml
        /// </summary>
        public readonly string Yaml;

        [OutputConstructor]
        private GetTriggersResult(
            string description,

            string id,

            string? identifier,

            bool? ignoreError,

            string? name,

            string orgId,

            string projectId,

            ImmutableArray<string> tags,

            string targetId,

            string yaml)
        {
            Description = description;
            Id = id;
            Identifier = identifier;
            IgnoreError = ignoreError;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            Tags = tags;
            TargetId = targetId;
            Yaml = yaml;
        }
    }
}
