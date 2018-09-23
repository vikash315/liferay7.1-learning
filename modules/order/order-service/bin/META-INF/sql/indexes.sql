create index IX_D0243941 on web_Order (groupId);
create index IX_110656D0 on web_Order (orderStatus[$COLUMN_LENGTH:75$], location[$COLUMN_LENGTH:75$]);
create index IX_9689F73D on web_Order (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_F7B128FF on web_Order (uuid_[$COLUMN_LENGTH:75$], groupId);