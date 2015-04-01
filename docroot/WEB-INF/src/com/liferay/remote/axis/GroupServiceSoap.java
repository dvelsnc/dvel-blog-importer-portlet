/**
 * GroupServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public interface GroupServiceSoap extends java.rmi.Remote {

	public com.liferay.remote.axis.GroupSoap[] search(
		long companyId, java.lang.String name, java.lang.String description,
		java.lang.String[] params, int start, int end)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap getGroup(long groupId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap getGroup(
		long companyId, java.lang.String name)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap addGroup(
		long liveGroupId, java.lang.String name, java.lang.String description,
		int type, java.lang.String friendlyURL, boolean active,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap addGroup(
		java.lang.String name, java.lang.String description, int type,
		java.lang.String friendlyURL, boolean active,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException;

	public void addRoleGroups(long roleId, long[] groupIds)
		throws java.rmi.RemoteException;

	public void deleteGroup(long groupId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap[] getManageableGroups(
		java.lang.String actionId, int max)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap[] getOrganizationsGroups(
		com.liferay.remote.axis.OrganizationSoap[] organizations)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap getUserGroup(
		long companyId, long userId)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap[] getUserGroupsGroups(
		com.liferay.remote.axis.UserGroupSoap[] userGroups)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap[] getUserOrganizationsGroups(
		long userId, int start, int end)
		throws java.rmi.RemoteException;

	public boolean hasUserGroup(long userId, long groupId)
		throws java.rmi.RemoteException;

	public int searchCount(
		long companyId, java.lang.String name, java.lang.String description,
		java.lang.String[] params)
		throws java.rmi.RemoteException;

	public void setRoleGroups(long roleId, long[] groupIds)
		throws java.rmi.RemoteException;

	public void unsetRoleGroups(long roleId, long[] groupIds)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap updateFriendlyURL(
		long groupId, java.lang.String friendlyURL)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap updateGroup(
		long groupId, java.lang.String typeSettings)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap updateGroup(
		long groupId, java.lang.String name, java.lang.String description,
		int type, java.lang.String friendlyURL, boolean active,
		com.liferay.remote.axis.ServiceContext serviceContext)
		throws java.rmi.RemoteException;

	public com.liferay.remote.axis.GroupSoap updateWorkflow(
		long groupId, boolean workflowEnabled, int workflowStages,
		java.lang.String workflowRoleNames)
		throws java.rmi.RemoteException;
}
