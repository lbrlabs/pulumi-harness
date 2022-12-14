// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platformconnector

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an AWS KMS connector.
func LookupAwsKms(ctx *pulumi.Context, args *LookupAwsKmsArgs, opts ...pulumi.InvokeOption) (*LookupAwsKmsResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupAwsKmsResult
	err := ctx.Invoke("harness:PlatformConnector/getAwsKms:getAwsKms", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAwsKms.
type LookupAwsKmsArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAwsKms.
type LookupAwsKmsResult struct {
	// A reference to the Harness secret containing the ARN of the AWS KMS.
	ArnRef string `pulumi:"arnRef"`
	// The credentials to use for connecting to aws.
	Credentials []GetAwsKmsCredential `pulumi:"credentials"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// The AWS region where the AWS Secret Manager is.
	Region string `pulumi:"region"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
}

func LookupAwsKmsOutput(ctx *pulumi.Context, args LookupAwsKmsOutputArgs, opts ...pulumi.InvokeOption) LookupAwsKmsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAwsKmsResult, error) {
			args := v.(LookupAwsKmsArgs)
			r, err := LookupAwsKms(ctx, &args, opts...)
			var s LookupAwsKmsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAwsKmsResultOutput)
}

// A collection of arguments for invoking getAwsKms.
type LookupAwsKmsOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAwsKmsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsKmsArgs)(nil)).Elem()
}

// A collection of values returned by getAwsKms.
type LookupAwsKmsResultOutput struct{ *pulumi.OutputState }

func (LookupAwsKmsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsKmsResult)(nil)).Elem()
}

func (o LookupAwsKmsResultOutput) ToLookupAwsKmsResultOutput() LookupAwsKmsResultOutput {
	return o
}

func (o LookupAwsKmsResultOutput) ToLookupAwsKmsResultOutputWithContext(ctx context.Context) LookupAwsKmsResultOutput {
	return o
}

// A reference to the Harness secret containing the ARN of the AWS KMS.
func (o LookupAwsKmsResultOutput) ArnRef() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) string { return v.ArnRef }).(pulumi.StringOutput)
}

// The credentials to use for connecting to aws.
func (o LookupAwsKmsResultOutput) Credentials() GetAwsKmsCredentialArrayOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) []GetAwsKmsCredential { return v.Credentials }).(GetAwsKmsCredentialArrayOutput)
}

// Connect using only the delegates which have these tags.
func (o LookupAwsKmsResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupAwsKmsResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAwsKmsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAwsKmsResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Name of the resource.
func (o LookupAwsKmsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAwsKmsResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAwsKmsResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// The AWS region where the AWS Secret Manager is.
func (o LookupAwsKmsResultOutput) Region() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) string { return v.Region }).(pulumi.StringOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupAwsKmsResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsKmsResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAwsKmsResultOutput{})
}
