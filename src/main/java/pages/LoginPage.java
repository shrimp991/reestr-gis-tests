package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends HeaderSecure{

  private By registerButton = By.xpath("//button[contains(text(), 'Регистрация')]");

  public LoginPage(WebDriver driver) {
    super(driver);
  }

  public RegisterPage clickRegisterButton() {
    waitAndClick(registerButton);
    return new RegisterPage(driver);
  }
}
