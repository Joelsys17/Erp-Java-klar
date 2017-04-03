/**
 * WebService1Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WebService1Soap extends java.rmi.Remote {
    public org.tempuri.GetResponseGetResult get() throws java.rmi.RemoteException;
    public org.tempuri.Get2ResponseGet2Result get2() throws java.rmi.RemoteException;
    public java.lang.Object[] java() throws java.rmi.RemoteException;
    public org.tempuri.Get3ResponseGet3Result get3() throws java.rmi.RemoteException;
    public org.tempuri.Get4ResponseGet4Result get4() throws java.rmi.RemoteException;
    public org.tempuri.Get5ResponseGet5Result get5() throws java.rmi.RemoteException;
    public org.tempuri.Get6ResponseGet6Result get6() throws java.rmi.RemoteException;
    public org.tempuri.Get7ResponseGet7Result get7() throws java.rmi.RemoteException;
    public org.tempuri.Get8ResponseGet8Result get8() throws java.rmi.RemoteException;
    public org.tempuri.FindUpdateEmployeeResponseFindUpdateEmployeeResult findUpdateEmployee(java.lang.String upnr) throws java.rmi.RemoteException;
    public void deleteEmploye(java.lang.String delnr) throws java.rmi.RemoteException;
    public void addEmployee(java.lang.String sosnr, java.lang.String name, java.lang.String adress, java.lang.String lastname, java.lang.String worktitle) throws java.rmi.RemoteException;
    public void updateEmployee(java.lang.String sosnr, java.lang.String name, java.lang.String adress, java.lang.String lastname, java.lang.String worktitle) throws java.rmi.RemoteException;
    public java.lang.Object[] objects() throws java.rmi.RemoteException;
    public java.lang.Object[] dsToArray() throws java.rmi.RemoteException;
    public org.tempuri.FindEmployeeResponseFindEmployeeResult findEmployee(java.lang.String sosnr) throws java.rmi.RemoteException;
    public java.lang.String getWebsiteHtml(java.lang.String url) throws java.rmi.RemoteException;
    public java.lang.Object[] objects2() throws java.rmi.RemoteException;
    public java.lang.Object[] toArray() throws java.rmi.RemoteException;
    public org.tempuri.SqlstringResponseSqlstringResult sqlstring() throws java.rmi.RemoteException;
    public void upload(byte[] contents, java.lang.String filenamesave) throws java.rmi.RemoteException;
    public java.lang.String txtFile(java.lang.String filename) throws java.rmi.RemoteException;
    public java.lang.Object[] getTable() throws java.rmi.RemoteException;
    public java.lang.String[][] javaUppgiftWebservice(int i) throws java.rmi.RemoteException;
    public java.lang.String[][] javaFindUpdate(java.lang.String upnr) throws java.rmi.RemoteException;
}
