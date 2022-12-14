// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserGroupNotificationSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserGroupNotificationSettingsArgs Empty = new UserGroupNotificationSettingsArgs();

    /**
     * The email addresses of the user group.
     * 
     */
    @Import(name="groupEmailAddresses")
    private @Nullable Output<List<String>> groupEmailAddresses;

    /**
     * @return The email addresses of the user group.
     * 
     */
    public Optional<Output<List<String>>> groupEmailAddresses() {
        return Optional.ofNullable(this.groupEmailAddresses);
    }

    /**
     * The Microsoft Teams webhook URL of the user group.
     * 
     */
    @Import(name="microsoftTeamsWebhookUrl")
    private @Nullable Output<String> microsoftTeamsWebhookUrl;

    /**
     * @return The Microsoft Teams webhook URL of the user group.
     * 
     */
    public Optional<Output<String>> microsoftTeamsWebhookUrl() {
        return Optional.ofNullable(this.microsoftTeamsWebhookUrl);
    }

    /**
     * Indicates whether an email is sent when a new user is added to the group.
     * 
     */
    @Import(name="sendMailToNewMembers")
    private @Nullable Output<Boolean> sendMailToNewMembers;

    /**
     * @return Indicates whether an email is sent when a new user is added to the group.
     * 
     */
    public Optional<Output<Boolean>> sendMailToNewMembers() {
        return Optional.ofNullable(this.sendMailToNewMembers);
    }

    /**
     * Enable this setting to have notifications sent to the members of this group.
     * 
     */
    @Import(name="sendNotificationsToMembers")
    private @Nullable Output<Boolean> sendNotificationsToMembers;

    /**
     * @return Enable this setting to have notifications sent to the members of this group.
     * 
     */
    public Optional<Output<Boolean>> sendNotificationsToMembers() {
        return Optional.ofNullable(this.sendNotificationsToMembers);
    }

    /**
     * The Slack channel to send notifications to.
     * 
     */
    @Import(name="slackChannel")
    private @Nullable Output<String> slackChannel;

    /**
     * @return The Slack channel to send notifications to.
     * 
     */
    public Optional<Output<String>> slackChannel() {
        return Optional.ofNullable(this.slackChannel);
    }

    /**
     * The Slack webhook URL to send notifications to.
     * 
     */
    @Import(name="slackWebhookUrl")
    private @Nullable Output<String> slackWebhookUrl;

    /**
     * @return The Slack webhook URL to send notifications to.
     * 
     */
    public Optional<Output<String>> slackWebhookUrl() {
        return Optional.ofNullable(this.slackWebhookUrl);
    }

    private UserGroupNotificationSettingsArgs() {}

    private UserGroupNotificationSettingsArgs(UserGroupNotificationSettingsArgs $) {
        this.groupEmailAddresses = $.groupEmailAddresses;
        this.microsoftTeamsWebhookUrl = $.microsoftTeamsWebhookUrl;
        this.sendMailToNewMembers = $.sendMailToNewMembers;
        this.sendNotificationsToMembers = $.sendNotificationsToMembers;
        this.slackChannel = $.slackChannel;
        this.slackWebhookUrl = $.slackWebhookUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserGroupNotificationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserGroupNotificationSettingsArgs $;

        public Builder() {
            $ = new UserGroupNotificationSettingsArgs();
        }

        public Builder(UserGroupNotificationSettingsArgs defaults) {
            $ = new UserGroupNotificationSettingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupEmailAddresses The email addresses of the user group.
         * 
         * @return builder
         * 
         */
        public Builder groupEmailAddresses(@Nullable Output<List<String>> groupEmailAddresses) {
            $.groupEmailAddresses = groupEmailAddresses;
            return this;
        }

        /**
         * @param groupEmailAddresses The email addresses of the user group.
         * 
         * @return builder
         * 
         */
        public Builder groupEmailAddresses(List<String> groupEmailAddresses) {
            return groupEmailAddresses(Output.of(groupEmailAddresses));
        }

        /**
         * @param groupEmailAddresses The email addresses of the user group.
         * 
         * @return builder
         * 
         */
        public Builder groupEmailAddresses(String... groupEmailAddresses) {
            return groupEmailAddresses(List.of(groupEmailAddresses));
        }

        /**
         * @param microsoftTeamsWebhookUrl The Microsoft Teams webhook URL of the user group.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeamsWebhookUrl(@Nullable Output<String> microsoftTeamsWebhookUrl) {
            $.microsoftTeamsWebhookUrl = microsoftTeamsWebhookUrl;
            return this;
        }

        /**
         * @param microsoftTeamsWebhookUrl The Microsoft Teams webhook URL of the user group.
         * 
         * @return builder
         * 
         */
        public Builder microsoftTeamsWebhookUrl(String microsoftTeamsWebhookUrl) {
            return microsoftTeamsWebhookUrl(Output.of(microsoftTeamsWebhookUrl));
        }

        /**
         * @param sendMailToNewMembers Indicates whether an email is sent when a new user is added to the group.
         * 
         * @return builder
         * 
         */
        public Builder sendMailToNewMembers(@Nullable Output<Boolean> sendMailToNewMembers) {
            $.sendMailToNewMembers = sendMailToNewMembers;
            return this;
        }

        /**
         * @param sendMailToNewMembers Indicates whether an email is sent when a new user is added to the group.
         * 
         * @return builder
         * 
         */
        public Builder sendMailToNewMembers(Boolean sendMailToNewMembers) {
            return sendMailToNewMembers(Output.of(sendMailToNewMembers));
        }

        /**
         * @param sendNotificationsToMembers Enable this setting to have notifications sent to the members of this group.
         * 
         * @return builder
         * 
         */
        public Builder sendNotificationsToMembers(@Nullable Output<Boolean> sendNotificationsToMembers) {
            $.sendNotificationsToMembers = sendNotificationsToMembers;
            return this;
        }

        /**
         * @param sendNotificationsToMembers Enable this setting to have notifications sent to the members of this group.
         * 
         * @return builder
         * 
         */
        public Builder sendNotificationsToMembers(Boolean sendNotificationsToMembers) {
            return sendNotificationsToMembers(Output.of(sendNotificationsToMembers));
        }

        /**
         * @param slackChannel The Slack channel to send notifications to.
         * 
         * @return builder
         * 
         */
        public Builder slackChannel(@Nullable Output<String> slackChannel) {
            $.slackChannel = slackChannel;
            return this;
        }

        /**
         * @param slackChannel The Slack channel to send notifications to.
         * 
         * @return builder
         * 
         */
        public Builder slackChannel(String slackChannel) {
            return slackChannel(Output.of(slackChannel));
        }

        /**
         * @param slackWebhookUrl The Slack webhook URL to send notifications to.
         * 
         * @return builder
         * 
         */
        public Builder slackWebhookUrl(@Nullable Output<String> slackWebhookUrl) {
            $.slackWebhookUrl = slackWebhookUrl;
            return this;
        }

        /**
         * @param slackWebhookUrl The Slack webhook URL to send notifications to.
         * 
         * @return builder
         * 
         */
        public Builder slackWebhookUrl(String slackWebhookUrl) {
            return slackWebhookUrl(Output.of(slackWebhookUrl));
        }

        public UserGroupNotificationSettingsArgs build() {
            return $;
        }
    }

}
