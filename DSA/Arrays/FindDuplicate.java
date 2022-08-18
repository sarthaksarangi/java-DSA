package Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int [] arr = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(find(arr));
     }
    public static boolean find (int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <arr.length ; j++) {
                if(arr[i]==arr[j]){
                    return true;
                }
                else return false;
            }
        }
        return false;
    }

}
