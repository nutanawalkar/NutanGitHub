
public class PunctuationCharCount {
	public static void main(String[] args) {
        String s="welcome to java! He said,'this is lovely'";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)==';'||s.charAt(i)=='?'||s.charAt(i)=='_'||s.charAt(i)=='-'||s.charAt(i)=='\''||s.charAt(i)==':'||s.charAt(i)=='/'){
            	count++;}
        }
        System.out.println("Total no of chars: "+count);
    }
}
