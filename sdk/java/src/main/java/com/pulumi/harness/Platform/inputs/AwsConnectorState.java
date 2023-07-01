// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.AwsConnectorCrossAccountAccessArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorEqualJitterBackoffStrategyArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorFixedDelayBackoffStrategyArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorFullJitterBackoffStrategyArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorInheritFromDelegateArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorIrsaArgs;
import com.pulumi.harness.platform.inputs.AwsConnectorManualArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsConnectorState extends com.pulumi.resources.ResourceArgs {

    public static final AwsConnectorState Empty = new AwsConnectorState();

    /**
     * Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    @Import(name="crossAccountAccess")
    private @Nullable Output<AwsConnectorCrossAccountAccessArgs> crossAccountAccess;

    /**
     * @return Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
     * 
     */
    public Optional<Output<AwsConnectorCrossAccountAccessArgs>> crossAccountAccess() {
        return Optional.ofNullable(this.crossAccountAccess);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Equal Jitter BackOff Strategy.
     * 
     */
    @Import(name="equalJitterBackoffStrategy")
    private @Nullable Output<AwsConnectorEqualJitterBackoffStrategyArgs> equalJitterBackoffStrategy;

    /**
     * @return Equal Jitter BackOff Strategy.
     * 
     */
    public Optional<Output<AwsConnectorEqualJitterBackoffStrategyArgs>> equalJitterBackoffStrategy() {
        return Optional.ofNullable(this.equalJitterBackoffStrategy);
    }

    /**
     * Fixed Delay BackOff Strategy.
     * 
     */
    @Import(name="fixedDelayBackoffStrategy")
    private @Nullable Output<AwsConnectorFixedDelayBackoffStrategyArgs> fixedDelayBackoffStrategy;

    /**
     * @return Fixed Delay BackOff Strategy.
     * 
     */
    public Optional<Output<AwsConnectorFixedDelayBackoffStrategyArgs>> fixedDelayBackoffStrategy() {
        return Optional.ofNullable(this.fixedDelayBackoffStrategy);
    }

    /**
     * Full Jitter BackOff Strategy.
     * 
     */
    @Import(name="fullJitterBackoffStrategy")
    private @Nullable Output<AwsConnectorFullJitterBackoffStrategyArgs> fullJitterBackoffStrategy;

    /**
     * @return Full Jitter BackOff Strategy.
     * 
     */
    public Optional<Output<AwsConnectorFullJitterBackoffStrategyArgs>> fullJitterBackoffStrategy() {
        return Optional.ofNullable(this.fullJitterBackoffStrategy);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Inherit credentials from the delegate.
     * 
     */
    @Import(name="inheritFromDelegate")
    private @Nullable Output<AwsConnectorInheritFromDelegateArgs> inheritFromDelegate;

    /**
     * @return Inherit credentials from the delegate.
     * 
     */
    public Optional<Output<AwsConnectorInheritFromDelegateArgs>> inheritFromDelegate() {
        return Optional.ofNullable(this.inheritFromDelegate);
    }

    /**
     * Use IAM role for service accounts.
     * 
     */
    @Import(name="irsa")
    private @Nullable Output<AwsConnectorIrsaArgs> irsa;

    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public Optional<Output<AwsConnectorIrsaArgs>> irsa() {
        return Optional.ofNullable(this.irsa);
    }

    /**
     * Use IAM role for service accounts.
     * 
     */
    @Import(name="manual")
    private @Nullable Output<AwsConnectorManualArgs> manual;

    /**
     * @return Use IAM role for service accounts.
     * 
     */
    public Optional<Output<AwsConnectorManualArgs>> manual() {
        return Optional.ofNullable(this.manual);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Tags to associate with the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AwsConnectorState() {}

    private AwsConnectorState(AwsConnectorState $) {
        this.crossAccountAccess = $.crossAccountAccess;
        this.description = $.description;
        this.equalJitterBackoffStrategy = $.equalJitterBackoffStrategy;
        this.fixedDelayBackoffStrategy = $.fixedDelayBackoffStrategy;
        this.fullJitterBackoffStrategy = $.fullJitterBackoffStrategy;
        this.identifier = $.identifier;
        this.inheritFromDelegate = $.inheritFromDelegate;
        this.irsa = $.irsa;
        this.manual = $.manual;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsConnectorState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsConnectorState $;

        public Builder() {
            $ = new AwsConnectorState();
        }

        public Builder(AwsConnectorState defaults) {
            $ = new AwsConnectorState(Objects.requireNonNull(defaults));
        }

        /**
         * @param crossAccountAccess Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
         * 
         * @return builder
         * 
         */
        public Builder crossAccountAccess(@Nullable Output<AwsConnectorCrossAccountAccessArgs> crossAccountAccess) {
            $.crossAccountAccess = crossAccountAccess;
            return this;
        }

        /**
         * @param crossAccountAccess Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
         * 
         * @return builder
         * 
         */
        public Builder crossAccountAccess(AwsConnectorCrossAccountAccessArgs crossAccountAccess) {
            return crossAccountAccess(Output.of(crossAccountAccess));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param equalJitterBackoffStrategy Equal Jitter BackOff Strategy.
         * 
         * @return builder
         * 
         */
        public Builder equalJitterBackoffStrategy(@Nullable Output<AwsConnectorEqualJitterBackoffStrategyArgs> equalJitterBackoffStrategy) {
            $.equalJitterBackoffStrategy = equalJitterBackoffStrategy;
            return this;
        }

        /**
         * @param equalJitterBackoffStrategy Equal Jitter BackOff Strategy.
         * 
         * @return builder
         * 
         */
        public Builder equalJitterBackoffStrategy(AwsConnectorEqualJitterBackoffStrategyArgs equalJitterBackoffStrategy) {
            return equalJitterBackoffStrategy(Output.of(equalJitterBackoffStrategy));
        }

        /**
         * @param fixedDelayBackoffStrategy Fixed Delay BackOff Strategy.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelayBackoffStrategy(@Nullable Output<AwsConnectorFixedDelayBackoffStrategyArgs> fixedDelayBackoffStrategy) {
            $.fixedDelayBackoffStrategy = fixedDelayBackoffStrategy;
            return this;
        }

        /**
         * @param fixedDelayBackoffStrategy Fixed Delay BackOff Strategy.
         * 
         * @return builder
         * 
         */
        public Builder fixedDelayBackoffStrategy(AwsConnectorFixedDelayBackoffStrategyArgs fixedDelayBackoffStrategy) {
            return fixedDelayBackoffStrategy(Output.of(fixedDelayBackoffStrategy));
        }

        /**
         * @param fullJitterBackoffStrategy Full Jitter BackOff Strategy.
         * 
         * @return builder
         * 
         */
        public Builder fullJitterBackoffStrategy(@Nullable Output<AwsConnectorFullJitterBackoffStrategyArgs> fullJitterBackoffStrategy) {
            $.fullJitterBackoffStrategy = fullJitterBackoffStrategy;
            return this;
        }

        /**
         * @param fullJitterBackoffStrategy Full Jitter BackOff Strategy.
         * 
         * @return builder
         * 
         */
        public Builder fullJitterBackoffStrategy(AwsConnectorFullJitterBackoffStrategyArgs fullJitterBackoffStrategy) {
            return fullJitterBackoffStrategy(Output.of(fullJitterBackoffStrategy));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param inheritFromDelegate Inherit credentials from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(@Nullable Output<AwsConnectorInheritFromDelegateArgs> inheritFromDelegate) {
            $.inheritFromDelegate = inheritFromDelegate;
            return this;
        }

        /**
         * @param inheritFromDelegate Inherit credentials from the delegate.
         * 
         * @return builder
         * 
         */
        public Builder inheritFromDelegate(AwsConnectorInheritFromDelegateArgs inheritFromDelegate) {
            return inheritFromDelegate(Output.of(inheritFromDelegate));
        }

        /**
         * @param irsa Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder irsa(@Nullable Output<AwsConnectorIrsaArgs> irsa) {
            $.irsa = irsa;
            return this;
        }

        /**
         * @param irsa Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder irsa(AwsConnectorIrsaArgs irsa) {
            return irsa(Output.of(irsa));
        }

        /**
         * @param manual Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder manual(@Nullable Output<AwsConnectorManualArgs> manual) {
            $.manual = manual;
            return this;
        }

        /**
         * @param manual Use IAM role for service accounts.
         * 
         * @return builder
         * 
         */
        public Builder manual(AwsConnectorManualArgs manual) {
            return manual(Output.of(manual));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public AwsConnectorState build() {
            return $;
        }
    }

}
