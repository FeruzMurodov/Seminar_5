package service;

import data.Student;
import data.Teacher;
import data.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private ArrayList<User> students = new ArrayList<>();
    private ArrayList<User> teachers = new ArrayList<>();
    int index;
    public void Create(User user){
        if (user instanceof Student){
            Student student = new Student(user.getName(), user.getAge(), user.getAddress(), students.size()+1);
            students.add(student);
        } else {
            Teacher teacher = new Teacher(user.getName(), user.getAge(), user.getAddress(), teachers.size()+1);
            teachers.add(teacher);
        }
    }

    public ArrayList<User> Read(String type){
        if (type.equals("Student")){
            return students;
        } else {
            return teachers;
        }
    }

    @Override
    public String toString() {
        return "DataService{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", index=" + index +
                '}';
    }

    public ArrayList<User> getStudents() {
        return students;
    }

    public ArrayList<User> getTeachers() {
        return teachers;
    }
}
