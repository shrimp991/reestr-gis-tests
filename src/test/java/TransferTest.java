import static org.junit.Assert.assertEquals;

import org.junit.Test;
import pages.AnalyticPage;
import pages.DemoPage;
import pages.GisPage;
import pages.InfoPage;
import pages.MainPage;
import pages.RequirementsPage;
import pages.SupportPage;

public class TransferTest extends BaseUiTest {

  @Test
  public void checkFromMainPageToGisPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickGisButton()
        .getPageUrl();
    assertEquals("Incorrect URL", GisPage.URL, currentUrl);
  }

  @Test
  public void checkFromMainPageToSupportPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickSupportButton()
        .getPageUrl();
    assertEquals("Incorrect URL", SupportPage.URL, currentUrl);
  }

  @Test
  public void checkFromMainPageToInfoPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickInfoButton()
        .getPageUrl();
    assertEquals("Incorrect URL", InfoPage.URL, currentUrl);
  }

  @Test
  public void checkFromMenuToMainPage() {
    String currentUrl = new InfoPage(driver)
        .open()
        .clickMainMenuButton()
        .getBaseUrl();
    assertEquals("Incorrect URL", MainPage.URL, currentUrl);
  }

  @Test
  public void checkFromMenuToGisPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickGisMenuButton()
        .getPageUrl();
    assertEquals("Incorrect URL", GisPage.URL, currentUrl);
  }

  @Test
  public void checkFromMenuToDemoPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickDemoMenuButton()
        .getPageUrl();
    assertEquals("Incorrect URL", DemoPage.URL, currentUrl);
  }

  @Test
  public void checkFromMenuToAnalyticPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickAnalyticMenuButton()
        .getPageUrl();
    assertEquals("Incorrect URL", AnalyticPage.URL, currentUrl);
  }

  @Test
  public void checkFromMenuToInfoPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickInfoMenuButton()
        .getPageUrl();
    assertEquals("Incorrect URL", InfoPage.URL, currentUrl);
  }

  @Test
  public void checkFromMenuToSupportPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickSupportMenuButton()
        .getPageUrl();
    assertEquals("Incorrect URL", SupportPage.URL, currentUrl);
  }

  @Test
  public void checkFromMenuToRequirementsPage() {
    String currentUrl = new MainPage(driver)
        .open()
        .clickRequirementsMenuButton()
        .getPageUrl();
    assertEquals("Incorrect URL", RequirementsPage.URL, currentUrl);
  }

}
