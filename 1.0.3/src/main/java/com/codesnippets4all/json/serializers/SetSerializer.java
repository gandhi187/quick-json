/*   Copyright 2013 Rajesh Putta

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 * 
 * 
 */

package com.codesnippets4all.json.serializers;

import java.util.Set;

import com.codesnippets4all.json.exceptions.SerializingException;
import com.codesnippets4all.json.serializers.pojos.SerializerOptions;

public class SetSerializer extends IterableDataSerializer implements JsonSerializer {
	public void serialize(Object toBeSerialized, StringBuilder serializedData,
				SerializerOptions options) {

		if(toBeSerialized==null || !(toBeSerialized instanceof Set))
		{
			throw new SerializingException("input object is not an instance of Set");
		}
		
		Set valueSet=(Set)toBeSerialized;
		
		super.serialize(valueSet, serializedData, options);
	}	
}
