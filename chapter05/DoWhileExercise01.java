// package chapter05;

public class DoWhileExercise01 {
        
    public static void main(String[] args) {
        int i = 1, flag = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                flag += 1;
                System.out.println("��5����������3����:"+ i+"\n"+"������"+flag);
            }
        } while (++i<=200);
    }
}
