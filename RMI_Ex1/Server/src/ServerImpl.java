import java.rmi.server.UnicastRemoteObject;

public class ServerImpl extends UnicastRemoteObject implements EchoInterface, AddInterface, ServerInterface {
    public ServerImpl() throws java.rmi.RemoteException {
        super();
    }

    public void echo(String s) throws java.rmi.RemoteException {
        System.out.println("Echoing: " + s);

    }

    public int add(int a, int b) throws java.rmi.RemoteException {
        System.out.println("Adding: " + a + " + " + b);
        return a + b;
    }

}
