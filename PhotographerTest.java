import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PhotographerTest{
  Photographer photographer;
  Camera camera;

  @Before
  public void before() {
    camera1 = new Camera();
  }

  @Test
  public void canAdd() {
    assertEquals(1, photographer.cameraCount)
  }
  

}