public class People {

    Format format = new Format();

    protected String name;
    protected String surname;
    protected String email;
    protected String dateOfBirth;

    public People() {

    }

    public People(String name, String surname, String email, String dateOfBirth) {
        setName(name);
        setSurname(surname);
        setEmail(email);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString() {
        return "========PEOPLE========"
                + "\nName: " + this.name
                + "\nSurname: " + this.surname
                + "\nEmail: " + this.email
                + "\nDate of birth: " + this.dateOfBirth;
    }

}