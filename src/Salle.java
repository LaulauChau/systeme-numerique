import java.util.ArrayList;
import java.util.Random;

public class Salle {
  private int id_salle;
  private String nom;
  private String adresse;
  private String ville;
  private String code_postal;
  private ArrayList<Administration> administrations;
  private ArrayList<Activite> activites;
  private Planning planning;

  public Salle() {
    this.id_salle = new Random().nextInt(1000);
    this.administrations = new ArrayList<>();
  }

  public Salle(String nom, String adresse, String ville, String code_postal, ArrayList<Administration> administrations, ArrayList<Activite> activites, Planning planning) {
    this.id_salle = new Random().nextInt(1000);
    this.nom = nom;
    this.adresse = adresse;
    this.ville = ville;
    this.code_postal = code_postal;
    this.administrations = administrations;
    this.activites = activites;
    this.planning = planning;
  }

  public int getId_salle() {
    return id_salle;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getAdresse() {
    return adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public String getVille() {
    return ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

  public String getCode_postal() {
    return code_postal;
  }

  public void setCode_postal(String code_postal) {
    this.code_postal = code_postal;
  }

  public Planning getPlanning() {
    return planning;
  }

  public void setPlanning(Planning planning) {
    this.planning = planning;
  }

  public ArrayList<Administration> getAdministrations() {
    return administrations;
  }

  public void setAdministrations(ArrayList<Administration> administrations) {
    this.administrations = administrations;
  }

  public void addAdministration(Administration administration) {
    this.administrations.add(administration);
  }

  public void removeAdministration(Administration administration) {
    this.administrations.remove(administration);
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

  @Override
  public String toString() {
    return "Salle{" + "id_salle=" + id_salle + ", nom=" + nom + ", adresse=" + adresse + ", ville=" + ville + ", code_postal=" + code_postal + '}';
  }
}
