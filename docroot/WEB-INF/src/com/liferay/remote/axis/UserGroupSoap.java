/**
 * UserGroupSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class UserGroupSoap implements java.io.Serializable {

	private long companyId;

	private java.lang.String description;

	private java.lang.String name;

	private long parentUserGroupId;

	private long primaryKey;

	private long userGroupId;

	public UserGroupSoap() {

	}

	public UserGroupSoap(
		long companyId, java.lang.String description, java.lang.String name,
		long parentUserGroupId, long primaryKey, long userGroupId) {

		this.companyId = companyId;
		this.description = description;
		this.name = name;
		this.parentUserGroupId = parentUserGroupId;
		this.primaryKey = primaryKey;
		this.userGroupId = userGroupId;
	}

	/**
	 * Gets the companyId value for this UserGroupSoap.
	 * 
	 * @return companyId
	 */
	public long getCompanyId() {

		return companyId;
	}

	/**
	 * Sets the companyId value for this UserGroupSoap.
	 * 
	 * @param companyId
	 */
	public void setCompanyId(long companyId) {

		this.companyId = companyId;
	}

	/**
	 * Gets the description value for this UserGroupSoap.
	 * 
	 * @return description
	 */
	public java.lang.String getDescription() {

		return description;
	}

	/**
	 * Sets the description value for this UserGroupSoap.
	 * 
	 * @param description
	 */
	public void setDescription(java.lang.String description) {

		this.description = description;
	}

	/**
	 * Gets the name value for this UserGroupSoap.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {

		return name;
	}

	/**
	 * Sets the name value for this UserGroupSoap.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {

		this.name = name;
	}

	/**
	 * Gets the parentUserGroupId value for this UserGroupSoap.
	 * 
	 * @return parentUserGroupId
	 */
	public long getParentUserGroupId() {

		return parentUserGroupId;
	}

	/**
	 * Sets the parentUserGroupId value for this UserGroupSoap.
	 * 
	 * @param parentUserGroupId
	 */
	public void setParentUserGroupId(long parentUserGroupId) {

		this.parentUserGroupId = parentUserGroupId;
	}

	/**
	 * Gets the primaryKey value for this UserGroupSoap.
	 * 
	 * @return primaryKey
	 */
	public long getPrimaryKey() {

		return primaryKey;
	}

	/**
	 * Sets the primaryKey value for this UserGroupSoap.
	 * 
	 * @param primaryKey
	 */
	public void setPrimaryKey(long primaryKey) {

		this.primaryKey = primaryKey;
	}

	/**
	 * Gets the userGroupId value for this UserGroupSoap.
	 * 
	 * @return userGroupId
	 */
	public long getUserGroupId() {

		return userGroupId;
	}

	/**
	 * Sets the userGroupId value for this UserGroupSoap.
	 * 
	 * @param userGroupId
	 */
	public void setUserGroupId(long userGroupId) {

		this.userGroupId = userGroupId;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {

		if (!(obj instanceof UserGroupSoap))
			return false;
		UserGroupSoap other = (UserGroupSoap) obj;
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
				((this.description == null && other.getDescription() == null) || (this.description != null && this.description.equals(other.getDescription()))) &&
				((this.name == null && other.getName() == null) || (this.name != null && this.name.equals(other.getName()))) &&
				this.parentUserGroupId == other.getParentUserGroupId() &&
				this.primaryKey == other.getPrimaryKey() &&
				this.userGroupId == other.getUserGroupId();
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
		if (getDescription() != null) {
			_hashCode += getDescription().hashCode();
		}
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += new Long(getParentUserGroupId()).hashCode();
		_hashCode += new Long(getPrimaryKey()).hashCode();
		_hashCode += new Long(getUserGroupId()).hashCode();
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
		new org.apache.axis.description.TypeDesc(UserGroupSoap.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "UserGroupSoap"));
		org.apache.axis.description.ElementDesc elemField =
			new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("companyId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("description");
		elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
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
		elemField.setFieldName("parentUserGroupId");
		elemField.setXmlName(new javax.xml.namespace.QName(
			"", "parentUserGroupId"));
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
		elemField.setFieldName("userGroupId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "userGroupId"));
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
