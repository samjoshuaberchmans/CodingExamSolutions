package projectCCPA;

public class DeleteCosts {
	
	static int Maxcost(String s, int[] cost) {
		
		int maxcost = 0;
		int i = 0 ;
		
		while ( i < s.length()-1){
			
			if (s.charAt(i) == s.charAt(i+1)){
				if (cost[i] > cost[i+1]){
					maxcost += cost[i];
				} else {
					maxcost += cost[i];
					cost[i+1] = cost[i];
				}
			}
			i++;
		}
		return maxcost;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Given string s 
	    String s = "abc";
	    // Given cost of removal 
	    int []cost = { 1, 2, 3}; 
	    // Function call 
	    System.out.print(Maxcost(s, cost));
	}

}
