public class ArrayRevers {
    public static void main(String[] args) {
        int[] arr1 = { 5, 1, 4, 94, 56 };
        int flag = 0;
        int[] arr2 = new int[arr1.length];
        for (int i = arr1.length - 1; i >= 0; i--) {
            arr2[flag] = arr1[i];
            flag++;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i]+"  ");
        }
    }
}
