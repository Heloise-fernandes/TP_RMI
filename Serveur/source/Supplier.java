package source;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Supplier extends  UnicastRemoteObject implements ISupplier {

	int id;
	protected Supplier(int id) throws RemoteException {
		super();
		this.id = id;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3434304596861132733L;

	@Override
	public String question() throws RemoteException {
		return "Hello i'm "+this;
	}

	@Override
	public String question(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return System.getProperty(s);
	}

	@Override
	public String name() throws RemoteException {
		// TODO Auto-generated method stub
		return this.toString();
	}
	
	public String toString(){
		return "supplier"+id;
	}

}
