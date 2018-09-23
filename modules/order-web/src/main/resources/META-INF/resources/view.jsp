<%@page import="order.model.Order"%>
<%@page import="order.service.OrderLocalServiceUtil"%>
<%@ include file="./init.jsp" %>

<p>
	<b><liferay-ui:message key="orderweb.caption"/></b>
</p>

<portlet:actionURL name="addOrder" var="addOrderURL"></portlet:actionURL>

<aui:form action="<%=addOrderURL.toString() %>" method="post" name="fm">
	<aui:input name="orderNumber" type="text" label="Order Number" value="0"/>
	<aui:input name="orderStatus" type="text" label="orderStatus"/>
	<aui:input name="accountName" type="text" label="accountName"/>
	<aui:input name="orderStartDate" type="text" label="orderStartDate"/>
	<aui:input name="createdBy" type="text" label="createdBy"/>
	<aui:input name="location" type="text" label="location"/>
	<aui:button-row>
		<aui:button type="submit"/>
		<aui:button type="cancel"/>
	</aui:button-row>
</aui:form>
	
<hr>


<liferay-ui:search-container total="<%=OrderLocalServiceUtil.getOrdersCountByGroupId(scopeGroupId.longValue())%>">
<liferay-ui:search-container-results
    results="<%= OrderLocalServiceUtil.getOrdersByGroupId(scopeGroupId.longValue(),
                    searchContainer.getStart(),
                    searchContainer.getEnd())%>" />

<liferay-ui:search-container-row
    className="order.model.Order" modelVar="order">

    <liferay-ui:search-container-column-text property="orderNumber" title="OrderNumber" />

    <liferay-ui:search-container-column-text property="orderStatus" title="OrderStatus" />
    
    <liferay-ui:search-container-column-text property="accountName" title="AccountName"/>
    <liferay-ui:search-container-column-text property="orderStartDate" title="OrderStartDate"/>
    <liferay-ui:search-container-column-text property="createdBy" title="CreatedBy"/>
    <liferay-ui:search-container-column-text property="location" title="Location"/>

</liferay-ui:search-container-row>

<liferay-ui:search-iterator />

</liferay-ui:search-container>