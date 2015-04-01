/**
 * ServiceContext.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.liferay.remote.axis;

public class ServiceContext  implements java.io.Serializable {
    private boolean addCommunityPermissions;

    private boolean addGuestPermissions;

    private java.util.HashMap attributes;

    private java.lang.String[] communityPermissions;

    private long companyId;

    private java.util.HashMap expandoBridgeAttributes;

    private java.lang.String[] guestPermissions;

    private java.lang.String languageId;

    private java.lang.String layoutURL;

    private java.lang.String pathMain;

    private long plid;

    private java.lang.String portalURL;

    private com.liferay.remote.axis.PortletPreferencesIds portletPreferencesIds;

    private long scopeGroupId;

    private java.lang.String[] tagsCategories;

    private java.lang.String[] tagsEntries;

    private java.lang.String userDisplayURL;

    private long userId;

    public ServiceContext() {
    }

    public ServiceContext(
           boolean addCommunityPermissions,
           boolean addGuestPermissions,
           java.util.HashMap attributes,
           java.lang.String[] communityPermissions,
           long companyId,
           java.util.HashMap expandoBridgeAttributes,
           java.lang.String[] guestPermissions,
           java.lang.String languageId,
           java.lang.String layoutURL,
           java.lang.String pathMain,
           long plid,
           java.lang.String portalURL,
           com.liferay.remote.axis.PortletPreferencesIds portletPreferencesIds,
           long scopeGroupId,
           java.lang.String[] tagsCategories,
           java.lang.String[] tagsEntries,
           java.lang.String userDisplayURL,
           long userId) {
           this.addCommunityPermissions = addCommunityPermissions;
           this.addGuestPermissions = addGuestPermissions;
           this.attributes = attributes;
           this.communityPermissions = communityPermissions;
           this.companyId = companyId;
           this.expandoBridgeAttributes = expandoBridgeAttributes;
           this.guestPermissions = guestPermissions;
           this.languageId = languageId;
           this.layoutURL = layoutURL;
           this.pathMain = pathMain;
           this.plid = plid;
           this.portalURL = portalURL;
           this.portletPreferencesIds = portletPreferencesIds;
           this.scopeGroupId = scopeGroupId;
           this.tagsCategories = tagsCategories;
           this.tagsEntries = tagsEntries;
           this.userDisplayURL = userDisplayURL;
           this.userId = userId;
    }


    /**
     * Gets the addCommunityPermissions value for this ServiceContext.
     * 
     * @return addCommunityPermissions
     */
    public boolean isAddCommunityPermissions() {
        return addCommunityPermissions;
    }


    /**
     * Sets the addCommunityPermissions value for this ServiceContext.
     * 
     * @param addCommunityPermissions
     */
    public void setAddCommunityPermissions(boolean addCommunityPermissions) {
        this.addCommunityPermissions = addCommunityPermissions;
    }


    /**
     * Gets the addGuestPermissions value for this ServiceContext.
     * 
     * @return addGuestPermissions
     */
    public boolean isAddGuestPermissions() {
        return addGuestPermissions;
    }


    /**
     * Sets the addGuestPermissions value for this ServiceContext.
     * 
     * @param addGuestPermissions
     */
    public void setAddGuestPermissions(boolean addGuestPermissions) {
        this.addGuestPermissions = addGuestPermissions;
    }


    /**
     * Gets the attributes value for this ServiceContext.
     * 
     * @return attributes
     */
    public java.util.HashMap getAttributes() {
        return attributes;
    }


    /**
     * Sets the attributes value for this ServiceContext.
     * 
     * @param attributes
     */
    public void setAttributes(java.util.HashMap attributes) {
        this.attributes = attributes;
    }


    /**
     * Gets the communityPermissions value for this ServiceContext.
     * 
     * @return communityPermissions
     */
    public java.lang.String[] getCommunityPermissions() {
        return communityPermissions;
    }


    /**
     * Sets the communityPermissions value for this ServiceContext.
     * 
     * @param communityPermissions
     */
    public void setCommunityPermissions(java.lang.String[] communityPermissions) {
        this.communityPermissions = communityPermissions;
    }


    /**
     * Gets the companyId value for this ServiceContext.
     * 
     * @return companyId
     */
    public long getCompanyId() {
        return companyId;
    }


    /**
     * Sets the companyId value for this ServiceContext.
     * 
     * @param companyId
     */
    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }


    /**
     * Gets the expandoBridgeAttributes value for this ServiceContext.
     * 
     * @return expandoBridgeAttributes
     */
    public java.util.HashMap getExpandoBridgeAttributes() {
        return expandoBridgeAttributes;
    }


    /**
     * Sets the expandoBridgeAttributes value for this ServiceContext.
     * 
     * @param expandoBridgeAttributes
     */
    public void setExpandoBridgeAttributes(java.util.HashMap expandoBridgeAttributes) {
        this.expandoBridgeAttributes = expandoBridgeAttributes;
    }


    /**
     * Gets the guestPermissions value for this ServiceContext.
     * 
     * @return guestPermissions
     */
    public java.lang.String[] getGuestPermissions() {
        return guestPermissions;
    }


    /**
     * Sets the guestPermissions value for this ServiceContext.
     * 
     * @param guestPermissions
     */
    public void setGuestPermissions(java.lang.String[] guestPermissions) {
        this.guestPermissions = guestPermissions;
    }


    /**
     * Gets the languageId value for this ServiceContext.
     * 
     * @return languageId
     */
    public java.lang.String getLanguageId() {
        return languageId;
    }


    /**
     * Sets the languageId value for this ServiceContext.
     * 
     * @param languageId
     */
    public void setLanguageId(java.lang.String languageId) {
        this.languageId = languageId;
    }


    /**
     * Gets the layoutURL value for this ServiceContext.
     * 
     * @return layoutURL
     */
    public java.lang.String getLayoutURL() {
        return layoutURL;
    }


    /**
     * Sets the layoutURL value for this ServiceContext.
     * 
     * @param layoutURL
     */
    public void setLayoutURL(java.lang.String layoutURL) {
        this.layoutURL = layoutURL;
    }


    /**
     * Gets the pathMain value for this ServiceContext.
     * 
     * @return pathMain
     */
    public java.lang.String getPathMain() {
        return pathMain;
    }


    /**
     * Sets the pathMain value for this ServiceContext.
     * 
     * @param pathMain
     */
    public void setPathMain(java.lang.String pathMain) {
        this.pathMain = pathMain;
    }


    /**
     * Gets the plid value for this ServiceContext.
     * 
     * @return plid
     */
    public long getPlid() {
        return plid;
    }


    /**
     * Sets the plid value for this ServiceContext.
     * 
     * @param plid
     */
    public void setPlid(long plid) {
        this.plid = plid;
    }


    /**
     * Gets the portalURL value for this ServiceContext.
     * 
     * @return portalURL
     */
    public java.lang.String getPortalURL() {
        return portalURL;
    }


    /**
     * Sets the portalURL value for this ServiceContext.
     * 
     * @param portalURL
     */
    public void setPortalURL(java.lang.String portalURL) {
        this.portalURL = portalURL;
    }


    /**
     * Gets the portletPreferencesIds value for this ServiceContext.
     * 
     * @return portletPreferencesIds
     */
    public com.liferay.remote.axis.PortletPreferencesIds getPortletPreferencesIds() {
        return portletPreferencesIds;
    }


    /**
     * Sets the portletPreferencesIds value for this ServiceContext.
     * 
     * @param portletPreferencesIds
     */
    public void setPortletPreferencesIds(com.liferay.remote.axis.PortletPreferencesIds portletPreferencesIds) {
        this.portletPreferencesIds = portletPreferencesIds;
    }


    /**
     * Gets the scopeGroupId value for this ServiceContext.
     * 
     * @return scopeGroupId
     */
    public long getScopeGroupId() {
        return scopeGroupId;
    }


    /**
     * Sets the scopeGroupId value for this ServiceContext.
     * 
     * @param scopeGroupId
     */
    public void setScopeGroupId(long scopeGroupId) {
        this.scopeGroupId = scopeGroupId;
    }


    /**
     * Gets the tagsCategories value for this ServiceContext.
     * 
     * @return tagsCategories
     */
    public java.lang.String[] getTagsCategories() {
        return tagsCategories;
    }


    /**
     * Sets the tagsCategories value for this ServiceContext.
     * 
     * @param tagsCategories
     */
    public void setTagsCategories(java.lang.String[] tagsCategories) {
        this.tagsCategories = tagsCategories;
    }


    /**
     * Gets the tagsEntries value for this ServiceContext.
     * 
     * @return tagsEntries
     */
    public java.lang.String[] getTagsEntries() {
        return tagsEntries;
    }


    /**
     * Sets the tagsEntries value for this ServiceContext.
     * 
     * @param tagsEntries
     */
    public void setTagsEntries(java.lang.String[] tagsEntries) {
        this.tagsEntries = tagsEntries;
    }


    /**
     * Gets the userDisplayURL value for this ServiceContext.
     * 
     * @return userDisplayURL
     */
    public java.lang.String getUserDisplayURL() {
        return userDisplayURL;
    }


    /**
     * Sets the userDisplayURL value for this ServiceContext.
     * 
     * @param userDisplayURL
     */
    public void setUserDisplayURL(java.lang.String userDisplayURL) {
        this.userDisplayURL = userDisplayURL;
    }


    /**
     * Gets the userId value for this ServiceContext.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this ServiceContext.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceContext)) return false;
        ServiceContext other = (ServiceContext) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.addCommunityPermissions == other.isAddCommunityPermissions() &&
            this.addGuestPermissions == other.isAddGuestPermissions() &&
            ((this.attributes==null && other.getAttributes()==null) || 
             (this.attributes!=null &&
              this.attributes.equals(other.getAttributes()))) &&
            ((this.communityPermissions==null && other.getCommunityPermissions()==null) || 
             (this.communityPermissions!=null &&
              java.util.Arrays.equals(this.communityPermissions, other.getCommunityPermissions()))) &&
            this.companyId == other.getCompanyId() &&
            ((this.expandoBridgeAttributes==null && other.getExpandoBridgeAttributes()==null) || 
             (this.expandoBridgeAttributes!=null &&
              this.expandoBridgeAttributes.equals(other.getExpandoBridgeAttributes()))) &&
            ((this.guestPermissions==null && other.getGuestPermissions()==null) || 
             (this.guestPermissions!=null &&
              java.util.Arrays.equals(this.guestPermissions, other.getGuestPermissions()))) &&
            ((this.languageId==null && other.getLanguageId()==null) || 
             (this.languageId!=null &&
              this.languageId.equals(other.getLanguageId()))) &&
            ((this.layoutURL==null && other.getLayoutURL()==null) || 
             (this.layoutURL!=null &&
              this.layoutURL.equals(other.getLayoutURL()))) &&
            ((this.pathMain==null && other.getPathMain()==null) || 
             (this.pathMain!=null &&
              this.pathMain.equals(other.getPathMain()))) &&
            this.plid == other.getPlid() &&
            ((this.portalURL==null && other.getPortalURL()==null) || 
             (this.portalURL!=null &&
              this.portalURL.equals(other.getPortalURL()))) &&
            ((this.portletPreferencesIds==null && other.getPortletPreferencesIds()==null) || 
             (this.portletPreferencesIds!=null &&
              this.portletPreferencesIds.equals(other.getPortletPreferencesIds()))) &&
            this.scopeGroupId == other.getScopeGroupId() &&
            ((this.tagsCategories==null && other.getTagsCategories()==null) || 
             (this.tagsCategories!=null &&
              java.util.Arrays.equals(this.tagsCategories, other.getTagsCategories()))) &&
            ((this.tagsEntries==null && other.getTagsEntries()==null) || 
             (this.tagsEntries!=null &&
              java.util.Arrays.equals(this.tagsEntries, other.getTagsEntries()))) &&
            ((this.userDisplayURL==null && other.getUserDisplayURL()==null) || 
             (this.userDisplayURL!=null &&
              this.userDisplayURL.equals(other.getUserDisplayURL()))) &&
            this.userId == other.getUserId();
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
        _hashCode += (isAddCommunityPermissions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAddGuestPermissions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAttributes() != null) {
            _hashCode += getAttributes().hashCode();
        }
        if (getCommunityPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommunityPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommunityPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCompanyId()).hashCode();
        if (getExpandoBridgeAttributes() != null) {
            _hashCode += getExpandoBridgeAttributes().hashCode();
        }
        if (getGuestPermissions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGuestPermissions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGuestPermissions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguageId() != null) {
            _hashCode += getLanguageId().hashCode();
        }
        if (getLayoutURL() != null) {
            _hashCode += getLayoutURL().hashCode();
        }
        if (getPathMain() != null) {
            _hashCode += getPathMain().hashCode();
        }
        _hashCode += new Long(getPlid()).hashCode();
        if (getPortalURL() != null) {
            _hashCode += getPortalURL().hashCode();
        }
        if (getPortletPreferencesIds() != null) {
            _hashCode += getPortletPreferencesIds().hashCode();
        }
        _hashCode += new Long(getScopeGroupId()).hashCode();
        if (getTagsCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTagsCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTagsCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTagsEntries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTagsEntries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTagsEntries(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserDisplayURL() != null) {
            _hashCode += getUserDisplayURL().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceContext.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service.portal.liferay.com", "ServiceContext"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addCommunityPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addCommunityPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addGuestPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addGuestPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expandoBridgeAttributes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expandoBridgeAttributes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xml.apache.org/xml-soap", "Map"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("guestPermissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "guestPermissions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("languageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "languageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layoutURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathMain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portalURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portletPreferencesIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portletPreferencesIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://model.portal.liferay.com", "PortletPreferencesIds"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scopeGroupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scopeGroupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagsCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagsCategories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagsEntries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagsEntries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userDisplayURL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userDisplayURL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
