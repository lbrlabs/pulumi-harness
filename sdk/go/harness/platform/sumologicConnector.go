// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Sumologic connector.
type SumologicConnector struct {
	pulumi.CustomResourceState

	// Reference to the Harness secret containing the access id.
	AccessIdRef pulumi.StringOutput `pulumi:"accessIdRef"`
	// Reference to the Harness secret containing the access key.
	AccessKeyRef pulumi.StringOutput `pulumi:"accessKeyRef"`
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
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Url of the SumoLogic server.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewSumologicConnector registers a new resource with the given unique name, arguments, and options.
func NewSumologicConnector(ctx *pulumi.Context,
	name string, args *SumologicConnectorArgs, opts ...pulumi.ResourceOption) (*SumologicConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccessIdRef == nil {
		return nil, errors.New("invalid value for required argument 'AccessIdRef'")
	}
	if args.AccessKeyRef == nil {
		return nil, errors.New("invalid value for required argument 'AccessKeyRef'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SumologicConnector
	err := ctx.RegisterResource("harness:platform/sumologicConnector:SumologicConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSumologicConnector gets an existing SumologicConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSumologicConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SumologicConnectorState, opts ...pulumi.ResourceOption) (*SumologicConnector, error) {
	var resource SumologicConnector
	err := ctx.ReadResource("harness:platform/sumologicConnector:SumologicConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SumologicConnector resources.
type sumologicConnectorState struct {
	// Reference to the Harness secret containing the access id.
	AccessIdRef *string `pulumi:"accessIdRef"`
	// Reference to the Harness secret containing the access key.
	AccessKeyRef *string `pulumi:"accessKeyRef"`
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
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Url of the SumoLogic server.
	Url *string `pulumi:"url"`
}

type SumologicConnectorState struct {
	// Reference to the Harness secret containing the access id.
	AccessIdRef pulumi.StringPtrInput
	// Reference to the Harness secret containing the access key.
	AccessKeyRef pulumi.StringPtrInput
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
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Url of the SumoLogic server.
	Url pulumi.StringPtrInput
}

func (SumologicConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*sumologicConnectorState)(nil)).Elem()
}

type sumologicConnectorArgs struct {
	// Reference to the Harness secret containing the access id.
	AccessIdRef string `pulumi:"accessIdRef"`
	// Reference to the Harness secret containing the access key.
	AccessKeyRef string `pulumi:"accessKeyRef"`
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
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// Url of the SumoLogic server.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a SumologicConnector resource.
type SumologicConnectorArgs struct {
	// Reference to the Harness secret containing the access id.
	AccessIdRef pulumi.StringInput
	// Reference to the Harness secret containing the access key.
	AccessKeyRef pulumi.StringInput
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
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// Url of the SumoLogic server.
	Url pulumi.StringInput
}

func (SumologicConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*sumologicConnectorArgs)(nil)).Elem()
}

type SumologicConnectorInput interface {
	pulumi.Input

	ToSumologicConnectorOutput() SumologicConnectorOutput
	ToSumologicConnectorOutputWithContext(ctx context.Context) SumologicConnectorOutput
}

func (*SumologicConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**SumologicConnector)(nil)).Elem()
}

func (i *SumologicConnector) ToSumologicConnectorOutput() SumologicConnectorOutput {
	return i.ToSumologicConnectorOutputWithContext(context.Background())
}

func (i *SumologicConnector) ToSumologicConnectorOutputWithContext(ctx context.Context) SumologicConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SumologicConnectorOutput)
}

// SumologicConnectorArrayInput is an input type that accepts SumologicConnectorArray and SumologicConnectorArrayOutput values.
// You can construct a concrete instance of `SumologicConnectorArrayInput` via:
//
//	SumologicConnectorArray{ SumologicConnectorArgs{...} }
type SumologicConnectorArrayInput interface {
	pulumi.Input

	ToSumologicConnectorArrayOutput() SumologicConnectorArrayOutput
	ToSumologicConnectorArrayOutputWithContext(context.Context) SumologicConnectorArrayOutput
}

type SumologicConnectorArray []SumologicConnectorInput

func (SumologicConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SumologicConnector)(nil)).Elem()
}

func (i SumologicConnectorArray) ToSumologicConnectorArrayOutput() SumologicConnectorArrayOutput {
	return i.ToSumologicConnectorArrayOutputWithContext(context.Background())
}

func (i SumologicConnectorArray) ToSumologicConnectorArrayOutputWithContext(ctx context.Context) SumologicConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SumologicConnectorArrayOutput)
}

// SumologicConnectorMapInput is an input type that accepts SumologicConnectorMap and SumologicConnectorMapOutput values.
// You can construct a concrete instance of `SumologicConnectorMapInput` via:
//
//	SumologicConnectorMap{ "key": SumologicConnectorArgs{...} }
type SumologicConnectorMapInput interface {
	pulumi.Input

	ToSumologicConnectorMapOutput() SumologicConnectorMapOutput
	ToSumologicConnectorMapOutputWithContext(context.Context) SumologicConnectorMapOutput
}

type SumologicConnectorMap map[string]SumologicConnectorInput

func (SumologicConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SumologicConnector)(nil)).Elem()
}

func (i SumologicConnectorMap) ToSumologicConnectorMapOutput() SumologicConnectorMapOutput {
	return i.ToSumologicConnectorMapOutputWithContext(context.Background())
}

func (i SumologicConnectorMap) ToSumologicConnectorMapOutputWithContext(ctx context.Context) SumologicConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SumologicConnectorMapOutput)
}

type SumologicConnectorOutput struct{ *pulumi.OutputState }

func (SumologicConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SumologicConnector)(nil)).Elem()
}

func (o SumologicConnectorOutput) ToSumologicConnectorOutput() SumologicConnectorOutput {
	return o
}

func (o SumologicConnectorOutput) ToSumologicConnectorOutputWithContext(ctx context.Context) SumologicConnectorOutput {
	return o
}

// Reference to the Harness secret containing the access id.
func (o SumologicConnectorOutput) AccessIdRef() pulumi.StringOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringOutput { return v.AccessIdRef }).(pulumi.StringOutput)
}

// Reference to the Harness secret containing the access key.
func (o SumologicConnectorOutput) AccessKeyRef() pulumi.StringOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringOutput { return v.AccessKeyRef }).(pulumi.StringOutput)
}

// Connect using only the delegates which have these tags.
func (o SumologicConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o SumologicConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o SumologicConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o SumologicConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o SumologicConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o SumologicConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o SumologicConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Url of the SumoLogic server.
func (o SumologicConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *SumologicConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type SumologicConnectorArrayOutput struct{ *pulumi.OutputState }

func (SumologicConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SumologicConnector)(nil)).Elem()
}

func (o SumologicConnectorArrayOutput) ToSumologicConnectorArrayOutput() SumologicConnectorArrayOutput {
	return o
}

func (o SumologicConnectorArrayOutput) ToSumologicConnectorArrayOutputWithContext(ctx context.Context) SumologicConnectorArrayOutput {
	return o
}

func (o SumologicConnectorArrayOutput) Index(i pulumi.IntInput) SumologicConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SumologicConnector {
		return vs[0].([]*SumologicConnector)[vs[1].(int)]
	}).(SumologicConnectorOutput)
}

type SumologicConnectorMapOutput struct{ *pulumi.OutputState }

func (SumologicConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SumologicConnector)(nil)).Elem()
}

func (o SumologicConnectorMapOutput) ToSumologicConnectorMapOutput() SumologicConnectorMapOutput {
	return o
}

func (o SumologicConnectorMapOutput) ToSumologicConnectorMapOutputWithContext(ctx context.Context) SumologicConnectorMapOutput {
	return o
}

func (o SumologicConnectorMapOutput) MapIndex(k pulumi.StringInput) SumologicConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SumologicConnector {
		return vs[0].(map[string]*SumologicConnector)[vs[1].(string)]
	}).(SumologicConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SumologicConnectorInput)(nil)).Elem(), &SumologicConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*SumologicConnectorArrayInput)(nil)).Elem(), SumologicConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SumologicConnectorMapInput)(nil)).Elem(), SumologicConnectorMap{})
	pulumi.RegisterOutputType(SumologicConnectorOutput{})
	pulumi.RegisterOutputType(SumologicConnectorArrayOutput{})
	pulumi.RegisterOutputType(SumologicConnectorMapOutput{})
}
