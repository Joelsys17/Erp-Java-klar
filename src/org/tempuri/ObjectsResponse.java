/**
 * ObjectsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ObjectsResponse  implements java.io.Serializable {
    private java.lang.Object[] objectsResult;

    public ObjectsResponse() {
    }

    public ObjectsResponse(
           java.lang.Object[] objectsResult) {
           this.objectsResult = objectsResult;
    }


    /**
     * Gets the objectsResult value for this ObjectsResponse.
     * 
     * @return objectsResult
     */
    public java.lang.Object[] getObjectsResult() {
        return objectsResult;
    }


    /**
     * Sets the objectsResult value for this ObjectsResponse.
     * 
     * @param objectsResult
     */
    public void setObjectsResult(java.lang.Object[] objectsResult) {
        this.objectsResult = objectsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObjectsResponse)) return false;
        ObjectsResponse other = (ObjectsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.objectsResult==null && other.getObjectsResult()==null) || 
             (this.objectsResult!=null &&
              java.util.Arrays.equals(this.objectsResult, other.getObjectsResult())));
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
        if (getObjectsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getObjectsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getObjectsResult(), i);
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
        new org.apache.axis.description.TypeDesc(ObjectsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">objectsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("objectsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "objectsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
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
