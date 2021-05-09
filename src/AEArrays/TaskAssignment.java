package AEArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class TaskAssignment {

    public static HashMap<Integer,ArrayList<Integer>> timeToIndexsMap;

    public static void FillTimeToIndexMap(ArrayList<Integer> inList){
        timeToIndexsMap = new HashMap<>();
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
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int inListSize = tasks.size();

        for(int i = 0 ; i < inListSize/2;i++){
//            System.out.println("i - " + i + " - listSize index - " + (inListSize-i-1));
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(returnIndexForValueFromHashMap(Integer.valueOf(tasks.get(i)),0));
            temp.add(returnIndexForValueFromHashMap(Integer.valueOf(tasks.get(inListSize-i-1)),1));
            result.add(temp);
        }
        return result;
    }

//     From Algo Expoert
    public static HashMap<Integer, ArrayList<Integer>> getTaskDurationsToIndices(ArrayList<Integer> tasks) {
        HashMap<Integer, ArrayList<Integer>> taskDurationsToIndices =
        new HashMap<Integer, ArrayList<Integer>>();
        for (int idx = 0; idx < tasks.size(); idx++) {
            int taskDuration = tasks.get(idx);
            if (taskDurationsToIndices.containsKey(taskDuration)) {
                taskDurationsToIndices.get(taskDuration).add(idx);
            } else {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                temp.add(idx);
                taskDurationsToIndices.put(taskDuration, temp);
            }
        }
        return taskDurationsToIndices;
    }

    public static ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        ArrayList<ArrayList<Integer>> pairedTasks = new ArrayList<ArrayList<Integer>>();
        HashMap<Integer, ArrayList<Integer>> taskDurationsToIndices = getTaskDurationsToIndices(tasks);
        ArrayList<Integer> sortedTasks = tasks;
        Collections.sort(sortedTasks);
        for (int idx = 0; idx < k; idx++) {
            int task1Duration = sortedTasks.get(idx);
            ArrayList<Integer> indicesWithTask1Duration = taskDurationsToIndices.get(task1Duration);
            int task1Index = indicesWithTask1Duration.remove(indicesWithTask1Duration.size() - 1);
            int task2SortedIndex = tasks.size() - 1 - idx;
            int task2Duration = sortedTasks.get(task2SortedIndex);
            ArrayList<Integer> indicesWithTask2Duration = taskDurationsToIndices.get(task2Duration);
            int task2Index = indicesWithTask2Duration.remove(indicesWithTask2Duration.size() - 1);
            ArrayList<Integer> pairedTask = new ArrayList<Integer>();
            pairedTask.add(task1Index);
            pairedTask.add(task2Index);
            pairedTasks.add(pairedTask);
        }
        return pairedTasks;
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
        ArrayList<ArrayList<Integer>> output1 = taskAssignment(k,inList);
        System.out.println(output1);
    }
}