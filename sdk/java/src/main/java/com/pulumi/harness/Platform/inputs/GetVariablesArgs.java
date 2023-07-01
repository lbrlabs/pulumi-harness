// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVariablesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVariablesArgs Empty = new GetVariablesArgs();

    /**
     * Unique identifier of the resource
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Organization Identifier for the Entity
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Organization Identifier for the Entity
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Project Identifier for the Entity
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier for the Entity
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    private GetVariablesArgs() {}

    private GetVariablesArgs(GetVariablesArgs $) {
        this.identifier = $.identifier;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVariablesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVariablesArgs $;

        public Builder() {
            $ = new GetVariablesArgs();
        }

        public Builder(GetVariablesArgs defaults) {
            $ = new GetVariablesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param orgId Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Organization Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier for the Entity
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public GetVariablesArgs build() {
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            return $;
        }
    }

}
