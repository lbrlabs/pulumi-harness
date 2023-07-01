// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.FeatureFlagGitDetailsArgs;
import com.pulumi.harness.platform.inputs.FeatureFlagVariationArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FeatureFlagState extends com.pulumi.resources.ResourceArgs {

    public static final FeatureFlagState Empty = new FeatureFlagState();

    /**
     * Whether or not the flag is archived
     * 
     */
    @Import(name="archived")
    private @Nullable Output<Boolean> archived;

    /**
     * @return Whether or not the flag is archived
     * 
     */
    public Optional<Output<Boolean>> archived() {
        return Optional.ofNullable(this.archived);
    }

    /**
     * Which of the variations to use when the flag is toggled to off state
     * 
     */
    @Import(name="defaultOffVariation")
    private @Nullable Output<String> defaultOffVariation;

    /**
     * @return Which of the variations to use when the flag is toggled to off state
     * 
     */
    public Optional<Output<String>> defaultOffVariation() {
        return Optional.ofNullable(this.defaultOffVariation);
    }

    /**
     * Which of the variations to use when the flag is toggled to on state
     * 
     */
    @Import(name="defaultOnVariation")
    private @Nullable Output<String> defaultOnVariation;

    /**
     * @return Which of the variations to use when the flag is toggled to on state
     * 
     */
    public Optional<Output<String>> defaultOnVariation() {
        return Optional.ofNullable(this.defaultOnVariation);
    }

    @Import(name="gitDetails")
    private @Nullable Output<FeatureFlagGitDetailsArgs> gitDetails;

    public Optional<Output<FeatureFlagGitDetailsArgs>> gitDetails() {
        return Optional.ofNullable(this.gitDetails);
    }

    /**
     * Identifier of the Feature Flag
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier of the Feature Flag
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the Feature Flag
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the Feature Flag
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Organization Identifier
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization Identifier
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * The owner of the flag
     * 
     */
    @Import(name="owner")
    private @Nullable Output<String> owner;

    /**
     * @return The owner of the flag
     * 
     */
    public Optional<Output<String>> owner() {
        return Optional.ofNullable(this.owner);
    }

    /**
     * Whether or not the flag is permanent. If it is, it will never be flagged as stale
     * 
     */
    @Import(name="permanent")
    private @Nullable Output<Boolean> permanent;

    /**
     * @return Whether or not the flag is permanent. If it is, it will never be flagged as stale
     * 
     */
    public Optional<Output<Boolean>> permanent() {
        return Optional.ofNullable(this.permanent);
    }

    /**
     * Project Identifier
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The options available for your flag
     * 
     */
    @Import(name="variations")
    private @Nullable Output<List<FeatureFlagVariationArgs>> variations;

    /**
     * @return The options available for your flag
     * 
     */
    public Optional<Output<List<FeatureFlagVariationArgs>>> variations() {
        return Optional.ofNullable(this.variations);
    }

    private FeatureFlagState() {}

    private FeatureFlagState(FeatureFlagState $) {
        this.archived = $.archived;
        this.defaultOffVariation = $.defaultOffVariation;
        this.defaultOnVariation = $.defaultOnVariation;
        this.gitDetails = $.gitDetails;
        this.identifier = $.identifier;
        this.kind = $.kind;
        this.name = $.name;
        this.orgId = $.orgId;
        this.owner = $.owner;
        this.permanent = $.permanent;
        this.projectId = $.projectId;
        this.variations = $.variations;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FeatureFlagState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FeatureFlagState $;

        public Builder() {
            $ = new FeatureFlagState();
        }

        public Builder(FeatureFlagState defaults) {
            $ = new FeatureFlagState(Objects.requireNonNull(defaults));
        }

        /**
         * @param archived Whether or not the flag is archived
         * 
         * @return builder
         * 
         */
        public Builder archived(@Nullable Output<Boolean> archived) {
            $.archived = archived;
            return this;
        }

        /**
         * @param archived Whether or not the flag is archived
         * 
         * @return builder
         * 
         */
        public Builder archived(Boolean archived) {
            return archived(Output.of(archived));
        }

        /**
         * @param defaultOffVariation Which of the variations to use when the flag is toggled to off state
         * 
         * @return builder
         * 
         */
        public Builder defaultOffVariation(@Nullable Output<String> defaultOffVariation) {
            $.defaultOffVariation = defaultOffVariation;
            return this;
        }

        /**
         * @param defaultOffVariation Which of the variations to use when the flag is toggled to off state
         * 
         * @return builder
         * 
         */
        public Builder defaultOffVariation(String defaultOffVariation) {
            return defaultOffVariation(Output.of(defaultOffVariation));
        }

        /**
         * @param defaultOnVariation Which of the variations to use when the flag is toggled to on state
         * 
         * @return builder
         * 
         */
        public Builder defaultOnVariation(@Nullable Output<String> defaultOnVariation) {
            $.defaultOnVariation = defaultOnVariation;
            return this;
        }

        /**
         * @param defaultOnVariation Which of the variations to use when the flag is toggled to on state
         * 
         * @return builder
         * 
         */
        public Builder defaultOnVariation(String defaultOnVariation) {
            return defaultOnVariation(Output.of(defaultOnVariation));
        }

        public Builder gitDetails(@Nullable Output<FeatureFlagGitDetailsArgs> gitDetails) {
            $.gitDetails = gitDetails;
            return this;
        }

        public Builder gitDetails(FeatureFlagGitDetailsArgs gitDetails) {
            return gitDetails(Output.of(gitDetails));
        }

        /**
         * @param identifier Identifier of the Feature Flag
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the Feature Flag
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param kind The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the Feature Flag
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the Feature Flag
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization Identifier
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param owner The owner of the flag
         * 
         * @return builder
         * 
         */
        public Builder owner(@Nullable Output<String> owner) {
            $.owner = owner;
            return this;
        }

        /**
         * @param owner The owner of the flag
         * 
         * @return builder
         * 
         */
        public Builder owner(String owner) {
            return owner(Output.of(owner));
        }

        /**
         * @param permanent Whether or not the flag is permanent. If it is, it will never be flagged as stale
         * 
         * @return builder
         * 
         */
        public Builder permanent(@Nullable Output<Boolean> permanent) {
            $.permanent = permanent;
            return this;
        }

        /**
         * @param permanent Whether or not the flag is permanent. If it is, it will never be flagged as stale
         * 
         * @return builder
         * 
         */
        public Builder permanent(Boolean permanent) {
            return permanent(Output.of(permanent));
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param variations The options available for your flag
         * 
         * @return builder
         * 
         */
        public Builder variations(@Nullable Output<List<FeatureFlagVariationArgs>> variations) {
            $.variations = variations;
            return this;
        }

        /**
         * @param variations The options available for your flag
         * 
         * @return builder
         * 
         */
        public Builder variations(List<FeatureFlagVariationArgs> variations) {
            return variations(Output.of(variations));
        }

        /**
         * @param variations The options available for your flag
         * 
         * @return builder
         * 
         */
        public Builder variations(FeatureFlagVariationArgs... variations) {
            return variations(List.of(variations));
        }

        public FeatureFlagState build() {
            return $;
        }
    }

}
