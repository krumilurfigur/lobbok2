/**
 * This class stores information about a person
 */

public class author {
    private String firstName;
    private String lastName;


    public author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
