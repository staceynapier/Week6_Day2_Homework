import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;

  @Before
  public void before() {
    digitalCamera = new DigitalCamera("Canon", "360");
    analogCamera = new AnalogCamera("Nikon", "Instamatic");
    photographer = new Photographer();
  }

  @Test
  public void canAdd() {
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemove() {
    photographer.addCamera(digitalCamera);
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canPrint() {

  }
  

}