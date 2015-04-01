/**
 * BlogsEntrySoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class BlogsEntrySoap implements java.io.Serializable {

	private boolean allowTrackbacks;

	private long companyId;

	private java.lang.String content;

	private java.util.Calendar createDate;

	private java.util.Calendar displayDate;

	private boolean draft;

	private long entryId;

	private long groupId;

	private java.util.Calendar modifiedDate;

	private long primaryKey;

	private java.lang.String title;

	private java.lang.String trackbacks;

	private java.lang.String urlTitle;

	private long userId;

	private java.lang.String userName;

	private java.lang.String uuid;

	public BlogsEntrySoap() {

	}

	public BlogsEntrySoap(
		boolean allowTrackbacks, long companyId, java.lang.String content,
		java.util.Calendar createDate, java.util.Calendar displayDate,
		boolean draft, long entryId, long groupId,
		java.util.Calendar modifiedDate, long primaryKey,
		java.lang.String title, java.lang.String trackbacks,
		java.lang.String urlTitle, long userId, java.lang.String userName,
		java.lang.String uuid) {

		this.allowTrackbacks = allowTrackbacks;
		this.companyId = companyId;
		this.content = content;
		this.createDate = createDate;
		this.displayDate = displayDate;
		this.draft = draft;
		this.entryId = entryId;
		this.groupId = groupId;
		this.modifiedDate = modifiedDate;
		this.primaryKey = primaryKey;
		this.title = title;
		this.trackbacks = trackbacks;
		this.urlTitle = urlTitle;
		this.userId = userId;
		this.userName = userName;
		this.uuid = uuid;
	}

	/**
	 * Gets the allowTrackbacks value for this BlogsEntrySoap.
	 * 
	 * @return allowTrackbacks
	 */
	public boolean isAllowTrackbacks() {

		return allowTrackbacks;
	}

	/**
	 * Sets the allowTrackbacks value for this BlogsEntrySoap.
	 * 
	 * @param allowTrackbacks
	 */
	public void setAllowTrackbacks(boolean allowTrackbacks) {

		this.allowTrackbacks = allowTrackbacks;
	}

	/**
	 * Gets the companyId value for this BlogsEntrySoap.
	 * 
	 * @return companyId
	 */
	public long getCompanyId() {

		return companyId;
	}

	/**
	 * Sets the companyId value for this BlogsEntrySoap.
	 * 
	 * @param companyId
	 */
	public void setCompanyId(long companyId) {

		this.companyId = companyId;
	}

	/**
	 * Gets the content value for this BlogsEntrySoap.
	 * 
	 * @return content
	 */
	public java.lang.String getContent() {

		return content;
	}

	/**
	 * Sets the content value for this BlogsEntrySoap.
	 * 
	 * @param content
	 */
	public void setContent(java.lang.String content) {

		this.content = content;
	}

	/**
	 * Gets the createDate value for this BlogsEntrySoap.
	 * 
	 * @return createDate
	 */
	public java.util.Calendar getCreateDate() {

		return createDate;
	}

	/**
	 * Sets the createDate value for this BlogsEntrySoap.
	 * 
	 * @param createDate
	 */
	public void setCreateDate(java.util.Calendar createDate) {

		this.createDate = createDate;
	}

	/**
	 * Gets the displayDate value for this BlogsEntrySoap.
	 * 
	 * @return displayDate
	 */
	public java.util.Calendar getDisplayDate() {

		return displayDate;
	}

	/**
	 * Sets the displayDate value for this BlogsEntrySoap.
	 * 
	 * @param displayDate
	 */
	public void setDisplayDate(java.util.Calendar displayDate) {

		this.displayDate = displayDate;
	}

	/**
	 * Gets the draft value for this BlogsEntrySoap.
	 * 
	 * @return draft
	 */
	public boolean isDraft() {

		return draft;
	}

	/**
	 * Sets the draft value for this BlogsEntrySoap.
	 * 
	 * @param draft
	 */
	public void setDraft(boolean draft) {

		this.draft = draft;
	}

	/**
	 * Gets the entryId value for this BlogsEntrySoap.
	 * 
	 * @return entryId
	 */
	public long getEntryId() {

		return entryId;
	}

	/**
	 * Sets the entryId value for this BlogsEntrySoap.
	 * 
	 * @param entryId
	 */
	public void setEntryId(long entryId) {

		this.entryId = entryId;
	}

	/**
	 * Gets the groupId value for this BlogsEntrySoap.
	 * 
	 * @return groupId
	 */
	public long getGroupId() {

		return groupId;
	}

	/**
	 * Sets the groupId value for this BlogsEntrySoap.
	 * 
	 * @param groupId
	 */
	public void setGroupId(long groupId) {

		this.groupId = groupId;
	}

	/**
	 * Gets the modifiedDate value for this BlogsEntrySoap.
	 * 
	 * @return modifiedDate
	 */
	public java.util.Calendar getModifiedDate() {

		return modifiedDate;
	}

	/**
	 * Sets the modifiedDate value for this BlogsEntrySoap.
	 * 
	 * @param modifiedDate
	 */
	public void setModifiedDate(java.util.Calendar modifiedDate) {

		this.modifiedDate = modifiedDate;
	}

	/**
	 * Gets the primaryKey value for this BlogsEntrySoap.
	 * 
	 * @return primaryKey
	 */
	public long getPrimaryKey() {

		return primaryKey;
	}

	/**
	 * Sets the primaryKey value for this BlogsEntrySoap.
	 * 
	 * @param primaryKey
	 */
	public void setPrimaryKey(long primaryKey) {

		this.primaryKey = primaryKey;
	}

	/**
	 * Gets the title value for this BlogsEntrySoap.
	 * 
	 * @return title
	 */
	public java.lang.String getTitle() {

		return title;
	}

	/**
	 * Sets the title value for this BlogsEntrySoap.
	 * 
	 * @param title
	 */
	public void setTitle(java.lang.String title) {

		this.title = title;
	}

	/**
	 * Gets the trackbacks value for this BlogsEntrySoap.
	 * 
	 * @return trackbacks
	 */
	public java.lang.String getTrackbacks() {

		return trackbacks;
	}

	/**
	 * Sets the trackbacks value for this BlogsEntrySoap.
	 * 
	 * @param trackbacks
	 */
	public void setTrackbacks(java.lang.String trackbacks) {

		this.trackbacks = trackbacks;
	}

	/**
	 * Gets the urlTitle value for this BlogsEntrySoap.
	 * 
	 * @return urlTitle
	 */
	public java.lang.String getUrlTitle() {

		return urlTitle;
	}

	/**
	 * Sets the urlTitle value for this BlogsEntrySoap.
	 * 
	 * @param urlTitle
	 */
	public void setUrlTitle(java.lang.String urlTitle) {

		this.urlTitle = urlTitle;
	}

	/**
	 * Gets the userId value for this BlogsEntrySoap.
	 * 
	 * @return userId
	 */
	public long getUserId() {

		return userId;
	}

	/**
	 * Sets the userId value for this BlogsEntrySoap.
	 * 
	 * @param userId
	 */
	public void setUserId(long userId) {

		this.userId = userId;
	}

	/**
	 * Gets the userName value for this BlogsEntrySoap.
	 * 
	 * @return userName
	 */
	public java.lang.String getUserName() {

		return userName;
	}

	/**
	 * Sets the userName value for this BlogsEntrySoap.
	 * 
	 * @param userName
	 */
	public void setUserName(java.lang.String userName) {

		this.userName = userName;
	}

	/**
	 * Gets the uuid value for this BlogsEntrySoap.
	 * 
	 * @return uuid
	 */
	public java.lang.String getUuid() {

		return uuid;
	}

	/**
	 * Sets the uuid value for this BlogsEntrySoap.
	 * 
	 * @param uuid
	 */
	public void setUuid(java.lang.String uuid) {

		this.uuid = uuid;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {

		if (!(obj instanceof BlogsEntrySoap))
			return false;
		BlogsEntrySoap other = (BlogsEntrySoap) obj;
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
				this.allowTrackbacks == other.isAllowTrackbacks() &&
				this.companyId == other.getCompanyId() &&
				((this.content == null && other.getContent() == null) || (this.content != null && this.content.equals(other.getContent()))) &&
				((this.createDate == null && other.getCreateDate() == null) || (this.createDate != null && this.createDate.equals(other.getCreateDate()))) &&
				((this.displayDate == null && other.getDisplayDate() == null) || (this.displayDate != null && this.displayDate.equals(other.getDisplayDate()))) &&
				this.draft == other.isDraft() &&
				this.entryId == other.getEntryId() &&
				this.groupId == other.getGroupId() &&
				((this.modifiedDate == null && other.getModifiedDate() == null) || (this.modifiedDate != null && this.modifiedDate.equals(other.getModifiedDate()))) &&
				this.primaryKey == other.getPrimaryKey() &&
				((this.title == null && other.getTitle() == null) || (this.title != null && this.title.equals(other.getTitle()))) &&
				((this.trackbacks == null && other.getTrackbacks() == null) || (this.trackbacks != null && this.trackbacks.equals(other.getTrackbacks()))) &&
				((this.urlTitle == null && other.getUrlTitle() == null) || (this.urlTitle != null && this.urlTitle.equals(other.getUrlTitle()))) &&
				this.userId == other.getUserId() &&
				((this.userName == null && other.getUserName() == null) || (this.userName != null && this.userName.equals(other.getUserName()))) &&
				((this.uuid == null && other.getUuid() == null) || (this.uuid != null && this.uuid.equals(other.getUuid())));
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
		_hashCode +=
			(isAllowTrackbacks() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += new Long(getCompanyId()).hashCode();
		if (getContent() != null) {
			_hashCode += getContent().hashCode();
		}
		if (getCreateDate() != null) {
			_hashCode += getCreateDate().hashCode();
		}
		if (getDisplayDate() != null) {
			_hashCode += getDisplayDate().hashCode();
		}
		_hashCode += (isDraft() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += new Long(getEntryId()).hashCode();
		_hashCode += new Long(getGroupId()).hashCode();
		if (getModifiedDate() != null) {
			_hashCode += getModifiedDate().hashCode();
		}
		_hashCode += new Long(getPrimaryKey()).hashCode();
		if (getTitle() != null) {
			_hashCode += getTitle().hashCode();
		}
		if (getTrackbacks() != null) {
			_hashCode += getTrackbacks().hashCode();
		}
		if (getUrlTitle() != null) {
			_hashCode += getUrlTitle().hashCode();
		}
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
		new org.apache.axis.description.TypeDesc(BlogsEntrySoap.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
			"http://model.blogs.portlet.liferay.com", "BlogsEntrySoap"));
		org.apache.axis.description.ElementDesc elemField =
			new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("allowTrackbacks");
		elemField.setXmlName(new javax.xml.namespace.QName(
			"", "allowTrackbacks"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("companyId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("content");
		elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("createDate");
		elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("displayDate");
		elemField.setXmlName(new javax.xml.namespace.QName("", "displayDate"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "dateTime"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("draft");
		elemField.setXmlName(new javax.xml.namespace.QName("", "draft"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
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
		elemField.setFieldName("primaryKey");
		elemField.setXmlName(new javax.xml.namespace.QName("", "primaryKey"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("title");
		elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("trackbacks");
		elemField.setXmlName(new javax.xml.namespace.QName("", "trackbacks"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("urlTitle");
		elemField.setXmlName(new javax.xml.namespace.QName("", "urlTitle"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
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
		elemField.setFieldName("uuid");
		elemField.setXmlName(new javax.xml.namespace.QName("", "uuid"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
