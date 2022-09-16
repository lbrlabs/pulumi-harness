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
    'GetDatadogConnectorResult',
    'AwaitableGetDatadogConnectorResult',
    'get_datadog_connector',
    'get_datadog_connector_output',
]

@pulumi.output_type
class GetDatadogConnectorResult:
    """
    A collection of values returned by getDatadogConnector.
    """
    def __init__(__self__, api_key_ref=None, application_key_ref=None, delegate_selectors=None, description=None, id=None, identifier=None, name=None, org_id=None, project_id=None, tags=None, url=None):
        if api_key_ref and not isinstance(api_key_ref, str):
            raise TypeError("Expected argument 'api_key_ref' to be a str")
        pulumi.set(__self__, "api_key_ref", api_key_ref)
        if application_key_ref and not isinstance(application_key_ref, str):
            raise TypeError("Expected argument 'application_key_ref' to be a str")
        pulumi.set(__self__, "application_key_ref", application_key_ref)
        if delegate_selectors and not isinstance(delegate_selectors, list):
            raise TypeError("Expected argument 'delegate_selectors' to be a list")
        pulumi.set(__self__, "delegate_selectors", delegate_selectors)
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if identifier and not isinstance(identifier, str):
            raise TypeError("Expected argument 'identifier' to be a str")
        pulumi.set(__self__, "identifier", identifier)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if org_id and not isinstance(org_id, str):
            raise TypeError("Expected argument 'org_id' to be a str")
        pulumi.set(__self__, "org_id", org_id)
        if project_id and not isinstance(project_id, str):
            raise TypeError("Expected argument 'project_id' to be a str")
        pulumi.set(__self__, "project_id", project_id)
        if tags and not isinstance(tags, list):
            raise TypeError("Expected argument 'tags' to be a list")
        pulumi.set(__self__, "tags", tags)
        if url and not isinstance(url, str):
            raise TypeError("Expected argument 'url' to be a str")
        pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="apiKeyRef")
    def api_key_ref(self) -> str:
        """
        Reference to the Harness secret containing the api key.
        """
        return pulumi.get(self, "api_key_ref")

    @property
    @pulumi.getter(name="applicationKeyRef")
    def application_key_ref(self) -> str:
        """
        Reference to the Harness secret containing the application key.
        """
        return pulumi.get(self, "application_key_ref")

    @property
    @pulumi.getter(name="delegateSelectors")
    def delegate_selectors(self) -> Optional[Sequence[str]]:
        """
        Connect using only the delegates which have these tags.
        """
        return pulumi.get(self, "delegate_selectors")

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
    @pulumi.getter(name="projectId")
    def project_id(self) -> Optional[str]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def tags(self) -> Sequence[str]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter
    def url(self) -> str:
        """
        Url of the Datadog server.
        """
        return pulumi.get(self, "url")


class AwaitableGetDatadogConnectorResult(GetDatadogConnectorResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetDatadogConnectorResult(
            api_key_ref=self.api_key_ref,
            application_key_ref=self.application_key_ref,
            delegate_selectors=self.delegate_selectors,
            description=self.description,
            id=self.id,
            identifier=self.identifier,
            name=self.name,
            org_id=self.org_id,
            project_id=self.project_id,
            tags=self.tags,
            url=self.url)


def get_datadog_connector(delegate_selectors: Optional[Sequence[str]] = None,
                          identifier: Optional[str] = None,
                          name: Optional[str] = None,
                          org_id: Optional[str] = None,
                          project_id: Optional[str] = None,
                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetDatadogConnectorResult:
    """
    Datasource for looking up a Datadog connector.


    :param Sequence[str] delegate_selectors: Connect using only the delegates which have these tags.
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    __args__ = dict()
    __args__['delegateSelectors'] = delegate_selectors
    __args__['identifier'] = identifier
    __args__['name'] = name
    __args__['orgId'] = org_id
    __args__['projectId'] = project_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('harness:platform/getDatadogConnector:getDatadogConnector', __args__, opts=opts, typ=GetDatadogConnectorResult).value

    return AwaitableGetDatadogConnectorResult(
        api_key_ref=__ret__.api_key_ref,
        application_key_ref=__ret__.application_key_ref,
        delegate_selectors=__ret__.delegate_selectors,
        description=__ret__.description,
        id=__ret__.id,
        identifier=__ret__.identifier,
        name=__ret__.name,
        org_id=__ret__.org_id,
        project_id=__ret__.project_id,
        tags=__ret__.tags,
        url=__ret__.url)


@_utilities.lift_output_func(get_datadog_connector)
def get_datadog_connector_output(delegate_selectors: Optional[pulumi.Input[Optional[Sequence[str]]]] = None,
                                 identifier: Optional[pulumi.Input[Optional[str]]] = None,
                                 name: Optional[pulumi.Input[Optional[str]]] = None,
                                 org_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 project_id: Optional[pulumi.Input[Optional[str]]] = None,
                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetDatadogConnectorResult]:
    """
    Datasource for looking up a Datadog connector.


    :param Sequence[str] delegate_selectors: Connect using only the delegates which have these tags.
    :param str identifier: Unique identifier of the resource.
    :param str name: Name of the resource.
    :param str org_id: Unique identifier of the organization.
    :param str project_id: Unique identifier of the project.
    """
    ...
