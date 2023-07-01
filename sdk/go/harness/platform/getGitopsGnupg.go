// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a GPG public key in the server's configuration.
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
//			_, err := platform.GetGitopsGnupg(ctx, &platform.GetGitopsGnupgArgs{
//				AccountId:  "account_id",
//				AgentId:    "agent_id",
//				Identifier: pulumi.StringRef("identifier"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetGitopsGnupg(ctx *pulumi.Context, args *GetGitopsGnupgArgs, opts ...pulumi.InvokeOption) (*GetGitopsGnupgResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetGitopsGnupgResult
	err := ctx.Invoke("harness:platform/getGitopsGnupg:getGitopsGnupg", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsGnupg.
type GetGitopsGnupgArgs struct {
	// Account Identifier for the GnuPG Key.
	AccountId string `pulumi:"accountId"`
	// Agent identifier for the GnuPG Key.
	AgentId string `pulumi:"agentId"`
	// Identifier for the GnuPG Key.
	Identifier *string `pulumi:"identifier"`
	// Organization Identifier for the GnuPG Key.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the GnuPG Key.
	ProjectId *string `pulumi:"projectId"`
	// GnuPGPublicKey is a representation of a GnuPG public key
	Requests []GetGitopsGnupgRequest `pulumi:"requests"`
}

// A collection of values returned by getGitopsGnupg.
type GetGitopsGnupgResult struct {
	// Account Identifier for the GnuPG Key.
	AccountId string `pulumi:"accountId"`
	// Agent identifier for the GnuPG Key.
	AgentId string `pulumi:"agentId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier for the GnuPG Key.
	Identifier *string `pulumi:"identifier"`
	// Organization Identifier for the GnuPG Key.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the GnuPG Key.
	ProjectId *string `pulumi:"projectId"`
	// GnuPGPublicKey is a representation of a GnuPG public key
	Requests []GetGitopsGnupgRequest `pulumi:"requests"`
}

func GetGitopsGnupgOutput(ctx *pulumi.Context, args GetGitopsGnupgOutputArgs, opts ...pulumi.InvokeOption) GetGitopsGnupgResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGitopsGnupgResult, error) {
			args := v.(GetGitopsGnupgArgs)
			r, err := GetGitopsGnupg(ctx, &args, opts...)
			var s GetGitopsGnupgResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGitopsGnupgResultOutput)
}

// A collection of arguments for invoking getGitopsGnupg.
type GetGitopsGnupgOutputArgs struct {
	// Account Identifier for the GnuPG Key.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Agent identifier for the GnuPG Key.
	AgentId pulumi.StringInput `pulumi:"agentId"`
	// Identifier for the GnuPG Key.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Organization Identifier for the GnuPG Key.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project Identifier for the GnuPG Key.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// GnuPGPublicKey is a representation of a GnuPG public key
	Requests GetGitopsGnupgRequestArrayInput `pulumi:"requests"`
}

func (GetGitopsGnupgOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsGnupgArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsGnupg.
type GetGitopsGnupgResultOutput struct{ *pulumi.OutputState }

func (GetGitopsGnupgResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsGnupgResult)(nil)).Elem()
}

func (o GetGitopsGnupgResultOutput) ToGetGitopsGnupgResultOutput() GetGitopsGnupgResultOutput {
	return o
}

func (o GetGitopsGnupgResultOutput) ToGetGitopsGnupgResultOutputWithContext(ctx context.Context) GetGitopsGnupgResultOutput {
	return o
}

// Account Identifier for the GnuPG Key.
func (o GetGitopsGnupgResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsGnupgResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier for the GnuPG Key.
func (o GetGitopsGnupgResultOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsGnupgResult) string { return v.AgentId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGitopsGnupgResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsGnupgResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier for the GnuPG Key.
func (o GetGitopsGnupgResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsGnupgResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Organization Identifier for the GnuPG Key.
func (o GetGitopsGnupgResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsGnupgResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project Identifier for the GnuPG Key.
func (o GetGitopsGnupgResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsGnupgResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// GnuPGPublicKey is a representation of a GnuPG public key
func (o GetGitopsGnupgResultOutput) Requests() GetGitopsGnupgRequestArrayOutput {
	return o.ApplyT(func(v GetGitopsGnupgResult) []GetGitopsGnupgRequest { return v.Requests }).(GetGitopsGnupgRequestArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGitopsGnupgResultOutput{})
}
