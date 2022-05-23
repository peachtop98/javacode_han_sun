public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "milan";
        p.age = 100;

        MyTools tools = new MyTools();
        Person p2 = tools.CopyPerson(p);

        System.out.println("");
    }
}

class Person{
    String name;
    int age;
}

class MyTools {
    public Person CopyPerson(Person p) {
        Person p2 = new Person();
        p2.name = p.name;
        p2.age = p.age;

        return p2;
    }
}
