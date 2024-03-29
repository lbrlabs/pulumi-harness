// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Outputs
{

    [OutputType]
    public sealed class GitOpsRepoCertRequestCertificateItem
    {
        public readonly string? CertData;
        public readonly string? CertInfo;
        public readonly string? CertSubType;
        public readonly string? CertType;
        public readonly string? ServerName;

        [OutputConstructor]
        private GitOpsRepoCertRequestCertificateItem(
            string? certData,

            string? certInfo,

            string? certSubType,

            string? certType,

            string? serverName)
        {
            CertData = certData;
            CertInfo = certInfo;
            CertSubType = certSubType;
            CertType = certType;
            ServerName = serverName;
        }
    }
}
