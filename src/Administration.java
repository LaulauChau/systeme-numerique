import java.util.Date;
import java.util.Random;

public class Administration extends Staff {
  private int id_administration;
  private String job;

  public Administration() {
    this.id_administration = new Random().nextInt(1000);
  }

  public Administration(String job, String nom, String prenom, String adresse, String ville, Date date_naissance) {
    super(nom, prenom, adresse, ville, date_naissance);
    this.id_administration = new Random().nextInt(1000);
    this.job = job;
  }

  public int getId_administration() {
    return id_administration;
  }

  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Override
  public String toString() {
    return "Administration{" + "id_administration=" + id_administration + ", job=" + job + '}';
  }
}
