package Patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        invertedPyramid(5);
    }
    public static void invertedPyramid(int n){
        for (int i = 0; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
