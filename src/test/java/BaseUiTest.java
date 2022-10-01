import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseUiTest {
  protected WebDriver driver;

  @Before
  public void setDriver() {
    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().window().maximize();
  }

  @After
  public void tearDown() {
    driver.quit();
  }

}
