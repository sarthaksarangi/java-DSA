/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+1;
				}
			}
		System.out.print(sum);
		System.out.println();
		for(int j=1;j<=n;j++) {
			if(n%j==0) {
				System.out.print(j+" ");
				}
		}
	}
}
