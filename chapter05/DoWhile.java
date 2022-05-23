
public class DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("你好，韩顺平教育"+ i);
        } while (i < 0);//最少执行一次
        while (i < 0) {//最少执行0次
            System.out.println("你好，韩顺平教育"+ i);
        }
    }
}
