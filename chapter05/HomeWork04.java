public class HomeWork04 {
    public static void main(String[] args) {
        int i = 0;
        while (++i <= 1000) {
            int one = i % 10;
            int two = (i / 10) % 10;
            int three = (i / 100) % 10;
            // System.out.println(three + "" + two + "" + one);
            if (one * one * one + two * two * two + three * three * three == i) {
                System.out.println(i+"是水仙花数");
            } else {
                
        }
        }
    }
}
