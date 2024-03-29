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
    public sealed class GetSpotConnectorPermanentTokenResult
    {
        public readonly string ApiTokenRef;
        public readonly ImmutableArray<string> DelegateSelectors;
        public readonly bool ExecuteOnDelegate;
        public readonly string SpotAccountId;
        public readonly string SpotAccountIdRef;

        [OutputConstructor]
        private GetSpotConnectorPermanentTokenResult(
            string apiTokenRef,

            ImmutableArray<string> delegateSelectors,

            bool executeOnDelegate,

            string spotAccountId,

            string spotAccountIdRef)
        {
            ApiTokenRef = apiTokenRef;
            DelegateSelectors = delegateSelectors;
            ExecuteOnDelegate = executeOnDelegate;
            SpotAccountId = spotAccountId;
            SpotAccountIdRef = spotAccountIdRef;
        }
    }
}
