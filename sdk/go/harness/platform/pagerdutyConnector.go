// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a PagerDuty connector.
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
//			_, err := platform.NewPagerdutyConnector(ctx, "test", &platform.PagerdutyConnectorArgs{
//				ApiTokenRef: pulumi.String("account.secret_id"),
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description: pulumi.String("test"),
//				Identifier:  pulumi.String("identifier"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
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
// # Import account level pagerduty connector
//
// ```sh
//
//	$ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <connector_id>
//
// ```
//
//	Import org level pagerduty connector
//
// ```sh
//
//	$ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <ord_id>/<connector_id>
//
// ```
//
//	Import project level pagerduty connector
//
// ```sh
//
//	$ pulumi import harness:platform/pagerdutyConnector:PagerdutyConnector example <org_id>/<project_id>/<connector_id>
//
// ```
type PagerdutyConnector struct {
	pulumi.CustomResourceState

	// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiTokenRef pulumi.StringOutput `pulumi:"apiTokenRef"`
	// Tags to filter delegates for connection.
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
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewPagerdutyConnector registers a new resource with the given unique name, arguments, and options.
func NewPagerdutyConnector(ctx *pulumi.Context,
	name string, args *PagerdutyConnectorArgs, opts ...pulumi.ResourceOption) (*PagerdutyConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApiTokenRef == nil {
		return nil, errors.New("invalid value for required argument 'ApiTokenRef'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource PagerdutyConnector
	err := ctx.RegisterResource("harness:platform/pagerdutyConnector:PagerdutyConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPagerdutyConnector gets an existing PagerdutyConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPagerdutyConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PagerdutyConnectorState, opts ...pulumi.ResourceOption) (*PagerdutyConnector, error) {
	var resource PagerdutyConnector
	err := ctx.ReadResource("harness:platform/pagerdutyConnector:PagerdutyConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering PagerdutyConnector resources.
type pagerdutyConnectorState struct {
	// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiTokenRef *string `pulumi:"apiTokenRef"`
	// Tags to filter delegates for connection.
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
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type PagerdutyConnectorState struct {
	// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiTokenRef pulumi.StringPtrInput
	// Tags to filter delegates for connection.
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
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (PagerdutyConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*pagerdutyConnectorState)(nil)).Elem()
}

type pagerdutyConnectorArgs struct {
	// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiTokenRef string `pulumi:"apiTokenRef"`
	// Tags to filter delegates for connection.
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
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a PagerdutyConnector resource.
type PagerdutyConnectorArgs struct {
	// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
	ApiTokenRef pulumi.StringInput
	// Tags to filter delegates for connection.
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
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (PagerdutyConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*pagerdutyConnectorArgs)(nil)).Elem()
}

type PagerdutyConnectorInput interface {
	pulumi.Input

	ToPagerdutyConnectorOutput() PagerdutyConnectorOutput
	ToPagerdutyConnectorOutputWithContext(ctx context.Context) PagerdutyConnectorOutput
}

func (*PagerdutyConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**PagerdutyConnector)(nil)).Elem()
}

func (i *PagerdutyConnector) ToPagerdutyConnectorOutput() PagerdutyConnectorOutput {
	return i.ToPagerdutyConnectorOutputWithContext(context.Background())
}

func (i *PagerdutyConnector) ToPagerdutyConnectorOutputWithContext(ctx context.Context) PagerdutyConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagerdutyConnectorOutput)
}

// PagerdutyConnectorArrayInput is an input type that accepts PagerdutyConnectorArray and PagerdutyConnectorArrayOutput values.
// You can construct a concrete instance of `PagerdutyConnectorArrayInput` via:
//
//	PagerdutyConnectorArray{ PagerdutyConnectorArgs{...} }
type PagerdutyConnectorArrayInput interface {
	pulumi.Input

	ToPagerdutyConnectorArrayOutput() PagerdutyConnectorArrayOutput
	ToPagerdutyConnectorArrayOutputWithContext(context.Context) PagerdutyConnectorArrayOutput
}

type PagerdutyConnectorArray []PagerdutyConnectorInput

func (PagerdutyConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PagerdutyConnector)(nil)).Elem()
}

func (i PagerdutyConnectorArray) ToPagerdutyConnectorArrayOutput() PagerdutyConnectorArrayOutput {
	return i.ToPagerdutyConnectorArrayOutputWithContext(context.Background())
}

func (i PagerdutyConnectorArray) ToPagerdutyConnectorArrayOutputWithContext(ctx context.Context) PagerdutyConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagerdutyConnectorArrayOutput)
}

// PagerdutyConnectorMapInput is an input type that accepts PagerdutyConnectorMap and PagerdutyConnectorMapOutput values.
// You can construct a concrete instance of `PagerdutyConnectorMapInput` via:
//
//	PagerdutyConnectorMap{ "key": PagerdutyConnectorArgs{...} }
type PagerdutyConnectorMapInput interface {
	pulumi.Input

	ToPagerdutyConnectorMapOutput() PagerdutyConnectorMapOutput
	ToPagerdutyConnectorMapOutputWithContext(context.Context) PagerdutyConnectorMapOutput
}

type PagerdutyConnectorMap map[string]PagerdutyConnectorInput

func (PagerdutyConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PagerdutyConnector)(nil)).Elem()
}

func (i PagerdutyConnectorMap) ToPagerdutyConnectorMapOutput() PagerdutyConnectorMapOutput {
	return i.ToPagerdutyConnectorMapOutputWithContext(context.Background())
}

func (i PagerdutyConnectorMap) ToPagerdutyConnectorMapOutputWithContext(ctx context.Context) PagerdutyConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PagerdutyConnectorMapOutput)
}

type PagerdutyConnectorOutput struct{ *pulumi.OutputState }

func (PagerdutyConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**PagerdutyConnector)(nil)).Elem()
}

func (o PagerdutyConnectorOutput) ToPagerdutyConnectorOutput() PagerdutyConnectorOutput {
	return o
}

func (o PagerdutyConnectorOutput) ToPagerdutyConnectorOutputWithContext(ctx context.Context) PagerdutyConnectorOutput {
	return o
}

// Reference to the Harness secret containing the api token. To reference a secret at the organization scope, prefix 'org' to the expression: org.{identifier}. To reference a secret at the account scope, prefix 'account` to the expression: account.{identifier}.
func (o PagerdutyConnectorOutput) ApiTokenRef() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringOutput { return v.ApiTokenRef }).(pulumi.StringOutput)
}

// Tags to filter delegates for connection.
func (o PagerdutyConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o PagerdutyConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o PagerdutyConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o PagerdutyConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o PagerdutyConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o PagerdutyConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource.
func (o PagerdutyConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *PagerdutyConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type PagerdutyConnectorArrayOutput struct{ *pulumi.OutputState }

func (PagerdutyConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*PagerdutyConnector)(nil)).Elem()
}

func (o PagerdutyConnectorArrayOutput) ToPagerdutyConnectorArrayOutput() PagerdutyConnectorArrayOutput {
	return o
}

func (o PagerdutyConnectorArrayOutput) ToPagerdutyConnectorArrayOutputWithContext(ctx context.Context) PagerdutyConnectorArrayOutput {
	return o
}

func (o PagerdutyConnectorArrayOutput) Index(i pulumi.IntInput) PagerdutyConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *PagerdutyConnector {
		return vs[0].([]*PagerdutyConnector)[vs[1].(int)]
	}).(PagerdutyConnectorOutput)
}

type PagerdutyConnectorMapOutput struct{ *pulumi.OutputState }

func (PagerdutyConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*PagerdutyConnector)(nil)).Elem()
}

func (o PagerdutyConnectorMapOutput) ToPagerdutyConnectorMapOutput() PagerdutyConnectorMapOutput {
	return o
}

func (o PagerdutyConnectorMapOutput) ToPagerdutyConnectorMapOutputWithContext(ctx context.Context) PagerdutyConnectorMapOutput {
	return o
}

func (o PagerdutyConnectorMapOutput) MapIndex(k pulumi.StringInput) PagerdutyConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *PagerdutyConnector {
		return vs[0].(map[string]*PagerdutyConnector)[vs[1].(string)]
	}).(PagerdutyConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PagerdutyConnectorInput)(nil)).Elem(), &PagerdutyConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagerdutyConnectorArrayInput)(nil)).Elem(), PagerdutyConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PagerdutyConnectorMapInput)(nil)).Elem(), PagerdutyConnectorMap{})
	pulumi.RegisterOutputType(PagerdutyConnectorOutput{})
	pulumi.RegisterOutputType(PagerdutyConnectorArrayOutput{})
	pulumi.RegisterOutputType(PagerdutyConnectorMapOutput{})
}
