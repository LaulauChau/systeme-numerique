import java.util.Date;
import java.util.Random;

public class Membre extends Personne {
  private int id_membre;
  private Abonnement abonnement;

  public Membre() {
    this.id_membre = new Random().nextInt(1000);
  }

  public Membre(Abonnement abonnement, int id_personne, String nom, String prenom, String adresse, String ville, Date date_naissance) {
    super(nom, prenom, adresse, ville, date_naissance);
    this.id_membre = new Random().nextInt(1000);
    this.abonnement = abonnement;
  }

  public int getId_membre() {
    return id_membre;
  }

  public Abonnement getAbonnement() {
    return abonnement;
  }

  public void setAbonnement(Abonnement abonnement) {
    this.abonnement = abonnement;
  }

  public void renouvelerAbonnement(Date duree) {
    this.abonnement.setDate_fin(new Date(this.abonnement.getDate_fin().getTime() + duree.getTime()));
  }

  public void arreterAbonnement() {
    this.abonnement.setDate_fin(new Date());
  }

  public void participerActivite(Activite activite) {
    Activite a = null;

    for (Activite act : this.abonnement.getActivites()) {
      if (act.getId_activite() == activite.getId_activite()) {
        a = act;
        break;
      }
    }

    if (a == null) {
      this.abonnement.ajouterActivite(activite);
      activite.ajouterParticipant(this);
    } else {
      a.ajouterParticipant(this);
    }
  }

  public void quitterActivite(Activite activite) {
    Activite a = null;

    for (Activite act : this.abonnement.getActivites()) {
      if (act.getId_activite() == activite.getId_activite()) {
        a = act;
        break;
      }
    }

    if (a != null) {
      a.supprimerParticipant(this);
    }
  }

  @Override
  public String toString() {
    return "Membre{" + "id_membre=" + id_membre + ", abonnement=" + abonnement + '}';
  }
}
