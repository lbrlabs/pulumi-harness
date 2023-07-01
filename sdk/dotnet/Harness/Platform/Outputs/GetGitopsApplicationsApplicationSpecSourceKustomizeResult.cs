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
    public sealed class GetGitopsApplicationsApplicationSpecSourceKustomizeResult
    {
        public readonly ImmutableDictionary<string, string>? CommonAnnotations;
        public readonly ImmutableDictionary<string, string>? CommonLabels;
        public readonly bool? ForceCommonAnnotations;
        public readonly bool? ForceCommonLabels;
        public readonly ImmutableArray<string> Images;
        public readonly string? NamePrefix;
        public readonly string? NameSuffix;
        public readonly string? Version;

        [OutputConstructor]
        private GetGitopsApplicationsApplicationSpecSourceKustomizeResult(
            ImmutableDictionary<string, string>? commonAnnotations,

            ImmutableDictionary<string, string>? commonLabels,

            bool? forceCommonAnnotations,

            bool? forceCommonLabels,

            ImmutableArray<string> images,

            string? namePrefix,

            string? nameSuffix,

            string? version)
        {
            CommonAnnotations = commonAnnotations;
            CommonLabels = commonLabels;
            ForceCommonAnnotations = forceCommonAnnotations;
            ForceCommonLabels = forceCommonLabels;
            Images = images;
            NamePrefix = namePrefix;
            NameSuffix = nameSuffix;
            Version = version;
        }
    }
}
