package data;

public class Teacher extends User{
    private Integer teacherId;

    public Teacher(String name, Integer age, String address, Integer teacherId) {
        super(name, age, address);
        this.teacherId = teacherId;
    }

    public Teacher(String name, Integer age, String address) {
        super(name, age, address);
    }

    @Override
    public String toString() {
        return "Учитель{" +
                "ID=" + teacherId +
                ", Имя: " + name +
                ", Возраст: " + age +
                ", Адрес: " + address +
                '}';
    }
}
