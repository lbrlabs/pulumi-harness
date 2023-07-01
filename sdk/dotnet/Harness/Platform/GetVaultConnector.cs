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
    public static class GetVaultConnector
    {
        /// <summary>
        /// DataSource for looking up a Vault connector in Harness.
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
        ///     var example = Harness.Platform.GetVaultConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVaultConnectorResult> InvokeAsync(GetVaultConnectorArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVaultConnectorResult>("harness:platform/getVaultConnector:getVaultConnector", args ?? new GetVaultConnectorArgs(), options.WithDefaults());

        /// <summary>
        /// DataSource for looking up a Vault connector in Harness.
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
        ///     var example = Harness.Platform.GetVaultConnector.Invoke(new()
        ///     {
        ///         Identifier = "identifier",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVaultConnectorResult> Invoke(GetVaultConnectorInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVaultConnectorResult>("harness:platform/getVaultConnector:getVaultConnector", args ?? new GetVaultConnectorInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVaultConnectorArgs : global::Pulumi.InvokeArgs
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

        public GetVaultConnectorArgs()
        {
        }
        public static new GetVaultConnectorArgs Empty => new GetVaultConnectorArgs();
    }

    public sealed class GetVaultConnectorInvokeArgs : global::Pulumi.InvokeArgs
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

        public GetVaultConnectorInvokeArgs()
        {
        }
        public static new GetVaultConnectorInvokeArgs Empty => new GetVaultConnectorInvokeArgs();
    }


    [OutputType]
    public sealed class GetVaultConnectorResult
    {
        /// <summary>
        /// Access type.
        /// </summary>
        public readonly string AccessType;
        /// <summary>
        /// ID of App Role.
        /// </summary>
        public readonly string AppRoleId;
        /// <summary>
        /// The authentication token for Vault.
        /// </summary>
        public readonly string AuthToken;
        /// <summary>
        /// The AWS region where AWS IAM auth will happen.
        /// </summary>
        public readonly string AwsRegion;
        /// <summary>
        /// The location of the Vault directory where Secret will be stored.
        /// </summary>
        public readonly string BasePath;
        /// <summary>
        /// Is default or not.
        /// </summary>
        public readonly bool Default;
        /// <summary>
        /// List of Delegate Selectors that belong to the same Delegate and are used to connect to the Secret Manager.
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
        /// Is default or not.
        /// </summary>
        public readonly bool IsDefault;
        /// <summary>
        /// Read only or not.
        /// </summary>
        public readonly bool IsReadOnly;
        /// <summary>
        /// The path where kubernetes auth is enabled in Vault.
        /// </summary>
        public readonly string K8sAuthEndpoint;
        /// <summary>
        /// Name of the resource.
        /// </summary>
        public readonly string? Name;
        /// <summary>
        /// The Vault namespace where Secret will be created.
        /// </summary>
        public readonly string Namespace;
        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        public readonly string? OrgId;
        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        public readonly string? ProjectId;
        /// <summary>
        /// Read only.
        /// </summary>
        public readonly bool ReadOnly;
        /// <summary>
        /// Boolean value to indicate if appRole token renewal is enabled or not.
        /// </summary>
        public readonly bool RenewAppRoleToken;
        /// <summary>
        /// The time interval for token renewal.
        /// </summary>
        public readonly int RenewalIntervalMinutes;
        /// <summary>
        /// Manually entered Secret Engine.
        /// </summary>
        public readonly bool SecretEngineManuallyConfigured;
        /// <summary>
        /// Name of the Secret Engine.
        /// </summary>
        public readonly string SecretEngineName;
        /// <summary>
        /// Version of Secret Engine.
        /// </summary>
        public readonly int SecretEngineVersion;
        /// <summary>
        /// ID of the Secret.
        /// </summary>
        public readonly string SecretId;
        /// <summary>
        /// The SA token path where the token is mounted in the K8s Pod.
        /// </summary>
        public readonly string ServiceAccountTokenPath;
        /// <summary>
        /// The location at which auth token is to be read from.
        /// </summary>
        public readonly string SinkPath;
        /// <summary>
        /// Tags to associate with the resource.
        /// </summary>
        public readonly ImmutableArray<string> Tags;
        /// <summary>
        /// Boolean value to indicate if AWS IAM is used for authentication.
        /// </summary>
        public readonly bool UseAwsIam;
        /// <summary>
        /// Boolean value to indicate if K8s Auth is used for authentication.
        /// </summary>
        public readonly bool UseK8sAuth;
        /// <summary>
        /// Boolean value to indicate if Vault Agent is used for authentication.
        /// </summary>
        public readonly bool UseVaultAgent;
        /// <summary>
        /// The Vault role defined to bind to AWS IAM account/role being accessed.
        /// </summary>
        public readonly string VaultAwsIamRole;
        /// <summary>
        /// The role where K8s auth will happen.
        /// </summary>
        public readonly string VaultK8sAuthRole;
        /// <summary>
        /// URL of the HashiCorp Vault.
        /// </summary>
        public readonly string VaultUrl;
        /// <summary>
        /// The AWS IAM Header Server ID that has been configured for this AWS IAM instance.
        /// </summary>
        public readonly string XvaultAwsIamServerId;

        [OutputConstructor]
        private GetVaultConnectorResult(
            string accessType,

            string appRoleId,

            string authToken,

            string awsRegion,

            string basePath,

            bool @default,

            ImmutableArray<string> delegateSelectors,

            string description,

            string id,

            string identifier,

            bool isDefault,

            bool isReadOnly,

            string k8sAuthEndpoint,

            string? name,

            string @namespace,

            string? orgId,

            string? projectId,

            bool readOnly,

            bool renewAppRoleToken,

            int renewalIntervalMinutes,

            bool secretEngineManuallyConfigured,

            string secretEngineName,

            int secretEngineVersion,

            string secretId,

            string serviceAccountTokenPath,

            string sinkPath,

            ImmutableArray<string> tags,

            bool useAwsIam,

            bool useK8sAuth,

            bool useVaultAgent,

            string vaultAwsIamRole,

            string vaultK8sAuthRole,

            string vaultUrl,

            string xvaultAwsIamServerId)
        {
            AccessType = accessType;
            AppRoleId = appRoleId;
            AuthToken = authToken;
            AwsRegion = awsRegion;
            BasePath = basePath;
            Default = @default;
            DelegateSelectors = delegateSelectors;
            Description = description;
            Id = id;
            Identifier = identifier;
            IsDefault = isDefault;
            IsReadOnly = isReadOnly;
            K8sAuthEndpoint = k8sAuthEndpoint;
            Name = name;
            Namespace = @namespace;
            OrgId = orgId;
            ProjectId = projectId;
            ReadOnly = readOnly;
            RenewAppRoleToken = renewAppRoleToken;
            RenewalIntervalMinutes = renewalIntervalMinutes;
            SecretEngineManuallyConfigured = secretEngineManuallyConfigured;
            SecretEngineName = secretEngineName;
            SecretEngineVersion = secretEngineVersion;
            SecretId = secretId;
            ServiceAccountTokenPath = serviceAccountTokenPath;
            SinkPath = sinkPath;
            Tags = tags;
            UseAwsIam = useAwsIam;
            UseK8sAuth = useK8sAuth;
            UseVaultAgent = useVaultAgent;
            VaultAwsIamRole = vaultAwsIamRole;
            VaultK8sAuthRole = vaultK8sAuthRole;
            VaultUrl = vaultUrl;
            XvaultAwsIamServerId = xvaultAwsIamServerId;
        }
    }
}
