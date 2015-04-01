/**
 * OrganizationSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class OrganizationSoap implements java.io.Serializable {

	private java.lang.String comments;

	private long companyId;

	private long countryId;

	private long leftOrganizationId;

	private java.lang.String name;

	private long organizationId;

	private long parentOrganizationId;

	private long primaryKey;

	private boolean recursable;

	private long regionId;

	private long rightOrganizationId;

	private int statusId;

	private java.lang.String type;

	public OrganizationSoap() {

	}

	public OrganizationSoap(
		java.lang.String comments, long companyId, long countryId,
		long leftOrganizationId, java.lang.String name, long organizationId,
		long parentOrganizationId, long primaryKey, boolean recursable,
		long regionId, long rightOrganizationId, int statusId,
		java.lang.String type) {

		this.comments = comments;
		this.companyId = companyId;
		this.countryId = countryId;
		this.leftOrganizationId = leftOrganizationId;
		this.name = name;
		this.organizationId = organizationId;
		this.parentOrganizationId = parentOrganizationId;
		this.primaryKey = primaryKey;
		this.recursable = recursable;
		this.regionId = regionId;
		this.rightOrganizationId = rightOrganizationId;
		this.statusId = statusId;
		this.type = type;
	}

	/**
	 * Gets the comments value for this OrganizationSoap.
	 * 
	 * @return comments
	 */
	public java.lang.String getComments() {

		return comments;
	}

	/**
	 * Sets the comments value for this OrganizationSoap.
	 * 
	 * @param comments
	 */
	public void setComments(java.lang.String comments) {

		this.comments = comments;
	}

	/**
	 * Gets the companyId value for this OrganizationSoap.
	 * 
	 * @return companyId
	 */
	public long getCompanyId() {

		return companyId;
	}

	/**
	 * Sets the companyId value for this OrganizationSoap.
	 * 
	 * @param companyId
	 */
	public void setCompanyId(long companyId) {

		this.companyId = companyId;
	}

	/**
	 * Gets the countryId value for this OrganizationSoap.
	 * 
	 * @return countryId
	 */
	public long getCountryId() {

		return countryId;
	}

	/**
	 * Sets the countryId value for this OrganizationSoap.
	 * 
	 * @param countryId
	 */
	public void setCountryId(long countryId) {

		this.countryId = countryId;
	}

	/**
	 * Gets the leftOrganizationId value for this OrganizationSoap.
	 * 
	 * @return leftOrganizationId
	 */
	public long getLeftOrganizationId() {

		return leftOrganizationId;
	}

	/**
	 * Sets the leftOrganizationId value for this OrganizationSoap.
	 * 
	 * @param leftOrganizationId
	 */
	public void setLeftOrganizationId(long leftOrganizationId) {

		this.leftOrganizationId = leftOrganizationId;
	}

	/**
	 * Gets the name value for this OrganizationSoap.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {

		return name;
	}

	/**
	 * Sets the name value for this OrganizationSoap.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {

		this.name = name;
	}

	/**
	 * Gets the organizationId value for this OrganizationSoap.
	 * 
	 * @return organizationId
	 */
	public long getOrganizationId() {

		return organizationId;
	}

	/**
	 * Sets the organizationId value for this OrganizationSoap.
	 * 
	 * @param organizationId
	 */
	public void setOrganizationId(long organizationId) {

		this.organizationId = organizationId;
	}

	/**
	 * Gets the parentOrganizationId value for this OrganizationSoap.
	 * 
	 * @return parentOrganizationId
	 */
	public long getParentOrganizationId() {

		return parentOrganizationId;
	}

	/**
	 * Sets the parentOrganizationId value for this OrganizationSoap.
	 * 
	 * @param parentOrganizationId
	 */
	public void setParentOrganizationId(long parentOrganizationId) {

		this.parentOrganizationId = parentOrganizationId;
	}

	/**
	 * Gets the primaryKey value for this OrganizationSoap.
	 * 
	 * @return primaryKey
	 */
	public long getPrimaryKey() {

		return primaryKey;
	}

	/**
	 * Sets the primaryKey value for this OrganizationSoap.
	 * 
	 * @param primaryKey
	 */
	public void setPrimaryKey(long primaryKey) {

		this.primaryKey = primaryKey;
	}

	/**
	 * Gets the recursable value for this OrganizationSoap.
	 * 
	 * @return recursable
	 */
	public boolean isRecursable() {

		return recursable;
	}

	/**
	 * Sets the recursable value for this OrganizationSoap.
	 * 
	 * @param recursable
	 */
	public void setRecursable(boolean recursable) {

		this.recursable = recursable;
	}

	/**
	 * Gets the regionId value for this OrganizationSoap.
	 * 
	 * @return regionId
	 */
	public long getRegionId() {

		return regionId;
	}

	/**
	 * Sets the regionId value for this OrganizationSoap.
	 * 
	 * @param regionId
	 */
	public void setRegionId(long regionId) {

		this.regionId = regionId;
	}

	/**
	 * Gets the rightOrganizationId value for this OrganizationSoap.
	 * 
	 * @return rightOrganizationId
	 */
	public long getRightOrganizationId() {

		return rightOrganizationId;
	}

	/**
	 * Sets the rightOrganizationId value for this OrganizationSoap.
	 * 
	 * @param rightOrganizationId
	 */
	public void setRightOrganizationId(long rightOrganizationId) {

		this.rightOrganizationId = rightOrganizationId;
	}

	/**
	 * Gets the statusId value for this OrganizationSoap.
	 * 
	 * @return statusId
	 */
	public int getStatusId() {

		return statusId;
	}

	/**
	 * Sets the statusId value for this OrganizationSoap.
	 * 
	 * @param statusId
	 */
	public void setStatusId(int statusId) {

		this.statusId = statusId;
	}

	/**
	 * Gets the type value for this OrganizationSoap.
	 * 
	 * @return type
	 */
	public java.lang.String getType() {

		return type;
	}

	/**
	 * Sets the type value for this OrganizationSoap.
	 * 
	 * @param type
	 */
	public void setType(java.lang.String type) {

		this.type = type;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {

		if (!(obj instanceof OrganizationSoap))
			return false;
		OrganizationSoap other = (OrganizationSoap) obj;
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
				((this.comments == null && other.getComments() == null) || (this.comments != null && this.comments.equals(other.getComments()))) &&
				this.companyId == other.getCompanyId() &&
				this.countryId == other.getCountryId() &&
				this.leftOrganizationId == other.getLeftOrganizationId() &&
				((this.name == null && other.getName() == null) || (this.name != null && this.name.equals(other.getName()))) &&
				this.organizationId == other.getOrganizationId() &&
				this.parentOrganizationId == other.getParentOrganizationId() &&
				this.primaryKey == other.getPrimaryKey() &&
				this.recursable == other.isRecursable() &&
				this.regionId == other.getRegionId() &&
				this.rightOrganizationId == other.getRightOrganizationId() &&
				this.statusId == other.getStatusId() &&
				((this.type == null && other.getType() == null) || (this.type != null && this.type.equals(other.getType())));
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
		if (getComments() != null) {
			_hashCode += getComments().hashCode();
		}
		_hashCode += new Long(getCompanyId()).hashCode();
		_hashCode += new Long(getCountryId()).hashCode();
		_hashCode += new Long(getLeftOrganizationId()).hashCode();
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		_hashCode += new Long(getOrganizationId()).hashCode();
		_hashCode += new Long(getParentOrganizationId()).hashCode();
		_hashCode += new Long(getPrimaryKey()).hashCode();
		_hashCode += (isRecursable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
		_hashCode += new Long(getRegionId()).hashCode();
		_hashCode += new Long(getRightOrganizationId()).hashCode();
		_hashCode += getStatusId();
		if (getType() != null) {
			_hashCode += getType().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc =
		new org.apache.axis.description.TypeDesc(OrganizationSoap.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
			"http://model.portal.liferay.com", "OrganizationSoap"));
		org.apache.axis.description.ElementDesc elemField =
			new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("comments");
		elemField.setXmlName(new javax.xml.namespace.QName("", "comments"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("companyId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("countryId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "countryId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("leftOrganizationId");
		elemField.setXmlName(new javax.xml.namespace.QName(
			"", "leftOrganizationId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://schemas.xmlsoap.org/soap/encoding/", "string"));
		elemField.setNillable(true);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("organizationId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "organizationId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("parentOrganizationId");
		elemField.setXmlName(new javax.xml.namespace.QName(
			"", "parentOrganizationId"));
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
		elemField.setFieldName("recursable");
		elemField.setXmlName(new javax.xml.namespace.QName("", "recursable"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "boolean"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("regionId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "regionId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("rightOrganizationId");
		elemField.setXmlName(new javax.xml.namespace.QName(
			"", "rightOrganizationId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "long"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("statusId");
		elemField.setXmlName(new javax.xml.namespace.QName("", "statusId"));
		elemField.setXmlType(new javax.xml.namespace.QName(
			"http://www.w3.org/2001/XMLSchema", "int"));
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("type");
		elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
