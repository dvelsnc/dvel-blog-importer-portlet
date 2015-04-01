/**
 * MBMessageServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public interface MBMessageServiceSoap extends java.rmi.Remote {
    public com.liferay.remote.axis.MBMessageSoap getMessage(long messageId) throws java.rmi.RemoteException;
    public com.liferay.remote.axis.MBMessageSoap addMessage(long categoryId, long threadId, long parentMessageId, java.lang.String subject, java.lang.String body, java.lang.Object[] files, boolean anonymous, double priority, com.liferay.remote.axis.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.remote.axis.MBMessageSoap addMessage(long categoryId, java.lang.String subject, java.lang.String body, java.lang.Object[] files, boolean anonymous, double priority, com.liferay.remote.axis.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.remote.axis.MBMessageSoap addDiscussionMessage(java.lang.String className, long classPK, long threadId, long parentMessageId, java.lang.String subject, java.lang.String body, com.liferay.remote.axis.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public void deleteDiscussionMessage(long groupId, java.lang.String className, long classPK, long messageId) throws java.rmi.RemoteException;
    public void deleteMessage(long messageId) throws java.rmi.RemoteException;
    public com.liferay.remote.axis.MBMessageSoap[] getCategoryMessages(long categoryId, int start, int end) throws java.rmi.RemoteException;
    public int getCategoryMessagesCount(long categoryId) throws java.rmi.RemoteException;
    public void subscribeMessage(long messageId) throws java.rmi.RemoteException;
    public void unsubscribeMessage(long messageId) throws java.rmi.RemoteException;
    public com.liferay.remote.axis.MBMessageSoap updateDiscussionMessage(java.lang.String className, long classPK, long messageId, java.lang.String subject, java.lang.String body, com.liferay.remote.axis.ServiceContext serviceContext) throws java.rmi.RemoteException;
    public com.liferay.remote.axis.MBMessageSoap updateMessage(long messageId, java.lang.String subject, java.lang.String body, java.lang.Object[] files, java.lang.Object[] existingFiles, double priority, com.liferay.remote.axis.ServiceContext serviceContext) throws java.rmi.RemoteException;
}
