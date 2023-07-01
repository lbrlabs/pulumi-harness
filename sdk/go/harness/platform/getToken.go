// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness ApiKey Token.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.LookupToken(ctx, &platform.LookupTokenArgs{
//				ApikeyId:   "apikey_id",
//				ApikeyType: "USER",
//				Identifier: "test_token",
//				OrgId:      pulumi.StringRef("org_id"),
//				ParentId:   "apikey_parent_id",
//				ProjectId:  pulumi.StringRef("project_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupToken(ctx *pulumi.Context, args *LookupTokenArgs, opts ...pulumi.InvokeOption) (*LookupTokenResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupTokenResult
	err := ctx.Invoke("harness:platform/getToken:getToken", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getToken.
type LookupTokenArgs struct {
	// Account Identifier for the Entity
	AccountId string `pulumi:"accountId"`
	// Identifier of the API Key
	ApikeyId string `pulumi:"apikeyId"`
	// Type of the API Key
	ApikeyType string `pulumi:"apikeyType"`
	// Description of the Token
	Description *string `pulumi:"description"`
	// Email Id of the user who created the Token
	Email *string `pulumi:"email"`
	// Encoded password of the Token
	EncodedPassword *string `pulumi:"encodedPassword"`
	// Identifier of the Token
	Identifier string `pulumi:"identifier"`
	// Name of the Token
	Name string `pulumi:"name"`
	// Organization Identifier for the Entity
	OrgId *string `pulumi:"orgId"`
	// Parent Entity Identifier of the API Key
	ParentId string `pulumi:"parentId"`
	// Project Identifier for the Entity
	ProjectId *string `pulumi:"projectId"`
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime *int `pulumi:"scheduledExpireTime"`
	// Tags for the Token
	Tags map[string]string `pulumi:"tags"`
	// Name of the user who created the Token
	Username *string `pulumi:"username"`
	// Boolean value to indicate if Token is valid or not.
	Valid *bool `pulumi:"valid"`
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom *int `pulumi:"validFrom"`
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo *int `pulumi:"validTo"`
}

// A collection of values returned by getToken.
type LookupTokenResult struct {
	// Account Identifier for the Entity
	AccountId string `pulumi:"accountId"`
	// Identifier of the API Key
	ApikeyId string `pulumi:"apikeyId"`
	// Type of the API Key
	ApikeyType string `pulumi:"apikeyType"`
	// Description of the Token
	Description *string `pulumi:"description"`
	// Email Id of the user who created the Token
	Email *string `pulumi:"email"`
	// Encoded password of the Token
	EncodedPassword *string `pulumi:"encodedPassword"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the Token
	Identifier string `pulumi:"identifier"`
	// Name of the Token
	Name string `pulumi:"name"`
	// Organization Identifier for the Entity
	OrgId *string `pulumi:"orgId"`
	// Parent Entity Identifier of the API Key
	ParentId string `pulumi:"parentId"`
	// Project Identifier for the Entity
	ProjectId *string `pulumi:"projectId"`
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime *int `pulumi:"scheduledExpireTime"`
	// Tags for the Token
	Tags map[string]string `pulumi:"tags"`
	// Name of the user who created the Token
	Username *string `pulumi:"username"`
	// Boolean value to indicate if Token is valid or not.
	Valid *bool `pulumi:"valid"`
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom *int `pulumi:"validFrom"`
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo *int `pulumi:"validTo"`
}

func LookupTokenOutput(ctx *pulumi.Context, args LookupTokenOutputArgs, opts ...pulumi.InvokeOption) LookupTokenResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupTokenResult, error) {
			args := v.(LookupTokenArgs)
			r, err := LookupToken(ctx, &args, opts...)
			var s LookupTokenResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupTokenResultOutput)
}

// A collection of arguments for invoking getToken.
type LookupTokenOutputArgs struct {
	// Account Identifier for the Entity
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Identifier of the API Key
	ApikeyId pulumi.StringInput `pulumi:"apikeyId"`
	// Type of the API Key
	ApikeyType pulumi.StringInput `pulumi:"apikeyType"`
	// Description of the Token
	Description pulumi.StringPtrInput `pulumi:"description"`
	// Email Id of the user who created the Token
	Email pulumi.StringPtrInput `pulumi:"email"`
	// Encoded password of the Token
	EncodedPassword pulumi.StringPtrInput `pulumi:"encodedPassword"`
	// Identifier of the Token
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Name of the Token
	Name pulumi.StringInput `pulumi:"name"`
	// Organization Identifier for the Entity
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Parent Entity Identifier of the API Key
	ParentId pulumi.StringInput `pulumi:"parentId"`
	// Project Identifier for the Entity
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime pulumi.IntPtrInput `pulumi:"scheduledExpireTime"`
	// Tags for the Token
	Tags pulumi.StringMapInput `pulumi:"tags"`
	// Name of the user who created the Token
	Username pulumi.StringPtrInput `pulumi:"username"`
	// Boolean value to indicate if Token is valid or not.
	Valid pulumi.BoolPtrInput `pulumi:"valid"`
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom pulumi.IntPtrInput `pulumi:"validFrom"`
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo pulumi.IntPtrInput `pulumi:"validTo"`
}

func (LookupTokenOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTokenArgs)(nil)).Elem()
}

// A collection of values returned by getToken.
type LookupTokenResultOutput struct{ *pulumi.OutputState }

func (LookupTokenResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupTokenResult)(nil)).Elem()
}

func (o LookupTokenResultOutput) ToLookupTokenResultOutput() LookupTokenResultOutput {
	return o
}

func (o LookupTokenResultOutput) ToLookupTokenResultOutputWithContext(ctx context.Context) LookupTokenResultOutput {
	return o
}

// Account Identifier for the Entity
func (o LookupTokenResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTokenResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Identifier of the API Key
func (o LookupTokenResultOutput) ApikeyId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTokenResult) string { return v.ApikeyId }).(pulumi.StringOutput)
}

// Type of the API Key
func (o LookupTokenResultOutput) ApikeyType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTokenResult) string { return v.ApikeyType }).(pulumi.StringOutput)
}

// Description of the Token
func (o LookupTokenResultOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *string { return v.Description }).(pulumi.StringPtrOutput)
}

// Email Id of the user who created the Token
func (o LookupTokenResultOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *string { return v.Email }).(pulumi.StringPtrOutput)
}

// Encoded password of the Token
func (o LookupTokenResultOutput) EncodedPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *string { return v.EncodedPassword }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupTokenResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTokenResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the Token
func (o LookupTokenResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTokenResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the Token
func (o LookupTokenResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTokenResult) string { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier for the Entity
func (o LookupTokenResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Parent Entity Identifier of the API Key
func (o LookupTokenResultOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupTokenResult) string { return v.ParentId }).(pulumi.StringOutput)
}

// Project Identifier for the Entity
func (o LookupTokenResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Scheduled expiry time in milliseconds
func (o LookupTokenResultOutput) ScheduledExpireTime() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *int { return v.ScheduledExpireTime }).(pulumi.IntPtrOutput)
}

// Tags for the Token
func (o LookupTokenResultOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v LookupTokenResult) map[string]string { return v.Tags }).(pulumi.StringMapOutput)
}

// Name of the user who created the Token
func (o LookupTokenResultOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *string { return v.Username }).(pulumi.StringPtrOutput)
}

// Boolean value to indicate if Token is valid or not.
func (o LookupTokenResultOutput) Valid() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *bool { return v.Valid }).(pulumi.BoolPtrOutput)
}

// This is the time from which the Token is valid. The time is in milliseconds
func (o LookupTokenResultOutput) ValidFrom() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *int { return v.ValidFrom }).(pulumi.IntPtrOutput)
}

// This is the time till which the Token is valid. The time is in milliseconds
func (o LookupTokenResultOutput) ValidTo() pulumi.IntPtrOutput {
	return o.ApplyT(func(v LookupTokenResult) *int { return v.ValidTo }).(pulumi.IntPtrOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupTokenResultOutput{})
}
