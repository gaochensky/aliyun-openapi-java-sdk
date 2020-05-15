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

package com.aliyuncs.iot.model.v20180120;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryBatchRegisterDeviceStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryBatchRegisterDeviceStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String status;

		private List<Map<Object,Object>> validList;

		private List<Map<Object,Object>> invalidList;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<Map<Object,Object>> getValidList() {
			return this.validList;
		}

		public void setValidList(List<Map<Object,Object>> validList) {
			this.validList = validList;
		}

		public List<Map<Object,Object>> getInvalidList() {
			return this.invalidList;
		}

		public void setInvalidList(List<Map<Object,Object>> invalidList) {
			this.invalidList = invalidList;
		}
	}

	@Override
	public QueryBatchRegisterDeviceStatusResponse getInstance(UnmarshallerContext context) {
		return	QueryBatchRegisterDeviceStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
