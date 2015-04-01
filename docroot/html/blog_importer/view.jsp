<%@ include file="/html/init.jsp" %>

<liferay-ui:error exception="<%=AxisFault.class %>" message="an-axis-fault-occurred" />
<liferay-ui:error exception="<%=NoSuchCompanyException.class %>" message="company-does-not-exist" />
<liferay-ui:error exception="<%=NoSuchGroupException.class %>" message="group-does-not-exist" />

<liferay-portlet:actionURL name="blogImport" var="blogImportURL" />
<aui:form action="<%=blogImportURL %>" method="post" name="fm">
	<aui:input name="virtualHost" required="true" />
	<aui:select name="protocol" required="true" showEmptyOption="false">
		<aui:option label="<%=Http.HTTP %>" value="<%=Http.HTTP %>" />
		<aui:option label="<%=Http.HTTPS %>" value="<%=Http.HTTPS %>" />
	</aui:select>
	<aui:input label="user-name" name="username" required="true" />
	<aui:input name="password" required="true" type="password" />
	<aui:input helpMessage="import-api-does-not-paginate" label="maximum-entries-to-import" name="max" required="true" type="number" value="500" />
	<aui:input checked="true" name="removeEntries" type="checkbox" />
	<aui:input name="includeAnonymousComments" type="checkbox" />
	
	<aui:button-row>
		<aui:button type="submit" value="import" />
	</aui:button-row>
</aui:form>