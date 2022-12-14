// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Outputs
{

    [OutputType]
    public sealed class SshCredentialSshAuthenticationInlineSsh
    {
        public readonly string? PassphraseSecretId;
        public readonly string SshKeyFileId;

        [OutputConstructor]
        private SshCredentialSshAuthenticationInlineSsh(
            string? passphraseSecretId,

            string sshKeyFileId)
        {
            PassphraseSecretId = passphraseSecretId;
            SshKeyFileId = sshKeyFileId;
        }
    }
}
