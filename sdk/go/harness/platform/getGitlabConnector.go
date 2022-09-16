// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up a Gitlab connector.
func LookupGitlabConnector(ctx *pulumi.Context, args *LookupGitlabConnectorArgs, opts ...pulumi.InvokeOption) (*LookupGitlabConnectorResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupGitlabConnectorResult
	err := ctx.Invoke("harness:platform/getGitlabConnector:getGitlabConnector", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitlabConnector.
type LookupGitlabConnectorArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getGitlabConnector.
type LookupGitlabConnectorResult struct {
	// Configuration for using the gitlab api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
	ApiAuthentications []GetGitlabConnectorApiAuthentication `pulumi:"apiAuthentications"`
	// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
	ConnectionType string `pulumi:"connectionType"`
	// Credentials to use for the connection.
	Credentials []GetGitlabConnectorCredential `pulumi:"credentials"`
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
	// Url of the gitlab repository or account.
	Url string `pulumi:"url"`
	// Repository to test the connection with. This is only used when `connectionType` is `Account`.
	ValidationRepo string `pulumi:"validationRepo"`
}

func LookupGitlabConnectorOutput(ctx *pulumi.Context, args LookupGitlabConnectorOutputArgs, opts ...pulumi.InvokeOption) LookupGitlabConnectorResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupGitlabConnectorResult, error) {
			args := v.(LookupGitlabConnectorArgs)
			r, err := LookupGitlabConnector(ctx, &args, opts...)
			var s LookupGitlabConnectorResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupGitlabConnectorResultOutput)
}

// A collection of arguments for invoking getGitlabConnector.
type LookupGitlabConnectorOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupGitlabConnectorOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitlabConnectorArgs)(nil)).Elem()
}

// A collection of values returned by getGitlabConnector.
type LookupGitlabConnectorResultOutput struct{ *pulumi.OutputState }

func (LookupGitlabConnectorResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupGitlabConnectorResult)(nil)).Elem()
}

func (o LookupGitlabConnectorResultOutput) ToLookupGitlabConnectorResultOutput() LookupGitlabConnectorResultOutput {
	return o
}

func (o LookupGitlabConnectorResultOutput) ToLookupGitlabConnectorResultOutputWithContext(ctx context.Context) LookupGitlabConnectorResultOutput {
	return o
}

// Configuration for using the gitlab api. API Access is Computed for using “Git Experience”, for creation of Git based triggers, Webhooks management and updating Git statuses.
func (o LookupGitlabConnectorResultOutput) ApiAuthentications() GetGitlabConnectorApiAuthenticationArrayOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) []GetGitlabConnectorApiAuthentication { return v.ApiAuthentications }).(GetGitlabConnectorApiAuthenticationArrayOutput)
}

// Whether the connection we're making is to a gitlab repository or a gitlab account. Valid values are Account, Repo.
func (o LookupGitlabConnectorResultOutput) ConnectionType() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) string { return v.ConnectionType }).(pulumi.StringOutput)
}

// Credentials to use for the connection.
func (o LookupGitlabConnectorResultOutput) Credentials() GetGitlabConnectorCredentialArrayOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) []GetGitlabConnectorCredential { return v.Credentials }).(GetGitlabConnectorCredentialArrayOutput)
}

// Connect using only the delegates which have these tags.
func (o LookupGitlabConnectorResultOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) []string { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o LookupGitlabConnectorResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupGitlabConnectorResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupGitlabConnectorResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Name of the resource.
func (o LookupGitlabConnectorResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupGitlabConnectorResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupGitlabConnectorResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupGitlabConnectorResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

// Url of the gitlab repository or account.
func (o LookupGitlabConnectorResultOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) string { return v.Url }).(pulumi.StringOutput)
}

// Repository to test the connection with. This is only used when `connectionType` is `Account`.
func (o LookupGitlabConnectorResultOutput) ValidationRepo() pulumi.StringOutput {
	return o.ApplyT(func(v LookupGitlabConnectorResult) string { return v.ValidationRepo }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupGitlabConnectorResultOutput{})
}
