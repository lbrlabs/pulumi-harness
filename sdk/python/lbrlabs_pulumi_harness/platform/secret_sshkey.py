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

__all__ = ['SecretSshkeyArgs', 'SecretSshkey']

@pulumi.input_type
class SecretSshkeyArgs:
    def __init__(__self__, *,
                 identifier: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 kerberos: Optional[pulumi.Input['SecretSshkeyKerberosArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 ssh: Optional[pulumi.Input['SecretSshkeySshArgs']] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        The set of arguments for constructing a SecretSshkey resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input['SecretSshkeyKerberosArgs'] kerberos: Kerberos authentication scheme
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[int] port: SSH port
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input['SecretSshkeySshArgs'] ssh: Kerberos authentication scheme
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        pulumi.set(__self__, "identifier", identifier)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if kerberos is not None:
            pulumi.set(__self__, "kerberos", kerberos)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if ssh is not None:
            pulumi.set(__self__, "ssh", ssh)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

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
    def kerberos(self) -> Optional[pulumi.Input['SecretSshkeyKerberosArgs']]:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "kerberos")

    @kerberos.setter
    def kerberos(self, value: Optional[pulumi.Input['SecretSshkeyKerberosArgs']]):
        pulumi.set(self, "kerberos", value)

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
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        SSH port
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

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
    def ssh(self) -> Optional[pulumi.Input['SecretSshkeySshArgs']]:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "ssh")

    @ssh.setter
    def ssh(self, value: Optional[pulumi.Input['SecretSshkeySshArgs']]):
        pulumi.set(self, "ssh", value)

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
class _SecretSshkeyState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 kerberos: Optional[pulumi.Input['SecretSshkeyKerberosArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 ssh: Optional[pulumi.Input['SecretSshkeySshArgs']] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None):
        """
        Input properties used for looking up and filtering SecretSshkey resources.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input['SecretSshkeyKerberosArgs'] kerberos: Kerberos authentication scheme
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[int] port: SSH port
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input['SecretSshkeySshArgs'] ssh: Kerberos authentication scheme
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if identifier is not None:
            pulumi.set(__self__, "identifier", identifier)
        if kerberos is not None:
            pulumi.set(__self__, "kerberos", kerberos)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if org_id is not None:
            pulumi.set(__self__, "org_id", org_id)
        if port is not None:
            pulumi.set(__self__, "port", port)
        if project_id is not None:
            pulumi.set(__self__, "project_id", project_id)
        if ssh is not None:
            pulumi.set(__self__, "ssh", ssh)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)

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
    def kerberos(self) -> Optional[pulumi.Input['SecretSshkeyKerberosArgs']]:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "kerberos")

    @kerberos.setter
    def kerberos(self, value: Optional[pulumi.Input['SecretSshkeyKerberosArgs']]):
        pulumi.set(self, "kerberos", value)

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
    @pulumi.getter
    def port(self) -> Optional[pulumi.Input[int]]:
        """
        SSH port
        """
        return pulumi.get(self, "port")

    @port.setter
    def port(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "port", value)

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
    def ssh(self) -> Optional[pulumi.Input['SecretSshkeySshArgs']]:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "ssh")

    @ssh.setter
    def ssh(self, value: Optional[pulumi.Input['SecretSshkeySshArgs']]):
        pulumi.set(self, "ssh", value)

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


class SecretSshkey(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 kerberos: Optional[pulumi.Input[pulumi.InputType['SecretSshkeyKerberosArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 ssh: Optional[pulumi.Input[pulumi.InputType['SecretSshkeySshArgs']]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        """
        Resource for creating an ssh key type secret.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        key_tab_file_path = harness.platform.SecretSshkey("keyTabFilePath",
            description="test",
            identifier="identifier",
            kerberos=harness.platform.SecretSshkeyKerberosArgs(
                principal="principal",
                realm="realm",
                tgt_generation_method="KeyTabFilePath",
                tgt_key_tab_file_path_spec=harness.platform.SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs(
                    key_path="key_path",
                ),
            ),
            port=22,
            tags=["foo:bar"])
        _tgt_password = harness.platform.SecretSshkey(" tgtPassword",
            description="test",
            identifier="identifier",
            kerberos=harness.platform.SecretSshkeyKerberosArgs(
                principal="principal",
                realm="realm",
                tgt_generation_method="Password",
                tgt_password_spec=harness.platform.SecretSshkeyKerberosTgtPasswordSpecArgs(
                    password="password",
                ),
            ),
            port=22,
            tags=["foo:bar"])
        sshkey_reference = harness.platform.SecretSshkey("sshkeyReference",
            description="test",
            identifier="identifier",
            port=22,
            ssh=harness.platform.SecretSshkeySshArgs(
                credential_type="KeyReference",
                sshkey_reference_credential=harness.platform.SecretSshkeySshSshkeyReferenceCredentialArgs(
                    encrypted_passphrase="encrypted_passphrase",
                    key="key",
                    user_name="user_name",
                ),
            ),
            tags=["foo:bar"])
        _sshkey_path = harness.platform.SecretSshkey(" sshkeyPath",
            description="test",
            identifier="identifier",
            port=22,
            ssh=harness.platform.SecretSshkeySshArgs(
                credential_type="KeyPath",
                sshkey_path_credential=harness.platform.SecretSshkeySshSshkeyPathCredentialArgs(
                    encrypted_passphrase="encrypted_passphrase",
                    key_path="key_path",
                    user_name="user_name",
                ),
            ),
            tags=["foo:bar"])
        ssh_password = harness.platform.SecretSshkey("sshPassword",
            description="test",
            identifier="identifier",
            port=22,
            ssh=harness.platform.SecretSshkeySshArgs(
                credential_type="Password",
                ssh_password_credential=harness.platform.SecretSshkeySshSshPasswordCredentialArgs(
                    password="password",
                    user_name="user_name",
                ),
            ),
            tags=["foo:bar"])
        ```

        ## Import

        # Import using secret sshkey id

        ```sh
         $ pulumi import harness:platform/secretSshkey:SecretSshkey example <secret_sshkey_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[pulumi.InputType['SecretSshkeyKerberosArgs']] kerberos: Kerberos authentication scheme
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[int] port: SSH port
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[pulumi.InputType['SecretSshkeySshArgs']] ssh: Kerberos authentication scheme
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SecretSshkeyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Resource for creating an ssh key type secret.

        ## Example Usage

        ```python
        import pulumi
        import lbrlabs_pulumi_harness as harness

        key_tab_file_path = harness.platform.SecretSshkey("keyTabFilePath",
            description="test",
            identifier="identifier",
            kerberos=harness.platform.SecretSshkeyKerberosArgs(
                principal="principal",
                realm="realm",
                tgt_generation_method="KeyTabFilePath",
                tgt_key_tab_file_path_spec=harness.platform.SecretSshkeyKerberosTgtKeyTabFilePathSpecArgs(
                    key_path="key_path",
                ),
            ),
            port=22,
            tags=["foo:bar"])
        _tgt_password = harness.platform.SecretSshkey(" tgtPassword",
            description="test",
            identifier="identifier",
            kerberos=harness.platform.SecretSshkeyKerberosArgs(
                principal="principal",
                realm="realm",
                tgt_generation_method="Password",
                tgt_password_spec=harness.platform.SecretSshkeyKerberosTgtPasswordSpecArgs(
                    password="password",
                ),
            ),
            port=22,
            tags=["foo:bar"])
        sshkey_reference = harness.platform.SecretSshkey("sshkeyReference",
            description="test",
            identifier="identifier",
            port=22,
            ssh=harness.platform.SecretSshkeySshArgs(
                credential_type="KeyReference",
                sshkey_reference_credential=harness.platform.SecretSshkeySshSshkeyReferenceCredentialArgs(
                    encrypted_passphrase="encrypted_passphrase",
                    key="key",
                    user_name="user_name",
                ),
            ),
            tags=["foo:bar"])
        _sshkey_path = harness.platform.SecretSshkey(" sshkeyPath",
            description="test",
            identifier="identifier",
            port=22,
            ssh=harness.platform.SecretSshkeySshArgs(
                credential_type="KeyPath",
                sshkey_path_credential=harness.platform.SecretSshkeySshSshkeyPathCredentialArgs(
                    encrypted_passphrase="encrypted_passphrase",
                    key_path="key_path",
                    user_name="user_name",
                ),
            ),
            tags=["foo:bar"])
        ssh_password = harness.platform.SecretSshkey("sshPassword",
            description="test",
            identifier="identifier",
            port=22,
            ssh=harness.platform.SecretSshkeySshArgs(
                credential_type="Password",
                ssh_password_credential=harness.platform.SecretSshkeySshSshPasswordCredentialArgs(
                    password="password",
                    user_name="user_name",
                ),
            ),
            tags=["foo:bar"])
        ```

        ## Import

        # Import using secret sshkey id

        ```sh
         $ pulumi import harness:platform/secretSshkey:SecretSshkey example <secret_sshkey_id>
        ```

        :param str resource_name: The name of the resource.
        :param SecretSshkeyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SecretSshkeyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 identifier: Optional[pulumi.Input[str]] = None,
                 kerberos: Optional[pulumi.Input[pulumi.InputType['SecretSshkeyKerberosArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 org_id: Optional[pulumi.Input[str]] = None,
                 port: Optional[pulumi.Input[int]] = None,
                 project_id: Optional[pulumi.Input[str]] = None,
                 ssh: Optional[pulumi.Input[pulumi.InputType['SecretSshkeySshArgs']]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SecretSshkeyArgs.__new__(SecretSshkeyArgs)

            __props__.__dict__["description"] = description
            if identifier is None and not opts.urn:
                raise TypeError("Missing required property 'identifier'")
            __props__.__dict__["identifier"] = identifier
            __props__.__dict__["kerberos"] = kerberos
            __props__.__dict__["name"] = name
            __props__.__dict__["org_id"] = org_id
            __props__.__dict__["port"] = port
            __props__.__dict__["project_id"] = project_id
            __props__.__dict__["ssh"] = ssh
            __props__.__dict__["tags"] = tags
        super(SecretSshkey, __self__).__init__(
            'harness:platform/secretSshkey:SecretSshkey',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            identifier: Optional[pulumi.Input[str]] = None,
            kerberos: Optional[pulumi.Input[pulumi.InputType['SecretSshkeyKerberosArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            org_id: Optional[pulumi.Input[str]] = None,
            port: Optional[pulumi.Input[int]] = None,
            project_id: Optional[pulumi.Input[str]] = None,
            ssh: Optional[pulumi.Input[pulumi.InputType['SecretSshkeySshArgs']]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None) -> 'SecretSshkey':
        """
        Get an existing SecretSshkey resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: Description of the resource.
        :param pulumi.Input[str] identifier: Unique identifier of the resource.
        :param pulumi.Input[pulumi.InputType['SecretSshkeyKerberosArgs']] kerberos: Kerberos authentication scheme
        :param pulumi.Input[str] name: Name of the resource.
        :param pulumi.Input[str] org_id: Unique identifier of the organization.
        :param pulumi.Input[int] port: SSH port
        :param pulumi.Input[str] project_id: Unique identifier of the project.
        :param pulumi.Input[pulumi.InputType['SecretSshkeySshArgs']] ssh: Kerberos authentication scheme
        :param pulumi.Input[Sequence[pulumi.Input[str]]] tags: Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SecretSshkeyState.__new__(_SecretSshkeyState)

        __props__.__dict__["description"] = description
        __props__.__dict__["identifier"] = identifier
        __props__.__dict__["kerberos"] = kerberos
        __props__.__dict__["name"] = name
        __props__.__dict__["org_id"] = org_id
        __props__.__dict__["port"] = port
        __props__.__dict__["project_id"] = project_id
        __props__.__dict__["ssh"] = ssh
        __props__.__dict__["tags"] = tags
        return SecretSshkey(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        Description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def identifier(self) -> pulumi.Output[str]:
        """
        Unique identifier of the resource.
        """
        return pulumi.get(self, "identifier")

    @property
    @pulumi.getter
    def kerberos(self) -> pulumi.Output[Optional['outputs.SecretSshkeyKerberos']]:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "kerberos")

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
    @pulumi.getter
    def port(self) -> pulumi.Output[Optional[int]]:
        """
        SSH port
        """
        return pulumi.get(self, "port")

    @property
    @pulumi.getter(name="projectId")
    def project_id(self) -> pulumi.Output[Optional[str]]:
        """
        Unique identifier of the project.
        """
        return pulumi.get(self, "project_id")

    @property
    @pulumi.getter
    def ssh(self) -> pulumi.Output[Optional['outputs.SecretSshkeySsh']]:
        """
        Kerberos authentication scheme
        """
        return pulumi.get(self, "ssh")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        """
        Tags to associate with the resource. Tags should be in the form `name:value`.
        """
        return pulumi.get(self, "tags")

