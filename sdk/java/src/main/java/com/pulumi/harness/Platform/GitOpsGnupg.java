// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.platform.GitOpsGnupgArgs;
import com.pulumi.harness.platform.inputs.GitOpsGnupgState;
import com.pulumi.harness.platform.outputs.GitOpsGnupgRequest;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * GPG public key in the server&#39;s configuration.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.platform.GitOpsGnupg;
 * import com.pulumi.harness.platform.GitOpsGnupgArgs;
 * import com.pulumi.harness.platform.inputs.GitOpsGnupgRequestArgs;
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
 *         var example = new GitOpsGnupg(&#34;example&#34;, GitOpsGnupgArgs.builder()        
 *             .accountId(&#34;account_id&#34;)
 *             .agentId(&#34;agent_id&#34;)
 *             .requests(GitOpsGnupgRequestArgs.builder()
 *                 .upsert(true)
 *                 .publickeys(GitOpsGnupgRequestPublickeyArgs.builder()
 *                     .keyData(&#34;-----BEGIN PGP PUBLIC KEY BLOCK-----XXXXXX-----END PGP PUBLIC KEY BLOCK-----&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import a Account level Gitops Cluster
 * 
 * ```sh
 *  $ pulumi import harness:platform/gitOpsGnupg:GitOpsGnupg example &lt;agent_id&gt;/&lt;key_id&gt;
 * ```
 * 
 *  Import a Project level Gitops Cluster
 * 
 * ```sh
 *  $ pulumi import harness:platform/gitOpsGnupg:GitOpsGnupg example &lt;organization_id&gt;/&lt;project_id&gt;/&lt;agent_id&gt;/&lt;key_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:platform/gitOpsGnupg:GitOpsGnupg")
public class GitOpsGnupg extends com.pulumi.resources.CustomResource {
    /**
     * Account Identifier for the GnuPG Key.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return Account Identifier for the GnuPG Key.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * Agent identifier for the GnuPG Key.
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return Agent identifier for the GnuPG Key.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Identifier for the GnuPG Key.
     * 
     */
    @Export(name="identifier", refs={String.class}, tree="[0]")
    private Output<String> identifier;

    /**
     * @return Identifier for the GnuPG Key.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }
    /**
     * Organization Identifier for the GnuPG Key.
     * 
     */
    @Export(name="orgId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> orgId;

    /**
     * @return Organization Identifier for the GnuPG Key.
     * 
     */
    public Output<Optional<String>> orgId() {
        return Codegen.optional(this.orgId);
    }
    /**
     * Project Identifier for the GnuPG Key.
     * 
     */
    @Export(name="projectId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> projectId;

    /**
     * @return Project Identifier for the GnuPG Key.
     * 
     */
    public Output<Optional<String>> projectId() {
        return Codegen.optional(this.projectId);
    }
    /**
     * GnuPGPublicKey is a representation of a GnuPG public key
     * 
     */
    @Export(name="requests", refs={List.class,GitOpsGnupgRequest.class}, tree="[0,1]")
    private Output<List<GitOpsGnupgRequest>> requests;

    /**
     * @return GnuPGPublicKey is a representation of a GnuPG public key
     * 
     */
    public Output<List<GitOpsGnupgRequest>> requests() {
        return this.requests;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GitOpsGnupg(String name) {
        this(name, GitOpsGnupgArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GitOpsGnupg(String name, GitOpsGnupgArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GitOpsGnupg(String name, GitOpsGnupgArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsGnupg:GitOpsGnupg", name, args == null ? GitOpsGnupgArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GitOpsGnupg(String name, Output<String> id, @Nullable GitOpsGnupgState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:platform/gitOpsGnupg:GitOpsGnupg", name, state, makeResourceOptions(options, id));
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
    public static GitOpsGnupg get(String name, Output<String> id, @Nullable GitOpsGnupgState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GitOpsGnupg(name, id, state, options);
    }
}