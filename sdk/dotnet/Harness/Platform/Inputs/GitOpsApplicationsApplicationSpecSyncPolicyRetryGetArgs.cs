// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Lbrlabs.PulumiPackage.Harness.Platform.Inputs
{

    public sealed class GitOpsApplicationsApplicationSpecSyncPolicyRetryGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("backoffs")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffGetArgs>? _backoffs;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffGetArgs> Backoffs
        {
            get => _backoffs ?? (_backoffs = new InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyRetryBackoffGetArgs>());
            set => _backoffs = value;
        }

        [Input("limit")]
        public Input<string>? Limit { get; set; }

        public GitOpsApplicationsApplicationSpecSyncPolicyRetryGetArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecSyncPolicyRetryGetArgs Empty => new GitOpsApplicationsApplicationSpecSyncPolicyRetryGetArgs();
    }
}