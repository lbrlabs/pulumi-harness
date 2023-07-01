// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating tokens.
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
//			_, err := platform.NewToken(ctx, "test", &platform.TokenArgs{
//				AccountId:  pulumi.String("account_id"),
//				ApikeyId:   pulumi.String("apikey_id"),
//				ApikeyType: pulumi.String("USER"),
//				Identifier: pulumi.String("test_token"),
//				OrgId:      pulumi.String("org_id"),
//				ParentId:   pulumi.String("apikey_parent_id"),
//				ProjectId:  pulumi.String("project_id"),
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
// # Import account level token
//
// ```sh
//
//	$ pulumi import harness:platform/token:Token harness_platform_token <parent_id>/<apikey_id>/<apikey_type>/<token_id>
//
// ```
//
//	Import org level token
//
// ```sh
//
//	$ pulumi import harness:platform/token:Token harness_platform_token <org_id>/<parent_id>/<apikey_id>/<apikey_type>/<token_id>
//
// ```
//
//	Import project level token
//
// ```sh
//
//	$ pulumi import harness:platform/token:Token harness_platform_token <org_id>/<project_id>/<parent_id>/<apikey_id>/<apikey_type>/<token_id>
//
// ```
type Token struct {
	pulumi.CustomResourceState

	// Account Identifier for the Entity
	AccountId pulumi.StringOutput `pulumi:"accountId"`
	// Identifier of the API Key
	ApikeyId pulumi.StringOutput `pulumi:"apikeyId"`
	// Type of the API Key
	ApikeyType pulumi.StringOutput `pulumi:"apikeyType"`
	// Description of the Token
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Email Id of the user who created the Token
	Email pulumi.StringPtrOutput `pulumi:"email"`
	// Encoded password of the Token
	EncodedPassword pulumi.StringPtrOutput `pulumi:"encodedPassword"`
	// Identifier of the Token
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the Token
	Name pulumi.StringOutput `pulumi:"name"`
	// Organization Identifier for the Entity
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Parent Entity Identifier of the API Key
	ParentId pulumi.StringOutput `pulumi:"parentId"`
	// Project Identifier for the Entity
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime pulumi.IntOutput `pulumi:"scheduledExpireTime"`
	// Tags for the Token
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Name of the user who created the Token
	Username pulumi.StringPtrOutput `pulumi:"username"`
	// Boolean value to indicate if Token is valid or not.
	Valid pulumi.BoolOutput `pulumi:"valid"`
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom pulumi.IntOutput `pulumi:"validFrom"`
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo pulumi.IntOutput `pulumi:"validTo"`
}

// NewToken registers a new resource with the given unique name, arguments, and options.
func NewToken(ctx *pulumi.Context,
	name string, args *TokenArgs, opts ...pulumi.ResourceOption) (*Token, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.ApikeyId == nil {
		return nil, errors.New("invalid value for required argument 'ApikeyId'")
	}
	if args.ApikeyType == nil {
		return nil, errors.New("invalid value for required argument 'ApikeyType'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.ParentId == nil {
		return nil, errors.New("invalid value for required argument 'ParentId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource Token
	err := ctx.RegisterResource("harness:platform/token:Token", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetToken gets an existing Token resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetToken(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TokenState, opts ...pulumi.ResourceOption) (*Token, error) {
	var resource Token
	err := ctx.ReadResource("harness:platform/token:Token", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Token resources.
type tokenState struct {
	// Account Identifier for the Entity
	AccountId *string `pulumi:"accountId"`
	// Identifier of the API Key
	ApikeyId *string `pulumi:"apikeyId"`
	// Type of the API Key
	ApikeyType *string `pulumi:"apikeyType"`
	// Description of the Token
	Description *string `pulumi:"description"`
	// Email Id of the user who created the Token
	Email *string `pulumi:"email"`
	// Encoded password of the Token
	EncodedPassword *string `pulumi:"encodedPassword"`
	// Identifier of the Token
	Identifier *string `pulumi:"identifier"`
	// Name of the Token
	Name *string `pulumi:"name"`
	// Organization Identifier for the Entity
	OrgId *string `pulumi:"orgId"`
	// Parent Entity Identifier of the API Key
	ParentId *string `pulumi:"parentId"`
	// Project Identifier for the Entity
	ProjectId *string `pulumi:"projectId"`
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime *int `pulumi:"scheduledExpireTime"`
	// Tags for the Token
	Tags map[string]string `pulumi:"tags"`
	// Name of the user who created the Token
	Username *string `pulumi:"username"`
	// Boolean value to indicate if Token is valid or not.
	Valid *bool `pulumi:"valid"`
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom *int `pulumi:"validFrom"`
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo *int `pulumi:"validTo"`
}

type TokenState struct {
	// Account Identifier for the Entity
	AccountId pulumi.StringPtrInput
	// Identifier of the API Key
	ApikeyId pulumi.StringPtrInput
	// Type of the API Key
	ApikeyType pulumi.StringPtrInput
	// Description of the Token
	Description pulumi.StringPtrInput
	// Email Id of the user who created the Token
	Email pulumi.StringPtrInput
	// Encoded password of the Token
	EncodedPassword pulumi.StringPtrInput
	// Identifier of the Token
	Identifier pulumi.StringPtrInput
	// Name of the Token
	Name pulumi.StringPtrInput
	// Organization Identifier for the Entity
	OrgId pulumi.StringPtrInput
	// Parent Entity Identifier of the API Key
	ParentId pulumi.StringPtrInput
	// Project Identifier for the Entity
	ProjectId pulumi.StringPtrInput
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime pulumi.IntPtrInput
	// Tags for the Token
	Tags pulumi.StringMapInput
	// Name of the user who created the Token
	Username pulumi.StringPtrInput
	// Boolean value to indicate if Token is valid or not.
	Valid pulumi.BoolPtrInput
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom pulumi.IntPtrInput
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo pulumi.IntPtrInput
}

func (TokenState) ElementType() reflect.Type {
	return reflect.TypeOf((*tokenState)(nil)).Elem()
}

type tokenArgs struct {
	// Account Identifier for the Entity
	AccountId string `pulumi:"accountId"`
	// Identifier of the API Key
	ApikeyId string `pulumi:"apikeyId"`
	// Type of the API Key
	ApikeyType string `pulumi:"apikeyType"`
	// Description of the Token
	Description *string `pulumi:"description"`
	// Email Id of the user who created the Token
	Email *string `pulumi:"email"`
	// Encoded password of the Token
	EncodedPassword *string `pulumi:"encodedPassword"`
	// Identifier of the Token
	Identifier string `pulumi:"identifier"`
	// Name of the Token
	Name *string `pulumi:"name"`
	// Organization Identifier for the Entity
	OrgId *string `pulumi:"orgId"`
	// Parent Entity Identifier of the API Key
	ParentId string `pulumi:"parentId"`
	// Project Identifier for the Entity
	ProjectId *string `pulumi:"projectId"`
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime *int `pulumi:"scheduledExpireTime"`
	// Tags for the Token
	Tags map[string]string `pulumi:"tags"`
	// Name of the user who created the Token
	Username *string `pulumi:"username"`
	// Boolean value to indicate if Token is valid or not.
	Valid *bool `pulumi:"valid"`
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom *int `pulumi:"validFrom"`
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo *int `pulumi:"validTo"`
}

// The set of arguments for constructing a Token resource.
type TokenArgs struct {
	// Account Identifier for the Entity
	AccountId pulumi.StringInput
	// Identifier of the API Key
	ApikeyId pulumi.StringInput
	// Type of the API Key
	ApikeyType pulumi.StringInput
	// Description of the Token
	Description pulumi.StringPtrInput
	// Email Id of the user who created the Token
	Email pulumi.StringPtrInput
	// Encoded password of the Token
	EncodedPassword pulumi.StringPtrInput
	// Identifier of the Token
	Identifier pulumi.StringInput
	// Name of the Token
	Name pulumi.StringPtrInput
	// Organization Identifier for the Entity
	OrgId pulumi.StringPtrInput
	// Parent Entity Identifier of the API Key
	ParentId pulumi.StringInput
	// Project Identifier for the Entity
	ProjectId pulumi.StringPtrInput
	// Scheduled expiry time in milliseconds
	ScheduledExpireTime pulumi.IntPtrInput
	// Tags for the Token
	Tags pulumi.StringMapInput
	// Name of the user who created the Token
	Username pulumi.StringPtrInput
	// Boolean value to indicate if Token is valid or not.
	Valid pulumi.BoolPtrInput
	// This is the time from which the Token is valid. The time is in milliseconds
	ValidFrom pulumi.IntPtrInput
	// This is the time till which the Token is valid. The time is in milliseconds
	ValidTo pulumi.IntPtrInput
}

func (TokenArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*tokenArgs)(nil)).Elem()
}

type TokenInput interface {
	pulumi.Input

	ToTokenOutput() TokenOutput
	ToTokenOutputWithContext(ctx context.Context) TokenOutput
}

func (*Token) ElementType() reflect.Type {
	return reflect.TypeOf((**Token)(nil)).Elem()
}

func (i *Token) ToTokenOutput() TokenOutput {
	return i.ToTokenOutputWithContext(context.Background())
}

func (i *Token) ToTokenOutputWithContext(ctx context.Context) TokenOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenOutput)
}

// TokenArrayInput is an input type that accepts TokenArray and TokenArrayOutput values.
// You can construct a concrete instance of `TokenArrayInput` via:
//
//	TokenArray{ TokenArgs{...} }
type TokenArrayInput interface {
	pulumi.Input

	ToTokenArrayOutput() TokenArrayOutput
	ToTokenArrayOutputWithContext(context.Context) TokenArrayOutput
}

type TokenArray []TokenInput

func (TokenArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Token)(nil)).Elem()
}

func (i TokenArray) ToTokenArrayOutput() TokenArrayOutput {
	return i.ToTokenArrayOutputWithContext(context.Background())
}

func (i TokenArray) ToTokenArrayOutputWithContext(ctx context.Context) TokenArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenArrayOutput)
}

// TokenMapInput is an input type that accepts TokenMap and TokenMapOutput values.
// You can construct a concrete instance of `TokenMapInput` via:
//
//	TokenMap{ "key": TokenArgs{...} }
type TokenMapInput interface {
	pulumi.Input

	ToTokenMapOutput() TokenMapOutput
	ToTokenMapOutputWithContext(context.Context) TokenMapOutput
}

type TokenMap map[string]TokenInput

func (TokenMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Token)(nil)).Elem()
}

func (i TokenMap) ToTokenMapOutput() TokenMapOutput {
	return i.ToTokenMapOutputWithContext(context.Background())
}

func (i TokenMap) ToTokenMapOutputWithContext(ctx context.Context) TokenMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TokenMapOutput)
}

type TokenOutput struct{ *pulumi.OutputState }

func (TokenOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Token)(nil)).Elem()
}

func (o TokenOutput) ToTokenOutput() TokenOutput {
	return o
}

func (o TokenOutput) ToTokenOutputWithContext(ctx context.Context) TokenOutput {
	return o
}

// Account Identifier for the Entity
func (o TokenOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.AccountId }).(pulumi.StringOutput)
}

// Identifier of the API Key
func (o TokenOutput) ApikeyId() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.ApikeyId }).(pulumi.StringOutput)
}

// Type of the API Key
func (o TokenOutput) ApikeyType() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.ApikeyType }).(pulumi.StringOutput)
}

// Description of the Token
func (o TokenOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Email Id of the user who created the Token
func (o TokenOutput) Email() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.StringPtrOutput { return v.Email }).(pulumi.StringPtrOutput)
}

// Encoded password of the Token
func (o TokenOutput) EncodedPassword() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.StringPtrOutput { return v.EncodedPassword }).(pulumi.StringPtrOutput)
}

// Identifier of the Token
func (o TokenOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the Token
func (o TokenOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Organization Identifier for the Entity
func (o TokenOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Parent Entity Identifier of the API Key
func (o TokenOutput) ParentId() pulumi.StringOutput {
	return o.ApplyT(func(v *Token) pulumi.StringOutput { return v.ParentId }).(pulumi.StringOutput)
}

// Project Identifier for the Entity
func (o TokenOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Scheduled expiry time in milliseconds
func (o TokenOutput) ScheduledExpireTime() pulumi.IntOutput {
	return o.ApplyT(func(v *Token) pulumi.IntOutput { return v.ScheduledExpireTime }).(pulumi.IntOutput)
}

// Tags for the Token
func (o TokenOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Token) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Name of the user who created the Token
func (o TokenOutput) Username() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Token) pulumi.StringPtrOutput { return v.Username }).(pulumi.StringPtrOutput)
}

// Boolean value to indicate if Token is valid or not.
func (o TokenOutput) Valid() pulumi.BoolOutput {
	return o.ApplyT(func(v *Token) pulumi.BoolOutput { return v.Valid }).(pulumi.BoolOutput)
}

// This is the time from which the Token is valid. The time is in milliseconds
func (o TokenOutput) ValidFrom() pulumi.IntOutput {
	return o.ApplyT(func(v *Token) pulumi.IntOutput { return v.ValidFrom }).(pulumi.IntOutput)
}

// This is the time till which the Token is valid. The time is in milliseconds
func (o TokenOutput) ValidTo() pulumi.IntOutput {
	return o.ApplyT(func(v *Token) pulumi.IntOutput { return v.ValidTo }).(pulumi.IntOutput)
}

type TokenArrayOutput struct{ *pulumi.OutputState }

func (TokenArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Token)(nil)).Elem()
}

func (o TokenArrayOutput) ToTokenArrayOutput() TokenArrayOutput {
	return o
}

func (o TokenArrayOutput) ToTokenArrayOutputWithContext(ctx context.Context) TokenArrayOutput {
	return o
}

func (o TokenArrayOutput) Index(i pulumi.IntInput) TokenOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Token {
		return vs[0].([]*Token)[vs[1].(int)]
	}).(TokenOutput)
}

type TokenMapOutput struct{ *pulumi.OutputState }

func (TokenMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Token)(nil)).Elem()
}

func (o TokenMapOutput) ToTokenMapOutput() TokenMapOutput {
	return o
}

func (o TokenMapOutput) ToTokenMapOutputWithContext(ctx context.Context) TokenMapOutput {
	return o
}

func (o TokenMapOutput) MapIndex(k pulumi.StringInput) TokenOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Token {
		return vs[0].(map[string]*Token)[vs[1].(string)]
	}).(TokenOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TokenInput)(nil)).Elem(), &Token{})
	pulumi.RegisterInputType(reflect.TypeOf((*TokenArrayInput)(nil)).Elem(), TokenArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TokenMapInput)(nil)).Elem(), TokenMap{})
	pulumi.RegisterOutputType(TokenOutput{})
	pulumi.RegisterOutputType(TokenArrayOutput{})
	pulumi.RegisterOutputType(TokenMapOutput{})
}
