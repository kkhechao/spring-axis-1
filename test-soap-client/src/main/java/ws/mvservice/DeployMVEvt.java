/**
 * DeployMVEvt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.mvservice;

public class DeployMVEvt  implements java.io.Serializable {
    private ws.mvservice.MVFile[] MVFileSet;

    private java.lang.String action;

    private java.lang.String actorName;

    private java.lang.String actorNameLetter;

    private java.lang.String actorType;

    private java.lang.String cmpID;

    private java.lang.String composer;

    private java.lang.String contentDesc;

    private java.lang.String contentID;

    private java.lang.String contentLetter;

    private java.lang.String contentName;

    private java.lang.String copyrightID;

    private java.lang.String invalidateDate;

    private java.lang.String lyricWriter;

    private java.lang.String price;

    private java.lang.String productClass;

    private java.lang.String property;

    private java.lang.String publishArea;

    private java.lang.String securityID;

    private java.lang.String songType;

    private java.lang.String targetDeviceID;

    private java.lang.String transactionId;

    private java.lang.String validateDate;

    private ws.mvservice.ParamInfo[] paramSet;

    public DeployMVEvt() {
    }

    public DeployMVEvt(
           ws.mvservice.MVFile[] MVFileSet,
           java.lang.String action,
           java.lang.String actorName,
           java.lang.String actorNameLetter,
           java.lang.String actorType,
           java.lang.String cmpID,
           java.lang.String composer,
           java.lang.String contentDesc,
           java.lang.String contentID,
           java.lang.String contentLetter,
           java.lang.String contentName,
           java.lang.String copyrightID,
           java.lang.String invalidateDate,
           java.lang.String lyricWriter,
           java.lang.String price,
           java.lang.String productClass,
           java.lang.String property,
           java.lang.String publishArea,
           java.lang.String securityID,
           java.lang.String songType,
           java.lang.String targetDeviceID,
           java.lang.String transactionId,
           java.lang.String validateDate,
           ws.mvservice.ParamInfo[] paramSet) {
           this.MVFileSet = MVFileSet;
           this.action = action;
           this.actorName = actorName;
           this.actorNameLetter = actorNameLetter;
           this.actorType = actorType;
           this.cmpID = cmpID;
           this.composer = composer;
           this.contentDesc = contentDesc;
           this.contentID = contentID;
           this.contentLetter = contentLetter;
           this.contentName = contentName;
           this.copyrightID = copyrightID;
           this.invalidateDate = invalidateDate;
           this.lyricWriter = lyricWriter;
           this.price = price;
           this.productClass = productClass;
           this.property = property;
           this.publishArea = publishArea;
           this.securityID = securityID;
           this.songType = songType;
           this.targetDeviceID = targetDeviceID;
           this.transactionId = transactionId;
           this.validateDate = validateDate;
           this.paramSet = paramSet;
    }


    /**
     * Gets the MVFileSet value for this DeployMVEvt.
     * 
     * @return MVFileSet
     */
    public ws.mvservice.MVFile[] getMVFileSet() {
        return MVFileSet;
    }


    /**
     * Sets the MVFileSet value for this DeployMVEvt.
     * 
     * @param MVFileSet
     */
    public void setMVFileSet(ws.mvservice.MVFile[] MVFileSet) {
        this.MVFileSet = MVFileSet;
    }


    /**
     * Gets the action value for this DeployMVEvt.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this DeployMVEvt.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the actorName value for this DeployMVEvt.
     * 
     * @return actorName
     */
    public java.lang.String getActorName() {
        return actorName;
    }


    /**
     * Sets the actorName value for this DeployMVEvt.
     * 
     * @param actorName
     */
    public void setActorName(java.lang.String actorName) {
        this.actorName = actorName;
    }


    /**
     * Gets the actorNameLetter value for this DeployMVEvt.
     * 
     * @return actorNameLetter
     */
    public java.lang.String getActorNameLetter() {
        return actorNameLetter;
    }


    /**
     * Sets the actorNameLetter value for this DeployMVEvt.
     * 
     * @param actorNameLetter
     */
    public void setActorNameLetter(java.lang.String actorNameLetter) {
        this.actorNameLetter = actorNameLetter;
    }


    /**
     * Gets the actorType value for this DeployMVEvt.
     * 
     * @return actorType
     */
    public java.lang.String getActorType() {
        return actorType;
    }


    /**
     * Sets the actorType value for this DeployMVEvt.
     * 
     * @param actorType
     */
    public void setActorType(java.lang.String actorType) {
        this.actorType = actorType;
    }


    /**
     * Gets the cmpID value for this DeployMVEvt.
     * 
     * @return cmpID
     */
    public java.lang.String getCmpID() {
        return cmpID;
    }


    /**
     * Sets the cmpID value for this DeployMVEvt.
     * 
     * @param cmpID
     */
    public void setCmpID(java.lang.String cmpID) {
        this.cmpID = cmpID;
    }


    /**
     * Gets the composer value for this DeployMVEvt.
     * 
     * @return composer
     */
    public java.lang.String getComposer() {
        return composer;
    }


    /**
     * Sets the composer value for this DeployMVEvt.
     * 
     * @param composer
     */
    public void setComposer(java.lang.String composer) {
        this.composer = composer;
    }


    /**
     * Gets the contentDesc value for this DeployMVEvt.
     * 
     * @return contentDesc
     */
    public java.lang.String getContentDesc() {
        return contentDesc;
    }


    /**
     * Sets the contentDesc value for this DeployMVEvt.
     * 
     * @param contentDesc
     */
    public void setContentDesc(java.lang.String contentDesc) {
        this.contentDesc = contentDesc;
    }


    /**
     * Gets the contentID value for this DeployMVEvt.
     * 
     * @return contentID
     */
    public java.lang.String getContentID() {
        return contentID;
    }


    /**
     * Sets the contentID value for this DeployMVEvt.
     * 
     * @param contentID
     */
    public void setContentID(java.lang.String contentID) {
        this.contentID = contentID;
    }


    /**
     * Gets the contentLetter value for this DeployMVEvt.
     * 
     * @return contentLetter
     */
    public java.lang.String getContentLetter() {
        return contentLetter;
    }


    /**
     * Sets the contentLetter value for this DeployMVEvt.
     * 
     * @param contentLetter
     */
    public void setContentLetter(java.lang.String contentLetter) {
        this.contentLetter = contentLetter;
    }


    /**
     * Gets the contentName value for this DeployMVEvt.
     * 
     * @return contentName
     */
    public java.lang.String getContentName() {
        return contentName;
    }


    /**
     * Sets the contentName value for this DeployMVEvt.
     * 
     * @param contentName
     */
    public void setContentName(java.lang.String contentName) {
        this.contentName = contentName;
    }


    /**
     * Gets the copyrightID value for this DeployMVEvt.
     * 
     * @return copyrightID
     */
    public java.lang.String getCopyrightID() {
        return copyrightID;
    }


    /**
     * Sets the copyrightID value for this DeployMVEvt.
     * 
     * @param copyrightID
     */
    public void setCopyrightID(java.lang.String copyrightID) {
        this.copyrightID = copyrightID;
    }


    /**
     * Gets the invalidateDate value for this DeployMVEvt.
     * 
     * @return invalidateDate
     */
    public java.lang.String getInvalidateDate() {
        return invalidateDate;
    }


    /**
     * Sets the invalidateDate value for this DeployMVEvt.
     * 
     * @param invalidateDate
     */
    public void setInvalidateDate(java.lang.String invalidateDate) {
        this.invalidateDate = invalidateDate;
    }


    /**
     * Gets the lyricWriter value for this DeployMVEvt.
     * 
     * @return lyricWriter
     */
    public java.lang.String getLyricWriter() {
        return lyricWriter;
    }


    /**
     * Sets the lyricWriter value for this DeployMVEvt.
     * 
     * @param lyricWriter
     */
    public void setLyricWriter(java.lang.String lyricWriter) {
        this.lyricWriter = lyricWriter;
    }


    /**
     * Gets the price value for this DeployMVEvt.
     * 
     * @return price
     */
    public java.lang.String getPrice() {
        return price;
    }


    /**
     * Sets the price value for this DeployMVEvt.
     * 
     * @param price
     */
    public void setPrice(java.lang.String price) {
        this.price = price;
    }


    /**
     * Gets the productClass value for this DeployMVEvt.
     * 
     * @return productClass
     */
    public java.lang.String getProductClass() {
        return productClass;
    }


    /**
     * Sets the productClass value for this DeployMVEvt.
     * 
     * @param productClass
     */
    public void setProductClass(java.lang.String productClass) {
        this.productClass = productClass;
    }


    /**
     * Gets the property value for this DeployMVEvt.
     * 
     * @return property
     */
    public java.lang.String getProperty() {
        return property;
    }


    /**
     * Sets the property value for this DeployMVEvt.
     * 
     * @param property
     */
    public void setProperty(java.lang.String property) {
        this.property = property;
    }


    /**
     * Gets the publishArea value for this DeployMVEvt.
     * 
     * @return publishArea
     */
    public java.lang.String getPublishArea() {
        return publishArea;
    }


    /**
     * Sets the publishArea value for this DeployMVEvt.
     * 
     * @param publishArea
     */
    public void setPublishArea(java.lang.String publishArea) {
        this.publishArea = publishArea;
    }


    /**
     * Gets the securityID value for this DeployMVEvt.
     * 
     * @return securityID
     */
    public java.lang.String getSecurityID() {
        return securityID;
    }


    /**
     * Sets the securityID value for this DeployMVEvt.
     * 
     * @param securityID
     */
    public void setSecurityID(java.lang.String securityID) {
        this.securityID = securityID;
    }


    /**
     * Gets the songType value for this DeployMVEvt.
     * 
     * @return songType
     */
    public java.lang.String getSongType() {
        return songType;
    }


    /**
     * Sets the songType value for this DeployMVEvt.
     * 
     * @param songType
     */
    public void setSongType(java.lang.String songType) {
        this.songType = songType;
    }


    /**
     * Gets the targetDeviceID value for this DeployMVEvt.
     * 
     * @return targetDeviceID
     */
    public java.lang.String getTargetDeviceID() {
        return targetDeviceID;
    }


    /**
     * Sets the targetDeviceID value for this DeployMVEvt.
     * 
     * @param targetDeviceID
     */
    public void setTargetDeviceID(java.lang.String targetDeviceID) {
        this.targetDeviceID = targetDeviceID;
    }


    /**
     * Gets the transactionId value for this DeployMVEvt.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this DeployMVEvt.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the validateDate value for this DeployMVEvt.
     * 
     * @return validateDate
     */
    public java.lang.String getValidateDate() {
        return validateDate;
    }


    /**
     * Sets the validateDate value for this DeployMVEvt.
     * 
     * @param validateDate
     */
    public void setValidateDate(java.lang.String validateDate) {
        this.validateDate = validateDate;
    }


    /**
     * Gets the paramSet value for this DeployMVEvt.
     * 
     * @return paramSet
     */
    public ws.mvservice.ParamInfo[] getParamSet() {
        return paramSet;
    }


    /**
     * Sets the paramSet value for this DeployMVEvt.
     * 
     * @param paramSet
     */
    public void setParamSet(ws.mvservice.ParamInfo[] paramSet) {
        this.paramSet = paramSet;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeployMVEvt)) return false;
        DeployMVEvt other = (DeployMVEvt) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MVFileSet==null && other.getMVFileSet()==null) || 
             (this.MVFileSet!=null &&
              java.util.Arrays.equals(this.MVFileSet, other.getMVFileSet()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.actorName==null && other.getActorName()==null) || 
             (this.actorName!=null &&
              this.actorName.equals(other.getActorName()))) &&
            ((this.actorNameLetter==null && other.getActorNameLetter()==null) || 
             (this.actorNameLetter!=null &&
              this.actorNameLetter.equals(other.getActorNameLetter()))) &&
            ((this.actorType==null && other.getActorType()==null) || 
             (this.actorType!=null &&
              this.actorType.equals(other.getActorType()))) &&
            ((this.cmpID==null && other.getCmpID()==null) || 
             (this.cmpID!=null &&
              this.cmpID.equals(other.getCmpID()))) &&
            ((this.composer==null && other.getComposer()==null) || 
             (this.composer!=null &&
              this.composer.equals(other.getComposer()))) &&
            ((this.contentDesc==null && other.getContentDesc()==null) || 
             (this.contentDesc!=null &&
              this.contentDesc.equals(other.getContentDesc()))) &&
            ((this.contentID==null && other.getContentID()==null) || 
             (this.contentID!=null &&
              this.contentID.equals(other.getContentID()))) &&
            ((this.contentLetter==null && other.getContentLetter()==null) || 
             (this.contentLetter!=null &&
              this.contentLetter.equals(other.getContentLetter()))) &&
            ((this.contentName==null && other.getContentName()==null) || 
             (this.contentName!=null &&
              this.contentName.equals(other.getContentName()))) &&
            ((this.copyrightID==null && other.getCopyrightID()==null) || 
             (this.copyrightID!=null &&
              this.copyrightID.equals(other.getCopyrightID()))) &&
            ((this.invalidateDate==null && other.getInvalidateDate()==null) || 
             (this.invalidateDate!=null &&
              this.invalidateDate.equals(other.getInvalidateDate()))) &&
            ((this.lyricWriter==null && other.getLyricWriter()==null) || 
             (this.lyricWriter!=null &&
              this.lyricWriter.equals(other.getLyricWriter()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.productClass==null && other.getProductClass()==null) || 
             (this.productClass!=null &&
              this.productClass.equals(other.getProductClass()))) &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              this.property.equals(other.getProperty()))) &&
            ((this.publishArea==null && other.getPublishArea()==null) || 
             (this.publishArea!=null &&
              this.publishArea.equals(other.getPublishArea()))) &&
            ((this.securityID==null && other.getSecurityID()==null) || 
             (this.securityID!=null &&
              this.securityID.equals(other.getSecurityID()))) &&
            ((this.songType==null && other.getSongType()==null) || 
             (this.songType!=null &&
              this.songType.equals(other.getSongType()))) &&
            ((this.targetDeviceID==null && other.getTargetDeviceID()==null) || 
             (this.targetDeviceID!=null &&
              this.targetDeviceID.equals(other.getTargetDeviceID()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.validateDate==null && other.getValidateDate()==null) || 
             (this.validateDate!=null &&
              this.validateDate.equals(other.getValidateDate()))) &&
            ((this.paramSet==null && other.getParamSet()==null) || 
             (this.paramSet!=null &&
              java.util.Arrays.equals(this.paramSet, other.getParamSet())));
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
        if (getMVFileSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMVFileSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMVFileSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getActorName() != null) {
            _hashCode += getActorName().hashCode();
        }
        if (getActorNameLetter() != null) {
            _hashCode += getActorNameLetter().hashCode();
        }
        if (getActorType() != null) {
            _hashCode += getActorType().hashCode();
        }
        if (getCmpID() != null) {
            _hashCode += getCmpID().hashCode();
        }
        if (getComposer() != null) {
            _hashCode += getComposer().hashCode();
        }
        if (getContentDesc() != null) {
            _hashCode += getContentDesc().hashCode();
        }
        if (getContentID() != null) {
            _hashCode += getContentID().hashCode();
        }
        if (getContentLetter() != null) {
            _hashCode += getContentLetter().hashCode();
        }
        if (getContentName() != null) {
            _hashCode += getContentName().hashCode();
        }
        if (getCopyrightID() != null) {
            _hashCode += getCopyrightID().hashCode();
        }
        if (getInvalidateDate() != null) {
            _hashCode += getInvalidateDate().hashCode();
        }
        if (getLyricWriter() != null) {
            _hashCode += getLyricWriter().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getProductClass() != null) {
            _hashCode += getProductClass().hashCode();
        }
        if (getProperty() != null) {
            _hashCode += getProperty().hashCode();
        }
        if (getPublishArea() != null) {
            _hashCode += getPublishArea().hashCode();
        }
        if (getSecurityID() != null) {
            _hashCode += getSecurityID().hashCode();
        }
        if (getSongType() != null) {
            _hashCode += getSongType().hashCode();
        }
        if (getTargetDeviceID() != null) {
            _hashCode += getTargetDeviceID().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getValidateDate() != null) {
            _hashCode += getValidateDate().hashCode();
        }
        if (getParamSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParamSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParamSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeployMVEvt.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.crbt.cmcc.com", "DeployMVEvt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MVFileSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MVFileSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.crbt.cmcc.com", "MVFile"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorNameLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actorNameLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actorType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actorType"));
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
        elemField.setFieldName("composer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "composer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentLetter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentLetter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyrightID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copyrightID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalidateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lyricWriter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lyricWriter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productClass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publishArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securityID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("songType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "songType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetDeviceID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetDeviceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paramSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.crbt.cmcc.com", "ParamInfo"));
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
