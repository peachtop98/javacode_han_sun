public class Return01 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){

            if (i == 3) {
		        System.out.println("��˳ƽ���� "+i);
				return; //��return���ڷ���ʱ����ʾ�������������ʹ����main,��ʾ�˳�����
                // break;
                // continue;
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on..");
    }
}
