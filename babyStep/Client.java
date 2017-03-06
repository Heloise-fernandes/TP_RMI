import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

	public static void main(String[] args) {
		IServer refServeur = null;
		try {
			refServeur = (IServer) Naming.lookup("rmi://:1099/HW");
			refServeur.sayHello();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
