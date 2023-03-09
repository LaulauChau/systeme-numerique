import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Abonnement {
  private Date date_debut;
  private Date date_fin;
  private int id_abonnement;
  private String libelle;
  private float tarif;
  private ArrayList<Activite> activites;

  public Abonnement() {
    this.id_abonnement = new Random().nextInt(1000);
    this.activites = new ArrayList<>();
  }

  public Abonnement(Date date_debut, Date date_fin, String libelle, float tarif) {
    this.date_debut = date_debut;
    this.date_fin = date_fin;
    this.id_abonnement = new Random().nextInt(1000);
    this.libelle = libelle;
    this.tarif = tarif;
    this.activites = new ArrayList<>();
  }

  public Date getDate_debut() {
    return date_debut;
  }

  public void setDate_debut(Date date_debut) {
    this.date_debut = date_debut;
  }

  public Date getDate_fin() {
    return date_fin;
  }

  public void setDate_fin(Date date_fin) {
    this.date_fin = date_fin;
  }

  public int getId_abonnement() {
    return id_abonnement;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public float getTarif() {
    return tarif;
  }

  public void setTarif(float tarif) {
    this.tarif = tarif;
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
    return "Abonnement{" + "date_debut=" + date_debut + ", date_fin=" + date_fin + '}';
  }
}
