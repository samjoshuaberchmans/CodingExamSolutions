package AEArrays;

import java.util.Arrays;

public class MinimumWaitTimeForQueries {

    public static int MinimumWaitTime(int[] queries){
        Arrays.sort(queries);
        int minimumCount=0;
        for(int i = 0 ; i < queries.length-1 ; i++){
//            System.out.println("I - " + i + " - balance length - " + (queries.length-1-i));
            minimumCount+=(queries[i]*(queries.length-1-i));
        }
        return minimumCount;
    }

    public static void main(String[] args){
        int[] queries = {3,2,1,2,6};
        System.out.println("Out - " + MinimumWaitTime(queries));
    }
}
