import java.rmi.Remote;

public interface ServerInterface extends Remote {
    public void echo(String s) throws java.rmi.RemoteException;

    public int add(int a, int b) throws java.rmi.RemoteException;
}
