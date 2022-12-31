import java.rmi.server.UnicastRemoteObject;

public class AddImpl extends UnicastRemoteObject implements AddInterface {

    public AddImpl() throws java.rmi.RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws java.rmi.RemoteException {
        return a + b;
    }

}
