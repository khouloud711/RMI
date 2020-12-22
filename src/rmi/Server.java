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
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Interface {
    double solde ;
    public Server() throws RemoteException {}

    /*public String sayHello() {
        return "Hello World !!";
    }*/
    
   /* public String CreerCompte(int id, double m){
        //this.id=id;
        solde = m;
        return "creation de compte: done";
    }*/
    public void LireSolde(double x){
        solde=x;
         System.out.println("votre solde est "+ solde);       
    }

    public void crediter(double x){
         
        solde += x ;
        System.out.println("votre solde après le crédit est "+ solde); 
    }
    public void debiter(double x){
        
        if (solde >= x){
            solde -= x;
            System.out.println("votre solde après débittement est "+ solde);
        }
        else {
                System.out.println("votre solde est insuffisant !!");
                }
    }


    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();

        java.rmi.registry.LocateRegistry.createRegistry(1250);

        Naming.rebind("rmi://127.0.0.1:1250/server", server);
    }
}
