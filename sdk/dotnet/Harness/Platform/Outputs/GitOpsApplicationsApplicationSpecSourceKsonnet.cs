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
    public sealed class GitOpsApplicationsApplicationSpecSourceKsonnet
    {
        public readonly string? Environment;
        public readonly ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceKsonnetParameter> Parameters;

        [OutputConstructor]
        private GitOpsApplicationsApplicationSpecSourceKsonnet(
            string? environment,

            ImmutableArray<Outputs.GitOpsApplicationsApplicationSpecSourceKsonnetParameter> parameters)
        {
            Environment = environment;
            Parameters = parameters;
        }
    }
}
