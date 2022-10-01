package pages;

import org.openqa.selenium.WebDriver;

public interface IHeader {

  WebDriver getDriver();

  private Header getHeader() {
    return new Header(getDriver());
  }

  default LoginPage clickLoginButton() {
    getHeader().clickLoginButton();
    return new LoginPage(getDriver());
  }

  default Header clickProfileMenuNode () {
    getHeader().clickProfileMenuNode();
    return new Header(getDriver());
  }

  default MainPage clickMainMenuButton() {
    getHeader().clickMainMenuButton();
    return new MainPage(getDriver());
  }

  default GisPage clickGisMenuButton() {
    getHeader().clickGisMenuButton();
    return new GisPage(getDriver());
  }

  default DemoPage clickDemoMenuButton() {
    getHeader().clickDemoMenuButton();
    return new DemoPage(getDriver());
  }
  default AnalyticPage clickAnalyticMenuButton() {
    getHeader().clickAnalyticMenuButton();
    return new AnalyticPage(getDriver());
  }
  default InfoPage clickInfoMenuButton() {
    getHeader().clickInfoMenuButton();
    return new InfoPage(getDriver());
  }
  default SupportPage clickSupportMenuButton() {
    getHeader().clickSupportMenuButton();
    return new SupportPage(getDriver());
  }
  default RequirementsPage clickRequirementsMenuButton() {
    getHeader().clickRequirementsMenuButton();
    return new RequirementsPage(getDriver());
  }
}
