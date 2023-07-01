// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsConnectorEqualJitterBackoffStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsConnectorEqualJitterBackoffStrategyArgs Empty = new AwsConnectorEqualJitterBackoffStrategyArgs();

    /**
     * Base delay.
     * 
     */
    @Import(name="baseDelay")
    private @Nullable Output<Integer> baseDelay;

    /**
     * @return Base delay.
     * 
     */
    public Optional<Output<Integer>> baseDelay() {
        return Optional.ofNullable(this.baseDelay);
    }

    /**
     * Max BackOff Time.
     * 
     */
    @Import(name="maxBackoffTime")
    private @Nullable Output<Integer> maxBackoffTime;

    /**
     * @return Max BackOff Time.
     * 
     */
    public Optional<Output<Integer>> maxBackoffTime() {
        return Optional.ofNullable(this.maxBackoffTime);
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

    private AwsConnectorEqualJitterBackoffStrategyArgs() {}

    private AwsConnectorEqualJitterBackoffStrategyArgs(AwsConnectorEqualJitterBackoffStrategyArgs $) {
        this.baseDelay = $.baseDelay;
        this.maxBackoffTime = $.maxBackoffTime;
        this.retryCount = $.retryCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsConnectorEqualJitterBackoffStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsConnectorEqualJitterBackoffStrategyArgs $;

        public Builder() {
            $ = new AwsConnectorEqualJitterBackoffStrategyArgs();
        }

        public Builder(AwsConnectorEqualJitterBackoffStrategyArgs defaults) {
            $ = new AwsConnectorEqualJitterBackoffStrategyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param baseDelay Base delay.
         * 
         * @return builder
         * 
         */
        public Builder baseDelay(@Nullable Output<Integer> baseDelay) {
            $.baseDelay = baseDelay;
            return this;
        }

        /**
         * @param baseDelay Base delay.
         * 
         * @return builder
         * 
         */
        public Builder baseDelay(Integer baseDelay) {
            return baseDelay(Output.of(baseDelay));
        }

        /**
         * @param maxBackoffTime Max BackOff Time.
         * 
         * @return builder
         * 
         */
        public Builder maxBackoffTime(@Nullable Output<Integer> maxBackoffTime) {
            $.maxBackoffTime = maxBackoffTime;
            return this;
        }

        /**
         * @param maxBackoffTime Max BackOff Time.
         * 
         * @return builder
         * 
         */
        public Builder maxBackoffTime(Integer maxBackoffTime) {
            return maxBackoffTime(Output.of(maxBackoffTime));
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

        public AwsConnectorEqualJitterBackoffStrategyArgs build() {
            return $;
        }
    }

}
