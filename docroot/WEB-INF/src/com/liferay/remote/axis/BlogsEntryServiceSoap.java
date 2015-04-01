/**
 * BlogsEntryServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public interface BlogsEntryServiceSoap extends java.rmi.Remote {

	public com.liferay.remote.axis.BlogsEntrySoap addEntry(
		java.lang.String title, java.lang.String content, int displayDateMonth,
		int displayDateDay, int displayDateYear, int displayDateHour,
		int displayDateMinute, boolean draft, boolean allowTrackbacks,
		java.lang.String[] trackbacks,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.BlogsEntrySoap getEntry(long entryId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.BlogsEntrySoap getEntry(
		long groupId, java.lang.String urlTitle)
		throws java.rmi.RemoteException;

	public void deleteEntry(long entryId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.BlogsEntrySoap updateEntry(
		long entryId, java.lang.String title, java.lang.String content,
		int displayDateMonth, int displayDateDay, int displayDateYear,
		int displayDateHour, int displayDateMinute, boolean draft,
		boolean allowTrackbacks, java.lang.String[] trackbacks,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.BlogsEntrySoap[] getCompanyEntries(
		long companyId, int max)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.BlogsEntrySoap[] getGroupEntries(
		long groupId, int max)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.BlogsEntrySoap[] getOrganizationEntries(
		long organizationId, int max)
		throws java.rmi.RemoteException;
}
