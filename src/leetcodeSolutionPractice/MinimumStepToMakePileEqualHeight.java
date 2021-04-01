package leetcodeSolutionPractice;

import java.util.Arrays;

public class MinimumStepToMakePileEqualHeight {
	
	public static int minSteps(int[] piles){
        int len = piles.length;
        if(len <= 1) return 0;
        Arrays.sort(piles);
        int res = 0, distinctNums = 0;
        for(int i = 1; i < len; ++i){
            if(piles[i] == piles[i - 1]){
                res += distinctNums;
            }
            else{
                ++distinctNums;
                res += distinctNums;
            }
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {5, 2, 1};
		int[] input2 = {1, 1, 2, 2, 2, 3, 3, 3, 4, 4};
		System.out.println("Pile input 5, 2, 1 ---- " + minSteps(input1));
		System.out.println("Pile input 1, 1, 2, 2, 2, 3, 3, 3, 4, 4 ---- " + minSteps(input2));

	}

}
