package hackerRankCodingPractice;

import java.util.*;

public class NewYearChaos {
	    // Complete the minimumBribes function below.
	    static void minimumBribes(int[] q) {
	        int minimumSwap=0;
	        int sameNumberSwap=0;
	        int swappedNumber=0;
//	        int previousSwaap=0;
	        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
	        for (int i = 0 ; i < q.length ; i++){
	            for (int j = i+1 ; j < q.length ; j++) {
	                int tmp = 0;  
	                // System.out.println(q[i] + " + " + q[j]);
	                if (q[i] > q[j])   
	                {  
	                    swappedNumber=q[i];
	                    tmp = q[i];  
	                    q[i] = q[j];  
	                    q[j] = tmp; 
	                    minimumSwap+=1;
	                    if(hmap.containsKey(swappedNumber)){
	                        hmap.put(swappedNumber,hmap.get(swappedNumber)+1);
	                    } else{
	                        hmap.put(swappedNumber,1);
	                    }
	                    if(hmap.get(swappedNumber) > 2) {
	                    	sameNumberSwap=1;
	                    }
	                }  
	            }
	        }
	        if(sameNumberSwap == 1){
	        	System.out.println("Too chaotic");
	        }else{
	        	System.out.println(minimumSwap);
	        }
	    }

	    public static int findIndex(int arr[], int t)
	    {
	 
	        // if array is Null
	        if (arr == null) {
	            return -1;
	        }
	 
	        // find length of array
	        int len = arr.length;
	        int i = 0;
	 
	        // traverse in the array
	        while (i < len) {
	 
	            // if the i-th element is t
	            // then return the index
	            if (arr[i] == t) {
	                return i;
	            }
	            else {
	                i = i + 1;
	            }
	        }
	        return -1;
	    }
	    
	    static void minimumBribes1(int[] q){
	    	
	    	int minimumSwap=0;
	    	int chaoticInd=0;
	    	System.out.println("into the 2nd function");
	    	for (int i = q.length-1 ; i >= 0 ; i--){
	    		System.out.println("q[i] - " + q[i] + " - Array index - " + (i+1));
	    		if(q[i] != i+1){
	    			int index= findIndex(q, (i+1));
	    			System.out.println("q[i] - " + q[i] + " - Array index - " + (i) + " - Calculated Index - "+ index + " - diff - " + (i-index));
	    			System.out.println();
	    			if(i-index > 2){
	    				chaoticInd=1;
	    			}else{
	    				if(index < i){
	    				minimumSwap+=(i-index); }
	    			}
	    		}
	    	}
	    	if(chaoticInd==1){
	    		System.out.println("Too Choatic");
	    	}else{
	    		System.out.println(minimumSwap+1);
	    	}
	    	
	    }

	    public static void main(String[] args) {
//	        int t = scanner.nextInt();
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        for (int tItr = 0; tItr < t; tItr++) {
//	            int n = scanner.nextInt();
//	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	            int[] q = new int[n];
//
//	            String[] qItems = scanner.nextLine().split(" ");
//	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	            for (int i = 0; i < n; i++) {
//	                int qItem = Integer.parseInt(qItems[i]);
//	                q[i] = qItem;
//	            }
//
//	            minimumBribes(q);
//	        }
//
//	        scanner.close();
//	                    0,1,2,3,4,5,6,7  	
//	    	int[] q =  {1,2,3,4,5,6,7,8}; 2+2-1+2+4-1 -8
	    	int[] q1 = {1,2,5,3,7,8,6,4};
	    	int[] q2 = {1,2,5,3,7,8,6,4};
//	    	
//	    	System.out.println("Index for 6 - " + findIndex(q2,6));
	    	minimumBribes(q1);
	    	minimumBribes1(q2);    	
	    }
}
