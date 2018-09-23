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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Order}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Order
 * @generated
 */
@ProviderType
public class OrderWrapper implements Order, ModelWrapper<Order> {
	public OrderWrapper(Order order) {
		_order = order;
	}

	@Override
	public Class<?> getModelClass() {
		return Order.class;
	}

	@Override
	public String getModelClassName() {
		return Order.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("orderNumber", getOrderNumber());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("orderStatus", getOrderStatus());
		attributes.put("accountName", getAccountName());
		attributes.put("orderStartDate", getOrderStartDate());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("location", getLocation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long orderNumber = (Long)attributes.get("orderNumber");

		if (orderNumber != null) {
			setOrderNumber(orderNumber);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String orderStatus = (String)attributes.get("orderStatus");

		if (orderStatus != null) {
			setOrderStatus(orderStatus);
		}

		String accountName = (String)attributes.get("accountName");

		if (accountName != null) {
			setAccountName(accountName);
		}

		Date orderStartDate = (Date)attributes.get("orderStartDate");

		if (orderStartDate != null) {
			setOrderStartDate(orderStartDate);
		}

		String createdBy = (String)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}
	}

	@Override
	public Object clone() {
		return new OrderWrapper((Order)_order.clone());
	}

	@Override
	public int compareTo(Order order) {
		return _order.compareTo(order);
	}

	/**
	* Returns the account name of this order.
	*
	* @return the account name of this order
	*/
	@Override
	public String getAccountName() {
		return _order.getAccountName();
	}

	/**
	* Returns the company ID of this order.
	*
	* @return the company ID of this order
	*/
	@Override
	public long getCompanyId() {
		return _order.getCompanyId();
	}

	/**
	* Returns the create date of this order.
	*
	* @return the create date of this order
	*/
	@Override
	public Date getCreateDate() {
		return _order.getCreateDate();
	}

	/**
	* Returns the created by of this order.
	*
	* @return the created by of this order
	*/
	@Override
	public String getCreatedBy() {
		return _order.getCreatedBy();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _order.getExpandoBridge();
	}

	/**
	* Returns the group ID of this order.
	*
	* @return the group ID of this order
	*/
	@Override
	public long getGroupId() {
		return _order.getGroupId();
	}

	/**
	* Returns the location of this order.
	*
	* @return the location of this order
	*/
	@Override
	public String getLocation() {
		return _order.getLocation();
	}

	/**
	* Returns the modified date of this order.
	*
	* @return the modified date of this order
	*/
	@Override
	public Date getModifiedDate() {
		return _order.getModifiedDate();
	}

	/**
	* Returns the order number of this order.
	*
	* @return the order number of this order
	*/
	@Override
	public long getOrderNumber() {
		return _order.getOrderNumber();
	}

	/**
	* Returns the order start date of this order.
	*
	* @return the order start date of this order
	*/
	@Override
	public Date getOrderStartDate() {
		return _order.getOrderStartDate();
	}

	/**
	* Returns the order status of this order.
	*
	* @return the order status of this order
	*/
	@Override
	public String getOrderStatus() {
		return _order.getOrderStatus();
	}

	/**
	* Returns the primary key of this order.
	*
	* @return the primary key of this order
	*/
	@Override
	public long getPrimaryKey() {
		return _order.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _order.getPrimaryKeyObj();
	}

	/**
	* Returns the user ID of this order.
	*
	* @return the user ID of this order
	*/
	@Override
	public long getUserId() {
		return _order.getUserId();
	}

	/**
	* Returns the user name of this order.
	*
	* @return the user name of this order
	*/
	@Override
	public String getUserName() {
		return _order.getUserName();
	}

	/**
	* Returns the user uuid of this order.
	*
	* @return the user uuid of this order
	*/
	@Override
	public String getUserUuid() {
		return _order.getUserUuid();
	}

	/**
	* Returns the uuid of this order.
	*
	* @return the uuid of this order
	*/
	@Override
	public String getUuid() {
		return _order.getUuid();
	}

	@Override
	public int hashCode() {
		return _order.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _order.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _order.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _order.isNew();
	}

	@Override
	public void persist() {
		_order.persist();
	}

	/**
	* Sets the account name of this order.
	*
	* @param accountName the account name of this order
	*/
	@Override
	public void setAccountName(String accountName) {
		_order.setAccountName(accountName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_order.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this order.
	*
	* @param companyId the company ID of this order
	*/
	@Override
	public void setCompanyId(long companyId) {
		_order.setCompanyId(companyId);
	}

	/**
	* Sets the create date of this order.
	*
	* @param createDate the create date of this order
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_order.setCreateDate(createDate);
	}

	/**
	* Sets the created by of this order.
	*
	* @param createdBy the created by of this order
	*/
	@Override
	public void setCreatedBy(String createdBy) {
		_order.setCreatedBy(createdBy);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_order.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_order.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_order.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this order.
	*
	* @param groupId the group ID of this order
	*/
	@Override
	public void setGroupId(long groupId) {
		_order.setGroupId(groupId);
	}

	/**
	* Sets the location of this order.
	*
	* @param location the location of this order
	*/
	@Override
	public void setLocation(String location) {
		_order.setLocation(location);
	}

	/**
	* Sets the modified date of this order.
	*
	* @param modifiedDate the modified date of this order
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_order.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_order.setNew(n);
	}

	/**
	* Sets the order number of this order.
	*
	* @param orderNumber the order number of this order
	*/
	@Override
	public void setOrderNumber(long orderNumber) {
		_order.setOrderNumber(orderNumber);
	}

	/**
	* Sets the order start date of this order.
	*
	* @param orderStartDate the order start date of this order
	*/
	@Override
	public void setOrderStartDate(Date orderStartDate) {
		_order.setOrderStartDate(orderStartDate);
	}

	/**
	* Sets the order status of this order.
	*
	* @param orderStatus the order status of this order
	*/
	@Override
	public void setOrderStatus(String orderStatus) {
		_order.setOrderStatus(orderStatus);
	}

	/**
	* Sets the primary key of this order.
	*
	* @param primaryKey the primary key of this order
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_order.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_order.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the user ID of this order.
	*
	* @param userId the user ID of this order
	*/
	@Override
	public void setUserId(long userId) {
		_order.setUserId(userId);
	}

	/**
	* Sets the user name of this order.
	*
	* @param userName the user name of this order
	*/
	@Override
	public void setUserName(String userName) {
		_order.setUserName(userName);
	}

	/**
	* Sets the user uuid of this order.
	*
	* @param userUuid the user uuid of this order
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_order.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this order.
	*
	* @param uuid the uuid of this order
	*/
	@Override
	public void setUuid(String uuid) {
		_order.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Order> toCacheModel() {
		return _order.toCacheModel();
	}

	@Override
	public Order toEscapedModel() {
		return new OrderWrapper(_order.toEscapedModel());
	}

	@Override
	public String toString() {
		return _order.toString();
	}

	@Override
	public Order toUnescapedModel() {
		return new OrderWrapper(_order.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _order.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderWrapper)) {
			return false;
		}

		OrderWrapper orderWrapper = (OrderWrapper)obj;

		if (Objects.equals(_order, orderWrapper._order)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _order.getStagedModelType();
	}

	@Override
	public Order getWrappedModel() {
		return _order;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _order.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _order.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_order.resetOriginalValues();
	}

	private final Order _order;
}