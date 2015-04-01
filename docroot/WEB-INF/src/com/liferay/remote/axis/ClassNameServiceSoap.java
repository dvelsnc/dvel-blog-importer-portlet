/**
 * ClassNameServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public interface ClassNameServiceSoap extends java.rmi.Remote {
    public com.liferay.remote.axis.ClassNameSoap getClassName(java.lang.String value) throws java.rmi.RemoteException;
    public com.liferay.remote.axis.ClassNameSoap getClassName(long classNameId) throws java.rmi.RemoteException;
    public long getClassNameId(java.lang.String value) throws java.rmi.RemoteException;
    public long getClassNameId(java.lang.Object classObj) throws java.rmi.RemoteException;
}
