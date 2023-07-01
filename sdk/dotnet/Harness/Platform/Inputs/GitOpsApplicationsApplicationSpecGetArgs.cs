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

    public sealed class GitOpsApplicationsApplicationSpecGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("destinations")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecDestinationGetArgs>? _destinations;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecDestinationGetArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.GitOpsApplicationsApplicationSpecDestinationGetArgs>());
            set => _destinations = value;
        }

        [Input("sources")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSourceGetArgs>? _sources;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSourceGetArgs> Sources
        {
            get => _sources ?? (_sources = new InputList<Inputs.GitOpsApplicationsApplicationSpecSourceGetArgs>());
            set => _sources = value;
        }

        [Input("syncPolicies")]
        private InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyGetArgs>? _syncPolicies;
        public InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyGetArgs> SyncPolicies
        {
            get => _syncPolicies ?? (_syncPolicies = new InputList<Inputs.GitOpsApplicationsApplicationSpecSyncPolicyGetArgs>());
            set => _syncPolicies = value;
        }

        public GitOpsApplicationsApplicationSpecGetArgs()
        {
        }
        public static new GitOpsApplicationsApplicationSpecGetArgs Empty => new GitOpsApplicationsApplicationSpecGetArgs();
    }
}
