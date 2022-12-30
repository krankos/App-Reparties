import java.rmi.Naming;

public class ReverseClient {
    public static void main(String[] args) {
        try {
            ReverseInterface rev = (ReverseInterface) Naming.lookup("rmi://localhost:1099/MyReverse");
            String res = rev.reverseString("Bonjour");
            System.out.println(res);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Erreur acces");
            System.out.println(e.toString());
        }
    }

}
