package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header extends BasePage<Header> {

  private By loginButton = By.xpath("//a[text()='Войти']");
  private By profileMenuNode = By.xpath("//li[@role='menuitem' and @aria-haspopup='true']");
  private By profileMenuButton = By.xpath("//span[text()='Профиль']/../../..");
  private By personalAccountMenuButton = By.xpath("//span[text()='Личный кабинет']/../../..");
  private By mainMenuButton = By.xpath("//span[text()='Главная']/../..");
  private By gisMenuButton = By.xpath("//span[text()='Реестр ГИС']/../..");
  private By demoMenuButton = By.xpath("//span[text()='Демонстрация систем']/../..");
  private By analyticMenuButton = By.xpath("//span[text()='Аналитика']/../..");
  private By infoMenuButton = By.xpath("//span[text()='Справка']/../..");
  private By supportMenuButton = By.xpath("//span[text()='Обращение в службу технической поддержки']/../..");
  private By requirementsMenuButton = By.xpath("//span[text()='Согласованные требования для систем']/../..");

  public Header(WebDriver driver) {
    super(driver);
  }

  public LoginPage clickLoginButton() {
    waitAndClick(loginButton);
    return new LoginPage(driver);
  }
  public Header clickProfileMenuNode() {
    waitAndClick(profileMenuNode);
    return new Header(driver);
  }
  public MainPage clickMainMenuButton() {
    waitAndClick(mainMenuButton);
    return new MainPage(driver);
  }
  public GisPage clickGisMenuButton() {
    waitAndClick(gisMenuButton);
    return new GisPage(driver);
  }
  public DemoPage clickDemoMenuButton() {
    waitAndClick(demoMenuButton);
    return new DemoPage(driver);
  }
  public AnalyticPage clickAnalyticMenuButton() {
    waitAndClick(analyticMenuButton);
    return new AnalyticPage(driver);
  }
  public InfoPage clickInfoMenuButton() {
    waitAndClick(infoMenuButton);
    return new InfoPage(driver);
  }
  public SupportPage clickSupportMenuButton() {
    waitAndClick(supportMenuButton);
    return new SupportPage(driver);
  }
  public RequirementsPage clickRequirementsMenuButton() {
    waitAndClick(requirementsMenuButton);
    return new RequirementsPage(driver);
  }
}
