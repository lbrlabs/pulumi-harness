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
    public sealed class UserRoleBinding
    {
        /// <summary>
        /// Managed Role of the user.
        /// </summary>
        public readonly bool? ManagedRole;
        /// <summary>
        /// Resource Group Identifier of the user.
        /// </summary>
        public readonly string? ResourceGroupIdentifier;
        /// <summary>
        /// Resource Group Name of the user.
        /// </summary>
        public readonly string? ResourceGroupName;
        /// <summary>
        /// Role Identifier of the user.
        /// </summary>
        public readonly string? RoleIdentifier;
        /// <summary>
        /// Role Name Identifier of the user.
        /// </summary>
        public readonly string? RoleName;

        [OutputConstructor]
        private UserRoleBinding(
            bool? managedRole,

            string? resourceGroupIdentifier,

            string? resourceGroupName,

            string? roleIdentifier,

            string? roleName)
        {
            ManagedRole = managedRole;
            ResourceGroupIdentifier = resourceGroupIdentifier;
            ResourceGroupName = resourceGroupName;
            RoleIdentifier = roleIdentifier;
            RoleName = roleName;
        }
    }
}