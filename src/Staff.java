import java.util.Date;
import java.util.Random;

public class Staff extends Personne {
  private int id_staff;

  public Staff() {
    this.id_staff = new Random().nextInt(1000);
  }

  public Staff(String nom, String prenom, String adresse, String ville, Date date_naissance) {
    super(nom, prenom, adresse, ville, date_naissance);
    this.id_staff = new Random().nextInt(1000);
  }

  public int getId_staff() {
    return id_staff;
  }

  @Override
  public String toString() {
    return "Staff{" + "id_staff=" + id_staff + '}';
  }
}
