public class forexercise {
    public static void main(String[] args) {
        //��ӡ1~100֮��������9�ı�����������
        //ͳ�Ƹ���  �� �ܺ�.[����Ϊ��,�������]
        int num = 0, sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                num++;
                sum += i;
                System.out.print("��" + i + "��");
            }
        }
        System.out.println();
        System.out.println("���ָ���Ϊ:"+ num + "   �ܺ�Ϊ��"+ sum);

    }
}