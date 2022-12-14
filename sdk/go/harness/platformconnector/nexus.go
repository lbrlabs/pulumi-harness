// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platformconnector

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Nexus connector.
type Nexus struct {
	pulumi.CustomResourceState

	// Credentials to use for authentication.
	Credentials NexusCredentialsPtrOutput `pulumi:"credentials"`
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
	// URL of the Nexus server.
	Url pulumi.StringOutput `pulumi:"url"`
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version pulumi.StringOutput `pulumi:"version"`
}

// NewNexus registers a new resource with the given unique name, arguments, and options.
func NewNexus(ctx *pulumi.Context,
	name string, args *NexusArgs, opts ...pulumi.ResourceOption) (*Nexus, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Nexus
	err := ctx.RegisterResource("harness:PlatformConnector/nexus:Nexus", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNexus gets an existing Nexus resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNexus(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NexusState, opts ...pulumi.ResourceOption) (*Nexus, error) {
	var resource Nexus
	err := ctx.ReadResource("harness:PlatformConnector/nexus:Nexus", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Nexus resources.
type nexusState struct {
	// Credentials to use for authentication.
	Credentials *NexusCredentials `pulumi:"credentials"`
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
	// URL of the Nexus server.
	Url *string `pulumi:"url"`
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version *string `pulumi:"version"`
}

type NexusState struct {
	// Credentials to use for authentication.
	Credentials NexusCredentialsPtrInput
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
	// URL of the Nexus server.
	Url pulumi.StringPtrInput
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version pulumi.StringPtrInput
}

func (NexusState) ElementType() reflect.Type {
	return reflect.TypeOf((*nexusState)(nil)).Elem()
}

type nexusArgs struct {
	// Credentials to use for authentication.
	Credentials *NexusCredentials `pulumi:"credentials"`
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
	// URL of the Nexus server.
	Url string `pulumi:"url"`
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version string `pulumi:"version"`
}

// The set of arguments for constructing a Nexus resource.
type NexusArgs struct {
	// Credentials to use for authentication.
	Credentials NexusCredentialsPtrInput
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
	// URL of the Nexus server.
	Url pulumi.StringInput
	// Version of the Nexus server. Valid values are 2.x, 3.x
	Version pulumi.StringInput
}

func (NexusArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nexusArgs)(nil)).Elem()
}

type NexusInput interface {
	pulumi.Input

	ToNexusOutput() NexusOutput
	ToNexusOutputWithContext(ctx context.Context) NexusOutput
}

func (*Nexus) ElementType() reflect.Type {
	return reflect.TypeOf((**Nexus)(nil)).Elem()
}

func (i *Nexus) ToNexusOutput() NexusOutput {
	return i.ToNexusOutputWithContext(context.Background())
}

func (i *Nexus) ToNexusOutputWithContext(ctx context.Context) NexusOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NexusOutput)
}

// NexusArrayInput is an input type that accepts NexusArray and NexusArrayOutput values.
// You can construct a concrete instance of `NexusArrayInput` via:
//
//	NexusArray{ NexusArgs{...} }
type NexusArrayInput interface {
	pulumi.Input

	ToNexusArrayOutput() NexusArrayOutput
	ToNexusArrayOutputWithContext(context.Context) NexusArrayOutput
}

type NexusArray []NexusInput

func (NexusArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Nexus)(nil)).Elem()
}

func (i NexusArray) ToNexusArrayOutput() NexusArrayOutput {
	return i.ToNexusArrayOutputWithContext(context.Background())
}

func (i NexusArray) ToNexusArrayOutputWithContext(ctx context.Context) NexusArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NexusArrayOutput)
}

// NexusMapInput is an input type that accepts NexusMap and NexusMapOutput values.
// You can construct a concrete instance of `NexusMapInput` via:
//
//	NexusMap{ "key": NexusArgs{...} }
type NexusMapInput interface {
	pulumi.Input

	ToNexusMapOutput() NexusMapOutput
	ToNexusMapOutputWithContext(context.Context) NexusMapOutput
}

type NexusMap map[string]NexusInput

func (NexusMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Nexus)(nil)).Elem()
}

func (i NexusMap) ToNexusMapOutput() NexusMapOutput {
	return i.ToNexusMapOutputWithContext(context.Background())
}

func (i NexusMap) ToNexusMapOutputWithContext(ctx context.Context) NexusMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NexusMapOutput)
}

type NexusOutput struct{ *pulumi.OutputState }

func (NexusOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Nexus)(nil)).Elem()
}

func (o NexusOutput) ToNexusOutput() NexusOutput {
	return o
}

func (o NexusOutput) ToNexusOutputWithContext(ctx context.Context) NexusOutput {
	return o
}

// Credentials to use for authentication.
func (o NexusOutput) Credentials() NexusCredentialsPtrOutput {
	return o.ApplyT(func(v *Nexus) NexusCredentialsPtrOutput { return v.Credentials }).(NexusCredentialsPtrOutput)
}

// Connect using only the delegates which have these tags.
func (o NexusOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o NexusOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o NexusOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o NexusOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o NexusOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o NexusOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o NexusOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Nexus server.
func (o NexusOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

// Version of the Nexus server. Valid values are 2.x, 3.x
func (o NexusOutput) Version() pulumi.StringOutput {
	return o.ApplyT(func(v *Nexus) pulumi.StringOutput { return v.Version }).(pulumi.StringOutput)
}

type NexusArrayOutput struct{ *pulumi.OutputState }

func (NexusArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Nexus)(nil)).Elem()
}

func (o NexusArrayOutput) ToNexusArrayOutput() NexusArrayOutput {
	return o
}

func (o NexusArrayOutput) ToNexusArrayOutputWithContext(ctx context.Context) NexusArrayOutput {
	return o
}

func (o NexusArrayOutput) Index(i pulumi.IntInput) NexusOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Nexus {
		return vs[0].([]*Nexus)[vs[1].(int)]
	}).(NexusOutput)
}

type NexusMapOutput struct{ *pulumi.OutputState }

func (NexusMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Nexus)(nil)).Elem()
}

func (o NexusMapOutput) ToNexusMapOutput() NexusMapOutput {
	return o
}

func (o NexusMapOutput) ToNexusMapOutputWithContext(ctx context.Context) NexusMapOutput {
	return o
}

func (o NexusMapOutput) MapIndex(k pulumi.StringInput) NexusOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Nexus {
		return vs[0].(map[string]*Nexus)[vs[1].(string)]
	}).(NexusOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NexusInput)(nil)).Elem(), &Nexus{})
	pulumi.RegisterInputType(reflect.TypeOf((*NexusArrayInput)(nil)).Elem(), NexusArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NexusMapInput)(nil)).Elem(), NexusMap{})
	pulumi.RegisterOutputType(NexusOutput{})
	pulumi.RegisterOutputType(NexusArrayOutput{})
	pulumi.RegisterOutputType(NexusMapOutput{})
}
