import java.util.Scanner;
public class forexercise02{
    public static void main(String[] args) {
        Scanner mysScanner = new Scanner(System.in);
        System.out.print("������Ҫ�������ֵ:");

        String string1 = mysScanner.next();
        int num1 = Integer.parseInt(string1);// �����ַ���ת������
        System.out.println("���������:" + num1);

        /*  ���濪ʼ����һ����������������� */
        for (int i = 1; i <= num1; i++) {
            for (int j = 0; j <= num1; j++) {
                if (i + j == num1) {
                    System.out.println(i+"+"+j+"="+(i+j));
                }
            }
        }
    }
}