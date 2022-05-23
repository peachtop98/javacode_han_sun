import java.util.Locale.Category;

public class object01 {
    public static void main(String[] args) {
        car cat1 = new car();
        cat1.age = 3;
        cat1.name="小白";
        cat1.color = "白色";
        System.out.println("第一只猫的信息:"+cat1.name);
    }


}
class car {
    String name;
    int age;
    String color;
}