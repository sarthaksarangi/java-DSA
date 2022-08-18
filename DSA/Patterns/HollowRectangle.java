package Patterns;

public class HollowRectangle {
    public static void main(String[] args) {
        rectangle(5,5);

    }
    //if it is the first row or last row print *
    //if it is the first col or last col print *
    //else print " "(Space)
    public static void rectangle(int rows, int col){
        for (int i = 1; i <=rows ; i++) {
            for(int j = 1;j<=col ; j++){
                if (i==1||i==rows||j==col||j==1){
                    System.out.print("* ");
                }
                else System.out.print("  ");

            }
            System.out.println();

        }
    }
}
