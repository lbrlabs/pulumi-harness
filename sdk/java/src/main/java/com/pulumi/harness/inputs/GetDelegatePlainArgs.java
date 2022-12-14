// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDelegatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDelegatePlainArgs Empty = new GetDelegatePlainArgs();

    /**
     * The hostname of the delegate.
     * 
     */
    @Import(name="hostname")
    private @Nullable String hostname;

    /**
     * @return The hostname of the delegate.
     * 
     */
    public Optional<String> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Unique identifier of the delegate
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Unique identifier of the delegate
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the delegate to query for.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the delegate to query for.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     * 
     */
    @Import(name="status")
    private @Nullable String status;

    /**
     * @return The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private GetDelegatePlainArgs() {}

    private GetDelegatePlainArgs(GetDelegatePlainArgs $) {
        this.hostname = $.hostname;
        this.id = $.id;
        this.name = $.name;
        this.status = $.status;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDelegatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDelegatePlainArgs $;

        public Builder() {
            $ = new GetDelegatePlainArgs();
        }

        public Builder(GetDelegatePlainArgs defaults) {
            $ = new GetDelegatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hostname The hostname of the delegate.
         * 
         * @return builder
         * 
         */
        public Builder hostname(@Nullable String hostname) {
            $.hostname = hostname;
            return this;
        }

        /**
         * @param id Unique identifier of the delegate
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the delegate to query for.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param status The status of the delegate to query for. Valid values are DELETED, ENABLED, WAITING*FOR*APPROVAL
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable String status) {
            $.status = status;
            return this;
        }

        /**
         * @param type The type of the delegate to query for. Valid values are DOCKER, ECS, HELM*DELEGATE, KUBERNETES, SHELL*SCRIPT
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public GetDelegatePlainArgs build() {
            return $;
        }
    }

}
