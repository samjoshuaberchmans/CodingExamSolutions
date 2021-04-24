package sampleSnippets;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class KAndMinusKExists {
	
	public static String checkIfNumberExistsInArray(int[] arr, int toCheckValue , int arrayIndex){
		for (int i=0; i < arr.length;i++) {
//			System.out.println("Element - " + arr[i] + " checkValue - " + toCheckValue);
            if (arr[i] == (toCheckValue*-1) && i!=arrayIndex) {
//            	System.out.println("Match found");
            	return String.valueOf(arr[i]*-1);
            }
        }
		return "Not Matching";
	}
	
	public static int findBiggestOfPositiveAndNegative(int[] input){
		int biggestNumber=-1999999999;
		int matchingNumber=0;
		for (int i = 0 ; i < input.length;i++){
			if (checkIfNumberExistsInArray(input,input[i],i) != "Not Matching"){
				matchingNumber=input[i];
				if(matchingNumber > biggestNumber){
					biggestNumber=matchingNumber;
				}
			}
		}
//		System.out.println("biggest Number - " + biggestNumber);
		if(biggestNumber==-1999999999){
			return -1;
		} else {
		return biggestNumber; }
	}
	
	public static int findBiggestOfPositiveAndNegativeTree(int[] input){
		int biggestNumber=Integer.MIN_VALUE;
		int matchingNumber=0;
		HashMap<Integer, Integer> pairedValue = new HashMap<>();
		for (int i = 0 ; i < input.length ; i++){
//			System.out.println("in - " + input[i]);
			if(pairedValue.containsKey((Math.abs(input[i])))){
//				System.out.println("Apending for Second Time -- " + Math.abs(input[i]));
				pairedValue.put(Math.abs(input[i]), pairedValue.get(Math.abs(input[i]))+1);
				matchingNumber=Math.abs(input[i]);
					if(matchingNumber > biggestNumber){
						biggestNumber=matchingNumber;
					}
			} else {
				pairedValue.put(Math.abs(input[i]), 1);
			}
		}
//	       for (Map.Entry<Integer,Integer> entry : pairedValue.entrySet())
//	            System.out.println("Key = " + entry.getKey() +
//	                             ", Value = " + entry.getValue());
		
		if(biggestNumber== Integer.MIN_VALUE){
			return -1;
		} else {
		return biggestNumber; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] i = {4,-4,3,-3,2};
		int[] j = {-2,0,0,-3};
		int[] k = {-2,4,0,-3};
//		System.out.println("Result i - " + findBiggestOfPositiveAndNegative(i));
//		System.out.println("Result j - " + findBiggestOfPositiveAndNegative(j));
//		System.out.println("Result k - " + findBiggestOfPositiveAndNegative(k));
		
		System.out.println("Result i - " + findBiggestOfPositiveAndNegativeTree(i));
		System.out.println("Result j - " + findBiggestOfPositiveAndNegativeTree(j));
		System.out.println("Result k - " + findBiggestOfPositiveAndNegativeTree(k));
	}

}
