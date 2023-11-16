package JavaProgrammingLAB.LAB8;


/*
|----------------------------------|
|DATE: week 12 | 2023 Nov16 | LAB 8|
|----------------------------------|
*/


public class StudentAndTeacherTest {

        public static void main(String[] args) {

                Person person = new Person();
                person.Greet();

                Student student = new Student();
                student.SetAge(21);
                student.Greet();
                student.ShowAge();

                Teacher teacher = new Teacher();
                teacher.SetAge(40);
                teacher.Greet();
                teacher.Explain();
        }
}
