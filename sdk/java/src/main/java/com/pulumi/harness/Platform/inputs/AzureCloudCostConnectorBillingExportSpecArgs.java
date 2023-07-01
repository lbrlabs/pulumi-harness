// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AzureCloudCostConnectorBillingExportSpecArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureCloudCostConnectorBillingExportSpecArgs Empty = new AzureCloudCostConnectorBillingExportSpecArgs();

    /**
     * Name of the container.
     * 
     */
    @Import(name="containerName", required=true)
    private Output<String> containerName;

    /**
     * @return Name of the container.
     * 
     */
    public Output<String> containerName() {
        return this.containerName;
    }

    /**
     * Name of the directory.
     * 
     */
    @Import(name="directoryName", required=true)
    private Output<String> directoryName;

    /**
     * @return Name of the directory.
     * 
     */
    public Output<String> directoryName() {
        return this.directoryName;
    }

    /**
     * Name of the report.
     * 
     */
    @Import(name="reportName", required=true)
    private Output<String> reportName;

    /**
     * @return Name of the report.
     * 
     */
    public Output<String> reportName() {
        return this.reportName;
    }

    /**
     * Name of the storage account.
     * 
     */
    @Import(name="storageAccountName", required=true)
    private Output<String> storageAccountName;

    /**
     * @return Name of the storage account.
     * 
     */
    public Output<String> storageAccountName() {
        return this.storageAccountName;
    }

    /**
     * Subsription Id.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private Output<String> subscriptionId;

    /**
     * @return Subsription Id.
     * 
     */
    public Output<String> subscriptionId() {
        return this.subscriptionId;
    }

    private AzureCloudCostConnectorBillingExportSpecArgs() {}

    private AzureCloudCostConnectorBillingExportSpecArgs(AzureCloudCostConnectorBillingExportSpecArgs $) {
        this.containerName = $.containerName;
        this.directoryName = $.directoryName;
        this.reportName = $.reportName;
        this.storageAccountName = $.storageAccountName;
        this.subscriptionId = $.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureCloudCostConnectorBillingExportSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureCloudCostConnectorBillingExportSpecArgs $;

        public Builder() {
            $ = new AzureCloudCostConnectorBillingExportSpecArgs();
        }

        public Builder(AzureCloudCostConnectorBillingExportSpecArgs defaults) {
            $ = new AzureCloudCostConnectorBillingExportSpecArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param containerName Name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName Name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param directoryName Name of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryName(Output<String> directoryName) {
            $.directoryName = directoryName;
            return this;
        }

        /**
         * @param directoryName Name of the directory.
         * 
         * @return builder
         * 
         */
        public Builder directoryName(String directoryName) {
            return directoryName(Output.of(directoryName));
        }

        /**
         * @param reportName Name of the report.
         * 
         * @return builder
         * 
         */
        public Builder reportName(Output<String> reportName) {
            $.reportName = reportName;
            return this;
        }

        /**
         * @param reportName Name of the report.
         * 
         * @return builder
         * 
         */
        public Builder reportName(String reportName) {
            return reportName(Output.of(reportName));
        }

        /**
         * @param storageAccountName Name of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(Output<String> storageAccountName) {
            $.storageAccountName = storageAccountName;
            return this;
        }

        /**
         * @param storageAccountName Name of the storage account.
         * 
         * @return builder
         * 
         */
        public Builder storageAccountName(String storageAccountName) {
            return storageAccountName(Output.of(storageAccountName));
        }

        /**
         * @param subscriptionId Subsription Id.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Subsription Id.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        public AzureCloudCostConnectorBillingExportSpecArgs build() {
            $.containerName = Objects.requireNonNull($.containerName, "expected parameter 'containerName' to be non-null");
            $.directoryName = Objects.requireNonNull($.directoryName, "expected parameter 'directoryName' to be non-null");
            $.reportName = Objects.requireNonNull($.reportName, "expected parameter 'reportName' to be non-null");
            $.storageAccountName = Objects.requireNonNull($.storageAccountName, "expected parameter 'storageAccountName' to be non-null");
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            return $;
        }
    }

}
