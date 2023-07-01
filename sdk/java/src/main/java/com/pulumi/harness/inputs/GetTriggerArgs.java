// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTriggerArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTriggerArgs Empty = new GetTriggerArgs();

    /**
     * The id of the application.
     * 
     */
    @Import(name="appId")
    private @Nullable Output<String> appId;

    /**
     * @return The id of the application.
     * 
     */
    public Optional<Output<String>> appId() {
        return Optional.ofNullable(this.appId);
    }

    /**
     * The trigger description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The trigger description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the trigger.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return Unique identifier of the trigger.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the trigger.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the trigger.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private GetTriggerArgs() {}

    private GetTriggerArgs(GetTriggerArgs $) {
        this.appId = $.appId;
        this.description = $.description;
        this.id = $.id;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTriggerArgs $;

        public Builder() {
            $ = new GetTriggerArgs();
        }

        public Builder(GetTriggerArgs defaults) {
            $ = new GetTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param appId The id of the application.
         * 
         * @return builder
         * 
         */
        public Builder appId(@Nullable Output<String> appId) {
            $.appId = appId;
            return this;
        }

        /**
         * @param appId The id of the application.
         * 
         * @return builder
         * 
         */
        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param description The trigger description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The trigger description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param id Unique identifier of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Unique identifier of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param name The name of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetTriggerArgs build() {
            return $;
        }
    }

}