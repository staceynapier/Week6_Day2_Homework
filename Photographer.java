import java.util.*;

public class Photographer {

  private ArrayList<Camera> allCameras;

  public Photographer() {
    this.allCameras = new ArrayList<Camera>();
  }

  public void addCamera(Camera camera) {
    this.allCameras.add(camera);
  }

  public int cameraCount() {
    return this.allCameras.size();
  }

  public void removeCamera() {
    this.allCameras.clear();
  }


}