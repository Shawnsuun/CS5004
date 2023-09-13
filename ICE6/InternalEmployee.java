/**
 * This class represents an internal employee who has no managerial
 * responsibilities.
 */
public class InternalEmployee extends NonManagerEmployee {
  public InternalEmployee(String name, double pay, Gender gender) {
    super(name, pay, gender);
  }

  @Override
  public String toString() {
    return "Name:" + name + ", Pay:" + pay + ", Gender:" + gender + ", Type:InternalEmployee";
  }
}