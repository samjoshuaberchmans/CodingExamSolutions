package AEArrays;

import java.util.Arrays;

public class SmallestDifferenceBetween2Arrays {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        int difference = Integer.MAX_VALUE;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int[] result = new int[0];
        for(int i = 0 ; i < arrayOne.length ; i++){                                                               
            for(int j = 0 ; j < arrayTwo.length ; j++){
                 int difference1 = Math.abs(arrayOne[i]) - Math.abs(arrayTwo[j]);
                 if(difference > difference1 && difference1 > 0){
                     difference=difference1;
                     result = new int[2];
                     result[0] = arrayOne[i];
                     result[1] = arrayTwo[j];
                 }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] array1 = {-1,5,10,20,28,3};
        int[] array2 = {26,134,135,15,17};
        int[] result = smallestDifference(array1,array2);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}