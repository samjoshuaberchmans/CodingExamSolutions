package AEArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class TaskAssignment {

    public static HashMap<Integer,ArrayList<Integer>> timeToIndexsMap;

    public static void FillTimeToIndexMap(ArrayList<Integer> inList){
        for(int i = 0 ; i < inList.size() ; i++){
            if(timeToIndexsMap.containsKey(inList.get(i))){
                ArrayList<Integer> temp = timeToIndexsMap.get(inList.get(i));
                temp.add(i);
                Collections.sort(temp);
                timeToIndexsMap.put(inList.get(i),temp );
            }else{
                ArrayList<Integer> temp =  new ArrayList<>();
                temp.add(i);
                timeToIndexsMap.put(inList.get(i),temp);
            }
        }
    }

    public static int returnIndexForValueFromHashMap(int fromValue,int lowerHigher){
        int returnIndex=0;
        int indexToFetch=0;
        if(timeToIndexsMap.containsKey(fromValue)){
            ArrayList<Integer> temp = timeToIndexsMap.get(fromValue);
            if(lowerHigher==0){
                indexToFetch=0;
            }else{
                indexToFetch=temp.size()-1;
            }
            returnIndex=temp.get(indexToFetch);
            temp.remove(indexToFetch);
            if(temp.size()==0){
                timeToIndexsMap.remove(fromValue);
            }else{
                timeToIndexsMap.put(fromValue,temp);
            }
            return returnIndex;
        }
        return -1;
    }

    public static ArrayList<ArrayList<Integer>> AssignTask(int k , ArrayList<Integer> tasks){
        FillTimeToIndexMap(tasks);
        Collections.sort(tasks);
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int inListSize = tasks.size();

        for(int i = 0 ; i < inListSize/2;i++){
//            System.out.println("i - " + i + " - listSize index - " + (inListSize-i-1));
            temp.add(returnIndexForValueFromHashMap(Integer.valueOf(tasks.get(i)),0));
            temp.add(returnIndexForValueFromHashMap(Integer.valueOf(tasks.get(i)),1));
            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args){
        int k = 3;
        int[] tasks = {1,3,5,3,1,4};
        ArrayList<Integer> inList = new ArrayList<>();
        for (int i = 0; i < tasks.length ; i++){
            inList.add(tasks[i]);
        }
        ArrayList<ArrayList<Integer>> output = AssignTask(k,inList);
        System.out.println(output);

    }
}
