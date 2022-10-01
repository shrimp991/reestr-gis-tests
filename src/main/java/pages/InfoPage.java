package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfoPage extends BasePage<InfoPage> implements IHeader {

  public static final String URL = "http://dev.reestr-gis.adc.vpn/info";
  private By infoPageTitle = By.xpath("//h2[text()='Справочные материалы Реестра ГИС']");

  public InfoPage(WebDriver driver) {
    super(driver);
  }

  public String getPageUrl() {
    waitForLoadVisibility(infoPageTitle);
    return driver.getCurrentUrl();
  }

  @Override
  public String getBaseUrl() {
    return URL;
  }
}
