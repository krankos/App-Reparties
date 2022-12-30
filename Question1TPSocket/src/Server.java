import java.io.*;
import java.net.*;

public class Server {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {
        // Création d'un objet s à l'écoute du port spécifié
        ServerSocket s = new ServerSocket(port);
        System.out.println("En attente de connexion");
        Socket socClient = s.accept(); // L'acceptation d'une connexion d'un client
        System.out.println("Connexion établie");
        // On crée maintenant les flux d'entrée-sortie du Serveur
        BufferedReader entreeServeur = new BufferedReader(
                new InputStreamReader(socClient.getInputStream())); // Un BufferedReader permet de lire
                                                                    // par ligne.
        PrintWriter sortieServeur = new PrintWriter(
                new BufferedWriter(
                        new OutputStreamWriter(socClient.getOutputStream())),
                true); // Un PrintWriter possède toutes les opérations print classiques.
        String str = entreeServeur.readLine(); // lecture du message envoyé par le client
        while (!str.equals("END")) {
            String strMajuscule = str.toUpperCase();
            sortieServeur.println(strMajuscule); // envoi du message au client
            str = entreeServeur.readLine(); // lecture du message envoyé par le client
        }
        // Fermeture des flux d'entrée-sortie du Serveur
        entreeServeur.close();
        sortieServeur.close();
        // Fermeture du socket client
        socClient.close();
        s.close();
    }
}
