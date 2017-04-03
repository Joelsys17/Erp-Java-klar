/**
 * Upload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Upload  implements java.io.Serializable {
    private byte[] contents;

    private java.lang.String filenamesave;

    public Upload() {
    }

    public Upload(
           byte[] contents,
           java.lang.String filenamesave) {
           this.contents = contents;
           this.filenamesave = filenamesave;
    }


    /**
     * Gets the contents value for this Upload.
     * 
     * @return contents
     */
    public byte[] getContents() {
        return contents;
    }


    /**
     * Sets the contents value for this Upload.
     * 
     * @param contents
     */
    public void setContents(byte[] contents) {
        this.contents = contents;
    }


    /**
     * Gets the filenamesave value for this Upload.
     * 
     * @return filenamesave
     */
    public java.lang.String getFilenamesave() {
        return filenamesave;
    }


    /**
     * Sets the filenamesave value for this Upload.
     * 
     * @param filenamesave
     */
    public void setFilenamesave(java.lang.String filenamesave) {
        this.filenamesave = filenamesave;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Upload)) return false;
        Upload other = (Upload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contents==null && other.getContents()==null) || 
             (this.contents!=null &&
              java.util.Arrays.equals(this.contents, other.getContents()))) &&
            ((this.filenamesave==null && other.getFilenamesave()==null) || 
             (this.filenamesave!=null &&
              this.filenamesave.equals(other.getFilenamesave())));
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
        if (getContents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilenamesave() != null) {
            _hashCode += getFilenamesave().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Upload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Upload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "contents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filenamesave");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "filenamesave"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
