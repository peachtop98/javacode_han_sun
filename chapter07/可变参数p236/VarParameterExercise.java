
public class VarParameterExercise {
    public static void main(String[] args) {
        haoMehods df1 = new haoMehods();
        String df = df1.showScore("xiangxin", 60, 100, 15, 169, 11);
        System.out.println(df);
    }
}

class haoMehods {
    public String showScore(String name, double... scores) {  //可变参数
        double totalscore = 0;
        for (int i = 0; i < scores.length; i++) {
            //scores 本质就是一个数组
            totalscore += scores[i]; 
        }
		return name + " 有 " +scores.length + "门课的成绩总分为=" + totalscore;
    }
}