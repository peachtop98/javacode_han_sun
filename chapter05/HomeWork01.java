public class HomeWork01 {
    public static void main(String[] args) {
        int money = 100000;
        int flag=0;
        while (true) {
            
            if (money > 50000) {
                // money = (int) (money * 0.95);
                money *= 0.95; //
                flag++;
                // System.out.println(money);
            } else if ( money <= 50000&&money >=1000 ) {
                money = money - 1000;
                flag++;
            } else if (money < 1000) {
                System.out.println("经过路口多少次："+flag);
                break;
            }
            // System.out.println(flag);
        }
    }    
}
