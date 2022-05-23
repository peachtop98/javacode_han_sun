import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        int reception = myscanner.nextInt();
        
        if ((reception % 4 == 0 && reception % 100 != 0) || reception % 400 == 0) {
            System.out.println("是闰年");
        } else {
            System.out.println("不是闰年");
        }
    }
}
