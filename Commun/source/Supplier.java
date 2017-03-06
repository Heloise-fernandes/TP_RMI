package source;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Supplier extends  UnicastRemoteObject implements ISupplier {

	String name;
	protected Supplier(String name) throws RemoteException {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3434304596861132733L;

	@Override
	public String question() throws RemoteException {
		return "Hello i'm "+this.name;
	}

	@Override
	public String question(String s) throws RemoteException {
		// TODO Auto-generated method stub
		return System.getProperty(s);
	}

	@Override
	public String name() throws RemoteException {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String toString(){
		return this.name;
	}

}
