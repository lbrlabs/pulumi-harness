# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities
from . import outputs
from ._inputs import *

__all__ = ['AwsCCConnectorArgs', 'AwsCCConnector']

@pulumi.input_type
class AwsCCConnectorArgs:
    def __init__(__self__, *,
                 account_id: pulumi.Input[str],
                 cross_account_access: pulumi.Input['AwsCCConnectorCrossAccountAccessArgs'],
                 features_enableds: pulumi.Input[Sequence[pulumi.Input[str]]],
                 identifier: pulumi.Input[str],
                 report_name: pulumi.Input[str],
                 s3_bucket: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a AwsCCConnector resource.
        :param pulumi.Input[str] account_id: The AWS account id.
        :param pulumi.Input['AwsCCConnectorCrossAccountAccessArgs'] cross_account_access: Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features_enableds: The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] report_name: The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        :param pulumi.Input[str] s3_bucket: The name of s3 bucket.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        pulumi.set(__self__, "account_id", account_id)
        pulumi.set(__self__, "cross_account_access", cross_account_access)
        pulumi.set(__self__, "features_enableds", features_enableds)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "report_name", report_name)
        pulumi.set(__self__, "s3_bucket", s3_bucket)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Input[str]:
        """
        The AWS account id.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="crossAccountAccess")
    def cross_account_access(self) -> pulumi.Input['AwsCCConnectorCrossAccountAccessArgs']:
        """
        Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        """
        return pulumi.get(self, "cross_account_access")

    @cross_account_access.setter
    def cross_account_access(self, value: pulumi.Input['AwsCCConnectorCrossAccountAccessArgs']):
        pulumi.set(self, "cross_account_access", value)

    @property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> pulumi.Input[Sequence[pulumi.Input[str]]]:
        """
        The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        """
        return pulumi.get(self, "features_enableds")

    @features_enableds.setter
    def features_enableds(self, value: pulumi.Input[Sequence[pulumi.Input[str]]]):
        pulumi.set(self, "features_enableds", value)

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
    @pulumi.getter(name="reportName")
    def report_name(self) -> pulumi.Input[str]:
        """
        The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        """
        return pulumi.get(self, "report_name")

    @report_name.setter
    def report_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "report_name", value)

    @property
    @pulumi.getter(name="s3Bucket")
    def s3_bucket(self) -> pulumi.Input[str]:
        """
        The name of s3 bucket.
        """
        return pulumi.get(self, "s3_bucket")

    @s3_bucket.setter
    def s3_bucket(self, value: pulumi.Input[str]):
        pulumi.set(self, "s3_bucket", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


@pulumi.input_type
class _AwsCCConnectorState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cross_account_access: Optional[pulumi.Input['AwsCCConnectorCrossAccountAccessArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 report_name: Optional[pulumi.Input[str]] = None,
                 s3_bucket: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering AwsCCConnector resources.
        :param pulumi.Input[str] account_id: The AWS account id.
        :param pulumi.Input['AwsCCConnectorCrossAccountAccessArgs'] cross_account_access: Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features_enableds: The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] report_name: The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        :param pulumi.Input[str] s3_bucket: The name of s3 bucket.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if cross_account_access is not None:
            pulumi.set(__self__, "cross_account_access", cross_account_access)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if features_enableds is not None:
            pulumi.set(__self__, "features_enableds", features_enableds)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if report_name is not None:
            pulumi.set(__self__, "report_name", report_name)
        if s3_bucket is not None:
            pulumi.set(__self__, "s3_bucket", s3_bucket)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AWS account id.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="crossAccountAccess")
    def cross_account_access(self) -> Optional[pulumi.Input['AwsCCConnectorCrossAccountAccessArgs']]:
        """
        Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        """
        return pulumi.get(self, "cross_account_access")

    @cross_account_access.setter
    def cross_account_access(self, value: Optional[pulumi.Input['AwsCCConnectorCrossAccountAccessArgs']]):
        pulumi.set(self, "cross_account_access", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        """
        return pulumi.get(self, "features_enableds")

    @features_enableds.setter
    def features_enableds(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "features_enableds", value)

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
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

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
    @pulumi.getter(name="reportName")
    def report_name(self) -> Optional[pulumi.Input[str]]:
        """
        The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        """
        return pulumi.get(self, "report_name")

    @report_name.setter
    def report_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "report_name", value)

    @property
    @pulumi.getter(name="s3Bucket")
    def s3_bucket(self) -> Optional[pulumi.Input[str]]:
        """
        The name of s3 bucket.
        """
        return pulumi.get(self, "s3_bucket")

    @s3_bucket.setter
    def s3_bucket(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "s3_bucket", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)


class AwsCCConnector(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cross_account_access: Optional[pulumi.Input[pulumi.InputType['AwsCCConnectorCrossAccountAccessArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 report_name: Optional[pulumi.Input[str]] = None,
                 s3_bucket: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for creating an AWS Cloud Cost connector.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account id.
        :param pulumi.Input[pulumi.InputType['AwsCCConnectorCrossAccountAccessArgs']] cross_account_access: Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features_enableds: The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] report_name: The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        :param pulumi.Input[str] s3_bucket: The name of s3 bucket.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AwsCCConnectorArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an AWS Cloud Cost connector.

        :param str resource_name: The name of the resource.
        :param AwsCCConnectorArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AwsCCConnectorArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[str]] = None,
                 cross_account_access: Optional[pulumi.Input[pulumi.InputType['AwsCCConnectorCrossAccountAccessArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 report_name: Optional[pulumi.Input[str]] = None,
                 s3_bucket: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AwsCCConnectorArgs.__new__(AwsCCConnectorArgs)

            if account_id is None and not opts.urn:
                raise TypeError("Missing required property 'account_id'")
            __props__.__dict__["account_id"] = account_id
            if cross_account_access is None and not opts.urn:
                raise TypeError("Missing required property 'cross_account_access'")
            __props__.__dict__["cross_account_access"] = cross_account_access
            __props__.__dict__["description"] = description
            if features_enableds is None and not opts.urn:
                raise TypeError("Missing required property 'features_enableds'")
            __props__.__dict__["features_enableds"] = features_enableds
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["project_id"] = project_id
            if report_name is None and not opts.urn:
                raise TypeError("Missing required property 'report_name'")
            __props__.__dict__["report_name"] = report_name
            if s3_bucket is None and not opts.urn:
                raise TypeError("Missing required property 's3_bucket'")
            __props__.__dict__["s3_bucket"] = s3_bucket
            __props__.__dict__["tags"] = tags
        super(AwsCCConnector, __self__).__init__(
            'harness:platform/awsCCConnector:AwsCCConnector',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[str]] = None,
            cross_account_access: Optional[pulumi.Input[pulumi.InputType['AwsCCConnectorCrossAccountAccessArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            features_enableds: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            report_name: Optional[pulumi.Input[str]] = None,
            s3_bucket: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'AwsCCConnector':
        """
        Get an existing AwsCCConnector resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] account_id: The AWS account id.
        :param pulumi.Input[pulumi.InputType['AwsCCConnectorCrossAccountAccessArgs']] cross_account_access: Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] features_enableds: The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[str] report_name: The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        :param pulumi.Input[str] s3_bucket: The name of s3 bucket.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AwsCCConnectorState.__new__(_AwsCCConnectorState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["cross_account_access"] = cross_account_access
        __props__.__dict__["description"] = description
        __props__.__dict__["features_enableds"] = features_enableds
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["report_name"] = report_name
        __props__.__dict__["s3_bucket"] = s3_bucket
        __props__.__dict__["tags"] = tags
        return AwsCCConnector(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[str]:
        """
        The AWS account id.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="crossAccountAccess")
    def cross_account_access(self) -> pulumi.Output['outputs.AwsCCConnectorCrossAccountAccess']:
        """
        Harness uses the secure cross-account role to access your AWS account. The role includes a restricted policy to access the cost and usage reports and resources for the sole purpose of cost analysis and cost optimization.
        """
        return pulumi.get(self, "cross_account_access")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="featuresEnableds")
    def features_enableds(self) -> pulumi.Output[Sequence[str]]:
        """
        The features enabled for the connector. Valid values are BILLING, OPTIMIZATION, VISIBILITY.
        """
        return pulumi.get(self, "features_enableds")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

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
    @pulumi.getter(name="reportName")
    def report_name(self) -> pulumi.Output[str]:
        """
        The cost and usage report name. Provided in the delivery options when the template is opened in the AWS console.
        """
        return pulumi.get(self, "report_name")

    @property
    @pulumi.getter(name="s3Bucket")
    def s3_bucket(self) -> pulumi.Output[str]:
        """
        The name of s3 bucket.
        """
        return pulumi.get(self, "s3_bucket")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

