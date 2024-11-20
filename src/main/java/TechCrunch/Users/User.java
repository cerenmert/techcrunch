package TechCrunch.Users;

public class User {

    private String email;
    private String firstname;
    private String lastname;
    private String birthYear;

    public User(String email, String firstname, String lastname, String birthYear) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getBirthYear() {
        return birthYear;
    }


}
