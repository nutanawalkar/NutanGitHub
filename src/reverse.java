
public class reverse {
public static void main(String[] args) {
	String s="Nutan Vitthal Awalkar";
	String reverse="";
	for(int i=s.length()-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);
		
	}
	System.out.println("the reverse string is :"+reverse);
}
}