package data;

public class Student extends User{
    private Integer studetId;

    public Student(String name, Integer age, String address, Integer studetId) {
        super(name, age, address);
        this.studetId = studetId;
    }

    public Student(String name, Integer age, String address) {
        super(name, age, address);

    }

    @Override
    public String toString() {
        return "Студент{" +
                "ID:" + studetId +
                ", Имя: " + name + ", Возраст: " + age +
                ", Адрес: " + address +
                '}';
    }
}
