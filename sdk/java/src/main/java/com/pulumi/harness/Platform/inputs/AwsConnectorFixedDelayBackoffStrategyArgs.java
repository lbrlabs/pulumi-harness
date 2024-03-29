// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsConnectorFixedDelayBackoffStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsConnectorFixedDelayBackoffStrategyArgs Empty = new AwsConnectorFixedDelayBackoffStrategyArgs();

    /**
     * Fixed Backoff.
     * 
     */
    @Import(name="fixedBackoff")
    private @Nullable Output<Integer> fixedBackoff;

    /**
     * @return Fixed Backoff.
     * 
     */
    public Optional<Output<Integer>> fixedBackoff() {
        return Optional.ofNullable(this.fixedBackoff);
    }

    /**
     * Retry Count.
     * 
     */
    @Import(name="retryCount")
    private @Nullable Output<Integer> retryCount;

    /**
     * @return Retry Count.
     * 
     */
    public Optional<Output<Integer>> retryCount() {
        return Optional.ofNullable(this.retryCount);
    }

    private AwsConnectorFixedDelayBackoffStrategyArgs() {}

    private AwsConnectorFixedDelayBackoffStrategyArgs(AwsConnectorFixedDelayBackoffStrategyArgs $) {
        this.fixedBackoff = $.fixedBackoff;
        this.retryCount = $.retryCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsConnectorFixedDelayBackoffStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsConnectorFixedDelayBackoffStrategyArgs $;

        public Builder() {
            $ = new AwsConnectorFixedDelayBackoffStrategyArgs();
        }

        public Builder(AwsConnectorFixedDelayBackoffStrategyArgs defaults) {
            $ = new AwsConnectorFixedDelayBackoffStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fixedBackoff Fixed Backoff.
         * 
         * @return builder
         * 
         */
        public Builder fixedBackoff(@Nullable Output<Integer> fixedBackoff) {
            $.fixedBackoff = fixedBackoff;
            return this;
        }

        /**
         * @param fixedBackoff Fixed Backoff.
         * 
         * @return builder
         * 
         */
        public Builder fixedBackoff(Integer fixedBackoff) {
            return fixedBackoff(Output.of(fixedBackoff));
        }

        /**
         * @param retryCount Retry Count.
         * 
         * @return builder
         * 
         */
        public Builder retryCount(@Nullable Output<Integer> retryCount) {
            $.retryCount = retryCount;
            return this;
        }

        /**
         * @param retryCount Retry Count.
         * 
         * @return builder
         * 
         */
        public Builder retryCount(Integer retryCount) {
            return retryCount(Output.of(retryCount));
        }

        public AwsConnectorFixedDelayBackoffStrategyArgs build() {
            return $;
        }
    }

}
