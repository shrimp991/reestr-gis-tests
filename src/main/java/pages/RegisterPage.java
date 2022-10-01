package pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage<RegisterPage> implements IHeader {

  public static final String URL = "http://dev.reestr-gis.adc.vpn/auth/users/signUp";

  private String fieldIsEmptyError = "/../../div[contains(text(), 'Не заполнено обязательное поле')";

  private By emailField = By.xpath("//input[@placeholder = 'Электронная почта']");
  private By emailFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Электронная почта']" + fieldIsEmptyError + "]");
  private By emailFieldIncorrectTextError = By.xpath("//input[@placeholder = 'Электронная почта']"
      + "/../../div[contains(text(), 'Ошибка в написании')]");
  private By passwordField = By.xpath("//input[@placeholder = 'Пароль']");
  private By passwordFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Пароль']"+ fieldIsEmptyError + "]");
  private By passwordFieldShortText = By.xpath("//input[@placeholder = 'Пароль']"
      + "/../../div[contains(text(), 'Не менее 6 символов')]");
  private By passwordRepeatField = By.xpath("//input[@placeholder = 'Подтверждение пароля']");
  private By passwordRepeatFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Подтверждение пароля']"+ fieldIsEmptyError + "]");
  private By passwordRepeatFieldNotMatchError = By.xpath("//input[@placeholder = "
      + "'Подтверждение пароля']/../../div[contains(text(), 'Пароли не совпадают')]");
  private By rolesField = By.xpath("//input[@class='el-select__input is-mini']");
  private By focusRolesField = By.xpath("//div[@class='el-input el-input--mini el-input--suffix is-focus']");
  private By lastNameField = By.xpath("//input[@placeholder = 'Фамилия']");
  private By lastNameFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Фамилия']" + fieldIsEmptyError + "]");
  private By firstNameField = By.xpath("//input[@placeholder = 'Имя']");
  private By firstNameFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Имя']" + fieldIsEmptyError + "]");
  private By middleNameField = By.xpath("//input[@placeholder = 'Отчество']");
  private By middleNameFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Отчество']" + fieldIsEmptyError + "]");
  private By positionField = By.xpath("//input[@placeholder = 'Должность']");
  private By positionFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Должность']" + fieldIsEmptyError + "]");
  private By departmentField = By.xpath("//input[@placeholder = 'Структурное подразделение']");
  private By organizationField = By.xpath("//input[@placeholder = 'Организация']");
  private By organizationFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Организация']" + fieldIsEmptyError + "]");
  private By phoneNumberField = By.xpath("//input[@placeholder = 'Телефон']");
  private By phoneNumberFieldIsEmptyError =
      By.xpath("//input[@placeholder = 'Телефон']" + fieldIsEmptyError + "]");
  private By phoneNumberFieldIncorrectNumberError =
      By.xpath("//input[@placeholder='Телефон']/../../div[@class='el-form-item__error']");
  private By registerButton = By.xpath("//span[contains(text(), 'Зарегистрироваться')]");

  private By successNotification = By.xpath(" //div[@class='el-message el-message--success']");

  public RegisterPage(WebDriver driver) {
    super(driver);
  }

  @Override
  public String getBaseUrl() {
    return URL;
  }

  public RegisterPage setEmailField(String email) {
    WebElement webElement = new WebDriverWait(driver, Duration.ofSeconds(3))
        .until(ExpectedConditions.visibilityOfElementLocated(emailField));
    driver.findElement(emailField).sendKeys(email);
    return this;
  }
  public RegisterPage setPasswordField(String password) {
    driver.findElement(passwordField).sendKeys(password);
    return this;
  }
  public RegisterPage setPasswordRepeatField(String passwordRepeat) {
    driver.findElement(passwordRepeatField).sendKeys(passwordRepeat);
    return this;
  }
  public RegisterPage setRolesField(String role) {
    driver.findElement(rolesField).sendKeys(role + Keys.ARROW_DOWN + Keys.ENTER);
    driver.findElement(rolesField).click();
    return this;
  }

  public RegisterPage setLastNameField(String lastName) {
    driver.findElement(lastNameField).sendKeys(lastName);
    return this;
  }
  public RegisterPage setFirstNameField(String firstname) {
    driver.findElement(firstNameField).sendKeys(firstname);
    return this;
  }
  public RegisterPage setMiddleNameField(String middleName) {
    driver.findElement(middleNameField).sendKeys(middleName);
    return this;
  }
  public RegisterPage setPositionField(String position) {
    driver.findElement(positionField).sendKeys(position);
    return this;
  }
  public RegisterPage setDepartmentField(String department) {
    driver.findElement(departmentField).sendKeys(department);
    return this;
  }
  public RegisterPage setOrganizationField(String organization) {
    driver.findElement(organizationField).sendKeys(organization);
    return this;
  }
  public RegisterPage setPhoneNumberField(String phoneNumber) {
    driver.findElement(phoneNumberField).sendKeys(phoneNumber);
    return this;
  }
  public RegisterPage clickRegisterButton() {
    driver.findElement(registerButton).click();
    return this;
  }
  public boolean isSuccessNotificationDisplayed() {
    return waitAndCheckDisplayed(successNotification);
  }
  public boolean isEmailFieldIsEmptyErrorDisplayed() {
    return waitAndCheckDisplayed(emailFieldIsEmptyError);
  }
  public boolean isEmailFieldIncorrectTextErrorDisplayed(){
    return waitAndCheckDisplayed(emailFieldIncorrectTextError);
  }
  public boolean isPasswordFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(passwordFieldIsEmptyError);
  }
  public boolean isPasswordFieldShortTextDisplayed(){
    return waitAndCheckDisplayed(passwordFieldShortText);
  }
  public boolean isPasswordRepeatFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(passwordRepeatFieldIsEmptyError);
  }
  public boolean isPasswordRepeatFieldNotMatchErrorDisplayed(){
    return waitAndCheckDisplayed(passwordRepeatFieldNotMatchError);
  }
  public boolean isLastNameFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(lastNameFieldIsEmptyError);
  }
  public boolean isFirstNameFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(firstNameFieldIsEmptyError);
  }
  public boolean isMiddleNameFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(middleNameFieldIsEmptyError);
  }
  public boolean isPositionFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(positionFieldIsEmptyError);
  }
  public boolean isOrganizationFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(organizationFieldIsEmptyError);
  }
  public boolean isPhoneNumberFieldIsEmptyErrorDisplayed(){
    return waitAndCheckDisplayed(phoneNumberFieldIsEmptyError);
  }
  public boolean isPhoneNumberFieldIncorrectNumberErrorDisplayed() {
    return waitAndCheckDisplayed(phoneNumberFieldIncorrectNumberError);
  }
  public boolean waitAndCheckDisplayed(By element){
    waitForLoadVisibility(element);
    return driver.findElement(element).isDisplayed();
  }

}
