// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an Azure Cloud Cost connector in Harness.
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
//			_, err := platform.NewAzureCloudCostConnector(ctx, "example", &platform.AzureCloudCostConnectorArgs{
//				BillingExportSpec: &platform.AzureCloudCostConnectorBillingExportSpecArgs{
//					ContainerName:      pulumi.String("container_name"),
//					DirectoryName:      pulumi.String("directory_name"),
//					ReportName:         pulumi.String("report_name"),
//					StorageAccountName: pulumi.String("storage_account_name"),
//					SubscriptionId:     pulumi.String("subscription_id"),
//				},
//				Description: pulumi.String("example"),
//				FeaturesEnableds: pulumi.StringArray{
//					pulumi.String("BILLING"),
//					pulumi.String("VISIBILITY"),
//					pulumi.String("OPTIMIZATION"),
//				},
//				Identifier:     pulumi.String("identifier"),
//				SubscriptionId: pulumi.String("subscription_id"),
//				Tags: pulumi.StringArray{
//					pulumi.String("foo:bar"),
//				},
//				TenantId: pulumi.String("tenant_id"),
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
// # Import account level azure cloud cost connector
//
// ```sh
//
//	$ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <connector_id>
//
// ```
//
//	Import org level azure cloud cost connector
//
// ```sh
//
//	$ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <ord_id>/<connector_id>
//
// ```
//
//	Import project level azure cloud cost connector
//
// ```sh
//
//	$ pulumi import harness:platform/azureCloudCostConnector:AzureCloudCostConnector example <org_id>/<project_id>/<connector_id>
//
// ```
type AzureCloudCostConnector struct {
	pulumi.CustomResourceState

	// Returns billing details for the Azure account.
	BillingExportSpec AzureCloudCostConnectorBillingExportSpecPtrOutput `pulumi:"billingExportSpec"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds pulumi.StringArrayOutput `pulumi:"featuresEnableds"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Subsription id.
	SubscriptionId pulumi.StringOutput `pulumi:"subscriptionId"`
	// Tags to associate with the resource.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// Tenant id.
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
}

// NewAzureCloudCostConnector registers a new resource with the given unique name, arguments, and options.
func NewAzureCloudCostConnector(ctx *pulumi.Context,
	name string, args *AzureCloudCostConnectorArgs, opts ...pulumi.ResourceOption) (*AzureCloudCostConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FeaturesEnableds == nil {
		return nil, errors.New("invalid value for required argument 'FeaturesEnableds'")
	}
	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.SubscriptionId == nil {
		return nil, errors.New("invalid value for required argument 'SubscriptionId'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource AzureCloudCostConnector
	err := ctx.RegisterResource("harness:platform/azureCloudCostConnector:AzureCloudCostConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAzureCloudCostConnector gets an existing AzureCloudCostConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAzureCloudCostConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AzureCloudCostConnectorState, opts ...pulumi.ResourceOption) (*AzureCloudCostConnector, error) {
	var resource AzureCloudCostConnector
	err := ctx.ReadResource("harness:platform/azureCloudCostConnector:AzureCloudCostConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AzureCloudCostConnector resources.
type azureCloudCostConnectorState struct {
	// Returns billing details for the Azure account.
	BillingExportSpec *AzureCloudCostConnectorBillingExportSpec `pulumi:"billingExportSpec"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Subsription id.
	SubscriptionId *string `pulumi:"subscriptionId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Tenant id.
	TenantId *string `pulumi:"tenantId"`
}

type AzureCloudCostConnectorState struct {
	// Returns billing details for the Azure account.
	BillingExportSpec AzureCloudCostConnectorBillingExportSpecPtrInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds pulumi.StringArrayInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Subsription id.
	SubscriptionId pulumi.StringPtrInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Tenant id.
	TenantId pulumi.StringPtrInput
}

func (AzureCloudCostConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*azureCloudCostConnectorState)(nil)).Elem()
}

type azureCloudCostConnectorArgs struct {
	// Returns billing details for the Azure account.
	BillingExportSpec *AzureCloudCostConnectorBillingExportSpec `pulumi:"billingExportSpec"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds []string `pulumi:"featuresEnableds"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Subsription id.
	SubscriptionId string `pulumi:"subscriptionId"`
	// Tags to associate with the resource.
	Tags []string `pulumi:"tags"`
	// Tenant id.
	TenantId string `pulumi:"tenantId"`
}

// The set of arguments for constructing a AzureCloudCostConnector resource.
type AzureCloudCostConnectorArgs struct {
	// Returns billing details for the Azure account.
	BillingExportSpec AzureCloudCostConnectorBillingExportSpecPtrInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Indicates which feature to enable among Billing, Optimization, and Visibility.
	FeaturesEnableds pulumi.StringArrayInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput
	// Subsription id.
	SubscriptionId pulumi.StringInput
	// Tags to associate with the resource.
	Tags pulumi.StringArrayInput
	// Tenant id.
	TenantId pulumi.StringInput
}

func (AzureCloudCostConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*azureCloudCostConnectorArgs)(nil)).Elem()
}

type AzureCloudCostConnectorInput interface {
	pulumi.Input

	ToAzureCloudCostConnectorOutput() AzureCloudCostConnectorOutput
	ToAzureCloudCostConnectorOutputWithContext(ctx context.Context) AzureCloudCostConnectorOutput
}

func (*AzureCloudCostConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureCloudCostConnector)(nil)).Elem()
}

func (i *AzureCloudCostConnector) ToAzureCloudCostConnectorOutput() AzureCloudCostConnectorOutput {
	return i.ToAzureCloudCostConnectorOutputWithContext(context.Background())
}

func (i *AzureCloudCostConnector) ToAzureCloudCostConnectorOutputWithContext(ctx context.Context) AzureCloudCostConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureCloudCostConnectorOutput)
}

// AzureCloudCostConnectorArrayInput is an input type that accepts AzureCloudCostConnectorArray and AzureCloudCostConnectorArrayOutput values.
// You can construct a concrete instance of `AzureCloudCostConnectorArrayInput` via:
//
//	AzureCloudCostConnectorArray{ AzureCloudCostConnectorArgs{...} }
type AzureCloudCostConnectorArrayInput interface {
	pulumi.Input

	ToAzureCloudCostConnectorArrayOutput() AzureCloudCostConnectorArrayOutput
	ToAzureCloudCostConnectorArrayOutputWithContext(context.Context) AzureCloudCostConnectorArrayOutput
}

type AzureCloudCostConnectorArray []AzureCloudCostConnectorInput

func (AzureCloudCostConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureCloudCostConnector)(nil)).Elem()
}

func (i AzureCloudCostConnectorArray) ToAzureCloudCostConnectorArrayOutput() AzureCloudCostConnectorArrayOutput {
	return i.ToAzureCloudCostConnectorArrayOutputWithContext(context.Background())
}

func (i AzureCloudCostConnectorArray) ToAzureCloudCostConnectorArrayOutputWithContext(ctx context.Context) AzureCloudCostConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureCloudCostConnectorArrayOutput)
}

// AzureCloudCostConnectorMapInput is an input type that accepts AzureCloudCostConnectorMap and AzureCloudCostConnectorMapOutput values.
// You can construct a concrete instance of `AzureCloudCostConnectorMapInput` via:
//
//	AzureCloudCostConnectorMap{ "key": AzureCloudCostConnectorArgs{...} }
type AzureCloudCostConnectorMapInput interface {
	pulumi.Input

	ToAzureCloudCostConnectorMapOutput() AzureCloudCostConnectorMapOutput
	ToAzureCloudCostConnectorMapOutputWithContext(context.Context) AzureCloudCostConnectorMapOutput
}

type AzureCloudCostConnectorMap map[string]AzureCloudCostConnectorInput

func (AzureCloudCostConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureCloudCostConnector)(nil)).Elem()
}

func (i AzureCloudCostConnectorMap) ToAzureCloudCostConnectorMapOutput() AzureCloudCostConnectorMapOutput {
	return i.ToAzureCloudCostConnectorMapOutputWithContext(context.Background())
}

func (i AzureCloudCostConnectorMap) ToAzureCloudCostConnectorMapOutputWithContext(ctx context.Context) AzureCloudCostConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureCloudCostConnectorMapOutput)
}

type AzureCloudCostConnectorOutput struct{ *pulumi.OutputState }

func (AzureCloudCostConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureCloudCostConnector)(nil)).Elem()
}

func (o AzureCloudCostConnectorOutput) ToAzureCloudCostConnectorOutput() AzureCloudCostConnectorOutput {
	return o
}

func (o AzureCloudCostConnectorOutput) ToAzureCloudCostConnectorOutputWithContext(ctx context.Context) AzureCloudCostConnectorOutput {
	return o
}

// Returns billing details for the Azure account.
func (o AzureCloudCostConnectorOutput) BillingExportSpec() AzureCloudCostConnectorBillingExportSpecPtrOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) AzureCloudCostConnectorBillingExportSpecPtrOutput {
		return v.BillingExportSpec
	}).(AzureCloudCostConnectorBillingExportSpecPtrOutput)
}

// Description of the resource.
func (o AzureCloudCostConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Indicates which feature to enable among Billing, Optimization, and Visibility.
func (o AzureCloudCostConnectorOutput) FeaturesEnableds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringArrayOutput { return v.FeaturesEnableds }).(pulumi.StringArrayOutput)
}

// Unique identifier of the resource.
func (o AzureCloudCostConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o AzureCloudCostConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the organization.
func (o AzureCloudCostConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o AzureCloudCostConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Subsription id.
func (o AzureCloudCostConnectorOutput) SubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringOutput { return v.SubscriptionId }).(pulumi.StringOutput)
}

// Tags to associate with the resource.
func (o AzureCloudCostConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// Tenant id.
func (o AzureCloudCostConnectorOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureCloudCostConnector) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

type AzureCloudCostConnectorArrayOutput struct{ *pulumi.OutputState }

func (AzureCloudCostConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureCloudCostConnector)(nil)).Elem()
}

func (o AzureCloudCostConnectorArrayOutput) ToAzureCloudCostConnectorArrayOutput() AzureCloudCostConnectorArrayOutput {
	return o
}

func (o AzureCloudCostConnectorArrayOutput) ToAzureCloudCostConnectorArrayOutputWithContext(ctx context.Context) AzureCloudCostConnectorArrayOutput {
	return o
}

func (o AzureCloudCostConnectorArrayOutput) Index(i pulumi.IntInput) AzureCloudCostConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AzureCloudCostConnector {
		return vs[0].([]*AzureCloudCostConnector)[vs[1].(int)]
	}).(AzureCloudCostConnectorOutput)
}

type AzureCloudCostConnectorMapOutput struct{ *pulumi.OutputState }

func (AzureCloudCostConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureCloudCostConnector)(nil)).Elem()
}

func (o AzureCloudCostConnectorMapOutput) ToAzureCloudCostConnectorMapOutput() AzureCloudCostConnectorMapOutput {
	return o
}

func (o AzureCloudCostConnectorMapOutput) ToAzureCloudCostConnectorMapOutputWithContext(ctx context.Context) AzureCloudCostConnectorMapOutput {
	return o
}

func (o AzureCloudCostConnectorMapOutput) MapIndex(k pulumi.StringInput) AzureCloudCostConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AzureCloudCostConnector {
		return vs[0].(map[string]*AzureCloudCostConnector)[vs[1].(string)]
	}).(AzureCloudCostConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AzureCloudCostConnectorInput)(nil)).Elem(), &AzureCloudCostConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureCloudCostConnectorArrayInput)(nil)).Elem(), AzureCloudCostConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureCloudCostConnectorMapInput)(nil)).Elem(), AzureCloudCostConnectorMap{})
	pulumi.RegisterOutputType(AzureCloudCostConnectorOutput{})
	pulumi.RegisterOutputType(AzureCloudCostConnectorArrayOutput{})
	pulumi.RegisterOutputType(AzureCloudCostConnectorMapOutput{})
}
