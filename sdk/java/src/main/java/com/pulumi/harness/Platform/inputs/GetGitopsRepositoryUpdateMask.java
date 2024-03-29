// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsRepositoryUpdateMask extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsRepositoryUpdateMask Empty = new GetGitopsRepositoryUpdateMask();

    /**
     * The set of field mask paths.
     * 
     */
    @Import(name="paths")
    private @Nullable List<String> paths;

    /**
     * @return The set of field mask paths.
     * 
     */
    public Optional<List<String>> paths() {
        return Optional.ofNullable(this.paths);
    }

    private GetGitopsRepositoryUpdateMask() {}

    private GetGitopsRepositoryUpdateMask(GetGitopsRepositoryUpdateMask $) {
        this.paths = $.paths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsRepositoryUpdateMask defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsRepositoryUpdateMask $;

        public Builder() {
            $ = new GetGitopsRepositoryUpdateMask();
        }

        public Builder(GetGitopsRepositoryUpdateMask defaults) {
            $ = new GetGitopsRepositoryUpdateMask(Objects.requireNonNull(defaults));
        }

        /**
         * @param paths The set of field mask paths.
         * 
         * @return builder
         * 
         */
        public Builder paths(@Nullable List<String> paths) {
            $.paths = paths;
            return this;
        }

        /**
         * @param paths The set of field mask paths.
         * 
         * @return builder
         * 
         */
        public Builder paths(String... paths) {
            return paths(List.of(paths));
        }

        public GetGitopsRepositoryUpdateMask build() {
            return $;
        }
    }

}
