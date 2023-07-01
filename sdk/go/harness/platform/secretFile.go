// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a secret of type secret file in Harness.
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
//			_, err := platform.NewSecretFile(ctx, "example", &platform.SecretFileArgs{
//				Description:             pulumi.String("test"),
//				FilePath:                pulumi.String("file_path"),
//				Identifier:              pulumi.String("identifier"),
//				SecretManagerIdentifier: pulumi.String("harnessSecretManager"),
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
// # Import account level secret file
//
// ```sh
//
//	$ pulumi import harness:platform/secretFile:SecretFile example <secret_file_id>
//
// ```
//
//	Import org level secret file
//
// ```sh
//
//	$ pulumi import harness:platform/secretFile:SecretFile example <ord_id>/<secret_file_id>
//
// ```
//
//	Import project level secret file
//
// ```sh
//
//	$ pulumi import harness:platform/secretFile:SecretFile example <org_id>/<project_id>/<secret_file_id>
//
// ```
type SecretFile struct {
	pulumi.CustomResourceState

	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Path of the file containing secret value
	FilePath pulumi.StringOutput `pulumi:"filePath"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Identifier of the Secret Manager used to manage the secret.
	SecretManagerIdentifier pulumi.StringOutput `pulumi:"secretManagerIdentifier"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
}

// NewSecretFile registers a new resource with the given unique name, arguments, and options.
func NewSecretFile(ctx *pulumi.Context,
	name string, args *SecretFileArgs, opts ...pulumi.ResourceOption) (*SecretFile, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FilePath == nil {
		return nil, errors.New("invalid value for required argument 'FilePath'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.SecretManagerIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'SecretManagerIdentifier'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SecretFile
	err := ctx.RegisterResource("harness:platform/secretFile:SecretFile", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSecretFile gets an existing SecretFile resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSecretFile(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SecretFileState, opts ...pulumi.ResourceOption) (*SecretFile, error) {
	var resource SecretFile
	err := ctx.ReadResource("harness:platform/secretFile:SecretFile", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SecretFile resources.
type secretFileState struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Path of the file containing secret value
	FilePath *string `pulumi:"filePath"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Identifier of the Secret Manager used to manage the secret.
	SecretManagerIdentifier *string `pulumi:"secretManagerIdentifier"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

type SecretFileState struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Path of the file containing secret value
	FilePath pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Identifier of the Secret Manager used to manage the secret.
	SecretManagerIdentifier pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (SecretFileState) ElementType() reflect.Type {
	return reflect.TypeOf((*secretFileState)(nil)).Elem()
}

type secretFileArgs struct {
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Path of the file containing secret value
	FilePath string `pulumi:"filePath"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Identifier of the Secret Manager used to manage the secret.
	SecretManagerIdentifier string `pulumi:"secretManagerIdentifier"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
}

// The set of arguments for constructing a SecretFile resource.
type SecretFileArgs struct {
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Path of the file containing secret value
	FilePath pulumi.StringInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Identifier of the Secret Manager used to manage the secret.
	SecretManagerIdentifier pulumi.StringInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
}

func (SecretFileArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*secretFileArgs)(nil)).Elem()
}

type SecretFileInput interface {
	pulumi.Input

	ToSecretFileOutput() SecretFileOutput
	ToSecretFileOutputWithContext(ctx context.Context) SecretFileOutput
}

func (*SecretFile) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretFile)(nil)).Elem()
}

func (i *SecretFile) ToSecretFileOutput() SecretFileOutput {
	return i.ToSecretFileOutputWithContext(context.Background())
}

func (i *SecretFile) ToSecretFileOutputWithContext(ctx context.Context) SecretFileOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretFileOutput)
}

// SecretFileArrayInput is an input type that accepts SecretFileArray and SecretFileArrayOutput values.
// You can construct a concrete instance of `SecretFileArrayInput` via:
//
//	SecretFileArray{ SecretFileArgs{...} }
type SecretFileArrayInput interface {
	pulumi.Input

	ToSecretFileArrayOutput() SecretFileArrayOutput
	ToSecretFileArrayOutputWithContext(context.Context) SecretFileArrayOutput
}

type SecretFileArray []SecretFileInput

func (SecretFileArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretFile)(nil)).Elem()
}

func (i SecretFileArray) ToSecretFileArrayOutput() SecretFileArrayOutput {
	return i.ToSecretFileArrayOutputWithContext(context.Background())
}

func (i SecretFileArray) ToSecretFileArrayOutputWithContext(ctx context.Context) SecretFileArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretFileArrayOutput)
}

// SecretFileMapInput is an input type that accepts SecretFileMap and SecretFileMapOutput values.
// You can construct a concrete instance of `SecretFileMapInput` via:
//
//	SecretFileMap{ "key": SecretFileArgs{...} }
type SecretFileMapInput interface {
	pulumi.Input

	ToSecretFileMapOutput() SecretFileMapOutput
	ToSecretFileMapOutputWithContext(context.Context) SecretFileMapOutput
}

type SecretFileMap map[string]SecretFileInput

func (SecretFileMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretFile)(nil)).Elem()
}

func (i SecretFileMap) ToSecretFileMapOutput() SecretFileMapOutput {
	return i.ToSecretFileMapOutputWithContext(context.Background())
}

func (i SecretFileMap) ToSecretFileMapOutputWithContext(ctx context.Context) SecretFileMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SecretFileMapOutput)
}

type SecretFileOutput struct{ *pulumi.OutputState }

func (SecretFileOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SecretFile)(nil)).Elem()
}

func (o SecretFileOutput) ToSecretFileOutput() SecretFileOutput {
	return o
}

func (o SecretFileOutput) ToSecretFileOutputWithContext(ctx context.Context) SecretFileOutput {
	return o
}

// Description of the resource.
func (o SecretFileOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Path of the file containing secret value
func (o SecretFileOutput) FilePath() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringOutput { return v.FilePath }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o SecretFileOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o SecretFileOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o SecretFileOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o SecretFileOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Identifier of the Secret Manager used to manage the secret.
func (o SecretFileOutput) SecretManagerIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringOutput { return v.SecretManagerIdentifier }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o SecretFileOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SecretFile) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

type SecretFileArrayOutput struct{ *pulumi.OutputState }

func (SecretFileArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SecretFile)(nil)).Elem()
}

func (o SecretFileArrayOutput) ToSecretFileArrayOutput() SecretFileArrayOutput {
	return o
}

func (o SecretFileArrayOutput) ToSecretFileArrayOutputWithContext(ctx context.Context) SecretFileArrayOutput {
	return o
}

func (o SecretFileArrayOutput) Index(i pulumi.IntInput) SecretFileOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SecretFile {
		return vs[0].([]*SecretFile)[vs[1].(int)]
	}).(SecretFileOutput)
}

type SecretFileMapOutput struct{ *pulumi.OutputState }

func (SecretFileMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SecretFile)(nil)).Elem()
}

func (o SecretFileMapOutput) ToSecretFileMapOutput() SecretFileMapOutput {
	return o
}

func (o SecretFileMapOutput) ToSecretFileMapOutputWithContext(ctx context.Context) SecretFileMapOutput {
	return o
}

func (o SecretFileMapOutput) MapIndex(k pulumi.StringInput) SecretFileOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SecretFile {
		return vs[0].(map[string]*SecretFile)[vs[1].(string)]
	}).(SecretFileOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SecretFileInput)(nil)).Elem(), &SecretFile{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretFileArrayInput)(nil)).Elem(), SecretFileArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SecretFileMapInput)(nil)).Elem(), SecretFileMap{})
	pulumi.RegisterOutputType(SecretFileOutput{})
	pulumi.RegisterOutputType(SecretFileArrayOutput{})
	pulumi.RegisterOutputType(SecretFileMapOutput{})
}
