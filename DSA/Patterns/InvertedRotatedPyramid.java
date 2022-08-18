package Patterns;

public class InvertedRotatedPyramid {
    public static void main(String[] args) {
        rotatedPyramid(5);
    }
    public static void rotatedPyramid(int n){
        for(int i = 1; i<=n ; i++){
            for (int j = i; j <=n-1 ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
