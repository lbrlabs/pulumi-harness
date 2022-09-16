// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Datadog connector.
type DatadogConnector struct {
	pulumi.CustomResourceState

	// Reference to the Harness secret containing the api key.
	ApiKeyRef pulumi.StringOutput `pulumi:"apiKeyRef"`
	// Reference to the Harness secret containing the application key.
	ApplicationKeyRef pulumi.StringOutput `pulumi:"applicationKeyRef"`
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
	// Url of the Datadog server.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewDatadogConnector registers a new resource with the given unique name, arguments, and options.
func NewDatadogConnector(ctx *pulumi.Context,
	name string, args *DatadogConnectorArgs, opts ...pulumi.ResourceOption) (*DatadogConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiKeyRef == nil {
		return nil, errors.New("invalid value for required argument 'ApiKeyRef'")
	}
	if args.ApplicationKeyRef == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationKeyRef'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DatadogConnector
	err := ctx.RegisterResource("harness:platform/datadogConnector:DatadogConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatadogConnector gets an existing DatadogConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatadogConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatadogConnectorState, opts ...pulumi.ResourceOption) (*DatadogConnector, error) {
	var resource DatadogConnector
	err := ctx.ReadResource("harness:platform/datadogConnector:DatadogConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatadogConnector resources.
type datadogConnectorState struct {
	// Reference to the Harness secret containing the api key.
	ApiKeyRef *string `pulumi:"apiKeyRef"`
	// Reference to the Harness secret containing the application key.
	ApplicationKeyRef *string `pulumi:"applicationKeyRef"`
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
	// Url of the Datadog server.
	Url *string `pulumi:"url"`
}

type DatadogConnectorState struct {
	// Reference to the Harness secret containing the api key.
	ApiKeyRef pulumi.StringPtrInput
	// Reference to the Harness secret containing the application key.
	ApplicationKeyRef pulumi.StringPtrInput
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
	// Url of the Datadog server.
	Url pulumi.StringPtrInput
}

func (DatadogConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*datadogConnectorState)(nil)).Elem()
}

type datadogConnectorArgs struct {
	// Reference to the Harness secret containing the api key.
	ApiKeyRef string `pulumi:"apiKeyRef"`
	// Reference to the Harness secret containing the application key.
	ApplicationKeyRef string `pulumi:"applicationKeyRef"`
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
	// Url of the Datadog server.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a DatadogConnector resource.
type DatadogConnectorArgs struct {
	// Reference to the Harness secret containing the api key.
	ApiKeyRef pulumi.StringInput
	// Reference to the Harness secret containing the application key.
	ApplicationKeyRef pulumi.StringInput
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
	// Url of the Datadog server.
	Url pulumi.StringInput
}

func (DatadogConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*datadogConnectorArgs)(nil)).Elem()
}

type DatadogConnectorInput interface {
	pulumi.Input

	ToDatadogConnectorOutput() DatadogConnectorOutput
	ToDatadogConnectorOutputWithContext(ctx context.Context) DatadogConnectorOutput
}

func (*DatadogConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**DatadogConnector)(nil)).Elem()
}

func (i *DatadogConnector) ToDatadogConnectorOutput() DatadogConnectorOutput {
	return i.ToDatadogConnectorOutputWithContext(context.Background())
}

func (i *DatadogConnector) ToDatadogConnectorOutputWithContext(ctx context.Context) DatadogConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatadogConnectorOutput)
}

// DatadogConnectorArrayInput is an input type that accepts DatadogConnectorArray and DatadogConnectorArrayOutput values.
// You can construct a concrete instance of `DatadogConnectorArrayInput` via:
//
//	DatadogConnectorArray{ DatadogConnectorArgs{...} }
type DatadogConnectorArrayInput interface {
	pulumi.Input

	ToDatadogConnectorArrayOutput() DatadogConnectorArrayOutput
	ToDatadogConnectorArrayOutputWithContext(context.Context) DatadogConnectorArrayOutput
}

type DatadogConnectorArray []DatadogConnectorInput

func (DatadogConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatadogConnector)(nil)).Elem()
}

func (i DatadogConnectorArray) ToDatadogConnectorArrayOutput() DatadogConnectorArrayOutput {
	return i.ToDatadogConnectorArrayOutputWithContext(context.Background())
}

func (i DatadogConnectorArray) ToDatadogConnectorArrayOutputWithContext(ctx context.Context) DatadogConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatadogConnectorArrayOutput)
}

// DatadogConnectorMapInput is an input type that accepts DatadogConnectorMap and DatadogConnectorMapOutput values.
// You can construct a concrete instance of `DatadogConnectorMapInput` via:
//
//	DatadogConnectorMap{ "key": DatadogConnectorArgs{...} }
type DatadogConnectorMapInput interface {
	pulumi.Input

	ToDatadogConnectorMapOutput() DatadogConnectorMapOutput
	ToDatadogConnectorMapOutputWithContext(context.Context) DatadogConnectorMapOutput
}

type DatadogConnectorMap map[string]DatadogConnectorInput

func (DatadogConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatadogConnector)(nil)).Elem()
}

func (i DatadogConnectorMap) ToDatadogConnectorMapOutput() DatadogConnectorMapOutput {
	return i.ToDatadogConnectorMapOutputWithContext(context.Background())
}

func (i DatadogConnectorMap) ToDatadogConnectorMapOutputWithContext(ctx context.Context) DatadogConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatadogConnectorMapOutput)
}

type DatadogConnectorOutput struct{ *pulumi.OutputState }

func (DatadogConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatadogConnector)(nil)).Elem()
}

func (o DatadogConnectorOutput) ToDatadogConnectorOutput() DatadogConnectorOutput {
	return o
}

func (o DatadogConnectorOutput) ToDatadogConnectorOutputWithContext(ctx context.Context) DatadogConnectorOutput {
	return o
}

// Reference to the Harness secret containing the api key.
func (o DatadogConnectorOutput) ApiKeyRef() pulumi.StringOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringOutput { return v.ApiKeyRef }).(pulumi.StringOutput)
}

// Reference to the Harness secret containing the application key.
func (o DatadogConnectorOutput) ApplicationKeyRef() pulumi.StringOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringOutput { return v.ApplicationKeyRef }).(pulumi.StringOutput)
}

// Connect using only the delegates which have these tags.
func (o DatadogConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o DatadogConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o DatadogConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o DatadogConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o DatadogConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o DatadogConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o DatadogConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Url of the Datadog server.
func (o DatadogConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *DatadogConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type DatadogConnectorArrayOutput struct{ *pulumi.OutputState }

func (DatadogConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatadogConnector)(nil)).Elem()
}

func (o DatadogConnectorArrayOutput) ToDatadogConnectorArrayOutput() DatadogConnectorArrayOutput {
	return o
}

func (o DatadogConnectorArrayOutput) ToDatadogConnectorArrayOutputWithContext(ctx context.Context) DatadogConnectorArrayOutput {
	return o
}

func (o DatadogConnectorArrayOutput) Index(i pulumi.IntInput) DatadogConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatadogConnector {
		return vs[0].([]*DatadogConnector)[vs[1].(int)]
	}).(DatadogConnectorOutput)
}

type DatadogConnectorMapOutput struct{ *pulumi.OutputState }

func (DatadogConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatadogConnector)(nil)).Elem()
}

func (o DatadogConnectorMapOutput) ToDatadogConnectorMapOutput() DatadogConnectorMapOutput {
	return o
}

func (o DatadogConnectorMapOutput) ToDatadogConnectorMapOutputWithContext(ctx context.Context) DatadogConnectorMapOutput {
	return o
}

func (o DatadogConnectorMapOutput) MapIndex(k pulumi.StringInput) DatadogConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatadogConnector {
		return vs[0].(map[string]*DatadogConnector)[vs[1].(string)]
	}).(DatadogConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatadogConnectorInput)(nil)).Elem(), &DatadogConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatadogConnectorArrayInput)(nil)).Elem(), DatadogConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatadogConnectorMapInput)(nil)).Elem(), DatadogConnectorMap{})
	pulumi.RegisterOutputType(DatadogConnectorOutput{})
	pulumi.RegisterOutputType(DatadogConnectorArrayOutput{})
	pulumi.RegisterOutputType(DatadogConnectorMapOutput{})
}
