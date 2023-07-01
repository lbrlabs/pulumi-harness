// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating a K8s connector.
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
//			_, err := platform.NewKubernetesConnector(ctx, "clientKeyCert", &platform.KubernetesConnectorArgs{
//				ClientKeyCert: &platform.KubernetesConnectorClientKeyCertArgs{
//					CaCertRef:              pulumi.String("account.TEST_k8ss_client_stuff"),
//					ClientCertRef:          pulumi.String("account.test_k8s_client_cert"),
//					ClientKeyAlgorithm:     pulumi.String("RSA"),
//					ClientKeyPassphraseRef: pulumi.String("account.TEST_k8s_client_test"),
//					ClientKeyRef:           pulumi.String("account.TEST_k8s_client_key"),
//					MasterUrl:              pulumi.String("https://kubernetes.example.com"),
//				},
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description: pulumi.String("description"),
//				Identifier:  pulumi.String("identifier"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewKubernetesConnector(ctx, "usernamePassword", &platform.KubernetesConnectorArgs{
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description: pulumi.String("description"),
//				Identifier:  pulumi.String("identifier"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				UsernamePassword: &platform.KubernetesConnectorUsernamePasswordArgs{
//					MasterUrl:   pulumi.String("https://kubernetes.example.com"),
//					PasswordRef: pulumi.String("account.TEST_k8s_client_test"),
//					Username:    pulumi.String("admin"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewKubernetesConnector(ctx, "serviceAccount", &platform.KubernetesConnectorArgs{
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description: pulumi.String("description"),
//				Identifier:  pulumi.String("identifier"),
//				ServiceAccount: &platform.KubernetesConnectorServiceAccountArgs{
//					MasterUrl:              pulumi.String("https://kubernetes.example.com"),
//					ServiceAccountTokenRef: pulumi.String("account.TEST_k8s_client_test"),
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewKubernetesConnector(ctx, "openIDConnect", &platform.KubernetesConnectorArgs{
//				DelegateSelectors: pulumi.StringArray{
//					pulumi.String("harness-delegate"),
//				},
//				Description: pulumi.String("description"),
//				Identifier:  pulumi.String("%[1]s"),
//				OpenidConnect: &platform.KubernetesConnectorOpenidConnectArgs{
//					ClientIdRef: pulumi.String("account.TEST_k8s_client_test"),
//					IssuerUrl:   pulumi.String("https://oidc.example.com"),
//					MasterUrl:   pulumi.String("https://kubernetes.example.com"),
//					PasswordRef: pulumi.String("account.TEST_k8s_client_test"),
//					Scopes: pulumi.StringArray{
//						pulumi.String("scope1"),
//						pulumi.String("scope2"),
//					},
//					SecretRef:   pulumi.String("account.TEST_k8s_client_test"),
//					UsernameRef: pulumi.String("account.TEST_k8s_client_test"),
//				},
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = platform.NewKubernetesConnector(ctx, "inheritFromDelegate", &platform.KubernetesConnectorArgs{
//				Description: pulumi.String("description"),
//				Identifier:  pulumi.String("identifier"),
//				InheritFromDelegate: &platform.KubernetesConnectorInheritFromDelegateArgs{
//					DelegateSelectors: pulumi.StringArray{
//						pulumi.String("harness-delegate"),
//					},
//				},
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
// # Import account level kubernetes connector
//
// ```sh
//
//	$ pulumi import harness:platform/kubernetesConnector:KubernetesConnector example <connector_id>
//
// ```
//
//	Import org level kubernetes connector
//
// ```sh
//
//	$ pulumi import harness:platform/kubernetesConnector:KubernetesConnector example <ord_id>/<connector_id>
//
// ```
//
//	Import project level kubernetes connector
//
// ```sh
//
//	$ pulumi import harness:platform/kubernetesConnector:KubernetesConnector example <org_id>/<project_id>/<connector_id>
//
// ```
type KubernetesConnector struct {
	pulumi.CustomResourceState

	// Client key and certificate config for the connector.
	ClientKeyCert KubernetesConnectorClientKeyCertPtrOutput `pulumi:"clientKeyCert"`
	// Selectors to use for the delegate.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Credentials are inherited from the delegate.
	InheritFromDelegate KubernetesConnectorInheritFromDelegatePtrOutput `pulumi:"inheritFromDelegate"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// OpenID configuration for the connector.
	OpenidConnect KubernetesConnectorOpenidConnectPtrOutput `pulumi:"openidConnect"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Service account for the connector.
	ServiceAccount KubernetesConnectorServiceAccountPtrOutput `pulumi:"serviceAccount"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Username and password for the connector.
	UsernamePassword KubernetesConnectorUsernamePasswordPtrOutput `pulumi:"usernamePassword"`
}

// NewKubernetesConnector registers a new resource with the given unique name, arguments, and options.
func NewKubernetesConnector(ctx *pulumi.Context,
	name string, args *KubernetesConnectorArgs, opts ...pulumi.ResourceOption) (*KubernetesConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource KubernetesConnector
	err := ctx.RegisterResource("harness:platform/kubernetesConnector:KubernetesConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetKubernetesConnector gets an existing KubernetesConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetKubernetesConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *KubernetesConnectorState, opts ...pulumi.ResourceOption) (*KubernetesConnector, error) {
	var resource KubernetesConnector
	err := ctx.ReadResource("harness:platform/kubernetesConnector:KubernetesConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering KubernetesConnector resources.
type kubernetesConnectorState struct {
	// Client key and certificate config for the connector.
	ClientKeyCert *KubernetesConnectorClientKeyCert `pulumi:"clientKeyCert"`
	// Selectors to use for the delegate.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Credentials are inherited from the delegate.
	InheritFromDelegate *KubernetesConnectorInheritFromDelegate `pulumi:"inheritFromDelegate"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// OpenID configuration for the connector.
	OpenidConnect *KubernetesConnectorOpenidConnect `pulumi:"openidConnect"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Service account for the connector.
	ServiceAccount *KubernetesConnectorServiceAccount `pulumi:"serviceAccount"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Username and password for the connector.
	UsernamePassword *KubernetesConnectorUsernamePassword `pulumi:"usernamePassword"`
}

type KubernetesConnectorState struct {
	// Client key and certificate config for the connector.
	ClientKeyCert KubernetesConnectorClientKeyCertPtrInput
	// Selectors to use for the delegate.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Credentials are inherited from the delegate.
	InheritFromDelegate KubernetesConnectorInheritFromDelegatePtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// OpenID configuration for the connector.
	OpenidConnect KubernetesConnectorOpenidConnectPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Service account for the connector.
	ServiceAccount KubernetesConnectorServiceAccountPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Username and password for the connector.
	UsernamePassword KubernetesConnectorUsernamePasswordPtrInput
}

func (KubernetesConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesConnectorState)(nil)).Elem()
}

type kubernetesConnectorArgs struct {
	// Client key and certificate config for the connector.
	ClientKeyCert *KubernetesConnectorClientKeyCert `pulumi:"clientKeyCert"`
	// Selectors to use for the delegate.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Credentials are inherited from the delegate.
	InheritFromDelegate *KubernetesConnectorInheritFromDelegate `pulumi:"inheritFromDelegate"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// OpenID configuration for the connector.
	OpenidConnect *KubernetesConnectorOpenidConnect `pulumi:"openidConnect"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Service account for the connector.
	ServiceAccount *KubernetesConnectorServiceAccount `pulumi:"serviceAccount"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Username and password for the connector.
	UsernamePassword *KubernetesConnectorUsernamePassword `pulumi:"usernamePassword"`
}

// The set of arguments for constructing a KubernetesConnector resource.
type KubernetesConnectorArgs struct {
	// Client key and certificate config for the connector.
	ClientKeyCert KubernetesConnectorClientKeyCertPtrInput
	// Selectors to use for the delegate.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Credentials are inherited from the delegate.
	InheritFromDelegate KubernetesConnectorInheritFromDelegatePtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// OpenID configuration for the connector.
	OpenidConnect KubernetesConnectorOpenidConnectPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Service account for the connector.
	ServiceAccount KubernetesConnectorServiceAccountPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Username and password for the connector.
	UsernamePassword KubernetesConnectorUsernamePasswordPtrInput
}

func (KubernetesConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*kubernetesConnectorArgs)(nil)).Elem()
}

type KubernetesConnectorInput interface {
	pulumi.Input

	ToKubernetesConnectorOutput() KubernetesConnectorOutput
	ToKubernetesConnectorOutputWithContext(ctx context.Context) KubernetesConnectorOutput
}

func (*KubernetesConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesConnector)(nil)).Elem()
}

func (i *KubernetesConnector) ToKubernetesConnectorOutput() KubernetesConnectorOutput {
	return i.ToKubernetesConnectorOutputWithContext(context.Background())
}

func (i *KubernetesConnector) ToKubernetesConnectorOutputWithContext(ctx context.Context) KubernetesConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesConnectorOutput)
}

// KubernetesConnectorArrayInput is an input type that accepts KubernetesConnectorArray and KubernetesConnectorArrayOutput values.
// You can construct a concrete instance of `KubernetesConnectorArrayInput` via:
//
//	KubernetesConnectorArray{ KubernetesConnectorArgs{...} }
type KubernetesConnectorArrayInput interface {
	pulumi.Input

	ToKubernetesConnectorArrayOutput() KubernetesConnectorArrayOutput
	ToKubernetesConnectorArrayOutputWithContext(context.Context) KubernetesConnectorArrayOutput
}

type KubernetesConnectorArray []KubernetesConnectorInput

func (KubernetesConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesConnector)(nil)).Elem()
}

func (i KubernetesConnectorArray) ToKubernetesConnectorArrayOutput() KubernetesConnectorArrayOutput {
	return i.ToKubernetesConnectorArrayOutputWithContext(context.Background())
}

func (i KubernetesConnectorArray) ToKubernetesConnectorArrayOutputWithContext(ctx context.Context) KubernetesConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesConnectorArrayOutput)
}

// KubernetesConnectorMapInput is an input type that accepts KubernetesConnectorMap and KubernetesConnectorMapOutput values.
// You can construct a concrete instance of `KubernetesConnectorMapInput` via:
//
//	KubernetesConnectorMap{ "key": KubernetesConnectorArgs{...} }
type KubernetesConnectorMapInput interface {
	pulumi.Input

	ToKubernetesConnectorMapOutput() KubernetesConnectorMapOutput
	ToKubernetesConnectorMapOutputWithContext(context.Context) KubernetesConnectorMapOutput
}

type KubernetesConnectorMap map[string]KubernetesConnectorInput

func (KubernetesConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesConnector)(nil)).Elem()
}

func (i KubernetesConnectorMap) ToKubernetesConnectorMapOutput() KubernetesConnectorMapOutput {
	return i.ToKubernetesConnectorMapOutputWithContext(context.Background())
}

func (i KubernetesConnectorMap) ToKubernetesConnectorMapOutputWithContext(ctx context.Context) KubernetesConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(KubernetesConnectorMapOutput)
}

type KubernetesConnectorOutput struct{ *pulumi.OutputState }

func (KubernetesConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**KubernetesConnector)(nil)).Elem()
}

func (o KubernetesConnectorOutput) ToKubernetesConnectorOutput() KubernetesConnectorOutput {
	return o
}

func (o KubernetesConnectorOutput) ToKubernetesConnectorOutputWithContext(ctx context.Context) KubernetesConnectorOutput {
	return o
}

// Client key and certificate config for the connector.
func (o KubernetesConnectorOutput) ClientKeyCert() KubernetesConnectorClientKeyCertPtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) KubernetesConnectorClientKeyCertPtrOutput { return v.ClientKeyCert }).(KubernetesConnectorClientKeyCertPtrOutput)
}

// Selectors to use for the delegate.
func (o KubernetesConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KubernetesConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o KubernetesConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o KubernetesConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Credentials are inherited from the delegate.
func (o KubernetesConnectorOutput) InheritFromDelegate() KubernetesConnectorInheritFromDelegatePtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) KubernetesConnectorInheritFromDelegatePtrOutput {
		return v.InheritFromDelegate
	}).(KubernetesConnectorInheritFromDelegatePtrOutput)
}

// Name of the resource.
func (o KubernetesConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *KubernetesConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// OpenID configuration for the connector.
func (o KubernetesConnectorOutput) OpenidConnect() KubernetesConnectorOpenidConnectPtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) KubernetesConnectorOpenidConnectPtrOutput { return v.OpenidConnect }).(KubernetesConnectorOpenidConnectPtrOutput)
}

// Unique identifier of the organization.
func (o KubernetesConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o KubernetesConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Service account for the connector.
func (o KubernetesConnectorOutput) ServiceAccount() KubernetesConnectorServiceAccountPtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) KubernetesConnectorServiceAccountPtrOutput { return v.ServiceAccount }).(KubernetesConnectorServiceAccountPtrOutput)
}

// Tags to associate with the resource.
func (o KubernetesConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *KubernetesConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Username and password for the connector.
func (o KubernetesConnectorOutput) UsernamePassword() KubernetesConnectorUsernamePasswordPtrOutput {
	return o.ApplyT(func(v *KubernetesConnector) KubernetesConnectorUsernamePasswordPtrOutput { return v.UsernamePassword }).(KubernetesConnectorUsernamePasswordPtrOutput)
}

type KubernetesConnectorArrayOutput struct{ *pulumi.OutputState }

func (KubernetesConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*KubernetesConnector)(nil)).Elem()
}

func (o KubernetesConnectorArrayOutput) ToKubernetesConnectorArrayOutput() KubernetesConnectorArrayOutput {
	return o
}

func (o KubernetesConnectorArrayOutput) ToKubernetesConnectorArrayOutputWithContext(ctx context.Context) KubernetesConnectorArrayOutput {
	return o
}

func (o KubernetesConnectorArrayOutput) Index(i pulumi.IntInput) KubernetesConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *KubernetesConnector {
		return vs[0].([]*KubernetesConnector)[vs[1].(int)]
	}).(KubernetesConnectorOutput)
}

type KubernetesConnectorMapOutput struct{ *pulumi.OutputState }

func (KubernetesConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*KubernetesConnector)(nil)).Elem()
}

func (o KubernetesConnectorMapOutput) ToKubernetesConnectorMapOutput() KubernetesConnectorMapOutput {
	return o
}

func (o KubernetesConnectorMapOutput) ToKubernetesConnectorMapOutputWithContext(ctx context.Context) KubernetesConnectorMapOutput {
	return o
}

func (o KubernetesConnectorMapOutput) MapIndex(k pulumi.StringInput) KubernetesConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *KubernetesConnector {
		return vs[0].(map[string]*KubernetesConnector)[vs[1].(string)]
	}).(KubernetesConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesConnectorInput)(nil)).Elem(), &KubernetesConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesConnectorArrayInput)(nil)).Elem(), KubernetesConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*KubernetesConnectorMapInput)(nil)).Elem(), KubernetesConnectorMap{})
	pulumi.RegisterOutputType(KubernetesConnectorOutput{})
	pulumi.RegisterOutputType(KubernetesConnectorArrayOutput{})
	pulumi.RegisterOutputType(KubernetesConnectorMapOutput{})
}
