import java.util.Scanner;

public class ArrAdd {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        do{

            int[] arr1 = { 5, 5, 1, 6 };
            int[] arr2 =new int[arr1.length+1];
            
            for(int i =0;i<arr1.length;i++){
                arr2[i]=arr1[i];
            }
            System.out.print("������Ҫ���������");
            int input_int = myscanner.nextInt();
            arr2[arr2.length-1] = input_int;
            
            arr1 = arr2;

            //���
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i]);
            }

            System.out.print("�Ƿ��������y/n:");
            String sentence = myscanner.nextLine();
            if(sentence=="n"){
                break;
            }
        } while (true);
    }
}
