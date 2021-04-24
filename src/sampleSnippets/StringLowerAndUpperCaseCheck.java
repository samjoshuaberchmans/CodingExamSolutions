package sampleSnippets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringLowerAndUpperCaseCheck {
	
	public static String findString(String s){
		String result = "No";
		char[] c = s.toCharArray();
		Arrays.sort(c);
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		for (int i = 0 ; i < c.length ; i++){
//			System.out.println("Character In - " + c[i]);
			if(
					hm.containsKey(
							String.valueOf(
									Character.toLowerCase(c[i])
									)
					) || hm.containsKey(String.valueOf(Character.toUpperCase(c[i])) )
					){
				if(Character.isLowerCase(c[i]) && hm.containsKey(String.valueOf(Character.toUpperCase(c[i]))) ){
					hm.put(String.valueOf(Character.toUpperCase(c[i])), hm.get(String.valueOf(Character.toUpperCase(c[i])))+1);
					result=String.valueOf(Character.toUpperCase(c[i]));
				} else if ( Character.isUpperCase(c[i]) && hm.containsKey(String.valueOf(Character.toLowerCase(c[i])))  ){
					hm.put(String.valueOf(Character.toLowerCase(c[i])), hm.get(String.valueOf(Character.toLowerCase(c[i])))+1);
					result=String.valueOf(Character.toLowerCase(c[i]));
				}
//				hm.put(String.valueOf(Character.toLowerCase(c[i])), hm.get(String.valueOf(Character.toLowerCase(c[i])))+1);
//				result=String.valueOf(Character.toLowerCase(c[i]));
			}else{
				hm.put(String.valueOf(c[i]), 1);
			}
		}
		
//	      for (Map.Entry<String,Integer> entry : hm.entrySet())
//        System.out.println("Key = " + entry.getKey() +
//                         ", Value = " + entry.getValue());		
		return result;
	}
	
	public static String checkIfLetterAndNumbersAreEqual(String s){
		String result = "Not Matching";
		char[] c = s.toCharArray();
		ArrayList<String> stringIn = new ArrayList<>();
		ArrayList<Integer> integerIn = new ArrayList<>();
		
		for (int i = 0 ; i < c.length ; i++){
			if(Character.isLetter(c[i])){
				stringIn.add(String.valueOf(c[i]));
			}else{
				integerIn.add(Integer.parseInt(String.valueOf(c[i])));
			}
		}
		if(stringIn.size() == integerIn.size()){
			result="Matching";
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaBabcDaA";
//		String s = "Codility";
		String y = "SamJ1234";
		System.out.println("Lower and Upper case available - " + findString(s));
		System.out.println("Integer and String Matching - " + checkIfLetterAndNumbersAreEqual(y));

	}

}
