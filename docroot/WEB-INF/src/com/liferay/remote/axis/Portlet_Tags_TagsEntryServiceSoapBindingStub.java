/**
 * Portlet_Tags_TagsEntryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class Portlet_Tags_TagsEntryServiceSoapBindingStub
	extends org.apache.axis.client.Stub
	implements com.liferay.remote.axis.TagsEntryServiceSoap {

	private java.util.Vector cachedSerClasses = new java.util.Vector();
	private java.util.Vector cachedSerQNames = new java.util.Vector();
	private java.util.Vector cachedSerFactories = new java.util.Vector();
	private java.util.Vector cachedDeserFactories = new java.util.Vector();

	static org.apache.axis.description.OperationDesc[] _operations;

	static {
		_operations = new org.apache.axis.description.OperationDesc[11];
		_initOperationDesc1();
		_initOperationDesc2();
	}

	private static void _initOperationDesc1() {

		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("addEntry");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "parentEntryName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
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
				new javax.xml.namespace.QName("", "vocabularyName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "properties"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.tags.portlet.liferay.com",
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
			"http://model.tags.portlet.liferay.com", "TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap.class);
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
			"http://model.tags.portlet.liferay.com", "TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "getEntryReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[1] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("search");
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
				new javax.xml.namespace.QName("", "properties"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.tags.portlet.liferay.com",
					"ArrayOf_xsd_string"), java.lang.String[].class, false,
				false);
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
			"http://www.w3.org/2001/XMLSchema", "anyType"));
		oper.setReturnClass(java.lang.Object.class);
		oper.setReturnQName(new javax.xml.namespace.QName("", "searchReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[2] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getEntries");
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
				new javax.xml.namespace.QName("", "classNameId"),
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
			"urn:http.service.tags.portlet.liferay.com",
			"ArrayOf_tns4_TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[3] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getEntries");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "className"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "classPK"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.tags.portlet.liferay.com",
			"ArrayOf_tns4_TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[4] = oper;

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
		_operations[5] = oper;

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
				new javax.xml.namespace.QName("", "parentEntryName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
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
				new javax.xml.namespace.QName("", "vocabularyName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "properties"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"urn:http.service.tags.portlet.liferay.com",
					"ArrayOf_xsd_string"), java.lang.String[].class, false,
				false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"http://model.tags.portlet.liferay.com", "TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap.class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "updateEntryReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[6] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getGroupVocabularyEntries");
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
				new javax.xml.namespace.QName("", "parentEntryName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "vocabularyName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.tags.portlet.liferay.com",
			"ArrayOf_tns4_TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getGroupVocabularyEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[7] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getGroupVocabularyEntries");
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
				new javax.xml.namespace.QName("", "vocabularyName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.tags.portlet.liferay.com",
			"ArrayOf_tns4_TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getGroupVocabularyEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[8] = oper;

		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("getGroupVocabularyRootEntries");
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
				new javax.xml.namespace.QName("", "vocabularyName"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "string"),
				java.lang.String.class, false, false);
		oper.addParameter(param);
		oper.setReturnType(new javax.xml.namespace.QName(
			"urn:http.service.tags.portlet.liferay.com",
			"ArrayOf_tns4_TagsEntrySoap"));
		oper.setReturnClass(com.liferay.remote.axis.TagsEntrySoap[].class);
		oper.setReturnQName(new javax.xml.namespace.QName(
			"", "getGroupVocabularyRootEntriesReturn"));
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[9] = oper;

	}

	private static void _initOperationDesc2() {

		org.apache.axis.description.OperationDesc oper;
		org.apache.axis.description.ParameterDesc param;
		oper = new org.apache.axis.description.OperationDesc();
		oper.setName("mergeEntries");
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "fromEntryId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		param =
			new org.apache.axis.description.ParameterDesc(
				new javax.xml.namespace.QName("", "toEntryId"),
				org.apache.axis.description.ParameterDesc.IN,
				new javax.xml.namespace.QName(
					"http://www.w3.org/2001/XMLSchema", "long"), long.class,
				false, false);
		oper.addParameter(param);
		oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
		oper.setStyle(org.apache.axis.constants.Style.RPC);
		oper.setUse(org.apache.axis.constants.Use.ENCODED);
		_operations[10] = oper;

	}

	public Portlet_Tags_TagsEntryServiceSoapBindingStub()
		throws org.apache.axis.AxisFault {

		this(null);
	}

	public Portlet_Tags_TagsEntryServiceSoapBindingStub(
		java.net.URL endpointURL, javax.xml.rpc.Service service)
		throws org.apache.axis.AxisFault {

		this(service);
		super.cachedEndpoint = endpointURL;
	}

	public Portlet_Tags_TagsEntryServiceSoapBindingStub(
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
				"http://model.portal.liferay.com", "PortletPreferencesIds");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.PortletPreferencesIds.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"http://model.tags.portlet.liferay.com", "TagsEntrySoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.TagsEntrySoap.class;
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
				"http://xml.apache.org/xml-soap", "mapItem");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.MapItem.class;
		cachedSerClasses.add(cls);
		cachedSerFactories.add(beansf);
		cachedDeserFactories.add(beandf);

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.tags.portlet.liferay.com",
				"ArrayOf_tns4_TagsEntrySoap");
		cachedSerQNames.add(qName);
		cls = com.liferay.remote.axis.TagsEntrySoap[].class;
		cachedSerClasses.add(cls);
		qName =
			new javax.xml.namespace.QName(
				"http://model.tags.portlet.liferay.com", "TagsEntrySoap");
		qName2 = null;
		cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(
			qName, qName2));
		cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

		qName =
			new javax.xml.namespace.QName(
				"urn:http.service.tags.portlet.liferay.com",
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

	public com.liferay.remote.axis.TagsEntrySoap addEntry(
		java.lang.String parentEntryName, java.lang.String name,
		java.lang.String vocabularyName, java.lang.String[] properties,
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
			"urn:http.service.tags.portlet.liferay.com", "addEntry"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					parentEntryName, name, vocabularyName, properties,
					serviceContext
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.TagsEntrySoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.TagsEntrySoap getEntry(long entryId)
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
			"urn:http.service.tags.portlet.liferay.com", "getEntry"));

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
					return (com.liferay.remote.axis.TagsEntrySoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public java.lang.Object search(
		long groupId, java.lang.String name, java.lang.String[] properties,
		int start, int end)
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
			"urn:http.service.tags.portlet.liferay.com", "search"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(groupId), name, properties,
					new java.lang.Integer(start), new java.lang.Integer(end)
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (java.lang.Object) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (java.lang.Object) org.apache.axis.utils.JavaUtils.convert(
						_resp, java.lang.Object.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.TagsEntrySoap[] getEntries(
		long groupId, long classNameId, java.lang.String name)
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
			"urn:http.service.tags.portlet.liferay.com", "getEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(groupId),
					new java.lang.Long(classNameId), name
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.TagsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.TagsEntrySoap[] getEntries(
		java.lang.String className, long classPK)
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
			"urn:http.service.tags.portlet.liferay.com", "getEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				className, new java.lang.Long(classPK)
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.TagsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap[].class);
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
		_call.setOperation(_operations[5]);
		_call.setUseSOAPAction(true);
		_call.setSOAPActionURI("");
		_call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
		_call.setOperationName(new javax.xml.namespace.QName(
			"urn:http.service.tags.portlet.liferay.com", "deleteEntry"));

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

	public com.liferay.remote.axis.TagsEntrySoap updateEntry(
		long entryId, java.lang.String parentEntryName, java.lang.String name,
		java.lang.String vocabularyName, java.lang.String[] properties)
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
			"urn:http.service.tags.portlet.liferay.com", "updateEntry"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp =
				_call.invoke(new java.lang.Object[] {
					new java.lang.Long(entryId), parentEntryName, name,
					vocabularyName, properties
				});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.TagsEntrySoap) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap.class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.TagsEntrySoap[] getGroupVocabularyEntries(
		long groupId, java.lang.String parentEntryName,
		java.lang.String vocabularyName)
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
			"urn:http.service.tags.portlet.liferay.com",
			"getGroupVocabularyEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId), parentEntryName, vocabularyName
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.TagsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.TagsEntrySoap[] getGroupVocabularyEntries(
		long groupId, java.lang.String vocabularyName)
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
			"urn:http.service.tags.portlet.liferay.com",
			"getGroupVocabularyEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId), vocabularyName
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.TagsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public com.liferay.remote.axis.TagsEntrySoap[] getGroupVocabularyRootEntries(
		long groupId, java.lang.String vocabularyName)
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
			"urn:http.service.tags.portlet.liferay.com",
			"getGroupVocabularyRootEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(groupId), vocabularyName
			});

			if (_resp instanceof java.rmi.RemoteException) {
				throw (java.rmi.RemoteException) _resp;
			}
			else {
				extractAttachments(_call);
				try {
					return (com.liferay.remote.axis.TagsEntrySoap[]) _resp;
				}
				catch (java.lang.Exception _exception) {
					return (com.liferay.remote.axis.TagsEntrySoap[]) org.apache.axis.utils.JavaUtils.convert(
						_resp, com.liferay.remote.axis.TagsEntrySoap[].class);
				}
			}
		}
		catch (org.apache.axis.AxisFault axisFaultException) {
			throw axisFaultException;
		}
	}

	public void mergeEntries(long fromEntryId, long toEntryId)
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
			"urn:http.service.tags.portlet.liferay.com", "mergeEntries"));

		setRequestHeaders(_call);
		setAttachments(_call);
		try {
			java.lang.Object _resp = _call.invoke(new java.lang.Object[] {
				new java.lang.Long(fromEntryId), new java.lang.Long(toEntryId)
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

}
