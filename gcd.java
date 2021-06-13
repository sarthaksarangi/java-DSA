package com.company;

public class gcdoftwonumbers {
    //The basic idea behind gcd is let b be smaller than a then gcd(a,b)= gcd(a-b,b).
  
    //Basic Iterative Method

     public static int gcd1(int c,int d){
        while(c!=d){
            if(c>d)
                c =c-d;
            else d=d-c;
        }
        return c;
    }


    //Recursive method
  
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b) ;

    }
    public static void main(String[] args) {
        System.out.println(gcd(49,7));
        System.out.println(gcd1(100,7));
    }
}
