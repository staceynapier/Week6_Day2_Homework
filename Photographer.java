import java.util.*;

public class Photographer {

  private ArrayList<Printable> allCameras;

  public Photographer() {
    this.allCameras = new ArrayList<Printable>();
  }

  public void addCamera(Printable camera) {
    this.allCameras.add(camera);
  }

  public int cameraCount() {
    return this.allCameras.size();
  }

  public void removeCamera() {
    this.allCameras.clear();
  }

  // public Printable printAllDetails() {
  //   for (Printable printable : allCameras) {
  //     System.out.println(printable + " ");
  //   }
  // }


}