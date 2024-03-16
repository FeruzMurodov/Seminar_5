import controller.Controller;
import data.Student;
import data.Teacher;
import service.DataService;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 22, "Moscow");
        Student s2 = new Student("Oleg", 20, "Moscow");
        Teacher t1 = new Teacher("Viktor", 40, "Moscow");
        Teacher t2 = new Teacher("Mariya", 38, "Moscow");
        Controller c1 = new Controller();
        c1.CreateUser(s1);
        c1.CreateUser(s2);
        c1.CreateUser(t1);
        c1.CreateUser(t2);
        c1.PrintStudents();
        c1.PrintTeachers();
    }
}