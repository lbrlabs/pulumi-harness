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
    public sealed class SpotConnectorPermanentToken
    {
        /// <summary>
        /// Reference to the Harness secret containing the permanent api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string ApiTokenRef;
        /// <summary>
        /// Connect only using delegates with these tags.
        /// </summary>
        public readonly ImmutableArray<string> DelegateSelectors;
        /// <summary>
        /// Execute on delegate or not.
        /// </summary>
        public readonly bool? ExecuteOnDelegate;
        /// <summary>
        /// Spot account id.
        /// </summary>
        public readonly string? SpotAccountId;
        /// <summary>
        /// Reference to the Harness secret containing the spot account id. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
        /// </summary>
        public readonly string? SpotAccountIdRef;

        [OutputConstructor]
        private SpotConnectorPermanentToken(
            string apiTokenRef,

            ImmutableArray<string> delegateSelectors,

            bool? executeOnDelegate,

            string? spotAccountId,

            string? spotAccountIdRef)
        {
            ApiTokenRef = apiTokenRef;
            DelegateSelectors = delegateSelectors;
            ExecuteOnDelegate = executeOnDelegate;
            SpotAccountId = spotAccountId;
            SpotAccountIdRef = spotAccountIdRef;
        }
    }
}