package hackerRankCodingPractice;

import java.util.Arrays;

public class ArrayManipulations {

    static long arrayManipulation(int n, int[][] queries) {
    	
    	long[] arrayIndexing =  new long[n+2];
    	
//    	for (int i = 0 ; i < n ; i++){
//    		arrayIndexing[i]=0;
//    	}
    	
    	for (int row = 0 ; row < queries.length ; row++){
    		int a = queries[row][0];
    		int b = queries[row][1];
    		int k = queries[row][2];
    		
//    		Use Prefix Index Method. https://youtu.be/hDhf04AJIRs
    		
    		arrayIndexing[a]+=k;
    		arrayIndexing[b+1]-=k;
    		
//    		for (int j = a-1; j <= b-1 ; j++){
////    			if (j == 4){
////    				System.out.println("result - " + arrayIndexing[j] + " - k - " + k + " - " +  (arrayIndexing[j]+k));
////    			}
//    			arrayIndexing[j] += k;
//    		}
//    		System.out.println("Index k - " + k + " Highest Record - " + arrayIndexing[4] );
    	}
    	long sum = 0;
    	long maxValue=Long.MIN_VALUE;
    	
    	for (int i = 0 ; i < arrayIndexing.length ; i++){
//    		System.out.println("sum - " + sum);
    		sum += arrayIndexing[i];
    		maxValue=Math.max(sum, maxValue);
 
    	}
    	
//    	System.out.println("Highest Record - " + arrayIndexing[4] + " - " + arrayIndexing[5]);
    	
//    	long maxValue;
//    	
//    	Arrays.sort(arrayIndexing);
//    	maxValue = arrayIndexing[arrayIndexing.length - 1];
//    	
//    	for (int i = 0 ; i < arrayIndexing.length ; i++){
//    		if (arrayIndexing[i] > maxValue){
//    			maxValue = arrayIndexing[i];
//    		}
//    	}
//    	
    	return maxValue;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 10;
//		int[][] inValue = {{1,5,3},{4,8,7},{6,9,1}};

//		int n = 5;
//		int[][] inValue = {{1,2,100},{2,5,100},{3,4,100}};

		int n = 10;
		int[][] inValue = {{2,6,8},{3,5,7},{1,8,1},{5,9,15}};
		
		System.out.println("Value - " + arrayManipulation(n, inValue));

	}

}
