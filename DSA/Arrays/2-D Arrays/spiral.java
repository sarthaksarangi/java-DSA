package Arrays;

public class Spiral {
    public static void main(String[] args) {
        int arr [][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printSpiral(arr);
    }
       //Time Complexity O(n^2)
    public static void printSpiral(int [] [] arr){
        int topRow = 0;
        int bottomRow = arr.length-1;
        int topCol = 0;
        int bottomCol = arr[0].length-1;

        while(topRow<=bottomRow && topCol<=bottomCol){
            //top
            for (int j = topCol; j <= bottomCol ; j++) {
                System.out.print(arr[topRow][j]+" ");
            }
            //right
            for (int i = topRow+1; i <= bottomRow; i++) {
                System.out.print(arr[i][bottomCol]+" ");
            }
            //bottom
            if(topRow==bottomRow){
                break;
            }
            for (int j = bottomCol-1; j >=topCol ; j--) {
                System.out.print(arr[bottomRow][j]+" ");
            }
            //left
            if(topCol==bottomCol){
                break;
            }
            for (int i = bottomRow-1; i >= topRow+1 ; i--) {
                System.out.print(arr[i][topCol]+" ");
            }

            topRow++;
            topCol++;
            bottomCol--;
            bottomRow--;

        }



    }
}
