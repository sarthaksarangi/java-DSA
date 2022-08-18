package Methods;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(122));

    }
    static int reverse(int n){
        int dec = 0;
        int pow = 0;
        while(n>0){
            int last = n%10;
            dec = dec *10 + last;
            pow++;
            n=n/10;
        }
        return dec;
    }
    static boolean isPalindrome(int n){
        if(n==reverse(n)){
            return true;
        }
return false;
    }
}
