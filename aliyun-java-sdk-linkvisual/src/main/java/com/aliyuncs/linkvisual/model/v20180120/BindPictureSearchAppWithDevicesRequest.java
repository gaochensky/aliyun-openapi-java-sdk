/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.linkvisual.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkvisual.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BindPictureSearchAppWithDevicesRequest extends RpcAcsRequest<BindPictureSearchAppWithDevicesResponse> {
	   

	private String deviceIotIds;

	private String appInstanceId;
	public BindPictureSearchAppWithDevicesRequest() {
		super("Linkvisual", "2018-01-20", "BindPictureSearchAppWithDevices", "Linkvisual");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDeviceIotIds() {
		return this.deviceIotIds;
	}

	public void setDeviceIotIds(String deviceIotIds) {
		this.deviceIotIds = deviceIotIds;
		if(deviceIotIds != null){
			putQueryParameter("DeviceIotIds", deviceIotIds);
		}
	}

	public String getAppInstanceId() {
		return this.appInstanceId;
	}

	public void setAppInstanceId(String appInstanceId) {
		this.appInstanceId = appInstanceId;
		if(appInstanceId != null){
			putQueryParameter("AppInstanceId", appInstanceId);
		}
	}

	@Override
	public Class<BindPictureSearchAppWithDevicesResponse> getResponseClass() {
		return BindPictureSearchAppWithDevicesResponse.class;
	}

}
