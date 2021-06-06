package AEArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSumInList {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        Integer[] temp;
        Arrays.sort(array);
        List<Integer[]> result = new ArrayList<>();
        for(int i = 0 ; i < array.length ; i++ ){
            for(int j = i+1 ; j < array.length ; j++){
                for(int k = j+1 ; k < array.length ; k++){
                    if((array[i]+array[j]+array[k]) == targetSum){
//                        System.out.println("Sum - " + (array[i]+array[j]+array[k]) + array[i] + array[j] + array[k]);
                        temp = new Integer[3];
                        temp[0] = array[i];
                        temp[1] = array[j];
                        temp[2] = array[k];
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] array = {12,3,1,2,-6,5,-8,6};
        int targetSum=0;
        List<Integer[]> result = threeNumberSum(array,targetSum);
        for (Integer[] integers : result) {
            System.out.println("[" + integers[0] + "," + integers[1] + "," + integers[2] + "]");
        }
    }
}
