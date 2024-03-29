// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.SloRequestArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SloState extends com.pulumi.resources.ResourceArgs {

    public static final SloState Empty = new SloState();

    /**
     * Identifier of the SLO.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier of the SLO.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Identifier of the organization in which the SLO is configured.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Identifier of the organization in which the SLO is configured.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Identifier of the project in which the SLO is configured.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Identifier of the project in which the SLO is configured.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Request for creating or updating SLO.
     * 
     */
    @Import(name="request")
    private @Nullable Output<SloRequestArgs> request;

    /**
     * @return Request for creating or updating SLO.
     * 
     */
    public Optional<Output<SloRequestArgs>> request() {
        return Optional.ofNullable(this.request);
    }

    private SloState() {}

    private SloState(SloState $) {
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.request = $.request;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SloState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SloState $;

        public Builder() {
            $ = new SloState();
        }

        public Builder(SloState defaults) {
            $ = new SloState(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Identifier of the SLO.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier of the SLO.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Identifier of the organization in which the SLO is configured.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Identifier of the organization in which the SLO is configured.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Identifier of the project in which the SLO is configured.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Identifier of the project in which the SLO is configured.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param request Request for creating or updating SLO.
         * 
         * @return builder
         * 
         */
        public Builder request(@Nullable Output<SloRequestArgs> request) {
            $.request = request;
            return this;
        }

        /**
         * @param request Request for creating or updating SLO.
         * 
         * @return builder
         * 
         */
        public Builder request(SloRequestArgs request) {
            return request(Output.of(request));
        }

        public SloState build() {
            return $;
        }
    }

}
