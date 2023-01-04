public interface ServerInterface extends java.rmi.Remote {
    public void echo(String s) throws java.rmi.RemoteException;

    public int add(int a, int b) throws java.rmi.RemoteException;
}
