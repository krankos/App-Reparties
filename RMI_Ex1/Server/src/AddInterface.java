import java.rmi.Remote;

public interface AddInterface extends Remote {

    public int add(int a, int b) throws java.rmi.RemoteException;
}
