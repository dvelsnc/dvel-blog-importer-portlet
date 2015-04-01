/**
 * MBMessageSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class MBMessageSoap  implements java.io.Serializable {
    private boolean anonymous;

    private boolean attachments;

    private java.lang.String body;

    private long categoryId;

    private long classNameId;

    private long classPK;

    private long companyId;

    private java.util.Calendar createDate;

    private long groupId;

    private long messageId;

    private java.util.Calendar modifiedDate;

    private long parentMessageId;

    private long primaryKey;

    private double priority;

    private java.lang.String subject;

    private long threadId;

    private long userId;

    private java.lang.String userName;

    private java.lang.String uuid;

    public MBMessageSoap() {
    }

    public MBMessageSoap(
           boolean anonymous,
           boolean attachments,
           java.lang.String body,
           long categoryId,
           long classNameId,
           long classPK,
           long companyId,
           java.util.Calendar createDate,
           long groupId,
           long messageId,
           java.util.Calendar modifiedDate,
           long parentMessageId,
           long primaryKey,
           double priority,
           java.lang.String subject,
           long threadId,
           long userId,
           java.lang.String userName,
           java.lang.String uuid) {
           this.anonymous = anonymous;
           this.attachments = attachments;
           this.body = body;
           this.categoryId = categoryId;
           this.classNameId = classNameId;
           this.classPK = classPK;
           this.companyId = companyId;
           this.createDate = createDate;
           this.groupId = groupId;
           this.messageId = messageId;
           this.modifiedDate = modifiedDate;
           this.parentMessageId = parentMessageId;
           this.primaryKey = primaryKey;
           this.priority = priority;
           this.subject = subject;
           this.threadId = threadId;
           this.userId = userId;
           this.userName = userName;
           this.uuid = uuid;
    }


    /**
     * Gets the anonymous value for this MBMessageSoap.
     * 
     * @return anonymous
     */
    public boolean isAnonymous() {
        return anonymous;
    }


    /**
     * Sets the anonymous value for this MBMessageSoap.
     * 
     * @param anonymous
     */
    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }


    /**
     * Gets the attachments value for this MBMessageSoap.
     * 
     * @return attachments
     */
    public boolean isAttachments() {
        return attachments;
    }


    /**
     * Sets the attachments value for this MBMessageSoap.
     * 
     * @param attachments
     */
    public void setAttachments(boolean attachments) {
        this.attachments = attachments;
    }


    /**
     * Gets the body value for this MBMessageSoap.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this MBMessageSoap.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the categoryId value for this MBMessageSoap.
     * 
     * @return categoryId
     */
    public long getCategoryId() {
        return categoryId;
    }


    /**
     * Sets the categoryId value for this MBMessageSoap.
     * 
     * @param categoryId
     */
    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }


    /**
     * Gets the classNameId value for this MBMessageSoap.
     * 
     * @return classNameId
     */
    public long getClassNameId() {
        return classNameId;
    }


    /**
     * Sets the classNameId value for this MBMessageSoap.
     * 
     * @param classNameId
     */
    public void setClassNameId(long classNameId) {
        this.classNameId = classNameId;
    }


    /**
     * Gets the classPK value for this MBMessageSoap.
     * 
     * @return classPK
     */
    public long getClassPK() {
        return classPK;
    }


    /**
     * Sets the classPK value for this MBMessageSoap.
     * 
     * @param classPK
     */
    public void setClassPK(long classPK) {
        this.classPK = classPK;
    }


    /**
     * Gets the companyId value for this MBMessageSoap.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this MBMessageSoap.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the createDate value for this MBMessageSoap.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this MBMessageSoap.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the groupId value for this MBMessageSoap.
     * 
     * @return groupId
     */
    public long getGroupId() {
        return groupId;
    }


    /**
     * Sets the groupId value for this MBMessageSoap.
     * 
     * @param groupId
     */
    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }


    /**
     * Gets the messageId value for this MBMessageSoap.
     * 
     * @return messageId
     */
    public long getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this MBMessageSoap.
     * 
     * @param messageId
     */
    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the modifiedDate value for this MBMessageSoap.
     * 
     * @return modifiedDate
     */
    public java.util.Calendar getModifiedDate() {
        return modifiedDate;
    }


    /**
     * Sets the modifiedDate value for this MBMessageSoap.
     * 
     * @param modifiedDate
     */
    public void setModifiedDate(java.util.Calendar modifiedDate) {
        this.modifiedDate = modifiedDate;
    }


    /**
     * Gets the parentMessageId value for this MBMessageSoap.
     * 
     * @return parentMessageId
     */
    public long getParentMessageId() {
        return parentMessageId;
    }


    /**
     * Sets the parentMessageId value for this MBMessageSoap.
     * 
     * @param parentMessageId
     */
    public void setParentMessageId(long parentMessageId) {
        this.parentMessageId = parentMessageId;
    }


    /**
     * Gets the primaryKey value for this MBMessageSoap.
     * 
     * @return primaryKey
     */
    public long getPrimaryKey() {
        return primaryKey;
    }


    /**
     * Sets the primaryKey value for this MBMessageSoap.
     * 
     * @param primaryKey
     */
    public void setPrimaryKey(long primaryKey) {
        this.primaryKey = primaryKey;
    }


    /**
     * Gets the priority value for this MBMessageSoap.
     * 
     * @return priority
     */
    public double getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this MBMessageSoap.
     * 
     * @param priority
     */
    public void setPriority(double priority) {
        this.priority = priority;
    }


    /**
     * Gets the subject value for this MBMessageSoap.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this MBMessageSoap.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the threadId value for this MBMessageSoap.
     * 
     * @return threadId
     */
    public long getThreadId() {
        return threadId;
    }


    /**
     * Sets the threadId value for this MBMessageSoap.
     * 
     * @param threadId
     */
    public void setThreadId(long threadId) {
        this.threadId = threadId;
    }


    /**
     * Gets the userId value for this MBMessageSoap.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this MBMessageSoap.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the userName value for this MBMessageSoap.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this MBMessageSoap.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the uuid value for this MBMessageSoap.
     * 
     * @return uuid
     */
    public java.lang.String getUuid() {
        return uuid;
    }


    /**
     * Sets the uuid value for this MBMessageSoap.
     * 
     * @param uuid
     */
    public void setUuid(java.lang.String uuid) {
        this.uuid = uuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MBMessageSoap)) return false;
        MBMessageSoap other = (MBMessageSoap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.anonymous == other.isAnonymous() &&
            this.attachments == other.isAttachments() &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            this.categoryId == other.getCategoryId() &&
            this.classNameId == other.getClassNameId() &&
            this.classPK == other.getClassPK() &&
            this.companyId == other.getCompanyId() &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            this.groupId == other.getGroupId() &&
            this.messageId == other.getMessageId() &&
            ((this.modifiedDate==null && other.getModifiedDate()==null) || 
             (this.modifiedDate!=null &&
              this.modifiedDate.equals(other.getModifiedDate()))) &&
            this.parentMessageId == other.getParentMessageId() &&
            this.primaryKey == other.getPrimaryKey() &&
            this.priority == other.getPriority() &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            this.threadId == other.getThreadId() &&
            this.userId == other.getUserId() &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.uuid==null && other.getUuid()==null) || 
             (this.uuid!=null &&
              this.uuid.equals(other.getUuid())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isAnonymous() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAttachments() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        _hashCode += new Long(getCategoryId()).hashCode();
        _hashCode += new Long(getClassNameId()).hashCode();
        _hashCode += new Long(getClassPK()).hashCode();
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        _hashCode += new Long(getGroupId()).hashCode();
        _hashCode += new Long(getMessageId()).hashCode();
        if (getModifiedDate() != null) {
            _hashCode += getModifiedDate().hashCode();
        }
        _hashCode += new Long(getParentMessageId()).hashCode();
        _hashCode += new Long(getPrimaryKey()).hashCode();
        _hashCode += new Double(getPriority()).hashCode();
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        _hashCode += new Long(getThreadId()).hashCode();
        _hashCode += new Long(getUserId()).hashCode();
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUuid() != null) {
            _hashCode += getUuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MBMessageSoap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://model.messageboards.portlet.liferay.com", "MBMessageSoap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymous");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anonymous"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attachments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attachments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classNameId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classNameId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classPK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classPK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
