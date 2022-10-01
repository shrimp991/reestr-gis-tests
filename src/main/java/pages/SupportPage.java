package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SupportPage extends BasePage<SupportPage> implements IHeader {

  public static final String URL = "http://dev.reestr-gis.adc.vpn/support";

  private By supportPageTitle = By.xpath("//h2[text()='Обращение в службу технической поддержки']");

  public SupportPage(WebDriver driver) {
    super(driver);
  }

  public String getPageUrl() {
    waitForLoadVisibility(supportPageTitle);
    return driver.getCurrentUrl();
  }


}
