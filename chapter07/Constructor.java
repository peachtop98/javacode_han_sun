public class Constructor {
    public static void main(String[] args) {
        Person p1 = new Person("asidun", 80);
        System.out.println("p1的信息如下："+p1.name+"  "+p1.age);
    }
}

class Person {
    String name;
    int age;

    public Person(String pName, int pAge) {
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;
    }
}