import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("���������÷�:");
        int score = myScanner.nextInt();

        System.out.println(score);
        if (score < 60) {
            System.out.println("���ò�����");
        }else if(score >= 60 && score <= 80){
            System.out.println("���ýϺ�\n\t.");
        } else if (score > 80 && score <=99) {
            System.out.print("���÷ǳ���");
        } else if (score == 100) {
            System.out.print("�����ر��\n\t.");
        }
    }
}

// public static String getType(Object o){
//     return o.getClass().toString(); //ʹ��int���͵�getClass()����
// }