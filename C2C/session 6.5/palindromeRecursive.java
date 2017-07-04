import java.util.*;

class Main{
public static void main(String args[]){
Scanner read = new Scanner(System.in);
System.out.println("Enter string : ");
String input = read.next();

boolean isPalin = isPalindrome(input);
if(isPalin)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}

public static boolean isPalindrome(String input){
if(input.length() == 0 || input.length() == 1)
return true;
else{
char c1 = input.charAt(0);
char c2 = input.charAt(input.length()-1);
if(c1 == c2)
return isPalindrome(input.substring(1,input.length()-1));
else
return false;
}
}
}