/**
 * MvPaymentConfirmRequestEvt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.mvservice;

public class MvPaymentConfirmRequestEvt  implements java.io.Serializable {
    private java.lang.String MSISDN;

    private java.lang.String cmpID;

    private java.lang.String deviceType;

    private java.lang.String disconnectReason;

    private java.lang.String enableID;

    private java.lang.String endTime;

    private java.lang.String fileSize;

    private java.lang.String fileTotalTime;

    private java.lang.String playTime;

    private java.lang.String startTime;

    private java.lang.String timeStamp;

    private java.lang.String totalSendBytes;

    private java.lang.String transactionID;

    public MvPaymentConfirmRequestEvt() {
    }

    public MvPaymentConfirmRequestEvt(
           java.lang.String MSISDN,
           java.lang.String cmpID,
           java.lang.String deviceType,
           java.lang.String disconnectReason,
           java.lang.String enableID,
           java.lang.String endTime,
           java.lang.String fileSize,
           java.lang.String fileTotalTime,
           java.lang.String playTime,
           java.lang.String startTime,
           java.lang.String timeStamp,
           java.lang.String totalSendBytes,
           java.lang.String transactionID) {
           this.MSISDN = MSISDN;
           this.cmpID = cmpID;
           this.deviceType = deviceType;
           this.disconnectReason = disconnectReason;
           this.enableID = enableID;
           this.endTime = endTime;
           this.fileSize = fileSize;
           this.fileTotalTime = fileTotalTime;
           this.playTime = playTime;
           this.startTime = startTime;
           this.timeStamp = timeStamp;
           this.totalSendBytes = totalSendBytes;
           this.transactionID = transactionID;
    }


    /**
     * Gets the MSISDN value for this MvPaymentConfirmRequestEvt.
     * 
     * @return MSISDN
     */
    public java.lang.String getMSISDN() {
        return MSISDN;
    }


    /**
     * Sets the MSISDN value for this MvPaymentConfirmRequestEvt.
     * 
     * @param MSISDN
     */
    public void setMSISDN(java.lang.String MSISDN) {
        this.MSISDN = MSISDN;
    }


    /**
     * Gets the cmpID value for this MvPaymentConfirmRequestEvt.
     * 
     * @return cmpID
     */
    public java.lang.String getCmpID() {
        return cmpID;
    }


    /**
     * Sets the cmpID value for this MvPaymentConfirmRequestEvt.
     * 
     * @param cmpID
     */
    public void setCmpID(java.lang.String cmpID) {
        this.cmpID = cmpID;
    }


    /**
     * Gets the deviceType value for this MvPaymentConfirmRequestEvt.
     * 
     * @return deviceType
     */
    public java.lang.String getDeviceType() {
        return deviceType;
    }


    /**
     * Sets the deviceType value for this MvPaymentConfirmRequestEvt.
     * 
     * @param deviceType
     */
    public void setDeviceType(java.lang.String deviceType) {
        this.deviceType = deviceType;
    }


    /**
     * Gets the disconnectReason value for this MvPaymentConfirmRequestEvt.
     * 
     * @return disconnectReason
     */
    public java.lang.String getDisconnectReason() {
        return disconnectReason;
    }


    /**
     * Sets the disconnectReason value for this MvPaymentConfirmRequestEvt.
     * 
     * @param disconnectReason
     */
    public void setDisconnectReason(java.lang.String disconnectReason) {
        this.disconnectReason = disconnectReason;
    }


    /**
     * Gets the enableID value for this MvPaymentConfirmRequestEvt.
     * 
     * @return enableID
     */
    public java.lang.String getEnableID() {
        return enableID;
    }


    /**
     * Sets the enableID value for this MvPaymentConfirmRequestEvt.
     * 
     * @param enableID
     */
    public void setEnableID(java.lang.String enableID) {
        this.enableID = enableID;
    }


    /**
     * Gets the endTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @return endTime
     */
    public java.lang.String getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @param endTime
     */
    public void setEndTime(java.lang.String endTime) {
        this.endTime = endTime;
    }


    /**
     * Gets the fileSize value for this MvPaymentConfirmRequestEvt.
     * 
     * @return fileSize
     */
    public java.lang.String getFileSize() {
        return fileSize;
    }


    /**
     * Sets the fileSize value for this MvPaymentConfirmRequestEvt.
     * 
     * @param fileSize
     */
    public void setFileSize(java.lang.String fileSize) {
        this.fileSize = fileSize;
    }


    /**
     * Gets the fileTotalTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @return fileTotalTime
     */
    public java.lang.String getFileTotalTime() {
        return fileTotalTime;
    }


    /**
     * Sets the fileTotalTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @param fileTotalTime
     */
    public void setFileTotalTime(java.lang.String fileTotalTime) {
        this.fileTotalTime = fileTotalTime;
    }


    /**
     * Gets the playTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @return playTime
     */
    public java.lang.String getPlayTime() {
        return playTime;
    }


    /**
     * Sets the playTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @param playTime
     */
    public void setPlayTime(java.lang.String playTime) {
        this.playTime = playTime;
    }


    /**
     * Gets the startTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @return startTime
     */
    public java.lang.String getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this MvPaymentConfirmRequestEvt.
     * 
     * @param startTime
     */
    public void setStartTime(java.lang.String startTime) {
        this.startTime = startTime;
    }


    /**
     * Gets the timeStamp value for this MvPaymentConfirmRequestEvt.
     * 
     * @return timeStamp
     */
    public java.lang.String getTimeStamp() {
        return timeStamp;
    }


    /**
     * Sets the timeStamp value for this MvPaymentConfirmRequestEvt.
     * 
     * @param timeStamp
     */
    public void setTimeStamp(java.lang.String timeStamp) {
        this.timeStamp = timeStamp;
    }


    /**
     * Gets the totalSendBytes value for this MvPaymentConfirmRequestEvt.
     * 
     * @return totalSendBytes
     */
    public java.lang.String getTotalSendBytes() {
        return totalSendBytes;
    }


    /**
     * Sets the totalSendBytes value for this MvPaymentConfirmRequestEvt.
     * 
     * @param totalSendBytes
     */
    public void setTotalSendBytes(java.lang.String totalSendBytes) {
        this.totalSendBytes = totalSendBytes;
    }


    /**
     * Gets the transactionID value for this MvPaymentConfirmRequestEvt.
     * 
     * @return transactionID
     */
    public java.lang.String getTransactionID() {
        return transactionID;
    }


    /**
     * Sets the transactionID value for this MvPaymentConfirmRequestEvt.
     * 
     * @param transactionID
     */
    public void setTransactionID(java.lang.String transactionID) {
        this.transactionID = transactionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MvPaymentConfirmRequestEvt)) return false;
        MvPaymentConfirmRequestEvt other = (MvPaymentConfirmRequestEvt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MSISDN==null && other.getMSISDN()==null) || 
             (this.MSISDN!=null &&
              this.MSISDN.equals(other.getMSISDN()))) &&
            ((this.cmpID==null && other.getCmpID()==null) || 
             (this.cmpID!=null &&
              this.cmpID.equals(other.getCmpID()))) &&
            ((this.deviceType==null && other.getDeviceType()==null) || 
             (this.deviceType!=null &&
              this.deviceType.equals(other.getDeviceType()))) &&
            ((this.disconnectReason==null && other.getDisconnectReason()==null) || 
             (this.disconnectReason!=null &&
              this.disconnectReason.equals(other.getDisconnectReason()))) &&
            ((this.enableID==null && other.getEnableID()==null) || 
             (this.enableID!=null &&
              this.enableID.equals(other.getEnableID()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              this.endTime.equals(other.getEndTime()))) &&
            ((this.fileSize==null && other.getFileSize()==null) || 
             (this.fileSize!=null &&
              this.fileSize.equals(other.getFileSize()))) &&
            ((this.fileTotalTime==null && other.getFileTotalTime()==null) || 
             (this.fileTotalTime!=null &&
              this.fileTotalTime.equals(other.getFileTotalTime()))) &&
            ((this.playTime==null && other.getPlayTime()==null) || 
             (this.playTime!=null &&
              this.playTime.equals(other.getPlayTime()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              this.startTime.equals(other.getStartTime()))) &&
            ((this.timeStamp==null && other.getTimeStamp()==null) || 
             (this.timeStamp!=null &&
              this.timeStamp.equals(other.getTimeStamp()))) &&
            ((this.totalSendBytes==null && other.getTotalSendBytes()==null) || 
             (this.totalSendBytes!=null &&
              this.totalSendBytes.equals(other.getTotalSendBytes()))) &&
            ((this.transactionID==null && other.getTransactionID()==null) || 
             (this.transactionID!=null &&
              this.transactionID.equals(other.getTransactionID())));
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
        if (getMSISDN() != null) {
            _hashCode += getMSISDN().hashCode();
        }
        if (getCmpID() != null) {
            _hashCode += getCmpID().hashCode();
        }
        if (getDeviceType() != null) {
            _hashCode += getDeviceType().hashCode();
        }
        if (getDisconnectReason() != null) {
            _hashCode += getDisconnectReason().hashCode();
        }
        if (getEnableID() != null) {
            _hashCode += getEnableID().hashCode();
        }
        if (getEndTime() != null) {
            _hashCode += getEndTime().hashCode();
        }
        if (getFileSize() != null) {
            _hashCode += getFileSize().hashCode();
        }
        if (getFileTotalTime() != null) {
            _hashCode += getFileTotalTime().hashCode();
        }
        if (getPlayTime() != null) {
            _hashCode += getPlayTime().hashCode();
        }
        if (getStartTime() != null) {
            _hashCode += getStartTime().hashCode();
        }
        if (getTimeStamp() != null) {
            _hashCode += getTimeStamp().hashCode();
        }
        if (getTotalSendBytes() != null) {
            _hashCode += getTotalSendBytes().hashCode();
        }
        if (getTransactionID() != null) {
            _hashCode += getTransactionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MvPaymentConfirmRequestEvt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.crbt.cmcc.com", "MvPaymentConfirmRequestEvt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSISDN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MSISDN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmpID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmpID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviceType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviceType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disconnectReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disconnectReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enableID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileTotalTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileTotalTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("playTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "playTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStamp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeStamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSendBytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalSendBytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
