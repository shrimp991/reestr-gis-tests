import static org.junit.Assert.assertTrue;

import model.User;
import model.UserGenerator;
import model.UserRoles;
import org.junit.Test;
import pages.MainPage;
import pages.RegisterPage;

public class RegisterTest extends BaseUiTest {

  private User anotherPasswordUser = UserGenerator.getAnotherPassword();
  private User incorrectPhoneUser = UserGenerator.getIncorrectPhone();
  private User shortPasswordUser = UserGenerator.getShortPassword();
  private User incorrectEmailUser = UserGenerator.getIncorrectEmail();
  private User defaultUser = UserGenerator.getDefault();

  @Test
  public void checkUserCanRegister() {
    boolean isSuccessNotificationDisplayed = new MainPage(driver)
        .open()
        .clickLoginButton()
        .clickRegisterButton()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setRolesField(UserRoles.OPERATOR_FOR_READ)
        .setRolesField(UserRoles.RID_EDITOR)
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isSuccessNotificationDisplayed();

    assertTrue(isSuccessNotificationDisplayed);
  }

  @Test
  public void checkUserCanNotRegisterWithEmptyEmail() {
    boolean isEmailFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setRolesField(UserRoles.OPERATOR_FOR_READ)
        .setRolesField(UserRoles.RID_EDITOR)
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isEmailFieldIsEmptyErrorDisplayed();

    assertTrue(isEmailFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithIncorrectEmail() {
    boolean isEmailFieldIncorrectTextErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(incorrectEmailUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isEmailFieldIncorrectTextErrorDisplayed();

    assertTrue(isEmailFieldIncorrectTextErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyPassword() {
    boolean isPasswordFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isPasswordFieldIsEmptyErrorDisplayed();

    assertTrue(isPasswordFieldIsEmptyErrorDisplayed);
  }

  @Test
  public void checkUserCanNotRegisterWithShortPassword() {
    boolean isPasswordFieldShortTextDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(shortPasswordUser.getPassword())
        .setPasswordRepeatField(shortPasswordUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isPasswordFieldShortTextDisplayed();

    assertTrue(isPasswordFieldShortTextDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyRepeatPassword() {
    boolean isPasswordRepeatFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isPasswordRepeatFieldIsEmptyErrorDisplayed();

    assertTrue(isPasswordRepeatFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithAnotherPasswordRepeat() {
    boolean isPasswordRepeatFieldNotMatchErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(anotherPasswordUser.getPassword())
        .setPasswordRepeatField(anotherPasswordUser.getPasswordRepeat())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isPasswordRepeatFieldNotMatchErrorDisplayed();

    assertTrue(isPasswordRepeatFieldNotMatchErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyLastName() {
    boolean isLastNameFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isLastNameFieldIsEmptyErrorDisplayed();

    assertTrue(isLastNameFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyFirstName() {
    boolean isFirstNameFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isFirstNameFieldIsEmptyErrorDisplayed();

    assertTrue(isFirstNameFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyMiddleName() {
    boolean isMiddleNameFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isMiddleNameFieldIsEmptyErrorDisplayed();

    assertTrue(isMiddleNameFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyPosition() {
    boolean isPositionFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isPositionFieldIsEmptyErrorDisplayed();

    assertTrue(isPositionFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyOrganization() {
    boolean isOrganizationFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setPhoneNumberField(defaultUser.getPhoneNumber())
        .clickRegisterButton()
        .isOrganizationFieldIsEmptyErrorDisplayed();

    assertTrue(isOrganizationFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithEmptyPhoneNumber() {
    boolean isPhoneNumberFieldIsEmptyErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .clickRegisterButton()
        .isPhoneNumberFieldIsEmptyErrorDisplayed();

    assertTrue(isPhoneNumberFieldIsEmptyErrorDisplayed);
  }
  @Test
  public void checkUserCanNotRegisterWithIncorrectPhoneNumber() {
    boolean isPhoneNumberFieldIncorrectNumberErrorDisplayed = new RegisterPage(driver)
        .open()
        .setEmailField(defaultUser.getEmail())
        .setPasswordField(defaultUser.getPassword())
        .setPasswordRepeatField(defaultUser.getPassword())
        .setLastNameField(defaultUser.getLastName())
        .setFirstNameField(defaultUser.getFirstName())
        .setMiddleNameField(defaultUser.getMiddleName())
        .setPositionField(defaultUser.getPosition())
        .setDepartmentField(defaultUser.getDepartment())
        .setOrganizationField(defaultUser.getOrganization())
        .setPhoneNumberField(incorrectPhoneUser.getPhoneNumber())
        .clickRegisterButton()
        .isPhoneNumberFieldIncorrectNumberErrorDisplayed();

    assertTrue(isPhoneNumberFieldIncorrectNumberErrorDisplayed);
  }

}
