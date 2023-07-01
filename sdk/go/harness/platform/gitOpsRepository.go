// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating Harness Gitops Repositories.
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
//			_, err := platform.NewGitOpsRepository(ctx, "example", &platform.GitOpsRepositoryArgs{
//				AccountId:  pulumi.String("account_id"),
//				AgentId:    pulumi.String("agent_id"),
//				Identifier: pulumi.String("identifier"),
//				OrgId:      pulumi.String("org_id"),
//				ProjectId:  pulumi.String("project_id"),
//				Repos: platform.GitOpsRepositoryRepoArray{
//					&platform.GitOpsRepositoryRepoArgs{
//						ConnectionType: pulumi.String("HTTPS_ANONYMOUS"),
//						Insecure:       pulumi.Bool(true),
//						Name:           pulumi.String("repo_name"),
//						Repo:           pulumi.String("https://github.com/willycoll/argocd-example-apps.git"),
//					},
//				},
//				Upsert: pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Import a Account level Gitops Repository
//
// ```sh
//
//	$ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example <agent_id>/<respository_id>
//
// ```
//
//	Import a Project level Gitops Repository
//
// ```sh
//
//	$ pulumi import harness:platform/gitOpsRepository:GitOpsRepository example <organization_id>/<project_id>/<agent_id>/<respository_id>
//
// ```
type GitOpsRepository struct {
	pulumi.CustomResourceState

	// Account identifier of the GitOps repository.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Agent identifier of the GitOps repository.
	AgentId pulumi.StringOutput `pulumi:"agentId"`
	// Indicates if to operate on credential set instead of repository.
	CredsOnly pulumi.BoolPtrOutput `pulumi:"credsOnly"`
	// Identifier of the GitOps repository.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Organization identifier of the GitOps repository.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Indicates to force refresh query for repository.
	QueryForceRefresh pulumi.BoolPtrOutput `pulumi:"queryForceRefresh"`
	// Project to query for the GitOps repo.
	QueryProject pulumi.StringPtrOutput `pulumi:"queryProject"`
	// GitOps repository to query.
	QueryRepo pulumi.StringPtrOutput `pulumi:"queryRepo"`
	// Repo details holding application configurations.
	Repos GitOpsRepositoryRepoArrayOutput `pulumi:"repos"`
	// Update mask of the repository.
	UpdateMasks GitOpsRepositoryUpdateMaskArrayOutput `pulumi:"updateMasks"`
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
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
	if args.AgentId == nil {
		return nil, errors.New("invalid value for required argument 'AgentId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
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
	// Account identifier of the GitOps repository.
	AccountId *string `pulumi:"accountId"`
	// Agent identifier of the GitOps repository.
	AgentId *string `pulumi:"agentId"`
	// Indicates if to operate on credential set instead of repository.
	CredsOnly *bool `pulumi:"credsOnly"`
	// Identifier of the GitOps repository.
	Identifier *string `pulumi:"identifier"`
	// Organization identifier of the GitOps repository.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId *string `pulumi:"projectId"`
	// Indicates to force refresh query for repository.
	QueryForceRefresh *bool `pulumi:"queryForceRefresh"`
	// Project to query for the GitOps repo.
	QueryProject *string `pulumi:"queryProject"`
	// GitOps repository to query.
	QueryRepo *string `pulumi:"queryRepo"`
	// Repo details holding application configurations.
	Repos []GitOpsRepositoryRepo `pulumi:"repos"`
	// Update mask of the repository.
	UpdateMasks []GitOpsRepositoryUpdateMask `pulumi:"updateMasks"`
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
	Upsert *bool `pulumi:"upsert"`
}

type GitOpsRepositoryState struct {
	// Account identifier of the GitOps repository.
	AccountId pulumi.StringPtrInput
	// Agent identifier of the GitOps repository.
	AgentId pulumi.StringPtrInput
	// Indicates if to operate on credential set instead of repository.
	CredsOnly pulumi.BoolPtrInput
	// Identifier of the GitOps repository.
	Identifier pulumi.StringPtrInput
	// Organization identifier of the GitOps repository.
	OrgId pulumi.StringPtrInput
	// Project identifier of the GitOps repository.
	ProjectId pulumi.StringPtrInput
	// Indicates to force refresh query for repository.
	QueryForceRefresh pulumi.BoolPtrInput
	// Project to query for the GitOps repo.
	QueryProject pulumi.StringPtrInput
	// GitOps repository to query.
	QueryRepo pulumi.StringPtrInput
	// Repo details holding application configurations.
	Repos GitOpsRepositoryRepoArrayInput
	// Update mask of the repository.
	UpdateMasks GitOpsRepositoryUpdateMaskArrayInput
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
	Upsert pulumi.BoolPtrInput
}

func (GitOpsRepositoryState) ElementType() reflect.Type {
	return reflect.TypeOf((*gitOpsRepositoryState)(nil)).Elem()
}

type gitOpsRepositoryArgs struct {
	// Account identifier of the GitOps repository.
	AccountId string `pulumi:"accountId"`
	// Agent identifier of the GitOps repository.
	AgentId string `pulumi:"agentId"`
	// Indicates if to operate on credential set instead of repository.
	CredsOnly *bool `pulumi:"credsOnly"`
	// Identifier of the GitOps repository.
	Identifier string `pulumi:"identifier"`
	// Organization identifier of the GitOps repository.
	OrgId *string `pulumi:"orgId"`
	// Project identifier of the GitOps repository.
	ProjectId *string `pulumi:"projectId"`
	// Indicates to force refresh query for repository.
	QueryForceRefresh *bool `pulumi:"queryForceRefresh"`
	// Project to query for the GitOps repo.
	QueryProject *string `pulumi:"queryProject"`
	// GitOps repository to query.
	QueryRepo *string `pulumi:"queryRepo"`
	// Repo details holding application configurations.
	Repos []GitOpsRepositoryRepo `pulumi:"repos"`
	// Update mask of the repository.
	UpdateMasks []GitOpsRepositoryUpdateMask `pulumi:"updateMasks"`
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
	Upsert *bool `pulumi:"upsert"`
}

// The set of arguments for constructing a GitOpsRepository resource.
type GitOpsRepositoryArgs struct {
	// Account identifier of the GitOps repository.
	AccountId pulumi.StringInput
	// Agent identifier of the GitOps repository.
	AgentId pulumi.StringInput
	// Indicates if to operate on credential set instead of repository.
	CredsOnly pulumi.BoolPtrInput
	// Identifier of the GitOps repository.
	Identifier pulumi.StringInput
	// Organization identifier of the GitOps repository.
	OrgId pulumi.StringPtrInput
	// Project identifier of the GitOps repository.
	ProjectId pulumi.StringPtrInput
	// Indicates to force refresh query for repository.
	QueryForceRefresh pulumi.BoolPtrInput
	// Project to query for the GitOps repo.
	QueryProject pulumi.StringPtrInput
	// GitOps repository to query.
	QueryRepo pulumi.StringPtrInput
	// Repo details holding application configurations.
	Repos GitOpsRepositoryRepoArrayInput
	// Update mask of the repository.
	UpdateMasks GitOpsRepositoryUpdateMaskArrayInput
	// Indicates if the GitOps repository should be updated if existing and inserted if not.
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

// Account identifier of the GitOps repository.
func (o GitOpsRepositoryOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Agent identifier of the GitOps repository.
func (o GitOpsRepositoryOutput) AgentId() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringOutput { return v.AgentId }).(pulumi.StringOutput)
}

// Indicates if to operate on credential set instead of repository.
func (o GitOpsRepositoryOutput) CredsOnly() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.BoolPtrOutput { return v.CredsOnly }).(pulumi.BoolPtrOutput)
}

// Identifier of the GitOps repository.
func (o GitOpsRepositoryOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Organization identifier of the GitOps repository.
func (o GitOpsRepositoryOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Project identifier of the GitOps repository.
func (o GitOpsRepositoryOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Indicates to force refresh query for repository.
func (o GitOpsRepositoryOutput) QueryForceRefresh() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.BoolPtrOutput { return v.QueryForceRefresh }).(pulumi.BoolPtrOutput)
}

// Project to query for the GitOps repo.
func (o GitOpsRepositoryOutput) QueryProject() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.QueryProject }).(pulumi.StringPtrOutput)
}

// GitOps repository to query.
func (o GitOpsRepositoryOutput) QueryRepo() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *GitOpsRepository) pulumi.StringPtrOutput { return v.QueryRepo }).(pulumi.StringPtrOutput)
}

// Repo details holding application configurations.
func (o GitOpsRepositoryOutput) Repos() GitOpsRepositoryRepoArrayOutput {
	return o.ApplyT(func(v *GitOpsRepository) GitOpsRepositoryRepoArrayOutput { return v.Repos }).(GitOpsRepositoryRepoArrayOutput)
}

// Update mask of the repository.
func (o GitOpsRepositoryOutput) UpdateMasks() GitOpsRepositoryUpdateMaskArrayOutput {
	return o.ApplyT(func(v *GitOpsRepository) GitOpsRepositoryUpdateMaskArrayOutput { return v.UpdateMasks }).(GitOpsRepositoryUpdateMaskArrayOutput)
}

// Indicates if the GitOps repository should be updated if existing and inserted if not.
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
