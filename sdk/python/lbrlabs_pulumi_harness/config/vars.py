# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('harness')


class _ExportableConfig(types.ModuleType):
    @property
    def account_id(self) -> Optional[str]:
        """
        The Harness account id. This can also be set using the `HARNESS_ACCOUNT_ID` environment variable.
        """
        return __config__.get('accountId') or _utilities.get_env('HARNESS_ACCOUNT_ID')

    @property
    def api_key(self) -> Optional[str]:
        """
        The Harness API key. This can also be set using the `HARNESS_API_KEY` environment variable.
        """
        return __config__.get('apiKey') or _utilities.get_env('HARNESS_API_KEY')

    @property
    def endpoint(self) -> Optional[str]:
        """
        The URL of the Harness API endpoint. The default is `https://app.harness.io/gateway`. This can also be set using the
        `HARNESS_ENDPOINT` environment variable.
        """
        return __config__.get('endpoint') or _utilities.get_env('HARNESS_ENDPOINT')

    @property
    def platform_api_key(self) -> Optional[str]:
        """
        The API key for the Harness next gen platform. This can also be set using the `HARNESS_PLATFORM_API_KEY` environment
        variable.
        """
        return __config__.get('platformApiKey') or _utilities.get_env('HARNESS_PLATFORM_API_KEY')

