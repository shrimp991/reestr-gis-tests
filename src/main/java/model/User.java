package model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class User {
  private String email;
  private String password;
  private String passwordRepeat;
  private String lastName;
  private String firstName;
  private String middleName;
  private String position;
  private String department;
  private String organization;
  private String phoneNumber;

  public User (String email) {
    this.email = email;
  }

  public User (String password, String passwordRepeat) {
    this.password = password;
    this.passwordRepeat = passwordRepeat;
  }

}
