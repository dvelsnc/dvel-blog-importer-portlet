/**
 * TagsEntrySoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class TagsEntrySoap implements java.io.Serializable {

	private long companyId;

	private java.util.Calendar createDate;

	private long entryId;

	private long groupId;

	private java.util.Calendar modifiedDate;

	private java.lang.String name;

	private long parentEntryId;

	private long primaryKey;

	private long userId;

	private java.lang.String userName;

	private long vocabularyId;

	public TagsEntrySoap() {

	}

	public TagsEntrySoap(
		long companyId, java.util.Calendar createDate, long entryId,
		long groupId, java.util.Calendar modifiedDate, java.lang.String name,
		long parentEntryId, long primaryKey, long userId,
		java.lang.String userName, long vocabularyId) {

		this.companyId = companyId;
		this.createDate = createDate;
		this.entryId = entryId;
		this.groupId = groupId;
		this.modifiedDate = modifiedDate;
		this.name = name;
		this.parentEntryId = parentEntryId;
		this.primaryKey = primaryKey;
		this.userId = userId;
		this.userName = userName;
		this.vocabularyId = vocabularyId;
	}

	/**
	 * Gets the companyId value for this TagsEntrySoap.
	 * 
	 * @return companyId
	 */
	public long getCompanyId() {

		return companyId;
	}

	/**
	 * Sets the companyId value for this TagsEntrySoap.
	 * 
	 * @param companyId
	 */
	public void setCompanyId(long companyId) {

		this.companyId = companyId;
	}

	/**
	 * Gets the createDate value for this TagsEntrySoap.
	 * 
	 * @return createDate
	 */
	public java.util.Calendar getCreateDate() {

		return createDate;
	}

	/**
	 * Sets the createDate value for this TagsEntrySoap.
	 * 
	 * @param createDate
	 */
	public void setCreateDate(java.util.Calendar createDate) {

		this.createDate = createDate;
	}

	/**
	 * Gets the entryId value for this TagsEntrySoap.
	 * 
	 * @return entryId
	 */
	public long getEntryId() {

		return entryId;
	}

	/**
	 * Sets the entryId value for this TagsEntrySoap.
	 * 
	 * @param entryId
	 */
	public void setEntryId(long entryId) {

		this.entryId = entryId;
	}

	/**
	 * Gets the groupId value for this TagsEntrySoap.
	 * 
	 * @return groupId
	 */
	public long getGroupId() {

		return groupId;
	}

	/**
	 * Sets the groupId value for this TagsEntrySoap.
	 * 
	 * @param groupId
	 */
	public void setGroupId(long groupId) {

		this.groupId = groupId;
	}

	/**
	 * Gets the modifiedDate value for this TagsEntrySoap.
	 * 
	 * @return modifiedDate
	 */
	public java.util.Calendar getModifiedDate() {

		return modifiedDate;
	}

	/**
	 * Sets the modifiedDate value for this TagsEntrySoap.
	 * 
	 * @param modifiedDate
	 */
	public void setModifiedDate(java.util.Calendar modifiedDate) {

		this.modifiedDate = modifiedDate;
	}

	/**
	 * Gets the name value for this TagsEntrySoap.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {

		return name;
	}

	/**
	 * Sets the name value for this TagsEntrySoap.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {

		this.name = name;
	}

	/**
	 * Gets the parentEntryId value for this TagsEntrySoap.
	 * 
	 * @return parentEntryId
	 */
	public long getParentEntryId() {

		return parentEntryId;
	}

	/**
	 * Sets the parentEntryId value for this TagsEntrySoap.
	 * 
	 * @param parentEntryId
	 */
	public void setParentEntryId(long parentEntryId) {

		this.parentEntryId = parentEntryId;
	}

	/**
	 * Gets the primaryKey value for this TagsEntrySoap.
	 * 
	 * @return primaryKey
	 */
	public long getPrimaryKey() {

		return primaryKey;
	}

	/**
	 * Sets the primaryKey value for this TagsEntrySoap.
	 * 
	 * @param primaryKey
	 */
	public void setPrimaryKey(long primaryKey) {

		this.primaryKey = primaryKey;
	}

	/**
	 * Gets the userId value for this TagsEntrySoap.
	 * 
	 * @return userId
	 */
	public long getUserId() {

		return userId;
	}

	/**
	 * Sets the userId value for this TagsEntrySoap.
	 * 
	 * @param userId
	 */
	public void setUserId(long userId) {

		this.userId = userId;
	}

	/**
	 * Gets the userName value for this TagsEntrySoap.
	 * 
	 * @return userName
	 */
	public java.lang.String getUserName() {

		return userName;
	}

	/**
	 * Sets the userName value for this TagsEntrySoap.
	 * 
	 * @param userName
	 */
	public void setUserName(java.lang.String userName) {

		this.userName = userName;
	}

	/**
	 * Gets the vocabularyId value for this TagsEntrySoap.
	 * 
	 * @return vocabularyId
	 */
	public long getVocabularyId() {

		return vocabularyId;
	}

	/**
	 * Sets the vocabularyId value for this TagsEntrySoap.
	 * 
	 * @param vocabularyId
	 */
	public void setVocabularyId(long vocabularyId) {

		this.vocabularyId = vocabularyId;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {

		if (!(obj instanceof TagsEntrySoap))
			return false;
		TagsEntrySoap other = (TagsEntrySoap) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals =
			true &&
				this.companyId == other.getCompanyId() &&
				((this.createDate == null && other.getCreateDate() == null) || (this.createDate != null && this.createDate.equals(other.getCreateDate()))) &&
				this.entryId == other.getEntryId() &&
				this.groupId == other.getGroupId() &&
				((this.modifiedDate == null && other.getModifiedDate() == null) || (this.modifiedDate != null && this.modifiedDate.equals(other.getModifiedDate()))) &&
				((this.name == null && other.getName() == null) || (this.name != null && this.name.equals(other.getName()))) &&
				this.parentEntryId == other.getParentEntryId() &&
				this.primaryKey == other.getPrimaryKey() &&
				this.userId == other.getUserId() &&
				((this.userName == null && other.getUserName() == null) || (this.userName != null && this.userName.equals(other.getUserName()))) &&
				this.vocabularyId == other.getVocabularyId();
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
		_hashCode += new Long(getCompanyId()).hashCode();
		if (getCreateDate() != null) {
			_hashCode += getCreateDate().hashCode();
		}
		_hashCode += new Long(getEntryId()).hashCode();
		_hashCode += new Long(getGroupId()).hashCode();
		if (getModifiedDate() != null) {
			_hashCode += getModifiedDate().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += new Long(getParentEntryId()).hashCode();
		_hashCode += new Long(getPrimaryKey()).hashCode();
		_hashCode += new Long(getUserId()).hashCode();
		if (getUserName() != null) {
			_hashCode += getUserName().hashCode();
		}
		_hashCode += new Long(getVocabularyId()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
		new org.apache.axis.description.TypeDesc(TagsEntrySoap.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
			"http://model.tags.portlet.liferay.com", "TagsEntrySoap"));
		org.apache.axis.description.ElementDesc elemField =
			new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("companyId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createDate");
		elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("entryId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "entryId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("groupId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "groupId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("modifiedDate");
		elemField.setXmlName(new javax.xml.namespace.QName("", "modifiedDate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parentEntryId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "parentEntryId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("primaryKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("userId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("userName");
		elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("vocabularyId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "vocabularyId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
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
		java.lang.String mechType, java.lang.Class _javaType,
		javax.xml.namespace.QName _xmlType) {

		return new org.apache.axis.encoding.ser.BeanSerializer(
			_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
		java.lang.String mechType, java.lang.Class _javaType,
		javax.xml.namespace.QName _xmlType) {

		return new org.apache.axis.encoding.ser.BeanDeserializer(
			_javaType, _xmlType, typeDesc);
	}

}
