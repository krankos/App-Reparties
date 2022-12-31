import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ReverseServer {
    // port
    private static final int PORT = 1099;

    public static void main(String[] args) {
        try {
            System.out.println("Serveur: Construction de l'implémentation");
            Reverse rev = new Reverse();
            LocateRegistry.createRegistry(PORT);
            Naming.rebind("rmi://localhost:" + PORT + "/MyReverse", rev);

            System.out.println("Attente");
        } catch (Exception e) {
            System.out.println("Erreur liaison");
            System.out.println(e.toString());
        }
    }

}
