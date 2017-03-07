package source;

import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;

/**
 * @author morat 
 */
public class Server  {

/**
   * @param args
   */
  public static void main(final String args[]) {
    String nom="";
    int nombre=1; int port = 1099;
    Registry registry=null;
    // récupération des arguments
    if (args.length!=3){
      System.out.println("Server <nom générique des objets distants> <nombre de noms> <port du registry>");
      System.exit(1);
    }
    try  {
      nom = args[0];
      port = Integer.parseInt(args[2]);
      nombre = Integer.parseInt(args[1]);
    }catch(Exception e) {
      System.out.println("Server <nom générique des objets distants> <nombre de noms> <port du registry>");
      System.exit(1);
    }
    // installation d'un securityManager
    // A COMPLETER : INSTALLATIOND'UN SECURITYMANAGER
   /* SecurityManager a = System.getSecurityManager();
    if(System.getSecurityManager()==null){
    	System.setSecurityManager(new SecurityManager());
    }
    */
    // A COMPLETER : MISE EN PLACE DU REGISTRY
    try {
		registry = LocateRegistry.createRegistry(port);
	} catch (RemoteException e1) {
		e1.printStackTrace();
	}
    
    
    
    try {
      for(int i=1;i<=nombre;i++){
      	// A COMPLETER : CONSTRUCTION ET EXPORTATION DES OBJETS DISTANTS
    	Supplier s = new Supplier(i);
    	Naming.bind(nom+i, s);
      }
      System.out.println("Tous les objets sont enregistrés dans le serveur d'objets distants");
    } catch (Exception e) {
      System.out.println("Server err: " + e);
    }
  }
}
