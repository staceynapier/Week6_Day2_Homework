public class DigitalCamera implements Printable {

  private String make;
  private String model;

  public DigitalCamera(String make, String model){
    this.make = make;
    this.model = model;
  }

  public String printDetails() {
    return (this.make + "," + this.model);

  }

}
