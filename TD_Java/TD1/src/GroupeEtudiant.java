import java.util.ArrayList;

public class GroupeEtudiant {

    public ArrayList<Etudiant> Groupe;

    public GroupeEtudiant(){
        this.Groupe = new ArrayList<Etudiant>();
    }


    public void ajout(Etudiant e){
        Groupe.add(e);
    }
    public ArrayList<Etudiant> recherche(String nom){

    }
}
