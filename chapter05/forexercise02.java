import java.util.Scanner;
public class forexercise02{
    public static void main(String[] args) {
        Scanner mysScanner = new Scanner(System.in);
        System.out.print("输入你要输出的数值:");

        String string1 = mysScanner.next();
        int num1 = Integer.parseInt(string1);// 测试字符串转换整型
        System.out.println("你输入的是:" + num1);

        /*  下面开始计算一个数由另两个数相加 */
        for (int i = 1; i <= num1; i++) {
            for (int j = 0; j <= num1; j++) {
                if (i + j == num1) {
                    System.out.println(i+"+"+j+"="+(i+j));
                }
            }
        }
    }
}