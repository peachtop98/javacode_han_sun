
public class VarParameterExercise {
    public static void main(String[] args) {
        haoMehods df1 = new haoMehods();
        String df = df1.showScore("xiangxin", 60, 100, 15, 169, 11);
        System.out.println(df);
    }
}

class haoMehods {
    public String showScore(String name, double... scores) {  //�ɱ����
        double totalscore = 0;
        for (int i = 0; i < scores.length; i++) {
            //scores ���ʾ���һ������
            totalscore += scores[i]; 
        }
		return name + " �� " +scores.length + "�ſεĳɼ��ܷ�Ϊ=" + totalscore;
    }
}