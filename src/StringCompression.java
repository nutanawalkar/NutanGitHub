import java.util.Scanner;

public class StringCompression {
public static void main(String[] args) {
	StringCompression str=new StringCompression();
	String s1,s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	s1=sc.nextLine();
	
	s2=s1.replaceAll("\\s", "");
	str.Compression(s2);
	
}
// Create a Java method Compression to compress the string
public static String Compression(String s) {
	int count=1;
	StringBuilder sb=new StringBuilder();
	for(int i=1;i<s.length()-1;i++) {
		if (s.charAt(i)==s.charAt(i-1)) {
			count++;
		}
		else
		{
			sb.append(s.charAt(i-1));
			sb.append(count);
			count=1;
			
		}
	}

// count last character of the string
	if(s.length()>1) {
		if(s.charAt(s.length()-1)==s.charAt(s.length()-2)) {
			count++;
		}
		else {
			sb.append(s.charAt(s.length()-1));
			sb.append(count);
			
		}
		s=sb.toString();
		System.out.println("The compressed string is:" + "\n" +s);
		return s;
	}
	return s;
	
}
}
