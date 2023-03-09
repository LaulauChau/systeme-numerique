import java.util.ArrayList;
import java.util.Random;

public class Activite {
  private int id_activite;
  private String libelle;
  private Boolean statut;
  private ArrayList<Membre> participants;
  private Coach coach;

  public Activite() {
    this.participants = new ArrayList<>();
    this.id_activite = new Random().nextInt(1000);
  }

  public Activite(String libelle, Boolean statut, ArrayList<Membre> participants, Coach coach) {
    this.id_activite = new Random().nextInt(1000);
    this.libelle = libelle;
    this.statut = statut;
    this.participants = participants;
  }

  public int getId_activite() {
    return id_activite;
  }

  public void setId_activite(int id_activite) {
    this.id_activite = id_activite;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public Boolean getStatut() {
    return statut;
  }

  public void setStatut(Boolean statut) {
    this.statut = statut;
  }

  public Coach getCoach() {
    return coach;
  }

  public void setCoach(Coach coach) {
    this.coach = coach;
  }

  public ArrayList<Membre> getParticipants() {
    return participants;
  }

  public void setParticipants(ArrayList<Membre> participants) {
    this.participants = participants;
  }

  public void ajouterParticipant(Membre membre) {
    this.participants.add(membre);
  }

  public void supprimerParticipant(Membre membre) {
    this.participants.remove(membre);
  }

  @Override
  public String toString() {
    return "Activite{" + "id_activite=" + id_activite + ", libelle=" + libelle + ", statut=" + statut + '}';
  }
}
