import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Coach extends Staff {
  private int id_coach;
  private ArrayList<Activite> activites;

  public Coach() {
    this.id_coach = new Random().nextInt(1000);
    this.activites = new ArrayList<>();
  }

  public Coach(String nom, String prenom, String adresse, String ville, Date date_naissance, ArrayList<Activite> activites) {
    super(nom, prenom, adresse, ville, date_naissance);
    this.id_coach = new Random().nextInt(1000);
    this.activites = activites;
  }

  public int getId_coach() {
    return id_coach;
  }

  public ArrayList<Activite> getActivites() {
    return activites;
  }

  public void setActivites(ArrayList<Activite> activites) {
    this.activites = activites;
  }

  public void ajouterActivite(Activite activite) {
    this.activites.add(activite);
  }

  public void supprimerActivite(Activite activite) {
    this.activites.remove(activite);
  }

  @Override
  public String toString() {
    return "Coach{" + "id_coach=" + id_coach + '}';
  }
}
