package leetcodeSolutionPractice;

import java.util.HashMap;
import java.util.Map;

public class SumFractionsTo1 {
	
	   private static int findLCM(int[] B) {
	        int[] nums= B.clone();
	        int div = 2;
	        int lcm = 1;
	        int count = 0;
	        while(true) {
	            boolean divides = false;
	            for(int i=0; i<nums.length; ++i) {
	                if(nums[i] == 0) return 0;
	                if(nums[i] != 1 && nums[i] % div == 0) {
	                    divides = true;
	                    nums[i] /= div;
	                    if(nums[i] == 1) ++count;
	                }
	                
	            }
	            if(divides) {
	                lcm *= div;
	            } else {
	                ++div;
	            }
	            if(count == nums.length) return lcm;
	        }
	    }

	private static int countFractionPairs(int[] A, int[] B) {
		int count = 0;
		int mod = 1000000007;
		int lcm = findLCM(B);
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<A.length; ++i) {
		A[i] *= lcm/B[i];
		count += map.getOrDefault(lcm - A[i], 0);
		count %= mod;
		map.put(A[i], map.getOrDefault(A[i], 0)+1);
		}
		return count;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,1};
		int[] B = {2,3,3};
		System.out.println("Number of Additions to be done - " + countFractionPairs(A, B));
	}

}
