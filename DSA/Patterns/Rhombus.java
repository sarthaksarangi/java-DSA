package Patterns;

public class Rhombus {
    public static void main(String[] args) {
        rhomnus(5);

    }
    public static void rhomnus(int n ){
        // n represents the no. of rows to be printed
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=n ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
