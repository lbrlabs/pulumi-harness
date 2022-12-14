// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platformconnector

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for looking up an App Dynamics connector.
func LookupArtifactory(ctx *pulumi.Context, args *LookupArtifactoryArgs, opts ...pulumi.InvokeOption) (*LookupArtifactoryResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupArtifactoryResult
	err := ctx.Invoke("harness:PlatformConnector/getArtifactory:getArtifactory", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getArtifactory.
type LookupArtifactoryArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getArtifactory.
type LookupArtifactoryResult struct {
	// Credentials to use for authentication.
	Credentials []GetArtifactoryCredential `pulumi:"credentials"`
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
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// URL of the Artifactory server.
	Url string `pulumi:"url"`
}

func LookupArtifactoryOutput(ctx *pulumi.Context, args LookupArtifactoryOutputArgs, opts ...pulumi.InvokeOption) LookupArtifactoryResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupArtifactoryResult, error) {
			args := v.(LookupArtifactoryArgs)
			r, err := LookupArtifactory(ctx, &args, opts...)
			var s LookupArtifactoryResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupArtifactoryResultOutput)
}

// A collection of arguments for invoking getArtifactory.
type LookupArtifactoryOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupArtifactoryOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupArtifactoryArgs)(nil)).Elem()
}

// A collection of values returned by getArtifactory.
type LookupArtifactoryResultOutput struct{ *pulumi.OutputState }

func (LookupArtifactoryResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupArtifactoryResult)(nil)).Elem()
}

func (o LookupArtifactoryResultOutput) ToLookupArtifactoryResultOutput() LookupArtifactoryResultOutput {
	return o
}

func (o LookupArtifactoryResultOutput) ToLookupArtifactoryResultOutputWithContext(ctx context.Context) LookupArtifactoryResultOutput {
	return o
}

// Credentials to use for authentication.
func (o LookupArtifactoryResultOutput) Credentials() GetArtifactoryCredentialArrayOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) []GetArtifactoryCredential { return v.Credentials }).(GetArtifactoryCredentialArrayOutput)
}

// Connect using only the delegates which have these tags.
func (o LookupArtifactoryResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupArtifactoryResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupArtifactoryResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupArtifactoryResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Name of the resource.
func (o LookupArtifactoryResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupArtifactoryResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupArtifactoryResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupArtifactoryResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Artifactory server.
func (o LookupArtifactoryResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupArtifactoryResult) string { return v.Url }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupArtifactoryResultOutput{})
}
