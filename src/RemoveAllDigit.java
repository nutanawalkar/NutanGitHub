
public class RemoveAllDigit {
	
	    public static String removeAllDigit (String str){
	       return str=  str.replaceAll("[0123456789]","");
	      
	    }
	    public static void main(String[] args) {
	        String str="Hare1234krishna";
	        System.out.println (removeAllDigit (str));
	    }
	}

