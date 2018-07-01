/**
 * DeploymvpicManage_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws.mvservice;

public interface DeploymvpicManage_PortType extends java.rmi.Remote {
    public ws.mvservice.Response deployPicture(ws.mvservice.DeployPicture event) throws java.rmi.RemoteException;
    public ws.mvservice.Response deployMV(ws.mvservice.DeployMVEvt event) throws java.rmi.RemoteException;
    public ws.mvservice.Response mvPaymentConfirmRequest(ws.mvservice.MvPaymentConfirmRequestEvt event) throws java.rmi.RemoteException;
    public ws.mvservice.Response vRBTIssueProductNotify(ws.mvservice.VRBTIssueProductNotifyEvt event) throws java.rmi.RemoteException;
}
