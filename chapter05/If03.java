import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入信用分:");
        int score = myScanner.nextInt();

        System.out.println(score);
        if (score < 60) {
            System.out.println("信用不及格");
        }else if(score >= 60 && score <= 80){
            System.out.println("信用较好\n\t.");
        } else if (score > 80 && score <=99) {
            System.out.print("信用非常好");
        } else if (score == 100) {
            System.out.print("信用特别好\n\t.");
        }
    }
}

// public static String getType(Object o){
//     return o.getClass().toString(); //使用int类型的getClass()方法
// }