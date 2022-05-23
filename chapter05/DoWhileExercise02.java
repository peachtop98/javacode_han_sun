import java.util.Scanner;

public class DoWhileExercise02 {
    public static void main(String[] args) {
        do {
            System.out.println("ÀÏº«»¹Ç®Âð£¿y/n\n" );
            Scanner myscanner = new Scanner(System.in);
            char condition1 = myscanner.next().charAt(0);
            if(condition1=='y'){
                break;
            }
        } while (true);


        




    }
}
