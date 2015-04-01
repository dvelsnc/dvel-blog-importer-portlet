/**
 * Portlet_Blogs_BlogsEntryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class Portlet_Blogs_BlogsEntryServiceSoapBindingStub
	extends org.apache.axis.client.Stub
	implements com.liferay.remote.axis.BlogsEntryServiceSoap {

	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[8];
		_initOperationDesc1();
	}

	private static void _initOperationDesc1() {

		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addEntry");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "title"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "content"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateMonth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateDay"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateYear"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateHour"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateMinute"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "draft"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "allowTrackbacks"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "trackbacks"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.blogs.portlet.liferay.com",
					"ArrayOf_xsd_string"), java.lang.String[].class, false,
				false);
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
			"http://model.blogs.portlet.liferay.com", "BlogsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.BlogsEntrySoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "addEntryReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[0] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getEntry");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "entryId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.blogs.portlet.liferay.com", "BlogsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.BlogsEntrySoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "getEntryReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getEntry");
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
				new javax.xml.namespace.QName("", "urlTitle"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.blogs.portlet.liferay.com", "BlogsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.BlogsEntrySoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "getEntryReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("deleteEntry");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "entryId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("updateEntry");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "entryId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "title"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "content"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateMonth"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateDay"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateYear"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateHour"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "displayDateMinute"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "draft"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "allowTrackbacks"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "boolean"),
				boolean.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "trackbacks"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.blogs.portlet.liferay.com",
					"ArrayOf_xsd_string"), java.lang.String[].class, false,
				false);
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
			"http://model.blogs.portlet.liferay.com", "BlogsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.BlogsEntrySoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "updateEntryReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[4] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getCompanyEntries");
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
				new javax.xml.namespace.QName("", "max"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.blogs.portlet.liferay.com",
			"ArrayOf_tns4_BlogsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.BlogsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getCompanyEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[5] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getGroupEntries");
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
				new javax.xml.namespace.QName("", "max"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "int"), int.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.blogs.portlet.liferay.com",
			"ArrayOf_tns4_BlogsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.BlogsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getGroupEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getOrganizationEntries");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "organizationId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
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
			"urn:http.service.blogs.portlet.liferay.com",
			"ArrayOf_tns4_BlogsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.BlogsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getOrganizationEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[7] = oper;

	}

	public Portlet_Blogs_BlogsEntryServiceSoapBindingStub()
		throws org.apache.axis.AxisFault {

		this(null);
	}

	public Portlet_Blogs_BlogsEntryServiceSoapBindingStub(
		java.net.URL endpointURL, javax.xml.rpc.Service service)
		throws org.apache.axis.AxisFault {

		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public Portlet_Blogs_BlogsEntryServiceSoapBindingStub(
		javax.xml.rpc.Service service)
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
				"http://model.blogs.portlet.liferay.com", "BlogsEntrySoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.BlogsEntrySoap.class;
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
				"http://service.portal.liferay.com", "ServiceContext");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.ServiceContext.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.blogs.portlet.liferay.com",
				"ArrayOf_tns4_BlogsEntrySoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.BlogsEntrySoap[].class;
		cachedSerClasses.add(cls);
		qName =
			new javax.xml.namespace.QName(
				"http://model.blogs.portlet.liferay.com", "BlogsEntrySoap");
		qName2 = null;
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
			qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.blogs.portlet.liferay.com",
				"ArrayOf_xsd_string");
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

	public com.liferay.remote.axis.BlogsEntrySoap addEntry(
		java.lang.String title, java.lang.String content, int displayDateMonth,
		int displayDateDay, int displayDateYear, int displayDateHour,
		int displayDateMinute, boolean draft, boolean allowTrackbacks,
		java.lang.String[] trackbacks,
		com.liferay.remote.axis.ServiceContext serviceContext)
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
			"urn:http.service.blogs.portlet.liferay.com", "addEntry"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					title, content, new java.lang.Integer(displayDateMonth),
					new java.lang.Integer(displayDateDay),
					new java.lang.Integer(displayDateYear),
					new java.lang.Integer(displayDateHour),
					new java.lang.Integer(displayDateMinute),
					new java.lang.Boolean(draft),
					new java.lang.Boolean(allowTrackbacks), trackbacks,
					serviceContext
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.BlogsEntrySoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.BlogsEntrySoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.BlogsEntrySoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.BlogsEntrySoap getEntry(long entryId)
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
			"urn:http.service.blogs.portlet.liferay.com", "getEntry"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(entryId)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.BlogsEntrySoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.BlogsEntrySoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.BlogsEntrySoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.BlogsEntrySoap getEntry(
		long groupId, java.lang.String urlTitle)
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
			"urn:http.service.blogs.portlet.liferay.com", "getEntry"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId), urlTitle
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.BlogsEntrySoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.BlogsEntrySoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.BlogsEntrySoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public void deleteEntry(long entryId)
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
			"urn:http.service.blogs.portlet.liferay.com", "deleteEntry"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(entryId)
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

	public com.liferay.remote.axis.BlogsEntrySoap updateEntry(
		long entryId, java.lang.String title, java.lang.String content,
		int displayDateMonth, int displayDateDay, int displayDateYear,
		int displayDateHour, int displayDateMinute, boolean draft,
		boolean allowTrackbacks, java.lang.String[] trackbacks,
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
			"urn:http.service.blogs.portlet.liferay.com", "updateEntry"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(entryId), title, content,
					new java.lang.Integer(displayDateMonth),
					new java.lang.Integer(displayDateDay),
					new java.lang.Integer(displayDateYear),
					new java.lang.Integer(displayDateHour),
					new java.lang.Integer(displayDateMinute),
					new java.lang.Boolean(draft),
					new java.lang.Boolean(allowTrackbacks), trackbacks,
					serviceContext
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.BlogsEntrySoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.BlogsEntrySoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.BlogsEntrySoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.BlogsEntrySoap[] getCompanyEntries(
		long companyId, int max)
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
			"urn:http.service.blogs.portlet.liferay.com", "getCompanyEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(companyId), new java.lang.Integer(max)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.BlogsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.BlogsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.BlogsEntrySoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.BlogsEntrySoap[] getGroupEntries(
		long groupId, int max)
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
			"urn:http.service.blogs.portlet.liferay.com", "getGroupEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId), new java.lang.Integer(max)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.BlogsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.BlogsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.BlogsEntrySoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.BlogsEntrySoap[] getOrganizationEntries(
		long organizationId, int max)
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
			"urn:http.service.blogs.portlet.liferay.com",
			"getOrganizationEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(organizationId), new java.lang.Integer(max)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.BlogsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.BlogsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.BlogsEntrySoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

}
