import java.util.Locale.Category;

public class object01 {
    public static void main(String[] args) {
        car cat1 = new car();
        cat1.age = 3;
        cat1.name="С��";
        cat1.color = "��ɫ";
        System.out.println("��һֻè����Ϣ:"+cat1.name);
    }


}
class car {
    String name;
    int age;
    String color;
}