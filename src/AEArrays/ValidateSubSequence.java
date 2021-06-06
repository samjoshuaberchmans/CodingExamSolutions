package AEArrays;

import java.util.ArrayList;
import java.util.List;

public class ValidateSubSequence {
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        boolean status = false;
        if(sequence.size() == array.size()){
            return sequence.equals(array);
        }
        System.out.println("Seq Size - " + sequence.size() + " Array Size - " + array.size());
        if(sequence.size() <= array.size()) {
            for (Integer integer : sequence) {
                System.out.println("List in Array - " + integer);
                if (array.contains(integer)) {
                    array.remove(integer);
                    status = true;
                } else
                    return false;
            }
        }
        return status;
    }

    public static List<Integer> pushIntoList(int[] arr){
        List<Integer> temp = new ArrayList<>();
        for (int j : arr) temp.add(j);
        return temp;
    }

    public static void main (String[] args){
//        int[] aarr = {5, 1, 22, 25, 6, -1, 8, 10};
//        int[] seq = {1,6,-1,10};
        int[] aarr = {5, 1, 22, 25, 6, -1, 8, 10};
        int[] seq = { 1,6,-1,-1,10};
        if(isValidSubsequence(pushIntoList(aarr),pushIntoList(seq)))
            System.out.println("Sub sequence Matching");
        else
            System.out.println("Sub sequence Not matching");
    }
}
