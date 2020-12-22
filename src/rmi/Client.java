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
import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        try {
            Interface service1 = (Interface) Naming.lookup("rmi://127.0.0.1:1250/server");
            //System.out.println(service1.sayHello());
            //System.out.println(service1.CreerCompte(1234,50000));
            
            System.out.println("donner votre montant initiale");
            double montant=s.nextDouble();
            service1.LireSolde(montant);
            
            System.out.println("donner le montant à créditer");
            double mCrd=s.nextDouble();
            service1.crediter(mCrd);
            
            System.out.println("donner le montant à débiter");
            double mDeb=s.nextDouble();
            service1.debiter(mDeb);
            
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}
