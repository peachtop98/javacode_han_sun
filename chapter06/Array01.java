import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        double[] shuzu = { 3, 5, 1, 3.4, 2, 50 };

        //第一种写法
        // double scores[] = new double[5];

        //第二种写法
        double scores[];
        scores = new double[5];
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入第"+(i + 1) + "个 元 素值");
            scores[i] = myScanner.nextDouble();
        }
        for (int j = 0; j < scores.length; j++) {
            System.out.print("输出第"+j+"个："+scores[j]);
        }
    }
}
