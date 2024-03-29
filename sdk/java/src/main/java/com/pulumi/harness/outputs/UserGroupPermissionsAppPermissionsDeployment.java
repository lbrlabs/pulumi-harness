// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UserGroupPermissionsAppPermissionsDeployment {
    private List<String> actions;
    private @Nullable List<String> appIds;
    private @Nullable List<String> envIds;
    private @Nullable List<String> filters;

    private UserGroupPermissionsAppPermissionsDeployment() {}
    public List<String> actions() {
        return this.actions;
    }
    public List<String> appIds() {
        return this.appIds == null ? List.of() : this.appIds;
    }
    public List<String> envIds() {
        return this.envIds == null ? List.of() : this.envIds;
    }
    public List<String> filters() {
        return this.filters == null ? List.of() : this.filters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupPermissionsAppPermissionsDeployment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> actions;
        private @Nullable List<String> appIds;
        private @Nullable List<String> envIds;
        private @Nullable List<String> filters;
        public Builder() {}
        public Builder(UserGroupPermissionsAppPermissionsDeployment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.appIds = defaults.appIds;
    	      this.envIds = defaults.envIds;
    	      this.filters = defaults.filters;
        }

        @CustomType.Setter
        public Builder actions(List<String> actions) {
            this.actions = Objects.requireNonNull(actions);
            return this;
        }
        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }
        @CustomType.Setter
        public Builder appIds(@Nullable List<String> appIds) {
            this.appIds = appIds;
            return this;
        }
        public Builder appIds(String... appIds) {
            return appIds(List.of(appIds));
        }
        @CustomType.Setter
        public Builder envIds(@Nullable List<String> envIds) {
            this.envIds = envIds;
            return this;
        }
        public Builder envIds(String... envIds) {
            return envIds(List.of(envIds));
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }
        public UserGroupPermissionsAppPermissionsDeployment build() {
            final var o = new UserGroupPermissionsAppPermissionsDeployment();
            o.actions = actions;
            o.appIds = appIds;
            o.envIds = envIds;
            o.filters = filters;
            return o;
        }
    }
}
