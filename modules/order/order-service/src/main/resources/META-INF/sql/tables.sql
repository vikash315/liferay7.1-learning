create table web_Order (
	uuid_ VARCHAR(75) null,
	orderNumber LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	orderStatus VARCHAR(75) null,
	accountName VARCHAR(75) null,
	orderStartDate DATE null,
	createdBy VARCHAR(75) null,
	location VARCHAR(75) null
);