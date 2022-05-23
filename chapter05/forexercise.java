public class forexercise {
    public static void main(String[] args) {
        //打印1~100之间所有是9的倍数的整数，
        //统计个数  及 总和.[化繁为简,先死后活]
        int num = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                num++;
                sum += i;
                System.out.print("第" + i + "次");
            }
        }
        System.out.println();
        System.out.println("出现个数为:"+ num + "   总和为："+ sum);

    }
}