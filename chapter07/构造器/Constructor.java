public class Constructor {
    public static void main(String[] args) {
        person p1 = new person("tom", 18);
        person p2 = new person("tom");

        System.out.println("���֣�"+p1.name+"����:"+p1.age);
        System.out.println("���֣�"+p2.name+" ����:"+p2.age);
    }
}

class Dog {
}
class person {
    String name;
    int age;

    public person(String pName, int pAge) {
        name = pName;
        age = pAge;
    }

    public person(String pName) {
        name = pName;
    }
}