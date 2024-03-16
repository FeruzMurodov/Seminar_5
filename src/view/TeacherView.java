package view;

import service.DataService;

public class TeacherView{
    DataService dataService = new DataService();

    public TeacherView(DataService dataService) {
        this.dataService = dataService;
    }
    public void print(){
        System.out.println(dataService.getTeachers());
    }
}
