package AEArrays;

public class TwoNumberSum {
    public static int[] twoNumberSumBrutForce(int[] array , int targetSum){
//        int[] result = new int[0];
        for(int i = 0 ; i <= array.length-1 ; i++){
            for(int j= i+1 ; j <= array.length-1 ; j++ ) {
//                System.out.println(" I - " + array[i] + " - J -" + array[j] + " - Array Length - " + array.length);
                if((array[i]+array[j]) == targetSum)
                    return new int[] {array[i],array[j]};
            }
        }
        return new int[0];
    }
    public static void main (String[] args){
        int[] array = {3,5,-4,8,11,1,-1,6};
        int targetSum = 10;
        int[] array1 = {-21,301,12,4,65,56,210,356,9,-47};
        int targetSum1 = 164;
        int[] array2 = {4,6,1,-3};
        int targetSum2 = 3;

        int[] result = twoNumberSumBrutForce(array,targetSum);
        for (int j : result) System.out.println(j);

        System.out.println("-----");

        int[] result1 = twoNumberSumBrutForce(array1,targetSum1);
        for (int j : result1) System.out.println(j);

        System.out.println("-----");

        int[] result2 = twoNumberSumBrutForce(array2,targetSum2);
        for (int j : result2) System.out.println(j);
    }
}
