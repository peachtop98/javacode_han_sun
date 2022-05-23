public class RecursionExercise01 {
    public static void main(String[] args) {
        T t1 = new T();
        int i=0;
        while (true) {
            long startTime = System.currentTimeMillis();

            i++;
            Long fbnq = t1.fibonacci(i);
            System.out.print("第" + i + "个的斐波那契数是:" + fbnq+"\t");
            
            long endTime = System.currentTimeMillis(); //获取结束时间

            System.out.println("程序运行时间：" + (endTime - startTime) + "ms"); //输出程序运行时间

            if (i == 100) {
                break;
            }
        }
    }
}

class T {
    public long fibonacci(int n) {
        if( n >= 1) {
            if( n == 1 || n == 2) {
                return 1;
            } else {
                return fibonacci(n-1) + fibonacci(n-2);
            }
        } else {
            System.out.println("要求输入的n>=1的整数");
            return -1;
        }
    }

}
