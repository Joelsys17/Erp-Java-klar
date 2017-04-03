/**
 * SqlstringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SqlstringResponse  implements java.io.Serializable {
    private org.tempuri.SqlstringResponseSqlstringResult sqlstringResult;

    public SqlstringResponse() {
    }

    public SqlstringResponse(
           org.tempuri.SqlstringResponseSqlstringResult sqlstringResult) {
           this.sqlstringResult = sqlstringResult;
    }


    /**
     * Gets the sqlstringResult value for this SqlstringResponse.
     * 
     * @return sqlstringResult
     */
    public org.tempuri.SqlstringResponseSqlstringResult getSqlstringResult() {
        return sqlstringResult;
    }


    /**
     * Sets the sqlstringResult value for this SqlstringResponse.
     * 
     * @param sqlstringResult
     */
    public void setSqlstringResult(org.tempuri.SqlstringResponseSqlstringResult sqlstringResult) {
        this.sqlstringResult = sqlstringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SqlstringResponse)) return false;
        SqlstringResponse other = (SqlstringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sqlstringResult==null && other.getSqlstringResult()==null) || 
             (this.sqlstringResult!=null &&
              this.sqlstringResult.equals(other.getSqlstringResult())));
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
        if (getSqlstringResult() != null) {
            _hashCode += getSqlstringResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SqlstringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">sqlstringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlstringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sqlstringResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>sqlstringResponse>sqlstringResult"));
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
