package projectCCPA;

/// input string: "bloombergisfun"
	// input dictionary: {bloomberg, is, fun}
	// expected output: "bloomberg is fun"

	// Algorithm

	//String dictionary[] = {"bloomberg","is","fun"};

	// Insert the dictionary in link list.

	import java.util.*;

	public class Solution
	{
	    static String resultF="";
	    static List<String> dictionary = new LinkedList<String>();
	    public static boolean breakwords(String pattern){
	        if (pattern.length()==0)
	            return true;
	        for (int i = 1 ; i <= pattern.length() ; i++){
	        	
//	        	System.out.println("Array - "+i+" - Patern Split - " + pattern.substring(0,i) + " - Pattern SubString - " + pattern.substring(i, pattern.length()));
	            if(dictionary.contains(pattern.substring(0,i)) && breakwords(pattern.substring(i, pattern.length())) ){
	                resultF=pattern.substring(0,i) + " " + resultF;
//	            	resultF=resultF + " " + pattern.substring(0,i);
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public static void main(String []args){
	        dictionary.add("bloomberg");
	        dictionary.add("is");
	        dictionary.add("fun");
	        
	        String patternIn="bloombergisfun";
	        
	        System.out.println("Dictionary - " + dictionary);
	        System.out.println(breakwords(patternIn));
	        System.out.println("result- " + resultF);
	    }
	}
