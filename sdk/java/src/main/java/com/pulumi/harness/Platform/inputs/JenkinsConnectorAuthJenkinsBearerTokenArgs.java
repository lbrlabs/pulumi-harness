// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class JenkinsConnectorAuthJenkinsBearerTokenArgs extends com.pulumi.resources.ResourceArgs {

    public static final JenkinsConnectorAuthJenkinsBearerTokenArgs Empty = new JenkinsConnectorAuthJenkinsBearerTokenArgs();

    @Import(name="tokenRef", required=true)
    private Output<String> tokenRef;

    public Output<String> tokenRef() {
        return this.tokenRef;
    }

    private JenkinsConnectorAuthJenkinsBearerTokenArgs() {}

    private JenkinsConnectorAuthJenkinsBearerTokenArgs(JenkinsConnectorAuthJenkinsBearerTokenArgs $) {
        this.tokenRef = $.tokenRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JenkinsConnectorAuthJenkinsBearerTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JenkinsConnectorAuthJenkinsBearerTokenArgs $;

        public Builder() {
            $ = new JenkinsConnectorAuthJenkinsBearerTokenArgs();
        }

        public Builder(JenkinsConnectorAuthJenkinsBearerTokenArgs defaults) {
            $ = new JenkinsConnectorAuthJenkinsBearerTokenArgs(Objects.requireNonNull(defaults));
        }

        public Builder tokenRef(Output<String> tokenRef) {
            $.tokenRef = tokenRef;
            return this;
        }

        public Builder tokenRef(String tokenRef) {
            return tokenRef(Output.of(tokenRef));
        }

        public JenkinsConnectorAuthJenkinsBearerTokenArgs build() {
            $.tokenRef = Objects.requireNonNull($.tokenRef, "expected parameter 'tokenRef' to be non-null");
            return $;
        }
    }

}
