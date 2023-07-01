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

    public sealed class GetGitopsApplicationsApplicationSpecSyncPolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("automateds")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs>? _automateds;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs> Automateds
        {
            get => _automateds ?? (_automateds = new List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyAutomatedArgs>());
            set => _automateds = value;
        }

        [Input("retries")]
        private List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs>? _retries;
        public List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs> Retries
        {
            get => _retries ?? (_retries = new List<Inputs.GetGitopsApplicationsApplicationSpecSyncPolicyRetryArgs>());
            set => _retries = value;
        }

        [Input("syncOptions")]
        private List<string>? _syncOptions;
        public List<string> SyncOptions
        {
            get => _syncOptions ?? (_syncOptions = new List<string>());
            set => _syncOptions = value;
        }

        public GetGitopsApplicationsApplicationSpecSyncPolicyArgs()
        {
        }
        public static new GetGitopsApplicationsApplicationSpecSyncPolicyArgs Empty => new GetGitopsApplicationsApplicationSpecSyncPolicyArgs();
    }
}