import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        double[] shuzu = { 3, 5, 1, 3.4, 2, 50 };

        //��һ��д��
        // double scores[] = new double[5];

        //�ڶ���д��
        double scores[];
        scores = new double[5];
        Scanner myScanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("�������"+(i + 1) + "�� Ԫ ��ֵ");
            scores[i] = myScanner.nextDouble();
        }
        for (int j = 0; j < scores.length; j++) {
            System.out.print("�����"+j+"����"+scores[j]);
        }
    }
}
