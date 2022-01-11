import java.util.List;

public class ClientEtudiant {

    public static void main(String[] args) {
        Etudiant Toto = new Etudiant(1, "Toto", "Toto");
        Etudiant Ilona = new Etudiant(69, "Ilona", "Brosset");
        Etudiant Salma = new Etudiant(24, "Salma", "Aziz");
        Etudiant Rocco = new Etudiant(47, "Rocco", "Salvatori");

        GroupeEtudiant potos = new GroupeEtudiant();

        potos.ajout(Toto);potos.ajout(Ilona);potos.ajout(Salma);potos.ajout(Rocco);

        // Code pour l'exo 3

        MultiMap m = new MultiMap(); m.putOneValue(1, new List<Integer>(1, 2, 3));
    }
}
