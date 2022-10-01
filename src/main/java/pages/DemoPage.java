package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoPage extends BasePage<DemoPage> implements IHeader{

  public static final String URL = "http://dev.reestr-gis.adc.vpn/demo";
  private By demoPageTitle = By.xpath("//h2[contains(text(), 'Демонстрационные материалы')]");

  protected DemoPage(WebDriver driver) {
    super(driver);
  }

  public String getPageUrl() {
    waitForLoadVisibility(demoPageTitle);
    return driver.getCurrentUrl();
  }

  @Override
  public String getBaseUrl() {
    return URL;
  }
}
