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

package order.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.util.Date;
import java.util.List;

import order.model.Order;
import order.service.base.OrderLocalServiceBaseImpl;

/**
 * The implementation of the order local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link order.service.OrderLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrderLocalServiceBaseImpl
 * @see order.service.OrderLocalServiceUtil
 */
public class OrderLocalServiceImpl extends OrderLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link order.service.OrderLocalServiceUtil} to access the order local service.
	 */
	
	public Order addOrder(long userId, String orderStatus, String accountName, Date orderStartDate, String createdBy,
			String location, ServiceContext serviceContext) throws PortalException {

		long groupId = serviceContext.getScopeGroupId();

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		long orderNumber = counterLocalService.increment();

		Order order = orderPersistence.create(orderNumber);

		order.setUuid(serviceContext.getUuid());
		order.setUserId(userId);
		order.setGroupId(groupId);
		order.setCompanyId(user.getCompanyId());
		order.setUserName(user.getFullName());
		order.setCreateDate(serviceContext.getCreateDate(now));
		order.setModifiedDate(serviceContext.getModifiedDate(now));
		order.setOrderStatus(orderStatus);
		order.setAccountName(accountName);
		order.setOrderStartDate(orderStartDate);
		order.setCreatedBy(createdBy);
		order.setLocation(location);

		order.setExpandoBridgeAttributes(serviceContext);

		orderPersistence.update(order);

		return order;

	}

	public Order updateOrder(long userId, long orderNumber, String orderStatus, String accountName, Date orderStartDate,
			String createdBy, String location, ServiceContext serviceContext) throws PortalException {

		User user = userLocalService.getUserById(userId);

		Date now = new Date();

		Order order = getOrder(orderNumber);

		order.setUserId(userId);
		order.setUserName(user.getFullName());
		order.setModifiedDate(serviceContext.getModifiedDate(now));
		order.setOrderStatus(orderStatus);
		order.setAccountName(accountName);
		order.setOrderStartDate(orderStartDate);
		order.setCreatedBy(createdBy);
		order.setLocation(location);

		order.setExpandoBridgeAttributes(serviceContext);

		orderPersistence.update(order);

		return order;

	}

	public Order deleteOrder(long orderNumber, ServiceContext serviceContext) throws PortalException {

		Order order = getOrder(orderNumber);

		order = deleteOrder(orderNumber);

		return order;
	}

	
	public List<Order> getOrdersByGroupId(long groupId) {

	    return orderPersistence.findByGroupId(groupId);
	}

	public List<Order> getOrdersByGroupId(long groupId, int start, int end, 
	    OrderByComparator<Order> obc) {

	    return orderPersistence.findByGroupId(groupId, start, end, obc);
	}

	public List<Order> getOrdersByGroupId(long groupId, int start, int end) {

	    return orderPersistence.findByGroupId(groupId, start, end);
	}

	public int getOrdersCountByGroupId(long groupId) {

	    return orderPersistence.countByGroupId(groupId);
	}
}