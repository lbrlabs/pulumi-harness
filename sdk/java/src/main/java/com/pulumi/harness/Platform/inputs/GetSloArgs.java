// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSloArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSloArgs Empty = new GetSloArgs();

    /**
     * Identifier of the SLO.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Identifier of the SLO.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Identifier of the organization in which the SLO is configured.
     * 
     */
    @Import(name="orgId", required=true)
    private Output<String> orgId;

    /**
     * @return Identifier of the organization in which the SLO is configured.
     * 
     */
    public Output<String> orgId() {
        return this.orgId;
    }

    /**
     * Identifier of the project in which the SLO is configured.
     * 
     */
    @Import(name="projectId", required=true)
    private Output<String> projectId;

    /**
     * @return Identifier of the project in which the SLO is configured.
     * 
     */
    public Output<String> projectId() {
        return this.projectId;
    }

    private GetSloArgs() {}

    private GetSloArgs(GetSloArgs $) {
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSloArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSloArgs $;

        public Builder() {
            $ = new GetSloArgs();
        }

        public Builder(GetSloArgs defaults) {
            $ = new GetSloArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Identifier of the SLO.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
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
        public Builder orgId(Output<String> orgId) {
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
        public Builder projectId(Output<String> projectId) {
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

        public GetSloArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}