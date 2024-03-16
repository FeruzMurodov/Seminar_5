package controller;

import data.User;
import service.DataService;
import view.StudentView;
import view.TeacherView;

import java.util.ArrayList;

public class Controller {
    public DataService service = new DataService();
    public void CreateUser(User user){
        service.Create(user);
    }

    public ArrayList<User> Read(String type){
        return service.Read(type);
    }
    public void PrintStudents(){
        StudentView sView = new StudentView(service);
        sView.print();
    }

    public void PrintTeachers() {
        TeacherView tView = new TeacherView(service);
        tView.print();
    }

}
