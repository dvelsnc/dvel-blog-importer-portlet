/**
 * BlogsEntryServiceSoapServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class BlogsEntryServiceSoapServiceLocator
	extends org.apache.axis.client.Service
	implements com.liferay.remote.axis.BlogsEntryServiceSoapService {

	public BlogsEntryServiceSoapServiceLocator() {

	}

	public BlogsEntryServiceSoapServiceLocator(
		org.apache.axis.EngineConfiguration config) {

		super(config);
	}

	public BlogsEntryServiceSoapServiceLocator(
		java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
		throws javax.xml.rpc.ServiceException {

		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for Portlet_Blogs_BlogsEntryService
	private java.lang.String Portlet_Blogs_BlogsEntryService_address =
		"http://blog.d-vel.com/tunnel-web/secure/axis/Portlet_Blogs_BlogsEntryService";

	public java.lang.String getPortlet_Blogs_BlogsEntryServiceAddress() {

		return Portlet_Blogs_BlogsEntryService_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String Portlet_Blogs_BlogsEntryServiceWSDDServiceName =
		"Portlet_Blogs_BlogsEntryService";

	public java.lang.String getPortlet_Blogs_BlogsEntryServiceWSDDServiceName() {

		return Portlet_Blogs_BlogsEntryServiceWSDDServiceName;
	}

	public void setPortlet_Blogs_BlogsEntryServiceWSDDServiceName(
		java.lang.String name) {

		Portlet_Blogs_BlogsEntryServiceWSDDServiceName = name;
	}

	public com.liferay.remote.axis.BlogsEntryServiceSoap getPortlet_Blogs_BlogsEntryService()
		throws javax.xml.rpc.ServiceException {

		java.net.URL endpoint;
		try {
			endpoint =
				new java.net.URL(Portlet_Blogs_BlogsEntryService_address);
		}
		catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getPortlet_Blogs_BlogsEntryService(endpoint);
	}

	public com.liferay.remote.axis.BlogsEntryServiceSoap getPortlet_Blogs_BlogsEntryService(
		java.net.URL portAddress)
		throws javax.xml.rpc.ServiceException {

		try {
			com.liferay.remote.axis.Portlet_Blogs_BlogsEntryServiceSoapBindingStub _stub =
				new com.liferay.remote.axis.Portlet_Blogs_BlogsEntryServiceSoapBindingStub(
					portAddress, this);
			_stub.setPortName(getPortlet_Blogs_BlogsEntryServiceWSDDServiceName());
			return _stub;
		}
		catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setPortlet_Blogs_BlogsEntryServiceEndpointAddress(
		java.lang.String address) {

		Portlet_Blogs_BlogsEntryService_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface)
		throws javax.xml.rpc.ServiceException {

		try {
			if (com.liferay.remote.axis.BlogsEntryServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
				com.liferay.remote.axis.Portlet_Blogs_BlogsEntryServiceSoapBindingStub _stub =
					new com.liferay.remote.axis.Portlet_Blogs_BlogsEntryServiceSoapBindingStub(
						new java.net.URL(
							Portlet_Blogs_BlogsEntryService_address), this);
				_stub.setPortName(getPortlet_Blogs_BlogsEntryServiceWSDDServiceName());
				return _stub;
			}
		}
		catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException(
			"There is no stub implementation for the interface:  " +
				(serviceEndpointInterface == null
					? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has
	 * no port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(
		javax.xml.namespace.QName portName, Class serviceEndpointInterface)
		throws javax.xml.rpc.ServiceException {

		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("Portlet_Blogs_BlogsEntryService".equals(inputPortName)) {
			return getPortlet_Blogs_BlogsEntryService();
		}
		else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {

		return new javax.xml.namespace.QName(
			"urn:http.service.blogs.portlet.liferay.com",
			"BlogsEntryServiceSoapService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {

		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
				"urn:http.service.blogs.portlet.liferay.com",
				"Portlet_Blogs_BlogsEntryService"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(
		java.lang.String portName, java.lang.String address)
		throws javax.xml.rpc.ServiceException {

		if ("Portlet_Blogs_BlogsEntryService".equals(portName)) {
			setPortlet_Blogs_BlogsEntryServiceEndpointAddress(address);
		}
		else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(
				" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(
		javax.xml.namespace.QName portName, java.lang.String address)
		throws javax.xml.rpc.ServiceException {

		setEndpointAddress(portName.getLocalPart(), address);
	}

}
