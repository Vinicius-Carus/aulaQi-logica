public class Student extends People {

    protected double note1;
    protected double note2;

    public Student() {
        super("Claudio","Asis","noobmaster@gmail.com","04/23/2004");
    }

    public double getNote1() {
        return this.note1;
    }

    public void setNote1(double note1) {
        this.note1 = note1;
    }

    public double getNote2() {
        return this.note2;
    }

    public void setNote2(double note2) {
        this.note2 = note2;
    }

    public double calculateTheAvarage(){
        return (this.note1 + this.note2) / 2;
    }

    public String toString() {
        return "========STUDENT========"
                + "\nName: " + this.name
                + "\nSurname: " + this.surname
                + "\nEmail: " + this.email
                + "\nDate of birth: " + this.dateOfBirth
                + "\nNote 1: " + format.format(this.note1)
                + "\nNote 2: " + format.format(this.note2)
                + "\nAvarage: " + format.format(this.calculateTheAvarage());
    }

}