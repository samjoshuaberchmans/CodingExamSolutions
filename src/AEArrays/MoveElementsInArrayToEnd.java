package AEArrays;

import java.util.*;

public class MoveElementsInArrayToEnd {
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for(int j = 0 ; j < array.size() ; j++){
            if(array.get(j) == toMove){
                temp.add(array.get(j));
            }else{
                result.add(array.get(j));
            }
        }
        result.addAll(temp);
        return result;
    }

    public static List<Integer> pushIntoList(int[] arr){
        List<Integer> temp = new ArrayList<>();
        for (int j : arr) temp.add(j);
        return temp;
    }

    public static void printList(List<Integer> toPrint){
        System.out.print("{");
        for(int k=0 ; k < toPrint.size() ; k++)
            System.out.print(toPrint.get(k)+",");
        System.out.print("}");
        System.out.println(" ");
    }
    public static void main(String[] args){
        int[] inArray = {2,1,2,2,2,3,4,2};
        int numberToMove=2;
        List<Integer> inArrays = pushIntoList(inArray);
        List<Integer> result = moveElementToEnd(inArrays,numberToMove);
        System.out.print("{");
        for(int k=0 ; k<result.size();k++)
            System.out.print(result.get(k)+",");
        System.out.print("}");
    }
}
