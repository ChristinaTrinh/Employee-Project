//This is the Employee class
//Each new created instance represents an employee
public abstract class Employee {
    private String firstName;
    private String lastName;

    public Employee() {
        firstName = " ";
        lastName = " ";
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public abstract double earnings();

    public String toString() {
        return firstName + " " + lastName;
    }
}
