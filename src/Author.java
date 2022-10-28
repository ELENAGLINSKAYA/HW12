
public class Author {
    private String firstName;
    private String lastName;
    public Author(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    @Override
    public String toString() {
        return "Author{"+
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\''+
                '}';
    }
}
