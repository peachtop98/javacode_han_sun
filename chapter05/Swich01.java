import java.util.Scanner;
import java.util.zip.Deflater;
public class Swich01 {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("������һ���ַ���a-g��");
        char c1 = myscanner.next().charAt(0);
        switch (c1) {
            case 'a':
                System.out.println("��������һ");
                break;
            case 'b':
                System.out.println("�������ڶ�");
                break;
            default:
                System.out.println("û��ƥ��");
                break;//��������break����Ҫ����Ҫ�˳�
        }
        System.out.println("�˳�switch");
    }   
}
