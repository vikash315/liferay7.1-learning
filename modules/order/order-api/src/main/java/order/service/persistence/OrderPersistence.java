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

package order.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import order.exception.NoSuchOrderException;

import order.model.Order;

/**
 * The persistence interface for the order service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see order.service.persistence.impl.OrderPersistenceImpl
 * @see OrderUtil
 * @generated
 */
@ProviderType
public interface OrderPersistence extends BasePersistence<Order> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrderUtil} to access the order persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching orders
	*/
	public java.util.List<Order> findByUuid(String uuid);

	/**
	* Returns a range of all the orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	*/
	public java.util.List<Order> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns an ordered range of all the orders where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the first order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the last order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the last order in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the orders before and after the current order in the ordered set where uuid = &#63;.
	*
	* @param orderNumber the primary key of the current order
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order
	* @throws NoSuchOrderException if a order with the primary key could not be found
	*/
	public Order[] findByUuid_PrevAndNext(long orderNumber, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Removes all the orders where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of orders where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching orders
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the order where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchOrderException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByUUID_G(String uuid, long groupId)
		throws NoSuchOrderException;

	/**
	* Returns the order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the order where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the order where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the order that was removed
	*/
	public Order removeByUUID_G(String uuid, long groupId)
		throws NoSuchOrderException;

	/**
	* Returns the number of orders where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching orders
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching orders
	*/
	public java.util.List<Order> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	*/
	public java.util.List<Order> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns an ordered range of all the orders where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the first order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the last order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the last order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the orders before and after the current order in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param orderNumber the primary key of the current order
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order
	* @throws NoSuchOrderException if a order with the primary key could not be found
	*/
	public Order[] findByUuid_C_PrevAndNext(long orderNumber, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Removes all the orders where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of orders where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching orders
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the orders where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching orders
	*/
	public java.util.List<Order> findByGroupId(long groupId);

	/**
	* Returns a range of all the orders where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	*/
	public java.util.List<Order> findByGroupId(long groupId, int start, int end);

	/**
	* Returns an ordered range of all the orders where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns an ordered range of all the orders where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByGroupId(long groupId, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the first order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByGroupId_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the last order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the last order in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByGroupId_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the orders before and after the current order in the ordered set where groupId = &#63;.
	*
	* @param orderNumber the primary key of the current order
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order
	* @throws NoSuchOrderException if a order with the primary key could not be found
	*/
	public Order[] findByGroupId_PrevAndNext(long orderNumber, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Removes all the orders where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeByGroupId(long groupId);

	/**
	* Returns the number of orders where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching orders
	*/
	public int countByGroupId(long groupId);

	/**
	* Returns all the orders where orderStatus = &#63;.
	*
	* @param orderStatus the order status
	* @return the matching orders
	*/
	public java.util.List<Order> findByO(String orderStatus);

	/**
	* Returns a range of all the orders where orderStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	*/
	public java.util.List<Order> findByO(String orderStatus, int start, int end);

	/**
	* Returns an ordered range of all the orders where orderStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByO(String orderStatus, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns an ordered range of all the orders where orderStatus = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByO(String orderStatus, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order in the ordered set where orderStatus = &#63;.
	*
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByO_First(String orderStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the first order in the ordered set where orderStatus = &#63;.
	*
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByO_First(String orderStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the last order in the ordered set where orderStatus = &#63;.
	*
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByO_Last(String orderStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the last order in the ordered set where orderStatus = &#63;.
	*
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByO_Last(String orderStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the orders before and after the current order in the ordered set where orderStatus = &#63;.
	*
	* @param orderNumber the primary key of the current order
	* @param orderStatus the order status
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order
	* @throws NoSuchOrderException if a order with the primary key could not be found
	*/
	public Order[] findByO_PrevAndNext(long orderNumber, String orderStatus,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Removes all the orders where orderStatus = &#63; from the database.
	*
	* @param orderStatus the order status
	*/
	public void removeByO(String orderStatus);

	/**
	* Returns the number of orders where orderStatus = &#63;.
	*
	* @param orderStatus the order status
	* @return the number of matching orders
	*/
	public int countByO(String orderStatus);

	/**
	* Returns all the orders where orderStatus = &#63; and location = &#63;.
	*
	* @param orderStatus the order status
	* @param location the location
	* @return the matching orders
	*/
	public java.util.List<Order> findByO_L(String orderStatus, String location);

	/**
	* Returns a range of all the orders where orderStatus = &#63; and location = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param location the location
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of matching orders
	*/
	public java.util.List<Order> findByO_L(String orderStatus, String location,
		int start, int end);

	/**
	* Returns an ordered range of all the orders where orderStatus = &#63; and location = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param location the location
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByO_L(String orderStatus, String location,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns an ordered range of all the orders where orderStatus = &#63; and location = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orderStatus the order status
	* @param location the location
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching orders
	*/
	public java.util.List<Order> findByO_L(String orderStatus, String location,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first order in the ordered set where orderStatus = &#63; and location = &#63;.
	*
	* @param orderStatus the order status
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByO_L_First(String orderStatus, String location,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the first order in the ordered set where orderStatus = &#63; and location = &#63;.
	*
	* @param orderStatus the order status
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByO_L_First(String orderStatus, String location,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the last order in the ordered set where orderStatus = &#63; and location = &#63;.
	*
	* @param orderStatus the order status
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order
	* @throws NoSuchOrderException if a matching order could not be found
	*/
	public Order findByO_L_Last(String orderStatus, String location,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Returns the last order in the ordered set where orderStatus = &#63; and location = &#63;.
	*
	* @param orderStatus the order status
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching order, or <code>null</code> if a matching order could not be found
	*/
	public Order fetchByO_L_Last(String orderStatus, String location,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns the orders before and after the current order in the ordered set where orderStatus = &#63; and location = &#63;.
	*
	* @param orderNumber the primary key of the current order
	* @param orderStatus the order status
	* @param location the location
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next order
	* @throws NoSuchOrderException if a order with the primary key could not be found
	*/
	public Order[] findByO_L_PrevAndNext(long orderNumber, String orderStatus,
		String location,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator)
		throws NoSuchOrderException;

	/**
	* Removes all the orders where orderStatus = &#63; and location = &#63; from the database.
	*
	* @param orderStatus the order status
	* @param location the location
	*/
	public void removeByO_L(String orderStatus, String location);

	/**
	* Returns the number of orders where orderStatus = &#63; and location = &#63;.
	*
	* @param orderStatus the order status
	* @param location the location
	* @return the number of matching orders
	*/
	public int countByO_L(String orderStatus, String location);

	/**
	* Caches the order in the entity cache if it is enabled.
	*
	* @param order the order
	*/
	public void cacheResult(Order order);

	/**
	* Caches the orders in the entity cache if it is enabled.
	*
	* @param orders the orders
	*/
	public void cacheResult(java.util.List<Order> orders);

	/**
	* Creates a new order with the primary key. Does not add the order to the database.
	*
	* @param orderNumber the primary key for the new order
	* @return the new order
	*/
	public Order create(long orderNumber);

	/**
	* Removes the order with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderNumber the primary key of the order
	* @return the order that was removed
	* @throws NoSuchOrderException if a order with the primary key could not be found
	*/
	public Order remove(long orderNumber) throws NoSuchOrderException;

	public Order updateImpl(Order order);

	/**
	* Returns the order with the primary key or throws a {@link NoSuchOrderException} if it could not be found.
	*
	* @param orderNumber the primary key of the order
	* @return the order
	* @throws NoSuchOrderException if a order with the primary key could not be found
	*/
	public Order findByPrimaryKey(long orderNumber) throws NoSuchOrderException;

	/**
	* Returns the order with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderNumber the primary key of the order
	* @return the order, or <code>null</code> if a order with the primary key could not be found
	*/
	public Order fetchByPrimaryKey(long orderNumber);

	@Override
	public java.util.Map<java.io.Serializable, Order> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the orders.
	*
	* @return the orders
	*/
	public java.util.List<Order> findAll();

	/**
	* Returns a range of all the orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @return the range of orders
	*/
	public java.util.List<Order> findAll(int start, int end);

	/**
	* Returns an ordered range of all the orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of orders
	*/
	public java.util.List<Order> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator);

	/**
	* Returns an ordered range of all the orders.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of orders
	* @param end the upper bound of the range of orders (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of orders
	*/
	public java.util.List<Order> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Order> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the orders from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of orders.
	*
	* @return the number of orders
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}