package Recursion;
import java.util.*;
//Check if the String is Palindrome
public class P8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a String");
        String s = sc.nextLine();
        System.out.println(string(s,0));
    }
    static boolean string(String s, int i ){

        int n = s.length();
        if(i==n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
        }
       return string(s,i+1);

    }
}
