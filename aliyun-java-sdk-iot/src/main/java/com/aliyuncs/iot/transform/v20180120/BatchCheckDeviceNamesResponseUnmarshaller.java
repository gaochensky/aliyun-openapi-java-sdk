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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.BatchCheckDeviceNamesResponse;
import com.aliyuncs.iot.model.v20180120.BatchCheckDeviceNamesResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchCheckDeviceNamesResponseUnmarshaller {

	public static BatchCheckDeviceNamesResponse unmarshall(BatchCheckDeviceNamesResponse batchCheckDeviceNamesResponse, UnmarshallerContext _ctx) {
		
		batchCheckDeviceNamesResponse.setRequestId(_ctx.stringValue("BatchCheckDeviceNamesResponse.RequestId"));
		batchCheckDeviceNamesResponse.setSuccess(_ctx.booleanValue("BatchCheckDeviceNamesResponse.Success"));
		batchCheckDeviceNamesResponse.setCode(_ctx.stringValue("BatchCheckDeviceNamesResponse.Code"));
		batchCheckDeviceNamesResponse.setErrorMessage(_ctx.stringValue("BatchCheckDeviceNamesResponse.ErrorMessage"));

		Data data = new Data();
		data.setApplyId(_ctx.longValue("BatchCheckDeviceNamesResponse.Data.ApplyId"));

		List<Map<Object, Object>> invalidDeviceNameList = _ctx.listMapValue("BatchCheckDeviceNamesResponse.Data.InvalidDeviceNameList");
		data.setInvalidDeviceNameList(invalidDeviceNameList);
		batchCheckDeviceNamesResponse.setData(data);
	 
	 	return batchCheckDeviceNamesResponse;
	}
}