public class RecursionExercise01 {
    public static void main(String[] args) {
        T t1 = new T();
        int i=0;
        while (true) {
            long startTime = System.currentTimeMillis();

            i++;
            Long fbnq = t1.fibonacci(i);
            System.out.print("��" + i + "����쳲���������:" + fbnq+"\t");
            
            long endTime = System.currentTimeMillis(); //��ȡ����ʱ��

            System.out.println("��������ʱ�䣺" + (endTime - startTime) + "ms"); //�����������ʱ��

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
            System.out.println("Ҫ�������n>=1������");
            return -1;
        }
    }

}
