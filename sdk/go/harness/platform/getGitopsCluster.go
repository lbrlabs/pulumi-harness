// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for fetching a Harness GitOps Cluster.
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
//			_, err := platform.GetGitopsCluster(ctx, &platform.GetGitopsClusterArgs{
//				AccountId:  "account_id",
//				AgentId:    "agent_id",
//				Identifier: "identifier",
//				OrgId:      pulumi.StringRef("org_id"),
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
func GetGitopsCluster(ctx *pulumi.Context, args *GetGitopsClusterArgs, opts ...pulumi.InvokeOption) (*GetGitopsClusterResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetGitopsClusterResult
	err := ctx.Invoke("harness:platform/getGitopsCluster:getGitopsCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsCluster.
type GetGitopsClusterArgs struct {
	// Account identifier of the GitOps cluster.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps cluster.
	AgentId string `pulumi:"agentId"`
	// Identifier of the GitOps cluster.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the cluster.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps cluster.
	ProjectId *string `pulumi:"projectId"`
	// Query for the GitOps cluster resources.
	Queries []GetGitopsClusterQuery `pulumi:"queries"`
}

// A collection of values returned by getGitopsCluster.
type GetGitopsClusterResult struct {
	// Account identifier of the GitOps cluster.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps cluster.
	AgentId string `pulumi:"agentId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Identifier of the GitOps cluster.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the cluster.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps cluster.
	ProjectId *string `pulumi:"projectId"`
	// Query for the GitOps cluster resources.
	Queries []GetGitopsClusterQuery `pulumi:"queries"`
	// Cluster create or update request.
	Requests []GetGitopsClusterRequest `pulumi:"requests"`
}

func GetGitopsClusterOutput(ctx *pulumi.Context, args GetGitopsClusterOutputArgs, opts ...pulumi.InvokeOption) GetGitopsClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGitopsClusterResult, error) {
			args := v.(GetGitopsClusterArgs)
			r, err := GetGitopsCluster(ctx, &args, opts...)
			var s GetGitopsClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGitopsClusterResultOutput)
}

// A collection of arguments for invoking getGitopsCluster.
type GetGitopsClusterOutputArgs struct {
	// Account identifier of the GitOps cluster.
	AccountId pulumi.StringInput `pulumi:"accountId"`
	// Agent identifier of the GitOps cluster.
	AgentId pulumi.StringInput `pulumi:"agentId"`
	// Identifier of the GitOps cluster.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// Organization identifier of the cluster.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Project identifier of the GitOps cluster.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
	// Query for the GitOps cluster resources.
	Queries GetGitopsClusterQueryArrayInput `pulumi:"queries"`
}

func (GetGitopsClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsClusterArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsCluster.
type GetGitopsClusterResultOutput struct{ *pulumi.OutputState }

func (GetGitopsClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsClusterResult)(nil)).Elem()
}

func (o GetGitopsClusterResultOutput) ToGetGitopsClusterResultOutput() GetGitopsClusterResultOutput {
	return o
}

func (o GetGitopsClusterResultOutput) ToGetGitopsClusterResultOutputWithContext(ctx context.Context) GetGitopsClusterResultOutput {
	return o
}

// Account identifier of the GitOps cluster.
func (o GetGitopsClusterResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier of the GitOps cluster.
func (o GetGitopsClusterResultOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.AgentId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGitopsClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

// Identifier of the GitOps cluster.
func (o GetGitopsClusterResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// Organization identifier of the cluster.
func (o GetGitopsClusterResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project identifier of the GitOps cluster.
func (o GetGitopsClusterResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Query for the GitOps cluster resources.
func (o GetGitopsClusterResultOutput) Queries() GetGitopsClusterQueryArrayOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) []GetGitopsClusterQuery { return v.Queries }).(GetGitopsClusterQueryArrayOutput)
}

// Cluster create or update request.
func (o GetGitopsClusterResultOutput) Requests() GetGitopsClusterRequestArrayOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) []GetGitopsClusterRequest { return v.Requests }).(GetGitopsClusterRequestArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGitopsClusterResultOutput{})
}
