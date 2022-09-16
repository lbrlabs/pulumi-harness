// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for looking up an SSH Key type secret.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := platform.LookupSecretSshkey(ctx, &platform.LookupSecretSshkeyArgs{
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
func LookupSecretSshkey(ctx *pulumi.Context, args *LookupSecretSshkeyArgs, opts ...pulumi.InvokeOption) (*LookupSecretSshkeyResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupSecretSshkeyResult
	err := ctx.Invoke("harness:platform/getSecretSshkey:getSecretSshkey", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getSecretSshkey.
type LookupSecretSshkeyArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getSecretSshkey.
type LookupSecretSshkeyResult struct {
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Kerberos authentication scheme
	Kerberos []GetSecretSshkeyKerbero `pulumi:"kerberos"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// SSH port
	Port int `pulumi:"port"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Kerberos authentication scheme
	Sshes []GetSecretSshkeySsh `pulumi:"sshes"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
}

func LookupSecretSshkeyOutput(ctx *pulumi.Context, args LookupSecretSshkeyOutputArgs, opts ...pulumi.InvokeOption) LookupSecretSshkeyResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupSecretSshkeyResult, error) {
			args := v.(LookupSecretSshkeyArgs)
			r, err := LookupSecretSshkey(ctx, &args, opts...)
			var s LookupSecretSshkeyResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupSecretSshkeyResultOutput)
}

// A collection of arguments for invoking getSecretSshkey.
type LookupSecretSshkeyOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupSecretSshkeyOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretSshkeyArgs)(nil)).Elem()
}

// A collection of values returned by getSecretSshkey.
type LookupSecretSshkeyResultOutput struct{ *pulumi.OutputState }

func (LookupSecretSshkeyResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupSecretSshkeyResult)(nil)).Elem()
}

func (o LookupSecretSshkeyResultOutput) ToLookupSecretSshkeyResultOutput() LookupSecretSshkeyResultOutput {
	return o
}

func (o LookupSecretSshkeyResultOutput) ToLookupSecretSshkeyResultOutputWithContext(ctx context.Context) LookupSecretSshkeyResultOutput {
	return o
}

// Description of the resource.
func (o LookupSecretSshkeyResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupSecretSshkeyResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupSecretSshkeyResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Kerberos authentication scheme
func (o LookupSecretSshkeyResultOutput) Kerberos() GetSecretSshkeyKerberoArrayOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) []GetSecretSshkeyKerbero { return v.Kerberos }).(GetSecretSshkeyKerberoArrayOutput)
}

// Name of the resource.
func (o LookupSecretSshkeyResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupSecretSshkeyResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// SSH port
func (o LookupSecretSshkeyResultOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) int { return v.Port }).(pulumi.IntOutput)
}

// Unique identifier of the project.
func (o LookupSecretSshkeyResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Kerberos authentication scheme
func (o LookupSecretSshkeyResultOutput) Sshes() GetSecretSshkeySshArrayOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) []GetSecretSshkeySsh { return v.Sshes }).(GetSecretSshkeySshArrayOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupSecretSshkeyResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupSecretSshkeyResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupSecretSshkeyResultOutput{})
}
