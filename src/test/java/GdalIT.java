import org.gdal.gdal.gdal;
import org.junit.Test;

public class GdalIT {

  public static void main(final String[] args) {
    // GDAL version >= 2.3.0
    System.loadLibrary("gdalalljni");
    gdal.AllRegister();
  }

  @Test
  public void test() {
    main(null);
  }
}
