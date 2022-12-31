import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    private static final int PORT = 1099;

    public static void main(String[] args) {

        try {
            // Create a new instance of the EchoImpl class
            EchoImpl echo = new EchoImpl();

            // Create a new instance of the AddImpl class
            AddImpl add = new AddImpl();

            // Create a new instance of the Registry class
            LocateRegistry.createRegistry(1099);

            // Bind the echo object to the registry
            Naming.rebind("rmi://localhost:" + PORT + "/echo", echo);

            // Bind the add object to the registry
            Naming.rebind("rmi://localhost:" + PORT + "/add", add);

            System.out.println("Server is running...");
        } catch (Exception e) {
            System.out.println("Erreur d'accès");
            System.out.println(e.toString());
        }

    }

}
