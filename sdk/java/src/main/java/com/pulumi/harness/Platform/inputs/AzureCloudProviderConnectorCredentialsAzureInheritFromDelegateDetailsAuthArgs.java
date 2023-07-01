// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs Empty = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs();

    @Import(name="azureMsiAuthUa")
    private @Nullable Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs> azureMsiAuthUa;

    public Optional<Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs>> azureMsiAuthUa() {
        return Optional.ofNullable(this.azureMsiAuthUa);
    }

    @Import(name="type", required=true)
    private Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs() {}

    private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs $) {
        this.azureMsiAuthUa = $.azureMsiAuthUa;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs $;

        public Builder() {
            $ = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs();
        }

        public Builder(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs defaults) {
            $ = new AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs(Objects.requireNonNull(defaults));
        }

        public Builder azureMsiAuthUa(@Nullable Output<AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs> azureMsiAuthUa) {
            $.azureMsiAuthUa = azureMsiAuthUa;
            return this;
        }

        public Builder azureMsiAuthUa(AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthAzureMsiAuthUaArgs azureMsiAuthUa) {
            return azureMsiAuthUa(Output.of(azureMsiAuthUa));
        }

        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public AzureCloudProviderConnectorCredentialsAzureInheritFromDelegateDetailsAuthArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
