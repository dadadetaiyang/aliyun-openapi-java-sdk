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
package com.aliyuncs.slb.model.v20140515;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SetVServerGroupAttributeRequest extends RpcAcsRequest<SetVServerGroupAttributeResponse> {
	
	public SetVServerGroupAttributeRequest() {
		super("Slb", "2014-05-15", "SetVServerGroupAttribute");
	}

	private Long ownerId;

	private String resourceOwnerAccount;

	private Long resourceOwnerId;

	private String ownerAccount;

	private String access_key_id;

	private String tags;

	private String vServerGroupId;

	private String vServerGroupName;

	private String backendServers;

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		putQueryParameter("OwnerId", ownerId);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		putQueryParameter("ResourceOwnerId", resourceOwnerId);
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		putQueryParameter("OwnerAccount", ownerAccount);
	}

	public String getaccess_key_id() {
		return this.access_key_id;
	}

	public void setaccess_key_id(String access_key_id) {
		this.access_key_id = access_key_id;
		putQueryParameter("access_key_id", access_key_id);
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		putQueryParameter("Tags", tags);
	}

	public String getVServerGroupId() {
		return this.vServerGroupId;
	}

	public void setVServerGroupId(String vServerGroupId) {
		this.vServerGroupId = vServerGroupId;
		putQueryParameter("VServerGroupId", vServerGroupId);
	}

	public String getVServerGroupName() {
		return this.vServerGroupName;
	}

	public void setVServerGroupName(String vServerGroupName) {
		this.vServerGroupName = vServerGroupName;
		putQueryParameter("VServerGroupName", vServerGroupName);
	}

	public String getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(String backendServers) {
		this.backendServers = backendServers;
		putQueryParameter("BackendServers", backendServers);
	}

	@Override
	public Class<SetVServerGroupAttributeResponse> getResponseClass() {
		return SetVServerGroupAttributeResponse.class;
	}

}