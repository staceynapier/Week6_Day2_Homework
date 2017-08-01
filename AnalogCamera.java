public class AnalogCamera implements Printable {

  private String make;
  private String model;

  public AnalogCamera(String make, String model){
    this.make = make;
    this.model = model;
  }

  public String printDetails() {
    return (this.make + "," + this.model);
  }
}