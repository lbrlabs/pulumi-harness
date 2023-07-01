// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.AzureCloudProviderConnectorArgs;
import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorState;
import com.pulumi.harness.platform.outputs.AzureCloudProviderConnectorCredentials;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an Azure Cloud Provider in Harness.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.AzureCloudProviderConnector;
 * import com.pulumi.harness.platform.AzureCloudProviderConnectorArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCertArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs;
 * import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var manualConfigSecret = new AzureCloudProviderConnector(&#34;manualConfigSecret&#34;, AzureCloudProviderConnectorArgs.builder()        
 *             .azureEnvironmentType(&#34;AZURE&#34;)
 *             .credentials(AzureCloudProviderConnectorCredentialsArgs.builder()
 *                 .azureManualDetails(AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs.builder()
 *                     .applicationId(&#34;application_id&#34;)
 *                     .auth(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs.builder()
 *                         .azureClientSecretKey(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientSecretKeyArgs.builder()
 *                             .secretRef(String.format(&#34;account.%s&#34;, harness_platform_secret_text.test().id()))
 *                             .build())
 *                         .type(&#34;Secret&#34;)
 *                         .build())
 *                     .tenantId(&#34;tenant_id&#34;)
 *                     .build())
 *                 .type(&#34;ManualConfig&#34;)
 *                 .build())
 *             .delegateSelectors(&#34;harness-delegate&#34;)
 *             .description(&#34;example&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .tags(&#34;foo:bar&#34;)
 *             .build());
 * 
 *         var manualConfigCertificate = new AzureCloudProviderConnector(&#34;manualConfigCertificate&#34;, AzureCloudProviderConnectorArgs.builder()        
 *             .azureEnvironmentType(&#34;AZURE&#34;)
 *             .credentials(AzureCloudProviderConnectorCredentialsArgs.builder()
 *                 .azureManualDetails(AzureCloudProviderConnectorCredentialsAzureManualDetailsArgs.builder()
 *                     .applicationId(&#34;application_id&#34;)
 *                     .auth(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthArgs.builder()
 *                         .azureClientKeyCert(AzureCloudProviderConnectorCredentialsAzureManualDetailsAuthAzureClientKeyCertArgs.builder()
 *                             .certificateRef(String.format(&#34;account.%s&#34;, harness_platform_secret_text.test().id()))
 *                             .build())
 *                         .type(&#34;Certificate&#34;)
 *                         .build())
 *                     .tenantId(&#34;tenant_id&#34;)
 *                     .build())
 *                 .type(&#34;ManualConfig&#34;)
 *                 .build())
 *             .delegateSelectors(&#34;harness-delegate&#34;)
 *             .description(&#34;example&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .tags(&#34;foo:bar&#34;)
 *             .build());
 * 
 *         var inheritFromDelegateUserAssignedManagedIdentity = new AzureCloudProviderConnector(&#34;inheritFromDelegateUserAssignedManagedIdentity&#34;, AzureCloudProviderConnectorArgs.builder()        
 *             .azureEnvironmentType(&#34;AZURE&#34;)
 *             .credentials(AzureCloudProviderConnectorCredentialsArgs.builder()
 *                 .azureInheritFromDelegateDetails(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs.builder()
 *                     .auth(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs.builder()
 *                         .azureMsiAuthUa(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs.builder()
 *                             .clientId(&#34;client_id&#34;)
 *                             .build())
 *                         .type(&#34;UserAssignedManagedIdentity&#34;)
 *                         .build())
 *                     .build())
 *                 .type(&#34;InheritFromDelegate&#34;)
 *                 .build())
 *             .delegateSelectors(&#34;harness-delegate&#34;)
 *             .description(&#34;example&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .tags(&#34;foo:bar&#34;)
 *             .build());
 * 
 *         var inheritFromDelegateSystemAssignedManagedIdentity = new AzureCloudProviderConnector(&#34;inheritFromDelegateSystemAssignedManagedIdentity&#34;, AzureCloudProviderConnectorArgs.builder()        
 *             .azureEnvironmentType(&#34;AZURE&#34;)
 *             .credentials(AzureCloudProviderConnectorCredentialsArgs.builder()
 *                 .azureInheritFromDelegateDetails(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsArgs.builder()
 *                     .auth(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs.builder()
 *                         .type(&#34;SystemAssignedManagedIdentity&#34;)
 *                         .build())
 *                     .build())
 *                 .type(&#34;InheritFromDelegate&#34;)
 *                 .build())
 *             .delegateSelectors(&#34;harness-delegate&#34;)
 *             .description(&#34;example&#34;)
 *             .identifier(&#34;identifier&#34;)
 *             .tags(&#34;foo:bar&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import account level azure cloud provider connector
 * 
 * ```sh
 *  $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example &lt;connector_id&gt;
 * ```
 * 
 *  Import org level azure cloud provider connector
 * 
 * ```sh
 *  $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example &lt;ord_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 *  Import project level azure cloud provider connector
 * 
 * ```sh
 *  $ pulumi import harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector example &lt;org_id&gt;/&lt;project_id&gt;/&lt;connector_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector")
public class AzureCloudProviderConnector extends com.pulumi.resources.CustomResource {
    /**
     * Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
     * 
     */
    @Export(name="azureEnvironmentType", refs={String.class}, tree="[0]")
    private Output<String> azureEnvironmentType;

    /**
     * @return Specifies the Azure Environment type, which is AZURE by default. Can either be AZURE or AZURE*US*GOVERNMENT
     * 
     */
    public Output<String> azureEnvironmentType() {
        return this.azureEnvironmentType;
    }
    /**
     * Contains Azure connector credentials.
     * 
     */
    @Export(name="credentials", refs={AzureCloudProviderConnectorCredentials.class}, tree="[0]")
    private Output<AzureCloudProviderConnectorCredentials> credentials;

    /**
     * @return Contains Azure connector credentials.
     * 
     */
    public Output<AzureCloudProviderConnectorCredentials> credentials() {
        return this.credentials;
    }
    /**
     * Tags to filter delegates for connection.
     * 
     */
    @Export(name="delegateSelectors", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> delegateSelectors;

    /**
     * @return Tags to filter delegates for connection.
     * 
     */
    public Output<Optional<List<String>>> delegateSelectors() {
        return Codegen.optional(this.delegateSelectors);
    }
    /**
     * Description of the resource.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Execute on delegate or not.
     * 
     */
    @Export(name="executeOnDelegate", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> executeOnDelegate;

    /**
     * @return Execute on delegate or not.
     * 
     */
    public Output<Optional<Boolean>> executeOnDelegate() {
        return Codegen.optional(this.executeOnDelegate);
    }
    /**
     * Unique identifier of the resource.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Unique identifier of the organization.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Unique identifier of the project.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * Tags to associate with the resource.
     * 
     */
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureCloudProviderConnector(String name) {
        this(name, AzureCloudProviderConnectorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureCloudProviderConnector(String name, AzureCloudProviderConnectorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureCloudProviderConnector(String name, AzureCloudProviderConnectorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector", name, args == null ? AzureCloudProviderConnectorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AzureCloudProviderConnector(String name, Output<String> id, @Nullable AzureCloudProviderConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/azureCloudProviderConnector:AzureCloudProviderConnector", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AzureCloudProviderConnector get(String name, Output<String> id, @Nullable AzureCloudProviderConnectorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AzureCloudProviderConnector(name, id, state, options);
    }
}