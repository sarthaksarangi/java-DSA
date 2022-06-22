import java.util.*;
public class Palindrome {
     
	public static void main(String[] args) {
		String str = "Madam Im Adam";
		String result =str.toLowerCase();
		result =result.replaceAll(" ", "");
		
		palindrome(result);
	}
	static void palindrome(String str) {
		if(str.isEmpty()) {
			System.out.println("String is Empty");
		}
		
		 
		  Stack<Character> s = new Stack<>();
		  int flag =0;
	        
		  if(str.length()%2==1) {
			  for (int i = 0; i < (str.length()/2); i++) {
				s.push(str.charAt(i));
			}
			  for (int i = (str.length()/2)+1; i <str.length() ; i++) {
					if(s.pop()!=str.charAt(i)) {
						flag += 1;
					}
				}
			
			  if(flag!=0) {
				  System.out.println("Not palindrome");
			  }
			  else
				  System.out.println("palindrome");
		  }
		  
		  else {
			  for (int i = 0; i < str.length()/2; i++) {
					s.push(str.charAt(i));
				}
				  for (int j = (str.length()/2); j <str.length() ; j++) {
						if(s.pop()!=str.charAt(j)) {
							flag += 1;
						}
					}
				  if(flag!=0) {
					  System.out.println("Not palindrome");
				  }
				  else
					  System.out.println("palindrome");
		  }
		
	}

}
