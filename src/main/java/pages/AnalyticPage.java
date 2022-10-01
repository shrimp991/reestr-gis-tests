package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AnalyticPage extends BasePage<AnalyticPage> implements IHeader{

  public static final String URL = "http://dev.reestr-gis.adc.vpn/charts";
  private By analyticPageTitle = By.xpath("//h2[contains(text(), 'Аналитика государственных информационных систем')]");

  public String getPageUrl() {
    waitForLoadVisibility(analyticPageTitle);
    return driver.getCurrentUrl();
  }

  protected AnalyticPage(WebDriver driver) {
    super(driver);
  }
  @Override
  public String getBaseUrl() {
    return URL;
  }
}
