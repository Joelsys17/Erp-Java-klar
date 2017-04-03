package org.tempuri;

public class WebService1SoapProxy implements org.tempuri.WebService1Soap {
  private String _endpoint = null;
  private org.tempuri.WebService1Soap webService1Soap = null;
  
  public WebService1SoapProxy() {
    _initWebService1SoapProxy();
  }
  
  public WebService1SoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWebService1SoapProxy();
  }
  
  private void _initWebService1SoapProxy() {
    try {
      webService1Soap = (new org.tempuri.WebService1Locator()).getWebService1Soap();
      if (webService1Soap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)webService1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)webService1Soap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (webService1Soap != null)
      ((javax.xml.rpc.Stub)webService1Soap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.WebService1Soap getWebService1Soap() {
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap;
  }
  
  public org.tempuri.GetResponseGetResult get() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get();
  }
  
  public org.tempuri.Get2ResponseGet2Result get2() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get2();
  }
  
  public java.lang.Object[] java() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.java();
  }
  
  public org.tempuri.Get3ResponseGet3Result get3() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get3();
  }
  
  public org.tempuri.Get4ResponseGet4Result get4() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get4();
  }
  
  public org.tempuri.Get5ResponseGet5Result get5() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get5();
  }
  
  public org.tempuri.Get6ResponseGet6Result get6() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get6();
  }
  
  public org.tempuri.Get7ResponseGet7Result get7() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get7();
  }
  
  public org.tempuri.Get8ResponseGet8Result get8() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.get8();
  }
  
  public org.tempuri.FindUpdateEmployeeResponseFindUpdateEmployeeResult findUpdateEmployee(java.lang.String upnr) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.findUpdateEmployee(upnr);
  }
  
  public void deleteEmploye(java.lang.String delnr) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    webService1Soap.deleteEmploye(delnr);
  }
  
  public void addEmployee(java.lang.String sosnr, java.lang.String name, java.lang.String adress, java.lang.String lastname, java.lang.String worktitle) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    webService1Soap.addEmployee(sosnr, name, adress, lastname, worktitle);
  }
  
  public void updateEmployee(java.lang.String sosnr, java.lang.String name, java.lang.String adress, java.lang.String lastname, java.lang.String worktitle) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    webService1Soap.updateEmployee(sosnr, name, adress, lastname, worktitle);
  }
  
  public java.lang.Object[] objects() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.objects();
  }
  
  public java.lang.Object[] dsToArray() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.dsToArray();
  }
  
  public org.tempuri.FindEmployeeResponseFindEmployeeResult findEmployee(java.lang.String sosnr) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.findEmployee(sosnr);
  }
  
  public java.lang.String getWebsiteHtml(java.lang.String url) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getWebsiteHtml(url);
  }
  
  public java.lang.Object[] objects2() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.objects2();
  }
  
  public java.lang.Object[] toArray() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.toArray();
  }
  
  public org.tempuri.SqlstringResponseSqlstringResult sqlstring() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.sqlstring();
  }
  
  public void upload(byte[] contents, java.lang.String filenamesave) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    webService1Soap.upload(contents, filenamesave);
  }
  
  public java.lang.String txtFile(java.lang.String filename) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.txtFile(filename);
  }
  
  public java.lang.Object[] getTable() throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.getTable();
  }
  
  public java.lang.String[][] javaUppgiftWebservice(int i) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.javaUppgiftWebservice(i);
  }
  
  public java.lang.String[][] javaFindUpdate(java.lang.String upnr) throws java.rmi.RemoteException{
    if (webService1Soap == null)
      _initWebService1SoapProxy();
    return webService1Soap.javaFindUpdate(upnr);
  }
  
  
}