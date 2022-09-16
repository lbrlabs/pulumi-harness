// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudprovider

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Spot cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness"
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/cloudprovider"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := harness.GetSecretManager(ctx, &GetSecretManagerArgs{
//				Default: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			spotToken, err := harness.NewEncryptedText(ctx, "spotToken", &harness.EncryptedTextArgs{
//				SecretManagerId: pulumi.String(_default.Id),
//				Value:           pulumi.String("<SPOT_TOKEN>"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudprovider.NewSpot(ctx, "example", &cloudprovider.SpotArgs{
//				AccountId:       pulumi.String("<SPOT_ACCOUNT_ID>"),
//				TokenSecretName: spotToken.Name,
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
// # Import using the Harness Spot cloud provider id.
//
// ```sh
//
//	$ pulumi import harness:cloudprovider/spot:Spot example <provider_id>
//
// ```
type Spot struct {
	pulumi.CustomResourceState

	// The Spot account ID
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// The name of the cloud provider.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Harness secret containing the spot account token
	TokenSecretName pulumi.StringOutput `pulumi:"tokenSecretName"`
}

// NewSpot registers a new resource with the given unique name, arguments, and options.
func NewSpot(ctx *pulumi.Context,
	name string, args *SpotArgs, opts ...pulumi.ResourceOption) (*Spot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.TokenSecretName == nil {
		return nil, errors.New("invalid value for required argument 'TokenSecretName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Spot
	err := ctx.RegisterResource("harness:cloudprovider/spot:Spot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSpot gets an existing Spot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSpot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SpotState, opts ...pulumi.ResourceOption) (*Spot, error) {
	var resource Spot
	err := ctx.ReadResource("harness:cloudprovider/spot:Spot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Spot resources.
type spotState struct {
	// The Spot account ID
	AccountId *string `pulumi:"accountId"`
	// The name of the cloud provider.
	Name *string `pulumi:"name"`
	// The name of the Harness secret containing the spot account token
	TokenSecretName *string `pulumi:"tokenSecretName"`
}

type SpotState struct {
	// The Spot account ID
	AccountId pulumi.StringPtrInput
	// The name of the cloud provider.
	Name pulumi.StringPtrInput
	// The name of the Harness secret containing the spot account token
	TokenSecretName pulumi.StringPtrInput
}

func (SpotState) ElementType() reflect.Type {
	return reflect.TypeOf((*spotState)(nil)).Elem()
}

type spotArgs struct {
	// The Spot account ID
	AccountId string `pulumi:"accountId"`
	// The name of the cloud provider.
	Name *string `pulumi:"name"`
	// The name of the Harness secret containing the spot account token
	TokenSecretName string `pulumi:"tokenSecretName"`
}

// The set of arguments for constructing a Spot resource.
type SpotArgs struct {
	// The Spot account ID
	AccountId pulumi.StringInput
	// The name of the cloud provider.
	Name pulumi.StringPtrInput
	// The name of the Harness secret containing the spot account token
	TokenSecretName pulumi.StringInput
}

func (SpotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*spotArgs)(nil)).Elem()
}

type SpotInput interface {
	pulumi.Input

	ToSpotOutput() SpotOutput
	ToSpotOutputWithContext(ctx context.Context) SpotOutput
}

func (*Spot) ElementType() reflect.Type {
	return reflect.TypeOf((**Spot)(nil)).Elem()
}

func (i *Spot) ToSpotOutput() SpotOutput {
	return i.ToSpotOutputWithContext(context.Background())
}

func (i *Spot) ToSpotOutputWithContext(ctx context.Context) SpotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotOutput)
}

// SpotArrayInput is an input type that accepts SpotArray and SpotArrayOutput values.
// You can construct a concrete instance of `SpotArrayInput` via:
//
//	SpotArray{ SpotArgs{...} }
type SpotArrayInput interface {
	pulumi.Input

	ToSpotArrayOutput() SpotArrayOutput
	ToSpotArrayOutputWithContext(context.Context) SpotArrayOutput
}

type SpotArray []SpotInput

func (SpotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Spot)(nil)).Elem()
}

func (i SpotArray) ToSpotArrayOutput() SpotArrayOutput {
	return i.ToSpotArrayOutputWithContext(context.Background())
}

func (i SpotArray) ToSpotArrayOutputWithContext(ctx context.Context) SpotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotArrayOutput)
}

// SpotMapInput is an input type that accepts SpotMap and SpotMapOutput values.
// You can construct a concrete instance of `SpotMapInput` via:
//
//	SpotMap{ "key": SpotArgs{...} }
type SpotMapInput interface {
	pulumi.Input

	ToSpotMapOutput() SpotMapOutput
	ToSpotMapOutputWithContext(context.Context) SpotMapOutput
}

type SpotMap map[string]SpotInput

func (SpotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Spot)(nil)).Elem()
}

func (i SpotMap) ToSpotMapOutput() SpotMapOutput {
	return i.ToSpotMapOutputWithContext(context.Background())
}

func (i SpotMap) ToSpotMapOutputWithContext(ctx context.Context) SpotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SpotMapOutput)
}

type SpotOutput struct{ *pulumi.OutputState }

func (SpotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Spot)(nil)).Elem()
}

func (o SpotOutput) ToSpotOutput() SpotOutput {
	return o
}

func (o SpotOutput) ToSpotOutputWithContext(ctx context.Context) SpotOutput {
	return o
}

// The Spot account ID
func (o SpotOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Spot) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// The name of the cloud provider.
func (o SpotOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Spot) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Harness secret containing the spot account token
func (o SpotOutput) TokenSecretName() pulumi.StringOutput {
	return o.ApplyT(func(v *Spot) pulumi.StringOutput { return v.TokenSecretName }).(pulumi.StringOutput)
}

type SpotArrayOutput struct{ *pulumi.OutputState }

func (SpotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Spot)(nil)).Elem()
}

func (o SpotArrayOutput) ToSpotArrayOutput() SpotArrayOutput {
	return o
}

func (o SpotArrayOutput) ToSpotArrayOutputWithContext(ctx context.Context) SpotArrayOutput {
	return o
}

func (o SpotArrayOutput) Index(i pulumi.IntInput) SpotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Spot {
		return vs[0].([]*Spot)[vs[1].(int)]
	}).(SpotOutput)
}

type SpotMapOutput struct{ *pulumi.OutputState }

func (SpotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Spot)(nil)).Elem()
}

func (o SpotMapOutput) ToSpotMapOutput() SpotMapOutput {
	return o
}

func (o SpotMapOutput) ToSpotMapOutputWithContext(ctx context.Context) SpotMapOutput {
	return o
}

func (o SpotMapOutput) MapIndex(k pulumi.StringInput) SpotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Spot {
		return vs[0].(map[string]*Spot)[vs[1].(string)]
	}).(SpotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SpotInput)(nil)).Elem(), &Spot{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpotArrayInput)(nil)).Elem(), SpotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SpotMapInput)(nil)).Elem(), SpotMap{})
	pulumi.RegisterOutputType(SpotOutput{})
	pulumi.RegisterOutputType(SpotArrayOutput{})
	pulumi.RegisterOutputType(SpotMapOutput{})
}
