public class Stars {
    public static void main(String[] args) {
        int Level = 5;
        for (int i = 1; i <= Level; i++) {
            for (int space = 1; space <= Level - i; space++) {
                System.out.print(" "); //打印每一行前面的空格，
            }
            for (int star = 1; star <= i * 2 - 1; star++) {
                if (star == 1 || star == i * 2 - 1 || i == 5) {//这里的逻辑判断很重要
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
