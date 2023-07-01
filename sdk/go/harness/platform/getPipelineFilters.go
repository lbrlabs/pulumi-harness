// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness Pipeline Filter.
func LookupPipelineFilters(ctx *pulumi.Context, args *LookupPipelineFiltersArgs, opts ...pulumi.InvokeOption) (*LookupPipelineFiltersResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupPipelineFiltersResult
	err := ctx.Invoke("harness:platform/getPipelineFilters:getPipelineFilters", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getPipelineFilters.
type LookupPipelineFiltersArgs struct {
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of filter. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}.
	Type string `pulumi:"type"`
}

// A collection of values returned by getPipelineFilters.
type LookupPipelineFiltersResult struct {
	// Properties of the filter entity defined in Harness.
	FilterProperties []GetPipelineFiltersFilterProperty `pulumi:"filterProperties"`
	// This indicates visibility of filter. By default, everyone can view this filter.
	FilterVisibility string `pulumi:"filterVisibility"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the Filter.
	Name string `pulumi:"name"`
	// Organization Identifier for the Entity.
	OrgId *string `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId *string `pulumi:"projectId"`
	// Type of filter. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}.
	Type string `pulumi:"type"`
}

func LookupPipelineFiltersOutput(ctx *pulumi.Context, args LookupPipelineFiltersOutputArgs, opts ...pulumi.InvokeOption) LookupPipelineFiltersResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupPipelineFiltersResult, error) {
			args := v.(LookupPipelineFiltersArgs)
			r, err := LookupPipelineFilters(ctx, &args, opts...)
			var s LookupPipelineFiltersResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupPipelineFiltersResultOutput)
}

// A collection of arguments for invoking getPipelineFilters.
type LookupPipelineFiltersOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Organization Identifier for the Entity.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project Identifier for the Entity.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Type of filter. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}.
	Type pulumi.StringInput `pulumi:"type"`
}

func (LookupPipelineFiltersOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPipelineFiltersArgs)(nil)).Elem()
}

// A collection of values returned by getPipelineFilters.
type LookupPipelineFiltersResultOutput struct{ *pulumi.OutputState }

func (LookupPipelineFiltersResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupPipelineFiltersResult)(nil)).Elem()
}

func (o LookupPipelineFiltersResultOutput) ToLookupPipelineFiltersResultOutput() LookupPipelineFiltersResultOutput {
	return o
}

func (o LookupPipelineFiltersResultOutput) ToLookupPipelineFiltersResultOutputWithContext(ctx context.Context) LookupPipelineFiltersResultOutput {
	return o
}

// Properties of the filter entity defined in Harness.
func (o LookupPipelineFiltersResultOutput) FilterProperties() GetPipelineFiltersFilterPropertyArrayOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) []GetPipelineFiltersFilterProperty { return v.FilterProperties }).(GetPipelineFiltersFilterPropertyArrayOutput)
}

// This indicates visibility of filter. By default, everyone can view this filter.
func (o LookupPipelineFiltersResultOutput) FilterVisibility() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) string { return v.FilterVisibility }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupPipelineFiltersResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupPipelineFiltersResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the Filter.
func (o LookupPipelineFiltersResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) string { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier for the Entity.
func (o LookupPipelineFiltersResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project Identifier for the Entity.
func (o LookupPipelineFiltersResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Type of filter. Currently supported types are {PipelineSetup, PipelineExecution, Deployment, Template, EnvironmentGroup, Environment}.
func (o LookupPipelineFiltersResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v LookupPipelineFiltersResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupPipelineFiltersResultOutput{})
}
