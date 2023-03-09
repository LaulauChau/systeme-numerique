import java.util.Date;
import java.util.Random;

public class Personne {
  private int id_personne;
  private String nom;
  private String prenom;
  private String adresse;
  private String ville;
  private Date date_naissance;

  public Personne() {
    this.id_personne = new Random().nextInt(1000);
  }

  public Personne(String nom, String prenom, String adresse, String ville, Date date_naissance) {
    this.id_personne = new Random().nextInt(1000);
    this.nom = nom;
    this.prenom = prenom;
    this.adresse = adresse;
    this.ville = ville;
    this.date_naissance = date_naissance;
  }

  public int getId_personne() {
    return id_personne;
  }

  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
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

  public Date getDate_naissance() {
    return date_naissance;
  }

  public void setDate_naissance(Date date_naissance) {
    this.date_naissance = date_naissance;
  }

  @Override
  public String toString() {
    return "Personne{" + "id_personne=" + id_personne + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville + ", date_naissance=" + date_naissance + '}';
  }
}
