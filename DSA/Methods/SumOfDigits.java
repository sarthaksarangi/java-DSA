package Methods;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(122));
    }
    static int sum(int n){
        int sum = 0;
        while(n>0){
            int lastdigit = n%10;
            sum = sum+lastdigit;
            n = n/10;
        }
        return sum;
    }
}
