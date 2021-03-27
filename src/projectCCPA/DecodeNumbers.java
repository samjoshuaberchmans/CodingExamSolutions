package projectCCPA;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DecodeNumbers {
	
	public static HashMap<Integer,ArrayList<String>> reference = new HashMap<Integer,ArrayList<String>>();
	public static HashMap<Integer,String> dictionaryRef = new HashMap<Integer,String>();
	public static List<String> decodedMessage = new ArrayList<String>();
	public static List<Integer> decodedNumber = new ArrayList<Integer>();
	
	static void addDictionary(){
		dictionaryRef.put(1, "a");
		dictionaryRef.put(2, "b");
		dictionaryRef.put(3, "c");
		dictionaryRef.put(4, "d");
		dictionaryRef.put(5, "e");
		dictionaryRef.put(6, "f");
		dictionaryRef.put(7, "g");
		dictionaryRef.put(8, "h");
		dictionaryRef.put(9, "i");
		dictionaryRef.put(10, "j");
		dictionaryRef.put(11, "k");
		dictionaryRef.put(12, "l");
		dictionaryRef.put(13, "m");
		dictionaryRef.put(14, "n");
		dictionaryRef.put(15, "o");
		dictionaryRef.put(16, "p");
		dictionaryRef.put(17, "q");
		dictionaryRef.put(18, "r");
		dictionaryRef.put(19, "s");
		dictionaryRef.put(20, "t");
		dictionaryRef.put(21, "u");
		dictionaryRef.put(22, "v");
		dictionaryRef.put(23, "w");
		dictionaryRef.put(24, "x");
		dictionaryRef.put(25, "y");
		dictionaryRef.put(26, "z");
	}
	
	static boolean decodeMessage(String number , int l ){
		if ( l == 0 || l <= 0 ){
			System.out.println("1");
			return true;
		}
		int numberLength = number.toCharArray().length;
		if (number.toCharArray()[0] == 0 || numberLength < 1 ){
			System.out.println("2");
			return false;
		}
//		int numberLength = number.toCharArray().length;
		for (int i = 0 ; i < numberLength ; i++){
			System.out.println("Integer - " + i + " - input Values - " + number);
			System.out.println("Decoded - Numbers In Loop - " + decodedNumber);
			System.out.println("Decoded - Message In Loop - " + decodedMessage);
			System.out.println("i ---- + " + i);
			System.out.println("Char - " + number.toCharArray()[i] + " - Balance Char -" + number.substring(i+1, numberLength) + "- indexed -" + (numberLength-(i+1)) );
			System.out.println("Char - " + number.substring(0, i+1) + " - Balance Char -" + number.substring(i+2, numberLength) + "- Indexed -" + (numberLength-(i+2)) );
			
			if (
					dictionaryRef.containsKey( Character.getNumericValue(number.toCharArray()[i]) ) && decodeMessage(number.substring(i+1, numberLength),numberLength-(i+1))
					){
				System.out.println("11");
				decodedMessage.add(dictionaryRef.get(number.toCharArray()[i]));
				decodedNumber.add(Character.getNumericValue(number.toCharArray()[i]));
			}
			
			if( dictionaryRef.containsKey(Integer.parseInt(number.substring(0, i+1)) ) && decodeMessage(number.substring(i+2, numberLength),numberLength-(i+2)) ){
				System.out.println("22");
				decodedMessage.add(dictionaryRef.get( number.substring(0, i+1) ));
				decodedNumber.add(Integer.parseInt( number.substring(0, i+1) ));
			}

		}
//		System.out.println("Decoded - Numbers In Loop - " + decodedNumber);
//		System.out.println("Decoded - Message In Loop - " + decodedMessage);
		return false;	
	}

	public static void main (String args[]) {
		addDictionary();
		String a = "14343";
		System.out.println(decodeMessage(a,a.length()));
		System.out.println("Dictionary - " + dictionaryRef);
		System.out.println("Decoded - Numbers - " + decodedNumber);
		System.out.println("Decoded - Message - " + decodedMessage);
	}
}
