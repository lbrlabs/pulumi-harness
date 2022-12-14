// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving the current user based on the API key.
func GetCurrentUser(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetCurrentUserResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetCurrentUserResult
	err := ctx.Invoke("harness:platform/getCurrentUser:getCurrentUser", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getCurrentUser.
type GetCurrentUserResult struct {
	// Whether the user is an administrator.
	Admin bool `pulumi:"admin"`
	// Billing frequency of the user.
	BillingFrequency string `pulumi:"billingFrequency"`
	// Default account ID of the user.
	DefaultAccountId string `pulumi:"defaultAccountId"`
	// Edition of the platform being used.
	Edition string `pulumi:"edition"`
	// Email address of the user.
	Email string `pulumi:"email"`
	// Whether the user's email address has been verified.
	EmailVerified bool `pulumi:"emailVerified"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Intent of the user.
	Intent string `pulumi:"intent"`
	// Whether 2FA is enabled for the user.
	IsTwoFactorAuthEnabled bool `pulumi:"isTwoFactorAuthEnabled"`
	// Whether or not the user account is locked.
	Locked bool `pulumi:"locked"`
	// Name of the user.
	Name string `pulumi:"name"`
	// Signup action of the user.
	SignupAction string `pulumi:"signupAction"`
	// Token used to authenticate the user.
	Token string `pulumi:"token"`
	// Unique identifier of the user.
	Uuid string `pulumi:"uuid"`
}
