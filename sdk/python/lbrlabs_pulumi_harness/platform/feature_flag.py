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

__all__ = ['FeatureFlagArgs', 'FeatureFlag']

@pulumi.input_type
class FeatureFlagArgs:
    def __init__(__self__, *,
                 default_off_variation: pulumi.Input[str],
                 default_on_variation: pulumi.Input[str],
                 identifier: pulumi.Input[str],
                 kind: pulumi.Input[str],
                 org_id: pulumi.Input[str],
                 permanent: pulumi.Input[bool],
                 project_id: pulumi.Input[str],
                 variations: pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]],
                 archived: Optional[pulumi.Input[bool]] = None,
                 git_details: Optional[pulumi.Input['FeatureFlagGitDetailsArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a FeatureFlag resource.
        :param pulumi.Input[str] default_off_variation: Which of the variations to use when the flag is toggled to off state
        :param pulumi.Input[str] default_on_variation: Which of the variations to use when the flag is toggled to on state
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag
        :param pulumi.Input[str] kind: The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[bool] permanent: Whether or not the flag is permanent. If it is, it will never be flagged as stale
        :param pulumi.Input[str] project_id: Project Identifier
        :param pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]] variations: The options available for your flag
        :param pulumi.Input[bool] archived: Whether or not the flag is archived
        :param pulumi.Input[str] name: Name of the Feature Flag
        :param pulumi.Input[str] owner: The owner of the flag
        """
        pulumi.set(__self__, "default_off_variation", default_off_variation)
        pulumi.set(__self__, "default_on_variation", default_on_variation)
        pulumi.set(__self__, "identifier", identifier)
        pulumi.set(__self__, "kind", kind)
        pulumi.set(__self__, "org_id", org_id)
        pulumi.set(__self__, "permanent", permanent)
        pulumi.set(__self__, "project_id", project_id)
        pulumi.set(__self__, "variations", variations)
        if archived is not None:
            pulumi.set(__self__, "archived", archived)
        if git_details is not None:
            pulumi.set(__self__, "git_details", git_details)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)

    @property
    @pulumi.getter(name="defaultOffVariation")
    def default_off_variation(self) -> pulumi.Input[str]:
        """
        Which of the variations to use when the flag is toggled to off state
        """
        return pulumi.get(self, "default_off_variation")

    @default_off_variation.setter
    def default_off_variation(self, value: pulumi.Input[str]):
        pulumi.set(self, "default_off_variation", value)

    @property
    @pulumi.getter(name="defaultOnVariation")
    def default_on_variation(self) -> pulumi.Input[str]:
        """
        Which of the variations to use when the flag is toggled to on state
        """
        return pulumi.get(self, "default_on_variation")

    @default_on_variation.setter
    def default_on_variation(self, value: pulumi.Input[str]):
        pulumi.set(self, "default_on_variation", value)

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Input[str]:
        """
        Identifier of the Feature Flag
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: pulumi.Input[str]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Input[str]:
        """
        The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: pulumi.Input[str]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Input[str]:
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def permanent(self) -> pulumi.Input[bool]:
        """
        Whether or not the flag is permanent. If it is, it will never be flagged as stale
        """
        return pulumi.get(self, "permanent")

    @permanent.setter
    def permanent(self, value: pulumi.Input[bool]):
        pulumi.set(self, "permanent", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Input[str]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def variations(self) -> pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]]:
        """
        The options available for your flag
        """
        return pulumi.get(self, "variations")

    @variations.setter
    def variations(self, value: pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]]):
        pulumi.set(self, "variations", value)

    @property
    @pulumi.getter
    def archived(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not the flag is archived
        """
        return pulumi.get(self, "archived")

    @archived.setter
    def archived(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "archived", value)

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> Optional[pulumi.Input['FeatureFlagGitDetailsArgs']]:
        return pulumi.get(self, "git_details")

    @git_details.setter
    def git_details(self, value: Optional[pulumi.Input['FeatureFlagGitDetailsArgs']]):
        pulumi.set(self, "git_details", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Feature Flag
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        The owner of the flag
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)


@pulumi.input_type
class _FeatureFlagState:
    def __init__(__self__, *,
                 archived: Optional[pulumi.Input[bool]] = None,
                 default_off_variation: Optional[pulumi.Input[str]] = None,
                 default_on_variation: Optional[pulumi.Input[str]] = None,
                 git_details: Optional[pulumi.Input['FeatureFlagGitDetailsArgs']] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 permanent: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 variations: Optional[pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]]] = None):
        """
        Input properties used for looking up and filtering FeatureFlag resources.
        :param pulumi.Input[bool] archived: Whether or not the flag is archived
        :param pulumi.Input[str] default_off_variation: Which of the variations to use when the flag is toggled to off state
        :param pulumi.Input[str] default_on_variation: Which of the variations to use when the flag is toggled to on state
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag
        :param pulumi.Input[str] kind: The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
        :param pulumi.Input[str] name: Name of the Feature Flag
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[str] owner: The owner of the flag
        :param pulumi.Input[bool] permanent: Whether or not the flag is permanent. If it is, it will never be flagged as stale
        :param pulumi.Input[str] project_id: Project Identifier
        :param pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]] variations: The options available for your flag
        """
        if archived is not None:
            pulumi.set(__self__, "archived", archived)
        if default_off_variation is not None:
            pulumi.set(__self__, "default_off_variation", default_off_variation)
        if default_on_variation is not None:
            pulumi.set(__self__, "default_on_variation", default_on_variation)
        if git_details is not None:
            pulumi.set(__self__, "git_details", git_details)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if kind is not None:
            pulumi.set(__self__, "kind", kind)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if owner is not None:
            pulumi.set(__self__, "owner", owner)
        if permanent is not None:
            pulumi.set(__self__, "permanent", permanent)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if variations is not None:
            pulumi.set(__self__, "variations", variations)

    @property
    @pulumi.getter
    def archived(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not the flag is archived
        """
        return pulumi.get(self, "archived")

    @archived.setter
    def archived(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "archived", value)

    @property
    @pulumi.getter(name="defaultOffVariation")
    def default_off_variation(self) -> Optional[pulumi.Input[str]]:
        """
        Which of the variations to use when the flag is toggled to off state
        """
        return pulumi.get(self, "default_off_variation")

    @default_off_variation.setter
    def default_off_variation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_off_variation", value)

    @property
    @pulumi.getter(name="defaultOnVariation")
    def default_on_variation(self) -> Optional[pulumi.Input[str]]:
        """
        Which of the variations to use when the flag is toggled to on state
        """
        return pulumi.get(self, "default_on_variation")

    @default_on_variation.setter
    def default_on_variation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "default_on_variation", value)

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> Optional[pulumi.Input['FeatureFlagGitDetailsArgs']]:
        return pulumi.get(self, "git_details")

    @git_details.setter
    def git_details(self, value: Optional[pulumi.Input['FeatureFlagGitDetailsArgs']]):
        pulumi.set(self, "git_details", value)

    @property
    @pulumi.getter
    def identifier(self) -> Optional[pulumi.Input[str]]:
        """
        Identifier of the Feature Flag
        """
        return pulumi.get(self, "identifier")

    @identifier.setter
    def identifier(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "identifier", value)

    @property
    @pulumi.getter
    def kind(self) -> Optional[pulumi.Input[str]]:
        """
        The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
        """
        return pulumi.get(self, "kind")

    @kind.setter
    def kind(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "kind", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the Feature Flag
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[pulumi.Input[str]]:
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @org_id.setter
    def org_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org_id", value)

    @property
    @pulumi.getter
    def owner(self) -> Optional[pulumi.Input[str]]:
        """
        The owner of the flag
        """
        return pulumi.get(self, "owner")

    @owner.setter
    def owner(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "owner", value)

    @property
    @pulumi.getter
    def permanent(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether or not the flag is permanent. If it is, it will never be flagged as stale
        """
        return pulumi.get(self, "permanent")

    @permanent.setter
    def permanent(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "permanent", value)

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[pulumi.Input[str]]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @project_id.setter
    def project_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project_id", value)

    @property
    @pulumi.getter
    def variations(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]]]:
        """
        The options available for your flag
        """
        return pulumi.get(self, "variations")

    @variations.setter
    def variations(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['FeatureFlagVariationArgs']]]]):
        pulumi.set(self, "variations", value)


class FeatureFlag(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 archived: Optional[pulumi.Input[bool]] = None,
                 default_off_variation: Optional[pulumi.Input[str]] = None,
                 default_on_variation: Optional[pulumi.Input[str]] = None,
                 git_details: Optional[pulumi.Input[pulumi.InputType['FeatureFlagGitDetailsArgs']]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 permanent: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 variations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FeatureFlagVariationArgs']]]]] = None,
                 __props__=None):
        """
        Resource for managing Feature Flags.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        # Boolean Flag
        mybooleanflag = harness.platform.FeatureFlag("mybooleanflag",
            default_off_variation="Disabled",
            default_on_variation="Enabled",
            identifier="MY_FEATURE",
            kind="boolean",
            org_id="test",
            permanent=False,
            project_id="testff",
            variations=[
                harness.platform.FeatureFlagVariationArgs(
                    description="The feature is enabled",
                    identifier="Enabled",
                    name="Enabled",
                    value="true",
                ),
                harness.platform.FeatureFlagVariationArgs(
                    description="The feature is disabled",
                    identifier="Disabled",
                    name="Disabled",
                    value="false",
                ),
            ])
        # Multivariate flag
        mymultivariateflag = harness.platform.FeatureFlag("mymultivariateflag",
            default_off_variation="trial20",
            default_on_variation="trial7",
            identifier="FREE_TRIAL_DURATION",
            kind="int",
            org_id="test",
            permanent=False,
            project_id="testff",
            variations=[
                harness.platform.FeatureFlagVariationArgs(
                    description="Free trial period 7 days",
                    identifier="trial7",
                    name="7 days trial",
                    value="7",
                ),
                harness.platform.FeatureFlagVariationArgs(
                    description="Free trial period 14 days",
                    identifier="trial14",
                    name="14 days trial",
                    value="14",
                ),
                harness.platform.FeatureFlagVariationArgs(
                    description="Free trial period 20 days",
                    identifier="trial20",
                    name="20 days trial",
                    value="20",
                ),
            ])
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] archived: Whether or not the flag is archived
        :param pulumi.Input[str] default_off_variation: Which of the variations to use when the flag is toggled to off state
        :param pulumi.Input[str] default_on_variation: Which of the variations to use when the flag is toggled to on state
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag
        :param pulumi.Input[str] kind: The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
        :param pulumi.Input[str] name: Name of the Feature Flag
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[str] owner: The owner of the flag
        :param pulumi.Input[bool] permanent: Whether or not the flag is permanent. If it is, it will never be flagged as stale
        :param pulumi.Input[str] project_id: Project Identifier
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FeatureFlagVariationArgs']]]] variations: The options available for your flag
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: FeatureFlagArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for managing Feature Flags.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        # Boolean Flag
        mybooleanflag = harness.platform.FeatureFlag("mybooleanflag",
            default_off_variation="Disabled",
            default_on_variation="Enabled",
            identifier="MY_FEATURE",
            kind="boolean",
            org_id="test",
            permanent=False,
            project_id="testff",
            variations=[
                harness.platform.FeatureFlagVariationArgs(
                    description="The feature is enabled",
                    identifier="Enabled",
                    name="Enabled",
                    value="true",
                ),
                harness.platform.FeatureFlagVariationArgs(
                    description="The feature is disabled",
                    identifier="Disabled",
                    name="Disabled",
                    value="false",
                ),
            ])
        # Multivariate flag
        mymultivariateflag = harness.platform.FeatureFlag("mymultivariateflag",
            default_off_variation="trial20",
            default_on_variation="trial7",
            identifier="FREE_TRIAL_DURATION",
            kind="int",
            org_id="test",
            permanent=False,
            project_id="testff",
            variations=[
                harness.platform.FeatureFlagVariationArgs(
                    description="Free trial period 7 days",
                    identifier="trial7",
                    name="7 days trial",
                    value="7",
                ),
                harness.platform.FeatureFlagVariationArgs(
                    description="Free trial period 14 days",
                    identifier="trial14",
                    name="14 days trial",
                    value="14",
                ),
                harness.platform.FeatureFlagVariationArgs(
                    description="Free trial period 20 days",
                    identifier="trial20",
                    name="20 days trial",
                    value="20",
                ),
            ])
        ```

        :param str resource_name: The name of the resource.
        :param FeatureFlagArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(FeatureFlagArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 archived: Optional[pulumi.Input[bool]] = None,
                 default_off_variation: Optional[pulumi.Input[str]] = None,
                 default_on_variation: Optional[pulumi.Input[str]] = None,
                 git_details: Optional[pulumi.Input[pulumi.InputType['FeatureFlagGitDetailsArgs']]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 kind: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 owner: Optional[pulumi.Input[str]] = None,
                 permanent: Optional[pulumi.Input[bool]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 variations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FeatureFlagVariationArgs']]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = FeatureFlagArgs.__new__(FeatureFlagArgs)

            __props__.__dict__["archived"] = archived
            if default_off_variation is None and not opts.urn:
                raise TypeError("Missing required property 'default_off_variation'")
            __props__.__dict__["default_off_variation"] = default_off_variation
            if default_on_variation is None and not opts.urn:
                raise TypeError("Missing required property 'default_on_variation'")
            __props__.__dict__["default_on_variation"] = default_on_variation
            __props__.__dict__["git_details"] = git_details
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            if kind is None and not opts.urn:
                raise TypeError("Missing required property 'kind'")
            __props__.__dict__["kind"] = kind
            __props__.__dict__["name"] = name
            if org_id is None and not opts.urn:
                raise TypeError("Missing required property 'org_id'")
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["owner"] = owner
            if permanent is None and not opts.urn:
                raise TypeError("Missing required property 'permanent'")
            __props__.__dict__["permanent"] = permanent
            if project_id is None and not opts.urn:
                raise TypeError("Missing required property 'project_id'")
            __props__.__dict__["project_id"] = project_id
            if variations is None and not opts.urn:
                raise TypeError("Missing required property 'variations'")
            __props__.__dict__["variations"] = variations
        super(FeatureFlag, __self__).__init__(
            'harness:platform/featureFlag:FeatureFlag',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            archived: Optional[pulumi.Input[bool]] = None,
            default_off_variation: Optional[pulumi.Input[str]] = None,
            default_on_variation: Optional[pulumi.Input[str]] = None,
            git_details: Optional[pulumi.Input[pulumi.InputType['FeatureFlagGitDetailsArgs']]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            kind: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            owner: Optional[pulumi.Input[str]] = None,
            permanent: Optional[pulumi.Input[bool]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            variations: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FeatureFlagVariationArgs']]]]] = None) -> 'FeatureFlag':
        """
        Get an existing FeatureFlag resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] archived: Whether or not the flag is archived
        :param pulumi.Input[str] default_off_variation: Which of the variations to use when the flag is toggled to off state
        :param pulumi.Input[str] default_on_variation: Which of the variations to use when the flag is toggled to on state
        :param pulumi.Input[str] identifier: Identifier of the Feature Flag
        :param pulumi.Input[str] kind: The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
        :param pulumi.Input[str] name: Name of the Feature Flag
        :param pulumi.Input[str] org_id: Organization Identifier
        :param pulumi.Input[str] owner: The owner of the flag
        :param pulumi.Input[bool] permanent: Whether or not the flag is permanent. If it is, it will never be flagged as stale
        :param pulumi.Input[str] project_id: Project Identifier
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['FeatureFlagVariationArgs']]]] variations: The options available for your flag
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _FeatureFlagState.__new__(_FeatureFlagState)

        __props__.__dict__["archived"] = archived
        __props__.__dict__["default_off_variation"] = default_off_variation
        __props__.__dict__["default_on_variation"] = default_on_variation
        __props__.__dict__["git_details"] = git_details
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["kind"] = kind
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["owner"] = owner
        __props__.__dict__["permanent"] = permanent
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["variations"] = variations
        return FeatureFlag(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def archived(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether or not the flag is archived
        """
        return pulumi.get(self, "archived")

    @property
    @pulumi.getter(name="defaultOffVariation")
    def default_off_variation(self) -> pulumi.Output[str]:
        """
        Which of the variations to use when the flag is toggled to off state
        """
        return pulumi.get(self, "default_off_variation")

    @property
    @pulumi.getter(name="defaultOnVariation")
    def default_on_variation(self) -> pulumi.Output[str]:
        """
        Which of the variations to use when the flag is toggled to on state
        """
        return pulumi.get(self, "default_on_variation")

    @property
    @pulumi.getter(name="gitDetails")
    def git_details(self) -> pulumi.Output[Optional['outputs.FeatureFlagGitDetails']]:
        return pulumi.get(self, "git_details")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Identifier of the Feature Flag
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def kind(self) -> pulumi.Output[str]:
        """
        The type of data the flag represents. Valid values are `boolean`, `int`, `string`, `json`
        """
        return pulumi.get(self, "kind")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the Feature Flag
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> pulumi.Output[str]:
        """
        Organization Identifier
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def owner(self) -> pulumi.Output[Optional[str]]:
        """
        The owner of the flag
        """
        return pulumi.get(self, "owner")

    @property
    @pulumi.getter
    def permanent(self) -> pulumi.Output[bool]:
        """
        Whether or not the flag is permanent. If it is, it will never be flagged as stale
        """
        return pulumi.get(self, "permanent")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[str]:
        """
        Project Identifier
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def variations(self) -> pulumi.Output[Sequence['outputs.FeatureFlagVariation']]:
        """
        The options available for your flag
        """
        return pulumi.get(self, "variations")

