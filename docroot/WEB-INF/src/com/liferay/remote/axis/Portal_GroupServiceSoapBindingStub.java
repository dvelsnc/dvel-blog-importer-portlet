/**
 * Portal_GroupServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class Portal_GroupServiceSoapBindingStub
	extends org.apache.axis.client.Stub
	implements com.liferay.remote.axis.GroupServiceSoap {

	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[20];
		_initOperationDesc1();
		_initOperationDesc2();
	}

	private static void _initOperationDesc1() {

		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("search");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "name"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "description"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "params"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.portal.liferay.com", "ArrayOf_xsd_string"),
				java.lang.String[].class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "start"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "end"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "ArrayOf_tns2_GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "searchReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "getGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "name"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "getGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "liveGroupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "name"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "description"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "type"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "friendlyURL"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "active"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "serviceContext"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://service.portal.liferay.com", "ServiceContext"),
				com.liferay.remote.axis.ServiceContext.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "addGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "name"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "description"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "type"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "friendlyURL"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "active"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "serviceContext"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://service.portal.liferay.com", "ServiceContext"),
				com.liferay.remote.axis.ServiceContext.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "addGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addRoleGroups");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "roleId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupIds"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.portal.liferay.com", "ArrayOf_xsd_long"),
				long[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("deleteGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getManageableGroups");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "actionId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "max"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "ArrayOf_tns2_GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getManageableGroupsReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getOrganizationsGroups");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "organizations"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.portal.liferay.com",
					"ArrayOf_tns2_OrganizationSoap"),
				com.liferay.remote.axis.OrganizationSoap[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "ArrayOf_tns2_GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getOrganizationsGroupsReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getUserGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "userId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getUserGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {

		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getUserGroupsGroups");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "userGroups"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.portal.liferay.com",
					"ArrayOf_tns2_UserGroupSoap"),
				com.liferay.remote.axis.UserGroupSoap[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "ArrayOf_tns2_GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getUserGroupsGroupsReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[10] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getUserOrganizationsGroups");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "userId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "start"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "end"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "ArrayOf_tns2_GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getUserOrganizationsGroupsReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[11] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("hasUserGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "userId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "boolean"));
		oper.setReturnClass(boolean.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "hasUserGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[12] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("searchCount");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "companyId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "name"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "description"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "params"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.portal.liferay.com", "ArrayOf_xsd_string"),
				java.lang.String[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "int"));
		oper.setReturnClass(int.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "searchCountReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[13] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("setRoleGroups");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "roleId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupIds"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.portal.liferay.com", "ArrayOf_xsd_long"),
				long[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[14] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("unsetRoleGroups");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "roleId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupIds"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.portal.liferay.com", "ArrayOf_xsd_long"),
				long[].class, false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[15] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateFriendlyURL");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "friendlyURL"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "updateFriendlyURLReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[16] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "typeSettings"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "updateGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[17] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateGroup");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "name"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "description"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "type"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "friendlyURL"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "active"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "serviceContext"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://service.portal.liferay.com", "ServiceContext"),
				com.liferay.remote.axis.ServiceContext.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "updateGroupReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[18] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateWorkflow");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "groupId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "workflowEnabled"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "workflowStages"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "workflowRoleNames"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "GroupSoap"));
		oper.setReturnClass(com.liferay.remote.axis.GroupSoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "updateWorkflowReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[19] = oper;

	}

	public Portal_GroupServiceSoapBindingStub()
		throws org.apache.axis.AxisFault {

		this(null);
	}

	public Portal_GroupServiceSoapBindingStub(
		java.net.URL endpointURL, javax.xml.rpc.Service service)
		throws org.apache.axis.AxisFault {

		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public Portal_GroupServiceSoapBindingStub(javax.xml.rpc.Service service)
		throws org.apache.axis.AxisFault {

		if (service == null) {
			super.service = new org.apache.axis.client.Service();
		}
		else {
			super.service = service;
		}
		((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
		java.lang.Class cls;
		javax.xml.namespace.QName qName;
		javax.xml.namespace.QName qName2;
		java.lang.Class beansf =
			org.apache.axis.encoding.ser.BeanSerializerFactory.class;
		java.lang.Class beandf =
			org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
		java.lang.Class enumsf =
			org.apache.axis.encoding.ser.EnumSerializerFactory.class;
		java.lang.Class enumdf =
			org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
		java.lang.Class arraysf =
			org.apache.axis.encoding.ser.ArraySerializerFactory.class;
		java.lang.Class arraydf =
			org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
		java.lang.Class simplesf =
			org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
		java.lang.Class simpledf =
			org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
		java.lang.Class simplelistsf =
			org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
		java.lang.Class simplelistdf =
			org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
		qName =
			new javax.xml.namespace.QName(
				"http://model.portal.liferay.com", "GroupSoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.GroupSoap.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"http://model.portal.liferay.com", "OrganizationSoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.OrganizationSoap.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"http://model.portal.liferay.com", "PortletPreferencesIds");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.PortletPreferencesIds.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"http://model.portal.liferay.com", "UserGroupSoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.UserGroupSoap.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"http://service.portal.liferay.com", "ServiceContext");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.ServiceContext.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.portal.liferay.com", "ArrayOf_tns2_GroupSoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.GroupSoap[].class;
		cachedSerClasses.add(cls);
		qName =
			new javax.xml.namespace.QName(
				"http://model.portal.liferay.com", "GroupSoap");
		qName2 = null;
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
			qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.portal.liferay.com",
				"ArrayOf_tns2_OrganizationSoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.OrganizationSoap[].class;
		cachedSerClasses.add(cls);
		qName =
			new javax.xml.namespace.QName(
				"http://model.portal.liferay.com", "OrganizationSoap");
		qName2 = null;
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
			qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.portal.liferay.com",
				"ArrayOf_tns2_UserGroupSoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.UserGroupSoap[].class;
		cachedSerClasses.add(cls);
		qName =
			new javax.xml.namespace.QName(
				"http://model.portal.liferay.com", "UserGroupSoap");
		qName2 = null;
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
			qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.portal.liferay.com", "ArrayOf_xsd_long");
		cachedSerQNames.add(qName);
		cls = long[].class;
		cachedSerClasses.add(cls);
		qName =
			new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "long");
		qName2 = null;
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
			qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.portal.liferay.com", "ArrayOf_xsd_string");
		cachedSerQNames.add(qName);
		cls = java.lang.String[].class;
		cachedSerClasses.add(cls);
		qName =
			new javax.xml.namespace.QName(
				"http://schemas.xmlsoap.org/soap/encoding/", "string");
		qName2 = null;
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
			qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

	}

	protected org.apache.axis.client.Call createCall()
		throws java.rmi.RemoteException {

		try {
			org.apache.axis.client.Call _call = super._createCall();
			if (super.maintainSessionSet) {
				_call.setMaintainSession(super.maintainSession);
			}
			if (super.cachedUsername != null) {
				_call.setUsername(super.cachedUsername);
			}
			if (super.cachedPassword != null) {
				_call.setPassword(super.cachedPassword);
			}
			if (super.cachedEndpoint != null) {
				_call.setTargetEndpointAddress(super.cachedEndpoint);
			}
			if (super.cachedTimeout != null) {
				_call.setTimeout(super.cachedTimeout);
			}
			if (super.cachedPortName != null) {
				_call.setPortName(super.cachedPortName);
			}
			java.util.Enumeration keys = super.cachedProperties.keys();
			while (keys.hasMoreElements()) {
				java.lang.String key = (java.lang.String) keys.nextElement();
				_call.setProperty(key, super.cachedProperties.get(key));
			}
			// All the type mapping information is registered
			// when the first call is made.
			// The type mapping information is actually registered in
			// the TypeMappingRegistry of the service, which
			// is the reason why registration is only needed for the first call.
			synchronized (this) {
				if (firstCall()) {
					// must set encoding style before registering serializers
					_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
					_call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
					for (int i = 0; i < cachedSerFactories.size(); ++i) {
						java.lang.Class cls =
							(java.lang.Class) cachedSerClasses.get(i);
						javax.xml.namespace.QName qName =
							(javax.xml.namespace.QName) cachedSerQNames.get(i);
						java.lang.Object x = cachedSerFactories.get(i);
						if (x instanceof Class) {
							java.lang.Class sf =
								(java.lang.Class) cachedSerFactories.get(i);
							java.lang.Class df =
								(java.lang.Class) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
						else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
							org.apache.axis.encoding.SerializerFactory sf =
								(org.apache.axis.encoding.SerializerFactory) cachedSerFactories.get(i);
							org.apache.axis.encoding.DeserializerFactory df =
								(org.apache.axis.encoding.DeserializerFactory) cachedDeserFactories.get(i);
							_call.registerTypeMapping(cls, qName, sf, df, false);
						}
					}
				}
			}
			return _call;
		}
		catch (java.lang.Throwable _t) {
			throw new org.apache.axis.AxisFault(
				"Failure trying to get the Call object", _t);
		}
	}

	public com.liferay.remote.axis.GroupSoap[] search(
		long companyId, java.lang.String name, java.lang.String description,
		java.lang.String[] params, int start, int end)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[0]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "search"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(companyId), name, description, params,
					new java.lang.Integer(start), new java.lang.Integer(end)
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap getGroup(long groupId)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[1]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "getGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap getGroup(
		long companyId, java.lang.String name)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[2]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "getGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(companyId), name
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap addGroup(
		long liveGroupId, java.lang.String name, java.lang.String description,
		int type, java.lang.String friendlyURL, boolean active,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[3]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "addGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(liveGroupId), name, description,
					new java.lang.Integer(type), friendlyURL,
					new java.lang.Boolean(active), serviceContext
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap addGroup(
		java.lang.String name, java.lang.String description, int type,
		java.lang.String friendlyURL, boolean active,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[4]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "addGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					name, description, new java.lang.Integer(type),
					friendlyURL, new java.lang.Boolean(active), serviceContext
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public void addRoleGroups(long roleId, long[] groupIds)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "addRoleGroups"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(roleId), groupIds
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public void deleteGroup(long groupId)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[6]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "deleteGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap[] getManageableGroups(
		java.lang.String actionId, int max)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[7]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "getManageableGroups"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				actionId, new java.lang.Integer(max)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap[] getOrganizationsGroups(
		com.liferay.remote.axis.OrganizationSoap[] organizations)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[8]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "getOrganizationsGroups"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				organizations
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap getUserGroup(
		long companyId, long userId)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[9]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "getUserGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(companyId), new java.lang.Long(userId)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap[] getUserGroupsGroups(
		com.liferay.remote.axis.UserGroupSoap[] userGroups)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[10]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "getUserGroupsGroups"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				userGroups
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap[] getUserOrganizationsGroups(
		long userId, int start, int end)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[11]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "getUserOrganizationsGroups"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(userId), new java.lang.Integer(start),
					new java.lang.Integer(end)
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public boolean hasUserGroup(long userId, long groupId)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[12]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "hasUserGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(userId), new java.lang.Long(groupId)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return ((java.lang.Boolean) _resp).booleanValue();
				}
				catch (java.lang.Exception _exception) {
					return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(
						_resp, boolean.class)).booleanValue();
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public int searchCount(
		long companyId, java.lang.String name, java.lang.String description,
		java.lang.String[] params)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[13]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "searchCount"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(companyId), name, description, params
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return ((java.lang.Integer) _resp).intValue();
				}
				catch (java.lang.Exception _exception) {
					return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(
						_resp, int.class)).intValue();
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public void setRoleGroups(long roleId, long[] groupIds)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[14]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "setRoleGroups"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(roleId), groupIds
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public void unsetRoleGroups(long roleId, long[] groupIds)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[15]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "unsetRoleGroups"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(roleId), groupIds
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			extractAttachments(_call);
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap updateFriendlyURL(
		long groupId, java.lang.String friendlyURL)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[16]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "updateFriendlyURL"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId), friendlyURL
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap updateGroup(
		long groupId, java.lang.String typeSettings)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[17]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "updateGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId), typeSettings
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap updateGroup(
		long groupId, java.lang.String name, java.lang.String description,
		int type, java.lang.String friendlyURL, boolean active,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[18]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "updateGroup"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(groupId), name, description,
					new java.lang.Integer(type), friendlyURL,
					new java.lang.Boolean(active), serviceContext
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.GroupSoap updateWorkflow(
		long groupId, boolean workflowEnabled, int workflowStages,
		java.lang.String workflowRoleNames)
		throws java.rmi.RemoteException {

		if (super.cachedEndpoint == null) {
			throw new org.apache.axis.NoEndPointException();
		}
		org.apache.axis.client.Call _call = createCall();
		_call.setOperation(_operations[19]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.portal.liferay.com", "updateWorkflow"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(groupId),
					new java.lang.Boolean(workflowEnabled),
					new java.lang.Integer(workflowStages), workflowRoleNames
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.GroupSoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.GroupSoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.GroupSoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
