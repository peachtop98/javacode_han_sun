import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("������һ�����:");
        int reception = myscanner.nextInt();
        
        if ((reception % 4 == 0 && reception % 100 != 0) || reception % 400 == 0) {
            System.out.println("������");
        } else {
            System.out.println("��������");
        }
    }
}
