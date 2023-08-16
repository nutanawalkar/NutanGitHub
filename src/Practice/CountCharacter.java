package Practice;

public class CountCharacter {
public static void main(String[] args) {
	
	String s="The best of both world";
	int count=0;
	//count each character except space
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)!=' ') {
			count++;
		}
		System.out.println("Total no of characters in string       :"+count);
	}
}
}
