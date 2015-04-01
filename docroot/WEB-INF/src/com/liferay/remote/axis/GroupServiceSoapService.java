/**
 * GroupServiceSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public interface GroupServiceSoapService extends javax.xml.rpc.Service {

	public java.lang.String getPortal_GroupServiceAddress();

	public com.liferay.remote.axis.GroupServiceSoap getPortal_GroupService()
		throws javax.xml.rpc.ServiceException;

	public com.liferay.remote.axis.GroupServiceSoap getPortal_GroupService(
		java.net.URL portAddress)
		throws javax.xml.rpc.ServiceException;
}
