package AEArrays;

import java.util.HashMap;

public class FirstDuplicateValueInArray {

    public static boolean CheckExistenceNotInCurrentIndex(int[] array , int numberToCheck , int indexToAvoid){
        for(int i = 0 ; i < array.length ; i++){
            if(array[i] == numberToCheck && i != indexToAvoid){
                return true;
            }
        }
        return false;
    }

    public static int firstDuplicateValue1(int[] array){ // This method will not work as it is having issue with the First Duplicate. We might need to use the Minimum Index to get this solved. Refer Brut force method.
        for (int i = 0 ; i < array.length ; i ++){
            if(CheckExistenceNotInCurrentIndex(array , array[i] , i)){
                return array[i];
            }
        }
        return -1;
    }

    public static HashMap<Integer , Integer> inList;
    public static int firstDuplicateValue(int[] array){
        for (int i = 0 ; i < array.length ; i++){
//            System.out.println("Array - " + array[i]);
            if(inList.containsKey(array[i])){
                return array[i];
            } else {
                inList.put((array[i]),1);
            }
        }
        return -1;
    }

    public static int brutForceMethod(int[] array){
        int minimalIndex=array.length;
        for(int i= 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i] == array[j]){
                    minimalIndex = Math.min(j,minimalIndex);
                }
            }
        }
        return array[minimalIndex];
    }

    public static void main(String[] args){
        int[] array = {2,1,5,2,3,3,4};
        inList = new HashMap<>();
        System.out.println("Duplicate Number1 in Array " + brutForceMethod(array) + " - Older Method - " + firstDuplicateValue(array));
        array= new int[]{2, 1, 5, 3, 3, 2, 4};
        inList = new HashMap<>();
        System.out.println("Duplicate Number2 in Array " + brutForceMethod(array) + " - Older Method - " + firstDuplicateValue(array));
//        array= new int[]{2, 1, 5, 3, 3, 2, 4};
//        System.out.println("Duplicate Number1 in Array " + firstDuplicateValue(array));
    }
}
