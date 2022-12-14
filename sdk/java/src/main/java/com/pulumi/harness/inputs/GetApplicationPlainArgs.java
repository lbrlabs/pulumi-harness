// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApplicationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetApplicationPlainArgs Empty = new GetApplicationPlainArgs();

    /**
     * The application description
     * 
     */
    @Import(name="description")
    private @Nullable String description;

    /**
     * @return The application description
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The id of the git sync connector
     * 
     */
    @Import(name="gitSyncConnectorId")
    private @Nullable String gitSyncConnectorId;

    /**
     * @return The id of the git sync connector
     * 
     */
    public Optional<String> gitSyncConnectorId() {
        return Optional.ofNullable(this.gitSyncConnectorId);
    }

    /**
     * True if git sync is enabled on this application
     * 
     */
    @Import(name="gitSyncEnabled")
    private @Nullable Boolean gitSyncEnabled;

    /**
     * @return True if git sync is enabled on this application
     * 
     */
    public Optional<Boolean> gitSyncEnabled() {
        return Optional.ofNullable(this.gitSyncEnabled);
    }

    /**
     * Unique identifier of the application
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return Unique identifier of the application
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * When this is set to true, all manual triggers will require API Key authorization
     * 
     */
    @Import(name="isManualTriggerAuthorized")
    private @Nullable Boolean isManualTriggerAuthorized;

    /**
     * @return When this is set to true, all manual triggers will require API Key authorization
     * 
     */
    public Optional<Boolean> isManualTriggerAuthorized() {
        return Optional.ofNullable(this.isManualTriggerAuthorized);
    }

    /**
     * The name of the application
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the application
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    private GetApplicationPlainArgs() {}

    private GetApplicationPlainArgs(GetApplicationPlainArgs $) {
        this.description = $.description;
        this.gitSyncConnectorId = $.gitSyncConnectorId;
        this.gitSyncEnabled = $.gitSyncEnabled;
        this.id = $.id;
        this.isManualTriggerAuthorized = $.isManualTriggerAuthorized;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetApplicationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetApplicationPlainArgs $;

        public Builder() {
            $ = new GetApplicationPlainArgs();
        }

        public Builder(GetApplicationPlainArgs defaults) {
            $ = new GetApplicationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The application description
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable String description) {
            $.description = description;
            return this;
        }

        /**
         * @param gitSyncConnectorId The id of the git sync connector
         * 
         * @return builder
         * 
         */
        public Builder gitSyncConnectorId(@Nullable String gitSyncConnectorId) {
            $.gitSyncConnectorId = gitSyncConnectorId;
            return this;
        }

        /**
         * @param gitSyncEnabled True if git sync is enabled on this application
         * 
         * @return builder
         * 
         */
        public Builder gitSyncEnabled(@Nullable Boolean gitSyncEnabled) {
            $.gitSyncEnabled = gitSyncEnabled;
            return this;
        }

        /**
         * @param id Unique identifier of the application
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param isManualTriggerAuthorized When this is set to true, all manual triggers will require API Key authorization
         * 
         * @return builder
         * 
         */
        public Builder isManualTriggerAuthorized(@Nullable Boolean isManualTriggerAuthorized) {
            $.isManualTriggerAuthorized = isManualTriggerAuthorized;
            return this;
        }

        /**
         * @param name The name of the application
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public GetApplicationPlainArgs build() {
            return $;
        }
    }

}
