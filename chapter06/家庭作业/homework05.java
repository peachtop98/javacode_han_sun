import static java.lang.Math.random;

public class homework05 {
    public static void main(String[] args) {
        int arr1[] = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (random() * 100);
            System.out.print(arr1[i]+" ");
        }
        //求平均值
        double sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        double aver = (sum) / (double)(arr1.length);

        System.out.println("平均数是："+aver+", 总 和是："+sum) ; 

        //求最大值，最小值，以及找到8
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
        System.out.println("最大值是："+max+"最小值是："+min);
        if(flag==1){
            System.out.println("这个数组里面包含8");
        }else{
            System.out.println("这个数组里面不包含8");
        }
    }
}
