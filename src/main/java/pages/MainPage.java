package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage<MainPage> implements IHeader {
  public static final String URL = "http://dev.reestr-gis.adc.vpn/main";

  private By gisButton = By.xpath("//a[@href=\"/gis\" and @class='link-type']");
  private By supportButton = By.xpath("//a[@href=\"/support\" and @class='link-type']");
  private By infoButton = By.xpath("//a[@href=\"/info\" and @class='link-type']");



  public MainPage(WebDriver driver) {
    super(driver);
  }

  public GisPage clickGisButton() {
    waitAndClick(gisButton);
    return new GisPage(driver);
  }

  public SupportPage clickSupportButton() {
    waitAndClick(supportButton);
    return new SupportPage(driver);
  }

  public InfoPage clickInfoButton() {
    waitAndClick(infoButton);
    return new InfoPage(driver);
  }

  @Override
  public String getBaseUrl(){
    return URL;
  }
}
