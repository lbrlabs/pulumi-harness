// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type GitOpsRepository struct {
	pulumi.CustomResourceState

	// account identifier of the cluster.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// agent identifier of the cluster.
	AgentId pulumi.StringPtrOutput `pulumi:"agentId"`
	// Credentials only of the Repo.
	CredsOnly pulumi.BoolPtrOutput `pulumi:"credsOnly"`
	// identifier of the cluster.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// organization identifier of the cluster.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// project identifier of the cluster.
	ProjectId pulumi.StringOutput `pulumi:"projectId"`
	// Force refresh query for Repo.
	QueryForceRefresh pulumi.BoolPtrOutput `pulumi:"queryForceRefresh"`
	// Project to Query for Repo.
	QueryProject pulumi.StringPtrOutput `pulumi:"queryProject"`
	// Repo to Query.
	QueryRepo pulumi.StringPtrOutput `pulumi:"queryRepo"`
	// Repo Details that need to be stored.
	Repos GitOpsRepositoryRepoArrayOutput `pulumi:"repos"`
	// Update mask of the Repository.
	UpdateMasks GitOpsRepositoryUpdateMaskArrayOutput `pulumi:"updateMasks"`
	// Upsert the Repo Details.
	Upsert pulumi.BoolPtrOutput `pulumi:"upsert"`
}

// NewGitOpsRepository registers a new resource with the given unique name, arguments, and options.
func NewGitOpsRepository(ctx *pulumi.Context,
	name string, args *GitOpsRepositoryArgs, opts ...pulumi.ResourceOption) (*GitOpsRepository, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.ProjectId == nil {
		return nil, errors.New("invalid value for required argument 'ProjectId'")
	}
	if args.Repos == nil {
		return nil, errors.New("invalid value for required argument 'Repos'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource GitOpsRepository
	err := ctx.RegisterResource("harness:platform/gitOpsRepository:GitOpsRepository", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetGitOpsRepository gets an existing GitOpsRepository resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetGitOpsRepository(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *GitOpsRepositoryState, opts ...pulumi.ResourceOption) (*GitOpsRepository, error) {
	var resource GitOpsRepository
	err := ctx.ReadResource("harness:platform/gitOpsRepository:GitOpsRepository", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering GitOpsRepository resources.
type gitOpsRepositoryState struct {
	// account identifier of the cluster.
	AccountId *string `pulumi:"accountId"`
	// agent identifier of the cluster.
	AgentId *string `pulumi:"agentId"`
	// Credentials only of the Repo.
	CredsOnly *bool `pulumi:"credsOnly"`
	// identifier of the cluster.
	Identifier *string `pulumi:"identifier"`
	// organization identifier of the cluster.
	OrgId *string `pulumi:"orgId"`
	// project identifier of the cluster.
	ProjectId *string `pulumi:"projectId"`
	// Force refresh query for Repo.
	QueryForceRefresh *bool `pulumi:"queryForceRefresh"`
	// Project to Query for Repo.
	QueryProject *string `pulumi:"queryProject"`
	// Repo to Query.
	QueryRepo *string `pulumi:"queryRepo"`
	// Repo Details that need to be stored.
	Repos []GitOpsRepositoryRepo `pulumi:"repos"`
	// Update mask of the Repository.
	UpdateMasks []GitOpsRepositoryUpdateMask `pulumi:"updateMasks"`
	// Upsert the Repo Details.
	Upsert *bool `pulumi:"upsert"`
}

type GitOpsRepositoryState struct {
	// account identifier of the cluster.
	AccountId pulumi.StringPtrInput
	// agent identifier of the cluster.
	AgentId pulumi.StringPtrInput
	// Credentials only of the Repo.
	CredsOnly pulumi.BoolPtrInput
	// identifier of the cluster.
	Identifier pulumi.StringPtrInput
	// organization identifier of the cluster.
	OrgId pulumi.StringPtrInput
	// project identifier of the cluster.
	ProjectId pulumi.StringPtrInput
	// Force refresh query for Repo.
	QueryForceRefresh pulumi.BoolPtrInput
	// Project to Query for Repo.
	QueryProject pulumi.StringPtrInput
	// Repo to Query.
	QueryRepo pulumi.StringPtrInput
	// Repo Details that need to be stored.
	Repos GitOpsRepositoryRepoArrayInput
	// Update mask of the Repository.
	UpdateMasks GitOpsRepositoryUpdateMaskArrayInput
	// Upsert the Repo Details.
	Upsert pulumi.BoolPtrInput
}

func (GitOpsRepositoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*gitOpsRepositoryState)(nil)).Elem()
}

type gitOpsRepositoryArgs struct {
	// account identifier of the cluster.
	AccountId string `pulumi:"accountId"`
	// agent identifier of the cluster.
	AgentId *string `pulumi:"agentId"`
	// Credentials only of the Repo.
	CredsOnly *bool `pulumi:"credsOnly"`
	// identifier of the cluster.
	Identifier string `pulumi:"identifier"`
	// organization identifier of the cluster.
	OrgId *string `pulumi:"orgId"`
	// project identifier of the cluster.
	ProjectId string `pulumi:"projectId"`
	// Force refresh query for Repo.
	QueryForceRefresh *bool `pulumi:"queryForceRefresh"`
	// Project to Query for Repo.
	QueryProject *string `pulumi:"queryProject"`
	// Repo to Query.
	QueryRepo *string `pulumi:"queryRepo"`
	// Repo Details that need to be stored.
	Repos []GitOpsRepositoryRepo `pulumi:"repos"`
	// Update mask of the Repository.
	UpdateMasks []GitOpsRepositoryUpdateMask `pulumi:"updateMasks"`
	// Upsert the Repo Details.
	Upsert *bool `pulumi:"upsert"`
}

// The set of arguments for constructing a GitOpsRepository resource.
type GitOpsRepositoryArgs struct {
	// account identifier of the cluster.
	AccountId pulumi.StringInput
	// agent identifier of the cluster.
	AgentId pulumi.StringPtrInput
	// Credentials only of the Repo.
	CredsOnly pulumi.BoolPtrInput
	// identifier of the cluster.
	Identifier pulumi.StringInput
	// organization identifier of the cluster.
	OrgId pulumi.StringPtrInput
	// project identifier of the cluster.
	ProjectId pulumi.StringInput
	// Force refresh query for Repo.
	QueryForceRefresh pulumi.BoolPtrInput
	// Project to Query for Repo.
	QueryProject pulumi.StringPtrInput
	// Repo to Query.
	QueryRepo pulumi.StringPtrInput
	// Repo Details that need to be stored.
	Repos GitOpsRepositoryRepoArrayInput
	// Update mask of the Repository.
	UpdateMasks GitOpsRepositoryUpdateMaskArrayInput
	// Upsert the Repo Details.
	Upsert pulumi.BoolPtrInput
}

func (GitOpsRepositoryArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*gitOpsRepositoryArgs)(nil)).Elem()
}

type GitOpsRepositoryInput interface {
	pulumi.Input

	ToGitOpsRepositoryOutput() GitOpsRepositoryOutput
	ToGitOpsRepositoryOutputWithContext(ctx context.Context) GitOpsRepositoryOutput
}

func (*GitOpsRepository) ElementType() reflect.Type {
	return reflect.TypeOf((**GitOpsRepository)(nil)).Elem()
}

func (i *GitOpsRepository) ToGitOpsRepositoryOutput() GitOpsRepositoryOutput {
	return i.ToGitOpsRepositoryOutputWithContext(context.Background())
}

func (i *GitOpsRepository) ToGitOpsRepositoryOutputWithContext(ctx context.Context) GitOpsRepositoryOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitOpsRepositoryOutput)
}

// GitOpsRepositoryArrayInput is an input type that accepts GitOpsRepositoryArray and GitOpsRepositoryArrayOutput values.
// You can construct a concrete instance of `GitOpsRepositoryArrayInput` via:
//
//	GitOpsRepositoryArray{ GitOpsRepositoryArgs{...} }
type GitOpsRepositoryArrayInput interface {
	pulumi.Input

	ToGitOpsRepositoryArrayOutput() GitOpsRepositoryArrayOutput
	ToGitOpsRepositoryArrayOutputWithContext(context.Context) GitOpsRepositoryArrayOutput
}

type GitOpsRepositoryArray []GitOpsRepositoryInput

func (GitOpsRepositoryArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitOpsRepository)(nil)).Elem()
}

func (i GitOpsRepositoryArray) ToGitOpsRepositoryArrayOutput() GitOpsRepositoryArrayOutput {
	return i.ToGitOpsRepositoryArrayOutputWithContext(context.Background())
}

func (i GitOpsRepositoryArray) ToGitOpsRepositoryArrayOutputWithContext(ctx context.Context) GitOpsRepositoryArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitOpsRepositoryArrayOutput)
}

// GitOpsRepositoryMapInput is an input type that accepts GitOpsRepositoryMap and GitOpsRepositoryMapOutput values.
// You can construct a concrete instance of `GitOpsRepositoryMapInput` via:
//
//	GitOpsRepositoryMap{ "key": GitOpsRepositoryArgs{...} }
type GitOpsRepositoryMapInput interface {
	pulumi.Input

	ToGitOpsRepositoryMapOutput() GitOpsRepositoryMapOutput
	ToGitOpsRepositoryMapOutputWithContext(context.Context) GitOpsRepositoryMapOutput
}

type GitOpsRepositoryMap map[string]GitOpsRepositoryInput

func (GitOpsRepositoryMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitOpsRepository)(nil)).Elem()
}

func (i GitOpsRepositoryMap) ToGitOpsRepositoryMapOutput() GitOpsRepositoryMapOutput {
	return i.ToGitOpsRepositoryMapOutputWithContext(context.Background())
}

func (i GitOpsRepositoryMap) ToGitOpsRepositoryMapOutputWithContext(ctx context.Context) GitOpsRepositoryMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(GitOpsRepositoryMapOutput)
}

type GitOpsRepositoryOutput struct{ *pulumi.OutputState }

func (GitOpsRepositoryOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**GitOpsRepository)(nil)).Elem()
}

func (o GitOpsRepositoryOutput) ToGitOpsRepositoryOutput() GitOpsRepositoryOutput {
	return o
}

func (o GitOpsRepositoryOutput) ToGitOpsRepositoryOutputWithContext(ctx context.Context) GitOpsRepositoryOutput {
	return o
}

// account identifier of the cluster.
func (o GitOpsRepositoryOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// agent identifier of the cluster.
func (o GitOpsRepositoryOutput) AgentId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.AgentId }).(pulumi.StringPtrOutput)
}

// Credentials only of the Repo.
func (o GitOpsRepositoryOutput) CredsOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.BoolPtrOutput { return v.CredsOnly }).(pulumi.BoolPtrOutput)
}

// identifier of the cluster.
func (o GitOpsRepositoryOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// organization identifier of the cluster.
func (o GitOpsRepositoryOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// project identifier of the cluster.
func (o GitOpsRepositoryOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringOutput { return v.ProjectId }).(pulumi.StringOutput)
}

// Force refresh query for Repo.
func (o GitOpsRepositoryOutput) QueryForceRefresh() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.BoolPtrOutput { return v.QueryForceRefresh }).(pulumi.BoolPtrOutput)
}

// Project to Query for Repo.
func (o GitOpsRepositoryOutput) QueryProject() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.QueryProject }).(pulumi.StringPtrOutput)
}

// Repo to Query.
func (o GitOpsRepositoryOutput) QueryRepo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.QueryRepo }).(pulumi.StringPtrOutput)
}

// Repo Details that need to be stored.
func (o GitOpsRepositoryOutput) Repos() GitOpsRepositoryRepoArrayOutput {
	return o.ApplyT(func(v *GitOpsRepository) GitOpsRepositoryRepoArrayOutput { return v.Repos }).(GitOpsRepositoryRepoArrayOutput)
}

// Update mask of the Repository.
func (o GitOpsRepositoryOutput) UpdateMasks() GitOpsRepositoryUpdateMaskArrayOutput {
	return o.ApplyT(func(v *GitOpsRepository) GitOpsRepositoryUpdateMaskArrayOutput { return v.UpdateMasks }).(GitOpsRepositoryUpdateMaskArrayOutput)
}

// Upsert the Repo Details.
func (o GitOpsRepositoryOutput) Upsert() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.BoolPtrOutput { return v.Upsert }).(pulumi.BoolPtrOutput)
}

type GitOpsRepositoryArrayOutput struct{ *pulumi.OutputState }

func (GitOpsRepositoryArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*GitOpsRepository)(nil)).Elem()
}

func (o GitOpsRepositoryArrayOutput) ToGitOpsRepositoryArrayOutput() GitOpsRepositoryArrayOutput {
	return o
}

func (o GitOpsRepositoryArrayOutput) ToGitOpsRepositoryArrayOutputWithContext(ctx context.Context) GitOpsRepositoryArrayOutput {
	return o
}

func (o GitOpsRepositoryArrayOutput) Index(i pulumi.IntInput) GitOpsRepositoryOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *GitOpsRepository {
		return vs[0].([]*GitOpsRepository)[vs[1].(int)]
	}).(GitOpsRepositoryOutput)
}

type GitOpsRepositoryMapOutput struct{ *pulumi.OutputState }

func (GitOpsRepositoryMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*GitOpsRepository)(nil)).Elem()
}

func (o GitOpsRepositoryMapOutput) ToGitOpsRepositoryMapOutput() GitOpsRepositoryMapOutput {
	return o
}

func (o GitOpsRepositoryMapOutput) ToGitOpsRepositoryMapOutputWithContext(ctx context.Context) GitOpsRepositoryMapOutput {
	return o
}

func (o GitOpsRepositoryMapOutput) MapIndex(k pulumi.StringInput) GitOpsRepositoryOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *GitOpsRepository {
		return vs[0].(map[string]*GitOpsRepository)[vs[1].(string)]
	}).(GitOpsRepositoryOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*GitOpsRepositoryInput)(nil)).Elem(), &GitOpsRepository{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitOpsRepositoryArrayInput)(nil)).Elem(), GitOpsRepositoryArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*GitOpsRepositoryMapInput)(nil)).Elem(), GitOpsRepositoryMap{})
	pulumi.RegisterOutputType(GitOpsRepositoryOutput{})
	pulumi.RegisterOutputType(GitOpsRepositoryArrayOutput{})
	pulumi.RegisterOutputType(GitOpsRepositoryMapOutput{})
}
