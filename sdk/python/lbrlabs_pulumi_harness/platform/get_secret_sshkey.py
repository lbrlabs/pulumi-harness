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

__all__ = [
    'GetSecretSshkeyResult',
    'AwaitableGetSecretSshkeyResult',
    'get_secret_sshkey',
    'get_secret_sshkey_output',
]

@pulumi.output_type
class GetSecretSshkeyResult:
    """
    A collection of values returned by getSecretSshkey.
    """
    def __init__(__self__, description=None, id=None, identifier=None, kerberos=None, name=None, org_id=None, port=None, project_id=None, sshes=None, tags=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if kerberos and not isinstance(kerberos, list):
            raise TypeError("Expected argument 'kerberos' to be a list")
        pulumi.set(__self__, "kerberos", kerberos)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if port and not isinstance(port, int):
            raise TypeError("Expected argument 'port' to be a int")
        pulumi.set(__self__, "port", port)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if sshes and not isinstance(sshes, list):
            raise TypeError("Expected argument 'sshes' to be a list")
        pulumi.set(__self__, "sshes", sshes)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)

    @property
    @pulumi.getter
    def description(self) -> str:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def identifier(self) -> Optional[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def kerberos(self) -> Sequence['outputs.GetSecretSshkeyKerberoResult']:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "kerberos")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        """
        Name of the resource.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="orgId")
    def org_id(self) -> Optional[str]:
        """
        Unique identifier of the organization.
        """
        return pulumi.get(self, "org_id")

    @property
    @pulumi.getter
    def port(self) -> int:
        """
        SSH port
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def sshes(self) -> Sequence['outputs.GetSecretSshkeySshResult']:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "sshes")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")


class AwaitableGetSecretSshkeyResult(GetSecretSshkeyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSecretSshkeyResult(
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            kerberos=self.kerberos,
            name=self.name,
            org_id=self.org_id,
            port=self.port,
            project_id=self.project_id,
            sshes=self.sshes,
            tags=self.tags)


def get_secret_sshkey(identifier: Optional[str] = None,
                      name: Optional[str] = None,
                      org_id: Optional[str] = None,
                      project_id: Optional[str] = None,
                      opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSecretSshkeyResult:
    """
    Resource for looking up an SSH Key type secret.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_secret_sshkey(identifier="identifier")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getSecretSshkey:getSecretSshkey', __args__, opts=opts, typ=GetSecretSshkeyResult).value

    return AwaitableGetSecretSshkeyResult(
        description=__ret__.description,
        id=__ret__.id,
        identifier=__ret__.identifier,
        kerberos=__ret__.kerberos,
        name=__ret__.name,
        org_id=__ret__.org_id,
        port=__ret__.port,
        project_id=__ret__.project_id,
        sshes=__ret__.sshes,
        tags=__ret__.tags)


@_utilities.lift_output_func(get_secret_sshkey)
def get_secret_sshkey_output(identifier: Optional[pulumi.Input[Optional[str]]] = None,
                             name: Optional[pulumi.Input[Optional[str]]] = None,
                             org_id: Optional[pulumi.Input[Optional[str]]] = None,
                             project_id: Optional[pulumi.Input[Optional[str]]] = None,
                             opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSecretSshkeyResult]:
    """
    Resource for looking up an SSH Key type secret.

    ## Example Usage

    ```python
    import pulumi
    import pulumi_harness as harness

    example = harness.platform.get_secret_sshkey(identifier="identifier")
    ```


    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...
