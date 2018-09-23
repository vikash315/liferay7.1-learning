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

package order.model;

import aQute.bnd.annotation.ProviderType;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link order.service.http.OrderServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see order.service.http.OrderServiceSoap
 * @generated
 */
@ProviderType
public class OrderSoap implements Serializable {
	public static OrderSoap toSoapModel(Order model) {
		OrderSoap soapModel = new OrderSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setOrderNumber(model.getOrderNumber());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setOrderStatus(model.getOrderStatus());
		soapModel.setAccountName(model.getAccountName());
		soapModel.setOrderStartDate(model.getOrderStartDate());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setLocation(model.getLocation());

		return soapModel;
	}

	public static OrderSoap[] toSoapModels(Order[] models) {
		OrderSoap[] soapModels = new OrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[][] toSoapModels(Order[][] models) {
		OrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[] toSoapModels(List<Order> models) {
		List<OrderSoap> soapModels = new ArrayList<OrderSoap>(models.size());

		for (Order model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrderSoap[soapModels.size()]);
	}

	public OrderSoap() {
	}

	public long getPrimaryKey() {
		return _orderNumber;
	}

	public void setPrimaryKey(long pk) {
		setOrderNumber(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getOrderNumber() {
		return _orderNumber;
	}

	public void setOrderNumber(long orderNumber) {
		_orderNumber = orderNumber;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getOrderStatus() {
		return _orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		_orderStatus = orderStatus;
	}

	public String getAccountName() {
		return _accountName;
	}

	public void setAccountName(String accountName) {
		_accountName = accountName;
	}

	public Date getOrderStartDate() {
		return _orderStartDate;
	}

	public void setOrderStartDate(Date orderStartDate) {
		_orderStartDate = orderStartDate;
	}

	public String getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(String createdBy) {
		_createdBy = createdBy;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	private String _uuid;
	private long _orderNumber;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _orderStatus;
	private String _accountName;
	private Date _orderStartDate;
	private String _createdBy;
	private String _location;
}