public class Main {

    public static void main (String args[]) {

        System.out.println ("\f");

        People people1 = new People("Augusto","Perera",
                "augustopererafazendeiro@gmail.com", "09/12/1977");
        System.out.println(people1);

        Student student1 = new Student();
        student1.setNote1(5.0);
        student1.setNote2(7.0);
        System.out.println(student1);

        Teacher teacher1 = new Teacher();
        teacher1.setNumberOfTheRecord(2005510);
        teacher1.setHoursWorked(220);
        teacher1.setHourValue(3.00);
        System.out.println(teacher1);

        Employee employee1 = new Employee();
        employee1.setNumberOfTheRecord(6578443);
        employee1.setFixedSalary(179.69);
        System.out.println(employee1);

    }

}