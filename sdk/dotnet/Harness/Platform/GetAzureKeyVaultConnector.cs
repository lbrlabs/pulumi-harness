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
    public static class GetAzureKeyVaultConnector
    {
        /// <summary>
        /// Data source for looking up an Azure key vault connector.
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
        ///     var example = Harness.Platform.GetAzureKeyVaultConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetAzureKeyVaultConnectorResult> InvokeAsync(GetAzureKeyVaultConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetAzureKeyVaultConnectorResult>("harness:platform/getAzureKeyVaultConnector:getAzureKeyVaultConnector", args ?? new GetAzureKeyVaultConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// Data source for looking up an Azure key vault connector.
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
        ///     var example = Harness.Platform.GetAzureKeyVaultConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetAzureKeyVaultConnectorResult> Invoke(GetAzureKeyVaultConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetAzureKeyVaultConnectorResult>("harness:platform/getAzureKeyVaultConnector:getAzureKeyVaultConnector", args ?? new GetAzureKeyVaultConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetAzureKeyVaultConnectorArgs : global::Pulumi.InvokeArgs
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

        public GetAzureKeyVaultConnectorArgs()
        {
        }
        public static new GetAzureKeyVaultConnectorArgs Empty => new GetAzureKeyVaultConnectorArgs();
    }

    public sealed class GetAzureKeyVaultConnectorInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetAzureKeyVaultConnectorInvokeArgs()
        {
        }
        public static new GetAzureKeyVaultConnectorInvokeArgs Empty => new GetAzureKeyVaultConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetAzureKeyVaultConnectorResult
    {
        /// <summary>
        /// Azure environment type. Possible values: AZURE or AZURE*US*GOVERNMENT. Default value: AZURE
        /// </summary>
        public readonly string AzureEnvironmentType;
        /// <summary>
        /// Application ID of the Azure App.
        /// </summary>
        public readonly string ClientId;
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
        public readonly string Identifier;
        /// <summary>
        /// Specifies whether or not is the default value.
        /// </summary>
        public readonly bool IsDefault;
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
        /// The Harness text secret with the Azure authentication key as its value.
        /// </summary>
        public readonly string SecretKey;
        /// <summary>
        /// Azure subscription ID.
        /// </summary>
        public readonly string Subscription;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// The Azure Active Directory (AAD) directory ID where you created your application.
        /// </summary>
        public readonly string TenantId;
        /// <summary>
        /// Name of the vault.
        /// </summary>
        public readonly string VaultName;

        [OutputConstructor]
        private GetAzureKeyVaultConnectorResult(
            string azureEnvironmentType,

            string clientId,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string identifier,

            bool isDefault,

            string? name,

            string? orgId,

            string? projectId,

            string secretKey,

            string subscription,

            ImmutableArray<string> tags,

            string tenantId,

            string vaultName)
        {
            AzureEnvironmentType = azureEnvironmentType;
            ClientId = clientId;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            IsDefault = isDefault;
            Name = name;
            OrgId = orgId;
            ProjectId = projectId;
            SecretKey = secretKey;
            Subscription = subscription;
            Tags = tags;
            TenantId = tenantId;
            VaultName = vaultName;
        }
    }
}
