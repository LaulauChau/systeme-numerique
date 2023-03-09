import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Planning {
  private int id_planning;
  private Date libelle;
  private ArrayList<Activite> activites;

  public Planning() {
    this.id_planning = new Random().nextInt(1000);
    this.activites = new ArrayList<>();
  }

  public Planning(Date libelle) {
    this.id_planning = new Random().nextInt(1000);
    this.libelle = libelle;
    this.activites = new ArrayList<>();
  }

  public int getId_planning() {
    return id_planning;
  }

  public Date getLibelle() {
    return libelle;
  }

  public void setLibelle(Date libelle) {
    this.libelle = libelle;
  }

  public ArrayList<Activite> getActivites() {
    return activites;
  }

  public void setActivites(ArrayList<Activite> activites) {
    this.activites = activites;
  }

  public void addActivite(Activite activite) {
    this.activites.add(activite);
  }

  public void removeActivite(Activite activite) {
    this.activites.remove(activite);
  }

  @Override
  public String toString() {
    return "Planning{" + "id_planning=" + id_planning + ", libelle=" + libelle + ", activites=" + activites + '}';
  }
}
