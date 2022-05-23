import  java.lang.Math;

public class OverLoadExercise01 {
    public static void main(String[] args) {
        Methods a1 = new Methods();
        a1.m("大手笔");
        System.out.println(a1.m(12, 1));
    }
}

class Methods {
    public int m(int a) {
        return a*a;
    }

    public double m(int a, int b) {
        return Math.pow(a, b);//返回double的类型
    }

    public int m(String aa) {
        System.out.println(aa);
        return 0;
    }
}