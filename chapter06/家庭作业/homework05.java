import static java.lang.Math.random;

public class homework05 {
    public static void main(String[] args) {
        int arr1[] = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (random() * 100);
            System.out.print(arr1[i]+" ");
        }
        //��ƽ��ֵ
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        double aver = (sum) / (double)(arr1.length);

        System.out.println("ƽ�����ǣ�"+aver+", �� ���ǣ�"+sum) ; 

        //�����ֵ����Сֵ���Լ��ҵ�8
        int max=arr1[0];
        int min=arr1[0];
        int max_index=0;
        int min_index=0,flag=-1;
        for (int i = 0; i < arr1.length; i++) {
            if(max<arr1[i]){
                max=arr1[i];
                max_index=i;
            }
            if(min>arr1[i]){
                min=arr1[i];
                min_index=i;
            }
            if(arr1[i]==8){
                flag=1;
            }
        }
        System.out.println("���ֵ�ǣ�"+max+"��Сֵ�ǣ�"+min);
        if(flag==1){
            System.out.println("��������������8");
        }else{
            System.out.println("����������治����8");
        }
    }
}
