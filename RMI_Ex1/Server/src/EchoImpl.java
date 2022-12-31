import java.rmi.server.UnicastRemoteObject;

public class EchoImpl extends UnicastRemoteObject implements EchoInterface {

    public EchoImpl() throws java.rmi.RemoteException {
        super();
    }

    @Override
    public void echo(String s) throws java.rmi.RemoteException {
        System.out.println(s);
    }
}
