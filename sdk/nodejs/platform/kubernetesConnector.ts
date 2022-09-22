// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a K8s connector.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const clientKeyCert = new harness.platform.KubernetesConnector("clientKeyCert", {
 *     clientKeyCert: {
 *         caCertRef: "account.TEST_k8ss_client_stuff",
 *         clientCertRef: "account.test_k8s_client_cert",
 *         clientKeyAlgorithm: "RSA",
 *         clientKeyPassphraseRef: "account.TEST_k8s_client_test",
 *         clientKeyRef: "account.TEST_k8s_client_key",
 *         masterUrl: "https://kubernetes.example.com",
 *     },
 *     delegateSelectors: ["harness-delegate"],
 *     description: "description",
 *     identifier: "identifier",
 *     tags: ["foo:bar"],
 * });
 * const usernamePassword = new harness.platform.KubernetesConnector("usernamePassword", {
 *     delegateSelectors: ["harness-delegate"],
 *     description: "description",
 *     identifier: "identifier",
 *     tags: ["foo:bar"],
 *     usernamePassword: {
 *         masterUrl: "https://kubernetes.example.com",
 *         passwordRef: "account.TEST_k8s_client_test",
 *         username: "admin",
 *     },
 * });
 * const serviceAccount = new harness.platform.KubernetesConnector("serviceAccount", {
 *     delegateSelectors: ["harness-delegate"],
 *     description: "description",
 *     identifier: "identifier",
 *     serviceAccount: {
 *         masterUrl: "https://kubernetes.example.com",
 *         serviceAccountTokenRef: "account.TEST_k8s_client_test",
 *     },
 *     tags: ["foo:bar"],
 * });
 * const openIDConnect = new harness.platform.KubernetesConnector("openIDConnect", {
 *     delegateSelectors: ["harness-delegate"],
 *     description: "description",
 *     identifier: "%[1]s",
 *     openidConnect: {
 *         clientIdRef: "account.TEST_k8s_client_test",
 *         issuerUrl: "https://oidc.example.com",
 *         masterUrl: "https://kubernetes.example.com",
 *         passwordRef: "account.TEST_k8s_client_test",
 *         scopes: [
 *             "scope1",
 *             "scope2",
 *         ],
 *         secretRef: "account.TEST_k8s_client_test",
 *         usernameRef: "account.TEST_k8s_client_test",
 *     },
 *     tags: ["foo:bar"],
 * });
 * const inheritFromDelegate = new harness.platform.KubernetesConnector("inheritFromDelegate", {
 *     description: "description",
 *     identifier: "identifier",
 *     inheritFromDelegate: {
 *         delegateSelectors: ["harness-delegate"],
 *     },
 *     tags: ["foo:bar"],
 * });
 * ```
 *
 * ## Import
 *
 * # Import using kubernetes connector id
 *
 * ```sh
 *  $ pulumi import harness:platform/kubernetesConnector:KubernetesConnector example <connector_id>
 * ```
 */
export class KubernetesConnector extends pulumi.CustomResource {
    /**
     * Get an existing KubernetesConnector resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesConnectorState, opts?: pulumi.CustomResourceOptions): KubernetesConnector {
        return new KubernetesConnector(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/kubernetesConnector:KubernetesConnector';

    /**
     * Returns true if the given object is an instance of KubernetesConnector.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is KubernetesConnector {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === KubernetesConnector.__pulumiType;
    }

    /**
     * Client key and certificate config for the connector.
     */
    public readonly clientKeyCert!: pulumi.Output<outputs.platform.KubernetesConnectorClientKeyCert | undefined>;
    /**
     * Selectors to use for the delegate.
     */
    public readonly delegateSelectors!: pulumi.Output<string[] | undefined>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Credentials are inherited from the delegate.
     */
    public readonly inheritFromDelegate!: pulumi.Output<outputs.platform.KubernetesConnectorInheritFromDelegate | undefined>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * OpenID configuration for the connector.
     */
    public readonly openidConnect!: pulumi.Output<outputs.platform.KubernetesConnectorOpenidConnect | undefined>;
    /**
     * Unique identifier of the organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Service account for the connector.
     */
    public readonly serviceAccount!: pulumi.Output<outputs.platform.KubernetesConnectorServiceAccount | undefined>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;
    /**
     * Username and password for the connector.
     */
    public readonly usernamePassword!: pulumi.Output<outputs.platform.KubernetesConnectorUsernamePassword | undefined>;

    /**
     * Create a KubernetesConnector resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesConnectorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubernetesConnectorArgs | KubernetesConnectorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubernetesConnectorState | undefined;
            resourceInputs["clientKeyCert"] = state ? state.clientKeyCert : undefined;
            resourceInputs["delegateSelectors"] = state ? state.delegateSelectors : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["inheritFromDelegate"] = state ? state.inheritFromDelegate : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["openidConnect"] = state ? state.openidConnect : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["serviceAccount"] = state ? state.serviceAccount : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["usernamePassword"] = state ? state.usernamePassword : undefined;
        } else {
            const args = argsOrState as KubernetesConnectorArgs | undefined;
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["clientKeyCert"] = args ? args.clientKeyCert : undefined;
            resourceInputs["delegateSelectors"] = args ? args.delegateSelectors : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["inheritFromDelegate"] = args ? args.inheritFromDelegate : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["openidConnect"] = args ? args.openidConnect : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["serviceAccount"] = args ? args.serviceAccount : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["usernamePassword"] = args ? args.usernamePassword : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(KubernetesConnector.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering KubernetesConnector resources.
 */
export interface KubernetesConnectorState {
    /**
     * Client key and certificate config for the connector.
     */
    clientKeyCert?: pulumi.Input<inputs.platform.KubernetesConnectorClientKeyCert>;
    /**
     * Selectors to use for the delegate.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Credentials are inherited from the delegate.
     */
    inheritFromDelegate?: pulumi.Input<inputs.platform.KubernetesConnectorInheritFromDelegate>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * OpenID configuration for the connector.
     */
    openidConnect?: pulumi.Input<inputs.platform.KubernetesConnectorOpenidConnect>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Service account for the connector.
     */
    serviceAccount?: pulumi.Input<inputs.platform.KubernetesConnectorServiceAccount>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Username and password for the connector.
     */
    usernamePassword?: pulumi.Input<inputs.platform.KubernetesConnectorUsernamePassword>;
}

/**
 * The set of arguments for constructing a KubernetesConnector resource.
 */
export interface KubernetesConnectorArgs {
    /**
     * Client key and certificate config for the connector.
     */
    clientKeyCert?: pulumi.Input<inputs.platform.KubernetesConnectorClientKeyCert>;
    /**
     * Selectors to use for the delegate.
     */
    delegateSelectors?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Credentials are inherited from the delegate.
     */
    inheritFromDelegate?: pulumi.Input<inputs.platform.KubernetesConnectorInheritFromDelegate>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * OpenID configuration for the connector.
     */
    openidConnect?: pulumi.Input<inputs.platform.KubernetesConnectorOpenidConnect>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Service account for the connector.
     */
    serviceAccount?: pulumi.Input<inputs.platform.KubernetesConnectorServiceAccount>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Username and password for the connector.
     */
    usernamePassword?: pulumi.Input<inputs.platform.KubernetesConnectorUsernamePassword>;
}
