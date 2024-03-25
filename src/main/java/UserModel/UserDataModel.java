package UserModel;

import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.time.Period;

public class UserDataModel {
    private Long userId;

    
    private String firstName;
    private String lastName;
    private String userPassword;
    private String userPhoneNumber;
    private String userEmail;
    private LocalDate userDob;
    private int userAge;


    public UserDataModel() {
    }

    public UserDataModel(String firstName, String lastName, String userPassword, String userPhoneNumber, String userEmail, LocalDate userDob, int userAge) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPassword = userPassword;
        this.userPhoneNumber = userPhoneNumber;
        this.userEmail = userEmail;
        this.userDob = userDob;
        this.userAge = userAge;
    }

    public UserDataModel(Long userId, String firstName, String lastName, String userPassword, String userPhoneNumber, String userEmail, LocalDate userDob, int userAge) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userPassword = userPassword;
        this.userPhoneNumber = userPhoneNumber;
        this.userEmail = userEmail;
        this.userDob = userDob;
        this.userAge = userAge;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserDob(LocalDate userDob) {
        this.userDob = userDob;
    }

    public LocalDate getUserDob() {
        return userDob;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserAge() {
        return Period.between(userDob,LocalDate.now()).getYears();
    }


    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userDob=" + userDob +
                ", userAge=" + userAge +
                '}';
    }
}
