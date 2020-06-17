public class Teacher extends People {

    protected int numberOfTheRecord;
    protected double hoursWorked;
    protected double hourValue;

    public Teacher() {
        super ("Altair", "Ferreira", "altairferreiraoficial@gmail.com", "08/10/1959");
    }

    public int getNumberOfTheRecord() {
        return this.numberOfTheRecord;
    }

    public void setNumberOfTheRecord(int numberOfTheRecord) {
        this.numberOfTheRecord = numberOfTheRecord;
    }

    public double getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourValue(){
        return this.hourValue;
    }

    public void setHourValue(double hourValue) {
        this.hourValue = hourValue;
    }

    public double calculateGrossSalary() {
        return this.hourValue * this.hoursWorked;
    }

    public double discountFGTS() {
        return this.calculateGrossSalary() * 0.8;
    }

    public String toString () {
        return "========TEACHER========"
                + "\nName: " + this.name
                + "\nSurname: " + this.surname
                + "\nEmail: " + this.email
                + "\nDate of birth: " + this.dateOfBirth
                + "\nNumber of the record: " + this.numberOfTheRecord
                + "\nHours worked: " + format.format(this.hoursWorked)
                + "\nHour value: " + format.format(this.hourValue)
                + "\nGross Salary: $" + format.format(this.calculateGrossSalary())
                + "\nDiscount FGTS: $" + format.format(this.discountFGTS());
    }
}