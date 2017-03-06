import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.RemoteObject;
import java.rmi.server.UnicastRemoteObject;

public class Serveur extends  UnicastRemoteObject implements IServer {

	protected Serveur() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2502394185642499953L;

	
	public static void main(String[] args) {
		
		try {
			Serveur refServeur = new Serveur();
			LocateRegistry.createRegistry(1099);
			Naming.bind("HW",refServeur );
		} catch (RemoteException | MalformedURLException | AlreadyBoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	@Override
	public void sayHello() throws RemoteException {
		System.out.println("Hello World");

	}
	
	

}
