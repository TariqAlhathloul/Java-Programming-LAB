package JavaProgrammingLAB.LAB8;

/*
|----------------------------------|
|DATE: week 12 | 2023 Nov16 | LAB 8|
|----------------------------------|
*/

public class Teacher extends Person {

    private String subject;
    Teacher() {

    }
    Teacher(String subject) {
        this.subject = subject;
    }
    public void Explain() {
        System.out.println("Explanation begins");

    }
    
}
