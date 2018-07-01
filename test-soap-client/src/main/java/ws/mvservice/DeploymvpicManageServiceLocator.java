/**
 * DeploymvpicManageServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.mvservice;

public class DeploymvpicManageServiceLocator extends org.apache.axis.client.Service implements ws.mvservice.DeploymvpicManageService {

    public DeploymvpicManageServiceLocator() {
    }


    public DeploymvpicManageServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DeploymvpicManageServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DeploymvpicManage
    private java.lang.String DeploymvpicManage_address = "http://10.25.193.114:18088/services/DeploymvpicManage";

    public java.lang.String getDeploymvpicManageAddress() {
        return DeploymvpicManage_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DeploymvpicManageWSDDServiceName = "DeploymvpicManage";

    public java.lang.String getDeploymvpicManageWSDDServiceName() {
        return DeploymvpicManageWSDDServiceName;
    }

    public void setDeploymvpicManageWSDDServiceName(java.lang.String name) {
        DeploymvpicManageWSDDServiceName = name;
    }

    public ws.mvservice.DeploymvpicManage_PortType getDeploymvpicManage() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DeploymvpicManage_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDeploymvpicManage(endpoint);
    }

    public ws.mvservice.DeploymvpicManage_PortType getDeploymvpicManage(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ws.mvservice.DeploymvpicManageSoapBindingStub _stub = new ws.mvservice.DeploymvpicManageSoapBindingStub(portAddress, this);
            _stub.setPortName(getDeploymvpicManageWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDeploymvpicManageEndpointAddress(java.lang.String address) {
        DeploymvpicManage_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ws.mvservice.DeploymvpicManage_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ws.mvservice.DeploymvpicManageSoapBindingStub _stub = new ws.mvservice.DeploymvpicManageSoapBindingStub(new java.net.URL(DeploymvpicManage_address), this);
                _stub.setPortName(getDeploymvpicManageWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DeploymvpicManage".equals(inputPortName)) {
            return getDeploymvpicManage();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://218.200.227.202:8089/jboss-net/services/DeploymvpicManage", "DeploymvpicManageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://218.200.227.202:8089/jboss-net/services/DeploymvpicManage", "DeploymvpicManage"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DeploymvpicManage".equals(portName)) {
            setDeploymvpicManageEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
