public class ArrayExercise02 {
    public static void main(String[] args) {
		int[] arr = {4,-1,9,10,23,23,45,123,12};
		int max = arr[0];//�ٶ���һ��Ԫ�ؾ������ֵ
		int maxIndex = 0; //

		for(int i = 1; i < arr.length; i++) {//���±� 1 ��ʼ����arr

			if(max < arr[i]) {//���max < ��ǰԪ��
				max = arr[i]; //��max ���ó� ��ǰԪ��
				maxIndex = i; 
			}
		} 
		//�����Ǳ����������arr�� , max�������������ֵ��maxIndex���ֵ�±�
		System.out.println("max=" + max + " maxIndex=" + maxIndex);
    }
}
