package JavaProgrammingLAB.LAB8;

/*
|----------------------------------|
|DATE: week 12 | 2023 Nov16 | LAB 8|
|----------------------------------|
*/

public class Employee {
    private int Id;
    private String Name;
    private double Salary;

    Employee(int Id, String Name, double Salary) {
        this.Id = Id;
        this.Name = Name;
        this.Salary = Salary;
    }
    Employee(){}

    public void putData() {
        System.out.println("Employee Information:");
        System.out.println("ID: " + Id);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
    }
}
