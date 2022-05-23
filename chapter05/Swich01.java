import java.util.Scanner;
import java.util.zip.Deflater;
public class Swich01 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入一个字符（a-g）");
        char c1 = myscanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("今天星期一");
                break;
            case 'b':
                System.out.println("今天星期二");
                break;
            default:
                System.out.println("没有匹配");
                break;//这里有无break不重要，都要退出
        }
        System.out.println("退出switch");
    }   
}
