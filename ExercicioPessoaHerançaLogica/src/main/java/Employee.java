public class Employee extends People {

    protected int numberOfTheRecord;
    protected double fixedSalary;

    public Employee() {
        super("Gerisvaldo", "da Silva", "gerisvaldodasil@gmail.com", "12/24/1984");
    }

    public int geNumberOfTheRecord() {
        return this.numberOfTheRecord;
    }

    public void setNumberOfTheRecord(int numberOfTheRecord) {
        this.numberOfTheRecord = numberOfTheRecord;
    }

    public double getFixedSalary() {
        return this.fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double calculateDiscountFGTSEmployee() {
        return this.fixedSalary * 0.8;
    }

    public String toString() {
        return "========EMPLOYEE========"
                + "\nName: " + this.name
                + "\nSurname: " + this.surname
                + "\nEmail: " + this.email
                + "\nDate of birth: " + this.dateOfBirth
                + "\nNumber of the record: " + this.numberOfTheRecord
                + "\nFixed Salary: $" + format.format(this.fixedSalary)
                + "\nDiscount FGTS: $" + format.format(calculateDiscountFGTSEmployee());
    }
}