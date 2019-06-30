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

package com.aliyuncs.qualitycheck.transform.v20190115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.qualitycheck.model.v20190115.VerifySentenceResponse;
import com.aliyuncs.qualitycheck.model.v20190115.VerifySentenceResponse.Delta;
import com.aliyuncs.qualitycheck.model.v20190115.VerifySentenceResponse.Delta.Source;
import com.aliyuncs.qualitycheck.model.v20190115.VerifySentenceResponse.Delta.Target;
import com.aliyuncs.transform.UnmarshallerContext;


public class VerifySentenceResponseUnmarshaller {

	public static VerifySentenceResponse unmarshall(VerifySentenceResponse verifySentenceResponse, UnmarshallerContext context) {
		
		verifySentenceResponse.setRequestId(context.stringValue("VerifySentenceResponse.RequestId"));
		verifySentenceResponse.setSuccess(context.booleanValue("VerifySentenceResponse.Success"));
		verifySentenceResponse.setCode(context.stringValue("VerifySentenceResponse.Code"));
		verifySentenceResponse.setMessage(context.stringValue("VerifySentenceResponse.Message"));
		verifySentenceResponse.setSourceRole(context.integerValue("VerifySentenceResponse.SourceRole"));
		verifySentenceResponse.setTargetRole(context.integerValue("VerifySentenceResponse.TargetRole"));
		verifySentenceResponse.setIncorrectWords(context.integerValue("VerifySentenceResponse.IncorrectWords"));

		List<Delta> data = new ArrayList<Delta>();
		for (int i = 0; i < context.lengthValue("VerifySentenceResponse.Data.Length"); i++) {
			Delta delta = new Delta();
			delta.setType(context.stringValue("VerifySentenceResponse.Data["+ i +"].Type"));

			Source source = new Source();
			source.setPosition(context.integerValue("VerifySentenceResponse.Data["+ i +"].Source.Position"));

			List<String> line = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("VerifySentenceResponse.Data["+ i +"].Source.Line.Length"); j++) {
				line.add(context.stringValue("VerifySentenceResponse.Data["+ i +"].Source.Line["+ j +"]"));
			}
			source.setLine(line);
			delta.setSource(source);

			Target target = new Target();
			target.setPosition(context.integerValue("VerifySentenceResponse.Data["+ i +"].Target.Position"));

			List<String> line1 = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("VerifySentenceResponse.Data["+ i +"].Target.Line.Length"); j++) {
				line1.add(context.stringValue("VerifySentenceResponse.Data["+ i +"].Target.Line["+ j +"]"));
			}
			target.setLine1(line1);
			delta.setTarget(target);

			data.add(delta);
		}
		verifySentenceResponse.setData(data);
	 
	 	return verifySentenceResponse;
	}
}