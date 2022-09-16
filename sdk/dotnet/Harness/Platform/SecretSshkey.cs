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
    /// <summary>
    /// Resource for creating an ssh key type secret.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Harness = Lbrlabs.PulumiPackage.Harness;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var keyTabFilePath = new Harness.Platform.SecretSshkey("keyTabFilePath", new()
    ///     {
    ///         Description = "test",
    ///         Identifier = "identifier",
    ///         Kerberos = new Harness.Platform.Inputs.SecretSshkeyKerberosArgs
    ///         {
    ///             Principal = "principal",
    ///             Realm = "realm",
    ///             TgtGenerationMethod = "KeyTabFilePath",
    ///             TgtKeyTabFilePathSpec = new Harness.Platform.Inputs.SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs
    ///             {
    ///                 KeyPath = "key_path",
    ///             },
    ///         },
    ///         Port = 22,
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///     });
    /// 
    ///     var _tgtPassword = new Harness.Platform.SecretSshkey(" tgtPassword", new()
    ///     {
    ///         Description = "test",
    ///         Identifier = "identifier",
    ///         Kerberos = new Harness.Platform.Inputs.SecretSshkeyKerberosArgs
    ///         {
    ///             Principal = "principal",
    ///             Realm = "realm",
    ///             TgtGenerationMethod = "Password",
    ///             TgtPasswordSpec = new Harness.Platform.Inputs.SecretSshkeyKerberosTgtPasswordSpecArgs
    ///             {
    ///                 Password = "password",
    ///             },
    ///         },
    ///         Port = 22,
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///     });
    /// 
    ///     var sshkeyReference = new Harness.Platform.SecretSshkey("sshkeyReference", new()
    ///     {
    ///         Description = "test",
    ///         Identifier = "identifier",
    ///         Port = 22,
    ///         Ssh = new Harness.Platform.Inputs.SecretSshkeySshArgs
    ///         {
    ///             CredentialType = "KeyReference",
    ///             SshkeyReferenceCredential = new Harness.Platform.Inputs.SecretSshkeySshSshkeyReferenceCredentialArgs
    ///             {
    ///                 EncryptedPassphrase = "encrypted_passphrase",
    ///                 Key = "key",
    ///                 UserName = "user_name",
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///     });
    /// 
    ///     var _sshkeyPath = new Harness.Platform.SecretSshkey(" sshkeyPath", new()
    ///     {
    ///         Description = "test",
    ///         Identifier = "identifier",
    ///         Port = 22,
    ///         Ssh = new Harness.Platform.Inputs.SecretSshkeySshArgs
    ///         {
    ///             CredentialType = "KeyPath",
    ///             SshkeyPathCredential = new Harness.Platform.Inputs.SecretSshkeySshSshkeyPathCredentialArgs
    ///             {
    ///                 EncryptedPassphrase = "encrypted_passphrase",
    ///                 KeyPath = "key_path",
    ///                 UserName = "user_name",
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///     });
    /// 
    ///     var sshPassword = new Harness.Platform.SecretSshkey("sshPassword", new()
    ///     {
    ///         Description = "test",
    ///         Identifier = "identifier",
    ///         Port = 22,
    ///         Ssh = new Harness.Platform.Inputs.SecretSshkeySshArgs
    ///         {
    ///             CredentialType = "Password",
    ///             SshPasswordCredential = new Harness.Platform.Inputs.SecretSshkeySshSshPasswordCredentialArgs
    ///             {
    ///                 Password = "password",
    ///                 UserName = "user_name",
    ///             },
    ///         },
    ///         Tags = new[]
    ///         {
    ///             "foo:bar",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// # Import using secret sshkey id
    /// 
    /// ```sh
    ///  $ pulumi import harness:platform/secretSshkey:SecretSshkey example &lt;secret_sshkey_id&gt;
    /// ```
    /// </summary>
    [HarnessResourceType("harness:platform/secretSshkey:SecretSshkey")]
    public partial class SecretSshkey : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Output("kerberos")]
        public Output<Outputs.SecretSshkeyKerberos?> Kerberos { get; private set; } = null!;

        /// <summary>
        /// Name of the resource.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the organization.
        /// </summary>
        [Output("orgId")]
        public Output<string?> OrgId { get; private set; } = null!;

        /// <summary>
        /// SSH port
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Output("projectId")]
        public Output<string?> ProjectId { get; private set; } = null!;

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Output("ssh")]
        public Output<Outputs.SecretSshkeySsh?> Ssh { get; private set; } = null!;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<string>> Tags { get; private set; } = null!;


        /// <summary>
        /// Create a SecretSshkey resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecretSshkey(string name, SecretSshkeyArgs args, CustomResourceOptions? options = null)
            : base("harness:platform/secretSshkey:SecretSshkey", name, args ?? new SecretSshkeyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecretSshkey(string name, Input<string> id, SecretSshkeyState? state = null, CustomResourceOptions? options = null)
            : base("harness:platform/secretSshkey:SecretSshkey", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/lbrlabs",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing SecretSshkey resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecretSshkey Get(string name, Input<string> id, SecretSshkeyState? state = null, CustomResourceOptions? options = null)
        {
            return new SecretSshkey(name, id, state, options);
        }
    }

    public sealed class SecretSshkeyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("kerberos")]
        public Input<Inputs.SecretSshkeyKerberosArgs>? Kerberos { get; set; }

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
        /// SSH port
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("ssh")]
        public Input<Inputs.SecretSshkeySshArgs>? Ssh { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public SecretSshkeyArgs()
        {
        }
        public static new SecretSshkeyArgs Empty => new SecretSshkeyArgs();
    }

    public sealed class SecretSshkeyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Description of the resource.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the resource.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("kerberos")]
        public Input<Inputs.SecretSshkeyKerberosGetArgs>? Kerberos { get; set; }

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
        /// SSH port
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Unique identifier of the project.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        /// <summary>
        /// Kerberos authentication scheme
        /// </summary>
        [Input("ssh")]
        public Input<Inputs.SecretSshkeySshGetArgs>? Ssh { get; set; }

        [Input("tags")]
        private InputList<string>? _tags;

        /// <summary>
        /// Tags to associate with the resource. Tags should be in the form `name:value`.
        /// </summary>
        public InputList<string> Tags
        {
            get => _tags ?? (_tags = new InputList<string>());
            set => _tags = value;
        }

        public SecretSshkeyState()
        {
        }
        public static new SecretSshkeyState Empty => new SecretSshkeyState();
    }
}
