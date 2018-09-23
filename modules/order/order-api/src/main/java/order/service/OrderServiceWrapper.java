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

package order.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OrderService}.
 *
 * @author Brian Wing Shun Chan
 * @see OrderService
 * @generated
 */
@ProviderType
public class OrderServiceWrapper implements OrderService,
	ServiceWrapper<OrderService> {
	public OrderServiceWrapper(OrderService orderService) {
		_orderService = orderService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _orderService.getOSGiServiceIdentifier();
	}

	@Override
	public OrderService getWrappedService() {
		return _orderService;
	}

	@Override
	public void setWrappedService(OrderService orderService) {
		_orderService = orderService;
	}

	private OrderService _orderService;
}