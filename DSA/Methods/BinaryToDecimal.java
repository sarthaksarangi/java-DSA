package Methods;

public class BinaryToDecimal {
    public static void main(String[] args) {
       // System.out.println(noOfDigits(1011));
       // System.out.println(51%10);
        System.out.println(decimal(1000));

    }


    static int decimal(int n) {
        int dec = 0;
        int pow = 0;
        while (n > 0){
        int lastDigit = n % 10;
        dec = dec + lastDigit * (int) Math.pow(2, pow);
        pow++;
        n = n / 10;
    }
        return dec;
    }
}
