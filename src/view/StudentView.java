package view;

import controller.Controller;
import data.User;
import service.DataService;

public class StudentView{
    DataService dataService = new DataService();

    public StudentView(DataService dataService) {
        this.dataService = dataService;
    }
    public void print(){
        System.out.println(dataService.getStudents());
    }
}
