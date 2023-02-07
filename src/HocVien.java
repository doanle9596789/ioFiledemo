import java.io.Serial;
import java.io.Serializable;

public class HocVien implements Serializable {
    private String name;
    private int age;

    public HocVien() {
    }

    public HocVien(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
