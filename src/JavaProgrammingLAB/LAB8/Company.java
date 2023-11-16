package JavaProgrammingLAB.LAB8;

/*
|----------------------------------|
|DATE: week 12 | 2023 Nov16 | LAB 8|
|----------------------------------|
*/

public class Company extends Employee {
    private String Cname;
    private int RegNo;

    Company(String Cname, int RegNo, int Id, String Name, double Salary) {
        super(Id, Name, Salary);
        this.Cname = Cname;
        this.RegNo = RegNo;
    }
    @Override
    public void putData() {
        super.putData();
        System.out.println("Company Details:");
        System.out.println("Company Name: " + Cname);
        System.out.println("Registration Number: " + RegNo);
    }
}
