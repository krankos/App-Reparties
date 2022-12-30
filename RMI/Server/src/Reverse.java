import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Reverse extends UnicastRemoteObject implements ReverseInterface {

    public Reverse() throws RemoteException {
        super();
    }

    @Override
    public String reverseString(String chaine) throws RemoteException {
        // int longeur = chaine.length();
        // StringBuffer tmp = new StringBuffer(longeur);
        // for (int i = longeur; i > 0; i--) {
        // tmp.append(chaine.substring(i - 1, i));
        // }
        // return tmp.toString();

        // reverse string
        return new StringBuffer(chaine).reverse().toString();

        // q: why use StringBuffer? a: because it is mutable otherwise it would be
        // immutable and we would have to create a new string

    }
}
