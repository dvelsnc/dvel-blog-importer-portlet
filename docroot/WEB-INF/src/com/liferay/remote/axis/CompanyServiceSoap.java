/**
 * CompanyServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public interface CompanyServiceSoap extends java.rmi.Remote {

	public com.liferay.remote.axis.CompanySoap getCompanyById(long companyId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.CompanySoap addCompany(
		java.lang.String webId, java.lang.String virtualHost,
		java.lang.String mx, java.lang.String shardName, boolean system)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.CompanySoap getCompanyByLogoId(long logoId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.CompanySoap getCompanyByMx(
		java.lang.String mx)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.CompanySoap getCompanyByVirtualHost(
		java.lang.String virtualHost)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.CompanySoap getCompanyByWebId(
		java.lang.String webId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.CompanySoap updateCompany(
		long companyId, java.lang.String virtualHost, java.lang.String mx)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.CompanySoap updateCompany(
		long companyId, java.lang.String virtualHost, java.lang.String mx,
		java.lang.String homeURL, java.lang.String name,
		java.lang.String legalName, java.lang.String legalId,
		java.lang.String legalType, java.lang.String sicCode,
		java.lang.String tickerSymbol, java.lang.String industry,
		java.lang.String type, java.lang.String size)
		throws java.rmi.RemoteException;

	public void updateDisplay(
		long companyId, java.lang.String languageId, java.lang.String timeZoneId)
		throws java.rmi.RemoteException;

	public void updateSecurity(
		long companyId, java.lang.String authType, boolean autoLogin,
		boolean sendPassword, boolean strangers, boolean strangersWithMx,
		boolean strangersVerify, boolean communityLogo)
		throws java.rmi.RemoteException;
}
