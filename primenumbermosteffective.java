package com.company;
//Basic Idea
/*i*i<n because if a number is not a prime number its divisors always occur in pair and the smaller number within the
pair is always < square root of n.
If n is a very large number checking it for weather it is divisible by 2 will reduce the no. of total possible
iterations to half in addition to this checking if the no is divisible by 3 or not will also reduce many iterations.
Starting with i=5 because it is a odd prime no. and we are checking for even no.s including no.s divisible by 3
with that in mind we are checking if i is divisible by i or i+2 because i+1 is always an even number.
*/

public class primemumbers {
   public static boolean isPrime(int n){
        if (n==1)
            return false;
        if(n==2||n==3)
            return false;
        if(n%2==0||n%3==0)
            return false;
        for (int i =5;i*i<n;i=i+6)
            if(n%i==0||n%(i+2)==0)
                return false;
            return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(41));
    }
}
