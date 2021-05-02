package leetcodeSolutionPractice;

import java.util.HashMap;
import java.util.Map;

public class KDifferenceUniquePairs {

    public static HashMap<Integer , Integer> keyPairs;

    public static void printHashMap(){
        for(Map.Entry<Integer , Integer> entry : keyPairs.entrySet())
            System.out.print("("+entry.getKey()+","+entry.getValue()+")");

        System.out.println(" ");
    }

    public static boolean findNumberInArray(int[] arr , int arrayInLoop , int differenceToAdd , int indexInArray){
//        printHashMap();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == (arrayInLoop+differenceToAdd) && !keyPairs.containsKey(arrayInLoop) && i != indexInArray ){
                keyPairs.put(arrayInLoop,arrayInLoop+differenceToAdd);
                return true;
            }
        }
        return false;
    }

    public static int findPairs(int[] arr , int diff){
        int count=0;
        keyPairs = new HashMap<>();
        for (int i = 0 ; i < arr.length ; i++){
//            System.out.println("Array - " + arr[i] + " to Find - " + (arr[i]+diff));
            if(findNumberInArray(arr,arr[i] ,diff , i)){
                count++;
            }
        }
        printHashMap(); // Print to see the results
        return count;
    }

    public static void main(String[] args){
        int[] num1 = {3,1,4,1,5};
        int diff1 = 2;
        System.out.println("Num1 K Diff Unique Pairs - " + findPairs(num1,diff1));

        int[] num2 = {1,2,3,4,5};
        int diff2 = 1;
        System.out.println("Num2 K Diff Unique Pairs - " + findPairs(num2,diff2));

        int[] num3 = {1,3,1,5,4};
        int diff3 = 0;
        System.out.println("Num3 K Diff Unique Pairs - " + findPairs(num3,diff3));

        int[] num4 = {1,2,4,4,3,3,0,9,2,3};
        int diff4 = 3;
        System.out.println("Num4 K Diff Unique Pairs - " + findPairs(num4,diff4));

        int[] num5 = {-1,-2,-3};
        int diff5 = 1;
        System.out.println("Num5 K Diff Unique Pairs - " + findPairs(num5,diff5));
    }
}
