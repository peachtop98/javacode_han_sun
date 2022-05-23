public class ArrayExercise {
    public static void main(String[] args) {
        char zhifu[] = new char[26];
        for (int i = 0; i <= 25; i++) {
            zhifu[i] = (char) ('A' + i);
        }
        for (int j = 0; j < 26; j++) {
            System.out.print(zhifu[j]+" ");
        }
    }
}
