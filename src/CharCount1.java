
public class CharCount1 {
	public static void main(String[] args) {
        String s="welcome to java";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
            	count++;}
        }
        System.out.println("Total no of chars: "+count);
    }
	
}
