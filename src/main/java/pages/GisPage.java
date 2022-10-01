package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GisPage extends BasePage<GisPage> implements IHeader {

  public static final String URL = "http://dev.reestr-gis.adc.vpn/gis";
  private By gisPageTitle = By.xpath("//h2[contains(text(), 'Реестр государственных информационных систем')]");

  public String getPageUrl() {
    waitForLoadVisibility(gisPageTitle);
    return driver.getCurrentUrl();
  }

  protected GisPage(WebDriver driver) {
    super(driver);
  }

  @Override
  public String getBaseUrl(){
    return URL;
  }

}
