// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Splunk connector.
type SplunkConnector struct {
	pulumi.CustomResourceState

	// Splunk account id.
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// The reference to the Harness secret containing the Splunk password.
	PasswordRef pulumi.StringOutput `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Url of the Splunk server.
	Url pulumi.StringOutput `pulumi:"url"`
	// The username used for connecting to Splunk.
	Username pulumi.StringOutput `pulumi:"username"`
}

// NewSplunkConnector registers a new resource with the given unique name, arguments, and options.
func NewSplunkConnector(ctx *pulumi.Context,
	name string, args *SplunkConnectorArgs, opts ...pulumi.ResourceOption) (*SplunkConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.PasswordRef == nil {
		return nil, errors.New("invalid value for required argument 'PasswordRef'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	if args.Username == nil {
		return nil, errors.New("invalid value for required argument 'Username'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SplunkConnector
	err := ctx.RegisterResource("harness:platform/splunkConnector:SplunkConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSplunkConnector gets an existing SplunkConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSplunkConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SplunkConnectorState, opts ...pulumi.ResourceOption) (*SplunkConnector, error) {
	var resource SplunkConnector
	err := ctx.ReadResource("harness:platform/splunkConnector:SplunkConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SplunkConnector resources.
type splunkConnectorState struct {
	// Splunk account id.
	AccountId *string `pulumi:"accountId"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// The reference to the Harness secret containing the Splunk password.
	PasswordRef *string `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Url of the Splunk server.
	Url *string `pulumi:"url"`
	// The username used for connecting to Splunk.
	Username *string `pulumi:"username"`
}

type SplunkConnectorState struct {
	// Splunk account id.
	AccountId pulumi.StringPtrInput
	// Connect using only the delegates which have these tags.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// The reference to the Harness secret containing the Splunk password.
	PasswordRef pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Url of the Splunk server.
	Url pulumi.StringPtrInput
	// The username used for connecting to Splunk.
	Username pulumi.StringPtrInput
}

func (SplunkConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*splunkConnectorState)(nil)).Elem()
}

type splunkConnectorArgs struct {
	// Splunk account id.
	AccountId string `pulumi:"accountId"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// The reference to the Harness secret containing the Splunk password.
	PasswordRef string `pulumi:"passwordRef"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Url of the Splunk server.
	Url string `pulumi:"url"`
	// The username used for connecting to Splunk.
	Username string `pulumi:"username"`
}

// The set of arguments for constructing a SplunkConnector resource.
type SplunkConnectorArgs struct {
	// Splunk account id.
	AccountId pulumi.StringInput
	// Connect using only the delegates which have these tags.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// The reference to the Harness secret containing the Splunk password.
	PasswordRef pulumi.StringInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Url of the Splunk server.
	Url pulumi.StringInput
	// The username used for connecting to Splunk.
	Username pulumi.StringInput
}

func (SplunkConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*splunkConnectorArgs)(nil)).Elem()
}

type SplunkConnectorInput interface {
	pulumi.Input

	ToSplunkConnectorOutput() SplunkConnectorOutput
	ToSplunkConnectorOutputWithContext(ctx context.Context) SplunkConnectorOutput
}

func (*SplunkConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**SplunkConnector)(nil)).Elem()
}

func (i *SplunkConnector) ToSplunkConnectorOutput() SplunkConnectorOutput {
	return i.ToSplunkConnectorOutputWithContext(context.Background())
}

func (i *SplunkConnector) ToSplunkConnectorOutputWithContext(ctx context.Context) SplunkConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SplunkConnectorOutput)
}

// SplunkConnectorArrayInput is an input type that accepts SplunkConnectorArray and SplunkConnectorArrayOutput values.
// You can construct a concrete instance of `SplunkConnectorArrayInput` via:
//
//	SplunkConnectorArray{ SplunkConnectorArgs{...} }
type SplunkConnectorArrayInput interface {
	pulumi.Input

	ToSplunkConnectorArrayOutput() SplunkConnectorArrayOutput
	ToSplunkConnectorArrayOutputWithContext(context.Context) SplunkConnectorArrayOutput
}

type SplunkConnectorArray []SplunkConnectorInput

func (SplunkConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SplunkConnector)(nil)).Elem()
}

func (i SplunkConnectorArray) ToSplunkConnectorArrayOutput() SplunkConnectorArrayOutput {
	return i.ToSplunkConnectorArrayOutputWithContext(context.Background())
}

func (i SplunkConnectorArray) ToSplunkConnectorArrayOutputWithContext(ctx context.Context) SplunkConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SplunkConnectorArrayOutput)
}

// SplunkConnectorMapInput is an input type that accepts SplunkConnectorMap and SplunkConnectorMapOutput values.
// You can construct a concrete instance of `SplunkConnectorMapInput` via:
//
//	SplunkConnectorMap{ "key": SplunkConnectorArgs{...} }
type SplunkConnectorMapInput interface {
	pulumi.Input

	ToSplunkConnectorMapOutput() SplunkConnectorMapOutput
	ToSplunkConnectorMapOutputWithContext(context.Context) SplunkConnectorMapOutput
}

type SplunkConnectorMap map[string]SplunkConnectorInput

func (SplunkConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SplunkConnector)(nil)).Elem()
}

func (i SplunkConnectorMap) ToSplunkConnectorMapOutput() SplunkConnectorMapOutput {
	return i.ToSplunkConnectorMapOutputWithContext(context.Background())
}

func (i SplunkConnectorMap) ToSplunkConnectorMapOutputWithContext(ctx context.Context) SplunkConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SplunkConnectorMapOutput)
}

type SplunkConnectorOutput struct{ *pulumi.OutputState }

func (SplunkConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SplunkConnector)(nil)).Elem()
}

func (o SplunkConnectorOutput) ToSplunkConnectorOutput() SplunkConnectorOutput {
	return o
}

func (o SplunkConnectorOutput) ToSplunkConnectorOutputWithContext(ctx context.Context) SplunkConnectorOutput {
	return o
}

// Splunk account id.
func (o SplunkConnectorOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Connect using only the delegates which have these tags.
func (o SplunkConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o SplunkConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o SplunkConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o SplunkConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o SplunkConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// The reference to the Harness secret containing the Splunk password.
func (o SplunkConnectorOutput) PasswordRef() pulumi.StringOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringOutput { return v.PasswordRef }).(pulumi.StringOutput)
}

// Unique identifier of the project.
func (o SplunkConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o SplunkConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Url of the Splunk server.
func (o SplunkConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// The username used for connecting to Splunk.
func (o SplunkConnectorOutput) Username() pulumi.StringOutput {
	return o.ApplyT(func(v *SplunkConnector) pulumi.StringOutput { return v.Username }).(pulumi.StringOutput)
}

type SplunkConnectorArrayOutput struct{ *pulumi.OutputState }

func (SplunkConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SplunkConnector)(nil)).Elem()
}

func (o SplunkConnectorArrayOutput) ToSplunkConnectorArrayOutput() SplunkConnectorArrayOutput {
	return o
}

func (o SplunkConnectorArrayOutput) ToSplunkConnectorArrayOutputWithContext(ctx context.Context) SplunkConnectorArrayOutput {
	return o
}

func (o SplunkConnectorArrayOutput) Index(i pulumi.IntInput) SplunkConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SplunkConnector {
		return vs[0].([]*SplunkConnector)[vs[1].(int)]
	}).(SplunkConnectorOutput)
}

type SplunkConnectorMapOutput struct{ *pulumi.OutputState }

func (SplunkConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SplunkConnector)(nil)).Elem()
}

func (o SplunkConnectorMapOutput) ToSplunkConnectorMapOutput() SplunkConnectorMapOutput {
	return o
}

func (o SplunkConnectorMapOutput) ToSplunkConnectorMapOutputWithContext(ctx context.Context) SplunkConnectorMapOutput {
	return o
}

func (o SplunkConnectorMapOutput) MapIndex(k pulumi.StringInput) SplunkConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SplunkConnector {
		return vs[0].(map[string]*SplunkConnector)[vs[1].(string)]
	}).(SplunkConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SplunkConnectorInput)(nil)).Elem(), &SplunkConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*SplunkConnectorArrayInput)(nil)).Elem(), SplunkConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SplunkConnectorMapInput)(nil)).Elem(), SplunkConnectorMap{})
	pulumi.RegisterOutputType(SplunkConnectorOutput{})
	pulumi.RegisterOutputType(SplunkConnectorArrayOutput{})
	pulumi.RegisterOutputType(SplunkConnectorMapOutput{})
}
