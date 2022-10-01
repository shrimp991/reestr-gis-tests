package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequirementsPage extends BasePage<RequirementsPage> implements IHeader {

  public static final String URL = "http://dev.reestr-gis.adc.vpn/requirements";
  private By requirementsPageTitle = By.xpath("//h2[contains(text(), 'Согласованные требования к созданию (развитию)')]");

  public String getPageUrl() {
    waitForLoadVisibility(requirementsPageTitle);
    return driver.getCurrentUrl();
  }

  public RequirementsPage(WebDriver driver) {
    super(driver);
  }

  @Override
  public String getBaseUrl() {
    return URL;
  }

}
