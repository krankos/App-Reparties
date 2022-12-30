import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ReverseServer {
    public static void main(String[] args) {
        try {
            System.out.println("Serveur: Construction de l'implémentation");
            Reverse rev = new Reverse();
            LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost:1099/MyReverse", rev);
            System.out.println("Attente");
        } catch (Exception e) {
            System.out.println("Erreur liaison");
            System.out.println(e.toString());
        }
    }

}
