package Methods;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(decToBin(10));

    }
    static int decToBin(int n){
        int bin = 0;
        int pow = 0;

        while(n>0){
            int rem = n%2;
            bin = bin + rem * (int)Math.pow(10,pow);
            n = n/2;
            pow++;
        }
        return bin;
    }
}
