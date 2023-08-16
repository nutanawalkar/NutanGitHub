package Practice;

import java.util.Scanner;

public class NoOfVowelsInString {
public static void main(String[] args) {
	System.out.println("Enter the string");
	//To take input string from console
	 Scanner sc=new Scanner(System.in);
	 //To read the string
	 String s=sc.nextLine();
	//Now sc.nextLine() will store the value into variable str 
	 int count=0;
	 for(int i=0;i<s.length();i++) {
		 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
			 System.out.println("vowel present at index "+i+" ==> "+s.charAt(i));
			 count++;
		 }
		 System.out.println(count);
	 }
}
}
