/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author ACER
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Interface extends Remote {

    //String sayHello()throws RemoteException;
    //String CreerCompte(int id, double m)throws RemoteException;
    void LireSolde(double x)throws RemoteException;
    void crediter(double x)throws RemoteException;
    void debiter(double x)throws RemoteException;

    
}
