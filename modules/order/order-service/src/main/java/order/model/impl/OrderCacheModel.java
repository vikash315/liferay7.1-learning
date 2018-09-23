/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package order.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import order.model.Order;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Order in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Order
 * @generated
 */
@ProviderType
public class OrderCacheModel implements CacheModel<Order>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderCacheModel)) {
			return false;
		}

		OrderCacheModel orderCacheModel = (OrderCacheModel)obj;

		if (orderNumber == orderCacheModel.orderNumber) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, orderNumber);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", orderNumber=");
		sb.append(orderNumber);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", orderStatus=");
		sb.append(orderStatus);
		sb.append(", accountName=");
		sb.append(accountName);
		sb.append(", orderStartDate=");
		sb.append(orderStartDate);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", location=");
		sb.append(location);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Order toEntityModel() {
		OrderImpl orderImpl = new OrderImpl();

		if (uuid == null) {
			orderImpl.setUuid("");
		}
		else {
			orderImpl.setUuid(uuid);
		}

		orderImpl.setOrderNumber(orderNumber);
		orderImpl.setGroupId(groupId);
		orderImpl.setCompanyId(companyId);
		orderImpl.setUserId(userId);

		if (userName == null) {
			orderImpl.setUserName("");
		}
		else {
			orderImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			orderImpl.setCreateDate(null);
		}
		else {
			orderImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			orderImpl.setModifiedDate(null);
		}
		else {
			orderImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (orderStatus == null) {
			orderImpl.setOrderStatus("");
		}
		else {
			orderImpl.setOrderStatus(orderStatus);
		}

		if (accountName == null) {
			orderImpl.setAccountName("");
		}
		else {
			orderImpl.setAccountName(accountName);
		}

		if (orderStartDate == Long.MIN_VALUE) {
			orderImpl.setOrderStartDate(null);
		}
		else {
			orderImpl.setOrderStartDate(new Date(orderStartDate));
		}

		if (createdBy == null) {
			orderImpl.setCreatedBy("");
		}
		else {
			orderImpl.setCreatedBy(createdBy);
		}

		if (location == null) {
			orderImpl.setLocation("");
		}
		else {
			orderImpl.setLocation(location);
		}

		orderImpl.resetOriginalValues();

		return orderImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		orderNumber = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		orderStatus = objectInput.readUTF();
		accountName = objectInput.readUTF();
		orderStartDate = objectInput.readLong();
		createdBy = objectInput.readUTF();
		location = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(orderNumber);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (orderStatus == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orderStatus);
		}

		if (accountName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(accountName);
		}

		objectOutput.writeLong(orderStartDate);

		if (createdBy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(createdBy);
		}

		if (location == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(location);
		}
	}

	public String uuid;
	public long orderNumber;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String orderStatus;
	public String accountName;
	public long orderStartDate;
	public String createdBy;
	public String location;
}