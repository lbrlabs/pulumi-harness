// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

// Export members:
export { AmiArgs, AmiState } from "./ami";
export type Ami = import("./ami").Ami;
export const Ami: typeof import("./ami").Ami = null as any;

export { CodedeployArgs, CodedeployState } from "./codedeploy";
export type Codedeploy = import("./codedeploy").Codedeploy;
export const Codedeploy: typeof import("./codedeploy").Codedeploy = null as any;

export { EcsArgs, EcsState } from "./ecs";
export type Ecs = import("./ecs").Ecs;
export const Ecs: typeof import("./ecs").Ecs = null as any;

export { HelmArgs, HelmState } from "./helm";
export type Helm = import("./helm").Helm;
export const Helm: typeof import("./helm").Helm = null as any;

export { KubernetesArgs, KubernetesState } from "./kubernetes";
export type Kubernetes = import("./kubernetes").Kubernetes;
export const Kubernetes: typeof import("./kubernetes").Kubernetes = null as any;

export { LambdaArgs, LambdaState } from "./lambda";
export type Lambda = import("./lambda").Lambda;
export const Lambda: typeof import("./lambda").Lambda = null as any;

export { SshArgs, SshState } from "./ssh";
export type Ssh = import("./ssh").Ssh;
export const Ssh: typeof import("./ssh").Ssh = null as any;

export { TanzuArgs, TanzuState } from "./tanzu";
export type Tanzu = import("./tanzu").Tanzu;
export const Tanzu: typeof import("./tanzu").Tanzu = null as any;

export { WinrmArgs, WinrmState } from "./winrm";
export type Winrm = import("./winrm").Winrm;
export const Winrm: typeof import("./winrm").Winrm = null as any;

utilities.lazyLoad(exports, ["Ami"], () => require("./ami"));
utilities.lazyLoad(exports, ["Codedeploy"], () => require("./codedeploy"));
utilities.lazyLoad(exports, ["Ecs"], () => require("./ecs"));
utilities.lazyLoad(exports, ["Helm"], () => require("./helm"));
utilities.lazyLoad(exports, ["Kubernetes"], () => require("./kubernetes"));
utilities.lazyLoad(exports, ["Lambda"], () => require("./lambda"));
utilities.lazyLoad(exports, ["Ssh"], () => require("./ssh"));
utilities.lazyLoad(exports, ["Tanzu"], () => require("./tanzu"));
utilities.lazyLoad(exports, ["Winrm"], () => require("./winrm"));

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "harness:service/ami:Ami":
                return new Ami(name, <any>undefined, { urn })
            case "harness:service/codedeploy:Codedeploy":
                return new Codedeploy(name, <any>undefined, { urn })
            case "harness:service/ecs:Ecs":
                return new Ecs(name, <any>undefined, { urn })
            case "harness:service/helm:Helm":
                return new Helm(name, <any>undefined, { urn })
            case "harness:service/kubernetes:Kubernetes":
                return new Kubernetes(name, <any>undefined, { urn })
            case "harness:service/lambda:Lambda":
                return new Lambda(name, <any>undefined, { urn })
            case "harness:service/ssh:Ssh":
                return new Ssh(name, <any>undefined, { urn })
            case "harness:service/tanzu:Tanzu":
                return new Tanzu(name, <any>undefined, { urn })
            case "harness:service/winrm:Winrm":
                return new Winrm(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("harness", "service/ami", _module)
pulumi.runtime.registerResourceModule("harness", "service/codedeploy", _module)
pulumi.runtime.registerResourceModule("harness", "service/ecs", _module)
pulumi.runtime.registerResourceModule("harness", "service/helm", _module)
pulumi.runtime.registerResourceModule("harness", "service/kubernetes", _module)
pulumi.runtime.registerResourceModule("harness", "service/lambda", _module)
pulumi.runtime.registerResourceModule("harness", "service/ssh", _module)
pulumi.runtime.registerResourceModule("harness", "service/tanzu", _module)
pulumi.runtime.registerResourceModule("harness", "service/winrm", _module)
