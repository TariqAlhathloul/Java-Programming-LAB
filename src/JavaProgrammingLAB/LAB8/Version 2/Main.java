package org.example;

class Employee{
    int id;
    String name;
    double salary;
    Employee(int i,String n,double s){id=i; name=n; salary=s;}
    public void putData(){System.out.printf("%s%d%n%s%s%n%s%.2f%n", "Employee id: ",id,"Employee name: ",name,"Employee salary: ",salary);}
}
class Company extends Employee{
    String cName;
    int regNo;
    Company(String c, int r, int i,String n,double s){super(i, n, s); cName=c; regNo=r;};
    public void putData(){super.putData(); System.out.printf("%s%s%n%s%d%n","Company name: ",cName,"Registration number: ",regNo);}
}

public class Main {
    public static void main(String[] args) {
        Company c=new Company("SEU",101,1,"Abdullah",10000);
        c.putData();
    }
}