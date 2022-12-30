import java.io.*;
import java.net.*;

public class Client {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        System.out.println("Demande de connexion");
        Socket socket = new Socket("127.0.0.1", port); // construit un socket client connecté à la
        // machine et le port spécifié
        System.out.println("Connexion établie");
        // On crée maintenant les flux d'entrée-sortie du Client
        BufferedReader entreeClient = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Un
                                                                                                          // BufferedReader
                                                                                                          // permet de
                                                                                                          // lire par
                                                                                                          // ligne.
        PrintWriter sortieClient = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())),
                true); // Un PrintWriter possède toutes les
        // opérations print classiques.
        for (int i = 0; i < 10; i++) {
            // generate a random string
            String str = "abcdefghijklmnopqrstuvwxyz";
            int length = (int) (Math.random() * 10);
            String randomString = "";
            for (int j = 0; j < length; j++) {
                int index = (int) (Math.random() * str.length());
                randomString += str.charAt(index);
            }
            str = randomString;
            System.out.println("Envoi du message " + i + ": " + str + " au serveur");
            sortieClient.println(str); // envoi du message au serveur
            String reponse = entreeClient.readLine(); // lecture de la réponse
            System.out.println("Réponse du serveur : " + reponse);
        }
        sortieClient.println("END"); // envoi du message au serveur

        // Fermeture des flux d'entrée-sortie du Client
        entreeClient.close();
        sortieClient.close();
        // Fermeture du socket client
        socket.close();
    }
}
