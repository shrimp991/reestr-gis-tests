package model;

import com.github.javafaker.Faker;

public class UserGenerator {

  private static Faker faker = new Faker();
  private static String randomEmail = faker.name().username() + "@som7e1.ru";
  private static String randomPassword = faker.animal().name() + 12345;
  private static String randomLastName = faker.name().lastName();
  private static String randomFirstName = faker.name().firstName();
  private static String randomMiddleName = faker.name().nameWithMiddle();
  private static String randomPosition = faker.job().position();
  private static String randomDepartment = faker.company().catchPhrase();
  private static String randomOrganization = faker.company().name();
  private static String randomPhoneNumber = faker.phoneNumber().phoneNumber() + 123;
  private static String incorrectEmail = faker.name().username() + "@dwa";
  private static String shortPassword = "12345";
  private static String anotherPassword = "123456";
  private static String incorrectPhoneNumber = "7954123664";



  public static User getDefault() {
    return new User(
        randomEmail, randomPassword, randomPassword, randomLastName,
        randomFirstName, randomMiddleName, randomPosition, randomDepartment,
        randomOrganization, randomPhoneNumber);
  }

  public static User getIncorrectEmail() {
    return new User(incorrectEmail);
  }
  public static User getShortPassword() {
    return new User(shortPassword, shortPassword);
  }

  public static User getAnotherPassword() {
    return new User(randomPassword, anotherPassword);
  }

  public static User getIncorrectPhone() {
    return new User(
        null, null, null, null,
        null, null, null, null,
        null, incorrectPhoneNumber);
  }

}
