import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {
        // try {
        // EchoInterface echo = (EchoInterface)
        // Naming.lookup("rmi://localhost:1099/echo");
        // echo.echo("Hello, World! From RMI Server");

        // AddInterface add = (AddInterface) Naming.lookup("rmi://localhost:1099/add");
        // System.out.println("Addition: " + add.add(129, 45));

        // } catch (Exception e) {
        // System.out.println("Erreur d'accès");
        // System.out.println(e.toString());
        // }

        try {
            ServerInterface server = (ServerInterface) Naming.lookup("rmi://localhost:1099/MyServer");
            server.echo("Hello, World! From RMI Server");
            System.out.println("Addition: " + server.add(129, 45));

        } catch (Exception e) {
            System.out.println("Erreur d'accès");
            System.out.println(e.toString());
        }
    }

}
