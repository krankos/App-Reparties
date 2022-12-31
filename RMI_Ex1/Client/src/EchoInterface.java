import java.rmi.Remote;

public interface EchoInterface extends Remote {
    public void echo(String s) throws java.rmi.RemoteException;
}
