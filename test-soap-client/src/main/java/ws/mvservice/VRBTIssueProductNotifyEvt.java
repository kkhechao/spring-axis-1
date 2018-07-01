/**
 * VRBTIssueProductNotifyEvt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.mvservice;

public class VRBTIssueProductNotifyEvt  implements java.io.Serializable {
    private java.lang.String DID;

    private java.lang.String DIDPwd;

    private java.lang.String SEQ;

    private java.lang.String accessPlatformID;

    private java.lang.String eventType;

    private java.lang.String toneID;

    public VRBTIssueProductNotifyEvt() {
    }

    public VRBTIssueProductNotifyEvt(
           java.lang.String DID,
           java.lang.String DIDPwd,
           java.lang.String SEQ,
           java.lang.String accessPlatformID,
           java.lang.String eventType,
           java.lang.String toneID) {
           this.DID = DID;
           this.DIDPwd = DIDPwd;
           this.SEQ = SEQ;
           this.accessPlatformID = accessPlatformID;
           this.eventType = eventType;
           this.toneID = toneID;
    }


    /**
     * Gets the DID value for this VRBTIssueProductNotifyEvt.
     * 
     * @return DID
     */
    public java.lang.String getDID() {
        return DID;
    }


    /**
     * Sets the DID value for this VRBTIssueProductNotifyEvt.
     * 
     * @param DID
     */
    public void setDID(java.lang.String DID) {
        this.DID = DID;
    }


    /**
     * Gets the DIDPwd value for this VRBTIssueProductNotifyEvt.
     * 
     * @return DIDPwd
     */
    public java.lang.String getDIDPwd() {
        return DIDPwd;
    }


    /**
     * Sets the DIDPwd value for this VRBTIssueProductNotifyEvt.
     * 
     * @param DIDPwd
     */
    public void setDIDPwd(java.lang.String DIDPwd) {
        this.DIDPwd = DIDPwd;
    }


    /**
     * Gets the SEQ value for this VRBTIssueProductNotifyEvt.
     * 
     * @return SEQ
     */
    public java.lang.String getSEQ() {
        return SEQ;
    }


    /**
     * Sets the SEQ value for this VRBTIssueProductNotifyEvt.
     * 
     * @param SEQ
     */
    public void setSEQ(java.lang.String SEQ) {
        this.SEQ = SEQ;
    }


    /**
     * Gets the accessPlatformID value for this VRBTIssueProductNotifyEvt.
     * 
     * @return accessPlatformID
     */
    public java.lang.String getAccessPlatformID() {
        return accessPlatformID;
    }


    /**
     * Sets the accessPlatformID value for this VRBTIssueProductNotifyEvt.
     * 
     * @param accessPlatformID
     */
    public void setAccessPlatformID(java.lang.String accessPlatformID) {
        this.accessPlatformID = accessPlatformID;
    }


    /**
     * Gets the eventType value for this VRBTIssueProductNotifyEvt.
     * 
     * @return eventType
     */
    public java.lang.String getEventType() {
        return eventType;
    }


    /**
     * Sets the eventType value for this VRBTIssueProductNotifyEvt.
     * 
     * @param eventType
     */
    public void setEventType(java.lang.String eventType) {
        this.eventType = eventType;
    }


    /**
     * Gets the toneID value for this VRBTIssueProductNotifyEvt.
     * 
     * @return toneID
     */
    public java.lang.String getToneID() {
        return toneID;
    }


    /**
     * Sets the toneID value for this VRBTIssueProductNotifyEvt.
     * 
     * @param toneID
     */
    public void setToneID(java.lang.String toneID) {
        this.toneID = toneID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VRBTIssueProductNotifyEvt)) return false;
        VRBTIssueProductNotifyEvt other = (VRBTIssueProductNotifyEvt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.DID==null && other.getDID()==null) || 
             (this.DID!=null &&
              this.DID.equals(other.getDID()))) &&
            ((this.DIDPwd==null && other.getDIDPwd()==null) || 
             (this.DIDPwd!=null &&
              this.DIDPwd.equals(other.getDIDPwd()))) &&
            ((this.SEQ==null && other.getSEQ()==null) || 
             (this.SEQ!=null &&
              this.SEQ.equals(other.getSEQ()))) &&
            ((this.accessPlatformID==null && other.getAccessPlatformID()==null) || 
             (this.accessPlatformID!=null &&
              this.accessPlatformID.equals(other.getAccessPlatformID()))) &&
            ((this.eventType==null && other.getEventType()==null) || 
             (this.eventType!=null &&
              this.eventType.equals(other.getEventType()))) &&
            ((this.toneID==null && other.getToneID()==null) || 
             (this.toneID!=null &&
              this.toneID.equals(other.getToneID())));
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
        if (getDID() != null) {
            _hashCode += getDID().hashCode();
        }
        if (getDIDPwd() != null) {
            _hashCode += getDIDPwd().hashCode();
        }
        if (getSEQ() != null) {
            _hashCode += getSEQ().hashCode();
        }
        if (getAccessPlatformID() != null) {
            _hashCode += getAccessPlatformID().hashCode();
        }
        if (getEventType() != null) {
            _hashCode += getEventType().hashCode();
        }
        if (getToneID() != null) {
            _hashCode += getToneID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VRBTIssueProductNotifyEvt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://218.200.227.202:8089/jboss-net/services/DeploymvpicManage", "VRBTIssueProductNotifyEvt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DIDPwd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DIDPwd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SEQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessPlatformID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessPlatformID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/soap/encoding/", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneID"));
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
