// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudprovider

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a Tanzu cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
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
//			tanzuPassword, err := harness.NewEncryptedText(ctx, "tanzuPassword", &harness.EncryptedTextArgs{
//				Value:           pulumi.String("<PASSWORD>"),
//				SecretManagerId: pulumi.String(_default.Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = cloudprovider.NewTanzu(ctx, "example", &cloudprovider.TanzuArgs{
//				Endpoint:           pulumi.String("https://endpoint.com"),
//				SkipValidation:     pulumi.Bool(true),
//				Username:           pulumi.String("<USERNAME>"),
//				PasswordSecretName: tanzuPassword.Name,
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
// # Import using the Harness Tanzu cloud provider id.
//
// ```sh
//
//	$ pulumi import harness:cloudprovider/tanzu:Tanzu example <provider_id>
//
// ```
type Tanzu struct {
	pulumi.CustomResourceState

	// The url of the Tanzu platform.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The name of the cloud provider.
	Name pulumi.StringOutput `pulumi:"name"`
	// The name of the Harness secret containing the password to use to authenticate to Tanzu.
	PasswordSecretName pulumi.StringOutput `pulumi:"passwordSecretName"`
	// Skip validation of Tanzu configuration.
	SkipValidation pulumi.BoolPtrOutput `pulumi:"skipValidation"`
	// The username to use to authenticate to Tanzu.
	Username pulumi.StringPtrOutput `pulumi:"username"`
	// The name of the Harness secret containing the username to authenticate to Tanzu with.
	UsernameSecretName pulumi.StringPtrOutput `pulumi:"usernameSecretName"`
}

// NewTanzu registers a new resource with the given unique name, arguments, and options.
func NewTanzu(ctx *pulumi.Context,
	name string, args *TanzuArgs, opts ...pulumi.ResourceOption) (*Tanzu, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Endpoint == nil {
		return nil, errors.New("invalid value for required argument 'Endpoint'")
	}
	if args.PasswordSecretName == nil {
		return nil, errors.New("invalid value for required argument 'PasswordSecretName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Tanzu
	err := ctx.RegisterResource("harness:cloudprovider/tanzu:Tanzu", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTanzu gets an existing Tanzu resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTanzu(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TanzuState, opts ...pulumi.ResourceOption) (*Tanzu, error) {
	var resource Tanzu
	err := ctx.ReadResource("harness:cloudprovider/tanzu:Tanzu", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Tanzu resources.
type tanzuState struct {
	// The url of the Tanzu platform.
	Endpoint *string `pulumi:"endpoint"`
	// The name of the cloud provider.
	Name *string `pulumi:"name"`
	// The name of the Harness secret containing the password to use to authenticate to Tanzu.
	PasswordSecretName *string `pulumi:"passwordSecretName"`
	// Skip validation of Tanzu configuration.
	SkipValidation *bool `pulumi:"skipValidation"`
	// The username to use to authenticate to Tanzu.
	Username *string `pulumi:"username"`
	// The name of the Harness secret containing the username to authenticate to Tanzu with.
	UsernameSecretName *string `pulumi:"usernameSecretName"`
}

type TanzuState struct {
	// The url of the Tanzu platform.
	Endpoint pulumi.StringPtrInput
	// The name of the cloud provider.
	Name pulumi.StringPtrInput
	// The name of the Harness secret containing the password to use to authenticate to Tanzu.
	PasswordSecretName pulumi.StringPtrInput
	// Skip validation of Tanzu configuration.
	SkipValidation pulumi.BoolPtrInput
	// The username to use to authenticate to Tanzu.
	Username pulumi.StringPtrInput
	// The name of the Harness secret containing the username to authenticate to Tanzu with.
	UsernameSecretName pulumi.StringPtrInput
}

func (TanzuState) ElementType() reflect.Type {
	return reflect.TypeOf((*tanzuState)(nil)).Elem()
}

type tanzuArgs struct {
	// The url of the Tanzu platform.
	Endpoint string `pulumi:"endpoint"`
	// The name of the cloud provider.
	Name *string `pulumi:"name"`
	// The name of the Harness secret containing the password to use to authenticate to Tanzu.
	PasswordSecretName string `pulumi:"passwordSecretName"`
	// Skip validation of Tanzu configuration.
	SkipValidation *bool `pulumi:"skipValidation"`
	// The username to use to authenticate to Tanzu.
	Username *string `pulumi:"username"`
	// The name of the Harness secret containing the username to authenticate to Tanzu with.
	UsernameSecretName *string `pulumi:"usernameSecretName"`
}

// The set of arguments for constructing a Tanzu resource.
type TanzuArgs struct {
	// The url of the Tanzu platform.
	Endpoint pulumi.StringInput
	// The name of the cloud provider.
	Name pulumi.StringPtrInput
	// The name of the Harness secret containing the password to use to authenticate to Tanzu.
	PasswordSecretName pulumi.StringInput
	// Skip validation of Tanzu configuration.
	SkipValidation pulumi.BoolPtrInput
	// The username to use to authenticate to Tanzu.
	Username pulumi.StringPtrInput
	// The name of the Harness secret containing the username to authenticate to Tanzu with.
	UsernameSecretName pulumi.StringPtrInput
}

func (TanzuArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tanzuArgs)(nil)).Elem()
}

type TanzuInput interface {
	pulumi.Input

	ToTanzuOutput() TanzuOutput
	ToTanzuOutputWithContext(ctx context.Context) TanzuOutput
}

func (*Tanzu) ElementType() reflect.Type {
	return reflect.TypeOf((**Tanzu)(nil)).Elem()
}

func (i *Tanzu) ToTanzuOutput() TanzuOutput {
	return i.ToTanzuOutputWithContext(context.Background())
}

func (i *Tanzu) ToTanzuOutputWithContext(ctx context.Context) TanzuOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TanzuOutput)
}

// TanzuArrayInput is an input type that accepts TanzuArray and TanzuArrayOutput values.
// You can construct a concrete instance of `TanzuArrayInput` via:
//
//	TanzuArray{ TanzuArgs{...} }
type TanzuArrayInput interface {
	pulumi.Input

	ToTanzuArrayOutput() TanzuArrayOutput
	ToTanzuArrayOutputWithContext(context.Context) TanzuArrayOutput
}

type TanzuArray []TanzuInput

func (TanzuArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tanzu)(nil)).Elem()
}

func (i TanzuArray) ToTanzuArrayOutput() TanzuArrayOutput {
	return i.ToTanzuArrayOutputWithContext(context.Background())
}

func (i TanzuArray) ToTanzuArrayOutputWithContext(ctx context.Context) TanzuArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TanzuArrayOutput)
}

// TanzuMapInput is an input type that accepts TanzuMap and TanzuMapOutput values.
// You can construct a concrete instance of `TanzuMapInput` via:
//
//	TanzuMap{ "key": TanzuArgs{...} }
type TanzuMapInput interface {
	pulumi.Input

	ToTanzuMapOutput() TanzuMapOutput
	ToTanzuMapOutputWithContext(context.Context) TanzuMapOutput
}

type TanzuMap map[string]TanzuInput

func (TanzuMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tanzu)(nil)).Elem()
}

func (i TanzuMap) ToTanzuMapOutput() TanzuMapOutput {
	return i.ToTanzuMapOutputWithContext(context.Background())
}

func (i TanzuMap) ToTanzuMapOutputWithContext(ctx context.Context) TanzuMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TanzuMapOutput)
}

type TanzuOutput struct{ *pulumi.OutputState }

func (TanzuOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Tanzu)(nil)).Elem()
}

func (o TanzuOutput) ToTanzuOutput() TanzuOutput {
	return o
}

func (o TanzuOutput) ToTanzuOutputWithContext(ctx context.Context) TanzuOutput {
	return o
}

// The url of the Tanzu platform.
func (o TanzuOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *Tanzu) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The name of the cloud provider.
func (o TanzuOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Tanzu) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The name of the Harness secret containing the password to use to authenticate to Tanzu.
func (o TanzuOutput) PasswordSecretName() pulumi.StringOutput {
	return o.ApplyT(func(v *Tanzu) pulumi.StringOutput { return v.PasswordSecretName }).(pulumi.StringOutput)
}

// Skip validation of Tanzu configuration.
func (o TanzuOutput) SkipValidation() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Tanzu) pulumi.BoolPtrOutput { return v.SkipValidation }).(pulumi.BoolPtrOutput)
}

// The username to use to authenticate to Tanzu.
func (o TanzuOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tanzu) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

// The name of the Harness secret containing the username to authenticate to Tanzu with.
func (o TanzuOutput) UsernameSecretName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Tanzu) pulumi.StringPtrOutput { return v.UsernameSecretName }).(pulumi.StringPtrOutput)
}

type TanzuArrayOutput struct{ *pulumi.OutputState }

func (TanzuArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Tanzu)(nil)).Elem()
}

func (o TanzuArrayOutput) ToTanzuArrayOutput() TanzuArrayOutput {
	return o
}

func (o TanzuArrayOutput) ToTanzuArrayOutputWithContext(ctx context.Context) TanzuArrayOutput {
	return o
}

func (o TanzuArrayOutput) Index(i pulumi.IntInput) TanzuOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Tanzu {
		return vs[0].([]*Tanzu)[vs[1].(int)]
	}).(TanzuOutput)
}

type TanzuMapOutput struct{ *pulumi.OutputState }

func (TanzuMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Tanzu)(nil)).Elem()
}

func (o TanzuMapOutput) ToTanzuMapOutput() TanzuMapOutput {
	return o
}

func (o TanzuMapOutput) ToTanzuMapOutputWithContext(ctx context.Context) TanzuMapOutput {
	return o
}

func (o TanzuMapOutput) MapIndex(k pulumi.StringInput) TanzuOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Tanzu {
		return vs[0].(map[string]*Tanzu)[vs[1].(string)]
	}).(TanzuOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TanzuInput)(nil)).Elem(), &Tanzu{})
	pulumi.RegisterInputType(reflect.TypeOf((*TanzuArrayInput)(nil)).Elem(), TanzuArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TanzuMapInput)(nil)).Elem(), TanzuMap{})
	pulumi.RegisterOutputType(TanzuOutput{})
	pulumi.RegisterOutputType(TanzuArrayOutput{})
	pulumi.RegisterOutputType(TanzuMapOutput{})
}
