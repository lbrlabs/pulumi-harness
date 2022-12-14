// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AddUserToGroupState extends com.pulumi.resources.ResourceArgs {

    public static final AddUserToGroupState Empty = new AddUserToGroupState();

    /**
     * The name of the user.
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return The name of the user.
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Unique identifier of the user.
     * 
     */
    @Import(name="userId")
    private @Nullable Output<String> userId;

    /**
     * @return Unique identifier of the user.
     * 
     */
    public Optional<Output<String>> userId() {
        return Optional.ofNullable(this.userId);
    }

    private AddUserToGroupState() {}

    private AddUserToGroupState(AddUserToGroupState $) {
        this.groupId = $.groupId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AddUserToGroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AddUserToGroupState $;

        public Builder() {
            $ = new AddUserToGroupState();
        }

        public Builder(AddUserToGroupState defaults) {
            $ = new AddUserToGroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param groupId The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId The name of the user.
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param userId Unique identifier of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(@Nullable Output<String> userId) {
            $.userId = userId;
            return this;
        }

        /**
         * @param userId Unique identifier of the user.
         * 
         * @return builder
         * 
         */
        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public AddUserToGroupState build() {
            return $;
        }
    }

}
