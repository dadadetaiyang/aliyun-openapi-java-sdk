/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.CreateClusterRequest;
import com.aliyuncs.exceptions.ClientException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;


public class CreateClusterRequestMarshaller {

    public static CreateClusterRequest marshall(CreateClusterRequest req) throws ClientException {

        ObjectMapper mapper = new ObjectMapper();

        //null或“”不序列化
        mapper.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);

        String contentString = null;
        try {
            contentString = mapper.writeValueAsString(req.getClusterDescription());
        } catch (IOException e) {
            //e.printStackTrace();
            throw new ClientException("API.EncodeError", "encode request body error");
        }


        req.setContent(contentString.getBytes(), req.getEncoding(), req.getAcceptFormat());

        return req;
    }
}