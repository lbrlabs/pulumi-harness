# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'GetSloResult',
    'AwaitableGetSloResult',
    'get_slo',
    'get_slo_output',
]

@pulumi.output_type
class GetSloResult:
    """
    A collection of values returned by getSlo.
    """
    def __init__(__self__, id=None, identifier=None, org_id=None, project_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> str:
        """
        Identifier of the SLO.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> str:
        """
        Identifier of the organization in which the SLO is configured.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> str:
        """
        Identifier of the project in which the SLO is configured.
        """
        return pulumi.get(self, "project_id")


class AwaitableGetSloResult(GetSloResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSloResult(
            id=self.id,
            identifier=self.identifier,
            org_id=self.org_id,
            project_id=self.project_id)


def get_slo(identifier: Optional[str] = None,
            org_id: Optional[str] = None,
            project_id: Optional[str] = None,
            opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSloResult:
    """
    Data source for retrieving an SLO.


    :param str identifier: Identifier of the SLO.
    :param str org_id: Identifier of the organization in which the SLO is configured.
    :param str project_id: Identifier of the project in which the SLO is configured.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getSlo:getSlo', __args__, opts=opts, typ=GetSloResult).value

    return AwaitableGetSloResult(
        id=pulumi.get(__ret__, 'id'),
        identifier=pulumi.get(__ret__, 'identifier'),
        org_id=pulumi.get(__ret__, 'org_id'),
        project_id=pulumi.get(__ret__, 'project_id'))


@_utilities.lift_output_func(get_slo)
def get_slo_output(identifier: Optional[pulumi.Input[str]] = None,
                   org_id: Optional[pulumi.Input[str]] = None,
                   project_id: Optional[pulumi.Input[str]] = None,
                   opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSloResult]:
    """
    Data source for retrieving an SLO.


    :param str identifier: Identifier of the SLO.
    :param str org_id: Identifier of the organization in which the SLO is configured.
    :param str project_id: Identifier of the project in which the SLO is configured.
    """
    ...
