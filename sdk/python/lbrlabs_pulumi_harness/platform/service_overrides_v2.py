# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ServiceOverridesV2Args', 'ServiceOverridesV2']

@pulumi.input_type
class ServiceOverridesV2Args:
    def __init__(__self__, *,
                 env_id: pulumi.Input[str],
                 identifier: pulumi.Input[str],
                 spec: pulumi.Input[str],
                 type: pulumi.Input[str],
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 infra_id: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ServiceOverridesV2 resource.
        :param pulumi.Input[str] env_id: The env ID to which the overrides are associated.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] spec: The overrides specification for the service.
        :param pulumi.Input[str] type: The type of the overrides
        :param pulumi.Input[str] cluster_id: The cluster ID to which the overrides are associated
        :param pulumi.Input[str] infra_id: The infrastructure ID to which the overrides are associated
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        """
        pulumi.set(__self__, "env_id", env_id)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "spec", spec)
        pulumi.set(__self__, "type", type)
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if infra_id is not None:
            pulumi.set(__self__, "infra_id", infra_id)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> pulumi.Input[str]:
        """
        The env ID to which the overrides are associated.
        """
        return pulumi.get(self, "env_id")

    @env_id.setter
    def env_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "env_id", value)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Input[str]:
        """
        The overrides specification for the service.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: pulumi.Input[str]):
        pulumi.set(self, "spec", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        The type of the overrides
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster ID to which the overrides are associated
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="infraId")
    def infra_id(self) -> Optional[pulumi.Input[str]]:
        """
        The infrastructure ID to which the overrides are associated
        """
        return pulumi.get(self, "infra_id")

    @infra_id.setter
    def infra_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "infra_id", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The service ID to which the overrides applies.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)


@pulumi.input_type
class _ServiceOverridesV2State:
    def __init__(__self__, *,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 infra_id: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ServiceOverridesV2 resources.
        :param pulumi.Input[str] cluster_id: The cluster ID to which the overrides are associated
        :param pulumi.Input[str] env_id: The env ID to which the overrides are associated.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] infra_id: The infrastructure ID to which the overrides are associated
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        :param pulumi.Input[str] spec: The overrides specification for the service.
        :param pulumi.Input[str] type: The type of the overrides
        """
        if cluster_id is not None:
            pulumi.set(__self__, "cluster_id", cluster_id)
        if env_id is not None:
            pulumi.set(__self__, "env_id", env_id)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if infra_id is not None:
            pulumi.set(__self__, "infra_id", infra_id)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if service_id is not None:
            pulumi.set(__self__, "service_id", service_id)
        if spec is not None:
            pulumi.set(__self__, "spec", spec)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> Optional[pulumi.Input[str]]:
        """
        The cluster ID to which the overrides are associated
        """
        return pulumi.get(self, "cluster_id")

    @cluster_id.setter
    def cluster_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "cluster_id", value)

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> Optional[pulumi.Input[str]]:
        """
        The env ID to which the overrides are associated.
        """
        return pulumi.get(self, "env_id")

    @env_id.setter
    def env_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "env_id", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter(name="infraId")
    def infra_id(self) -> Optional[pulumi.Input[str]]:
        """
        The infrastructure ID to which the overrides are associated
        """
        return pulumi.get(self, "infra_id")

    @infra_id.setter
    def infra_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "infra_id", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> Optional[pulumi.Input[str]]:
        """
        The service ID to which the overrides applies.
        """
        return pulumi.get(self, "service_id")

    @service_id.setter
    def service_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "service_id", value)

    @property
    @pulumi.getter
    def spec(self) -> Optional[pulumi.Input[str]]:
        """
        The overrides specification for the service.
        """
        return pulumi.get(self, "spec")

    @spec.setter
    def spec(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "spec", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the overrides
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class ServiceOverridesV2(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 infra_id: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a ServiceOverridesV2 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The cluster ID to which the overrides are associated
        :param pulumi.Input[str] env_id: The env ID to which the overrides are associated.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] infra_id: The infrastructure ID to which the overrides are associated
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        :param pulumi.Input[str] spec: The overrides specification for the service.
        :param pulumi.Input[str] type: The type of the overrides
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ServiceOverridesV2Args,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a ServiceOverridesV2 resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param ServiceOverridesV2Args args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ServiceOverridesV2Args, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cluster_id: Optional[pulumi.Input[str]] = None,
                 env_id: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 infra_id: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 service_id: Optional[pulumi.Input[str]] = None,
                 spec: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ServiceOverridesV2Args.__new__(ServiceOverridesV2Args)

            __props__.__dict__["cluster_id"] = cluster_id
            if env_id is None and not opts.urn:
                raise TypeError("Missing required property 'env_id'")
            __props__.__dict__["env_id"] = env_id
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["infra_id"] = infra_id
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["service_id"] = service_id
            if spec is None and not opts.urn:
                raise TypeError("Missing required property 'spec'")
            __props__.__dict__["spec"] = spec
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
        super(ServiceOverridesV2, __self__).__init__(
            'harness:platform/serviceOverridesV2:ServiceOverridesV2',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cluster_id: Optional[pulumi.Input[str]] = None,
            env_id: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            infra_id: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            service_id: Optional[pulumi.Input[str]] = None,
            spec: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'ServiceOverridesV2':
        """
        Get an existing ServiceOverridesV2 resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] cluster_id: The cluster ID to which the overrides are associated
        :param pulumi.Input[str] env_id: The env ID to which the overrides are associated.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] infra_id: The infrastructure ID to which the overrides are associated
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] service_id: The service ID to which the overrides applies.
        :param pulumi.Input[str] spec: The overrides specification for the service.
        :param pulumi.Input[str] type: The type of the overrides
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ServiceOverridesV2State.__new__(_ServiceOverridesV2State)

        __props__.__dict__["cluster_id"] = cluster_id
        __props__.__dict__["env_id"] = env_id
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["infra_id"] = infra_id
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["service_id"] = service_id
        __props__.__dict__["spec"] = spec
        __props__.__dict__["type"] = type
        return ServiceOverridesV2(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clusterId")
    def cluster_id(self) -> pulumi.Output[str]:
        """
        The cluster ID to which the overrides are associated
        """
        return pulumi.get(self, "cluster_id")

    @property
    @pulumi.getter(name="envId")
    def env_id(self) -> pulumi.Output[str]:
        """
        The env ID to which the overrides are associated.
        """
        return pulumi.get(self, "env_id")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="infraId")
    def infra_id(self) -> pulumi.Output[str]:
        """
        The infrastructure ID to which the overrides are associated
        """
        return pulumi.get(self, "infra_id")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter(name="serviceId")
    def service_id(self) -> pulumi.Output[str]:
        """
        The service ID to which the overrides applies.
        """
        return pulumi.get(self, "service_id")

    @property
    @pulumi.getter
    def spec(self) -> pulumi.Output[str]:
        """
        The overrides specification for the service.
        """
        return pulumi.get(self, "spec")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of the overrides
        """
        return pulumi.get(self, "type")
