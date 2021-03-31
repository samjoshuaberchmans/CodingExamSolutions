package hackerRankCodingPractice;

public class MinimumDeletionCost {
	
	public static int minCost(String S , int[] cost){
		int minCost=0;
		for(int i = 1 ; i < S.length() ; i++){
			if( S.charAt(i) == S.charAt(i-1)){
				if(cost[i-1] < cost[i]){
					minCost += cost[i-1];
				} else {
					minCost += cost[i];
					cost[i] = cost[i-1];
				}
			}
		}
		return minCost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String S = "aabaa";
//		int[] cost = {1,2,3,4,1};

		String S = "aaabbbbc";
		int[] cost = {5,1,3,6,1,2,6,3};
		
		System.out.println("Cost - " + minCost(S, cost));

	}

}
