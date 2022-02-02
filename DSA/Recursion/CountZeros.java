package com.company;

public class CountZeros {
    public static void main(String[] args) {
        int n =1200003404;
        System.out.println(count(n));
    }
/*
    static int zeros(int n,int count){
        if(n==0) {
            return count;
        }
        int rem= n%10;
        if(rem==0){
            return zeros(n/10,count+1);
        }
        else return zeros(n/10,count);
    }
}

 */
 static int count(int n){

    return helper(n,0);
}
public static int helper(int n,int count) {
    int rem = n % 10;
    if (n == 0) {
        return count;

    }
    if (rem == 0){
        return helper(n / 10, count+1);
}
    else return helper(n/10,count);

}

}
