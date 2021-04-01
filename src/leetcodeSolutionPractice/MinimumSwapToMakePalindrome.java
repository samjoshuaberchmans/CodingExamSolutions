package leetcodeSolutionPractice;

import java.util.HashSet;

// Input Questions.... 

//Example 1:
//
//Input: "mamad"
//Output: 3
//Example 2:
//
//Input: "asflkj"
//Output: -1
//Example 3:
//
//Input: "aabb"
//Output: 2
//Example 4:
//
//Input: "ntiin"
//Output: 1
//Explanation: swap 't' with 'i' => "nitin"

public class MinimumSwapToMakePalindrome {
	
	private static boolean isPalindrome(char[] s1) {
		HashSet<Character> hs = new HashSet<>();
		for(char c: s1) {
			if(hs.contains(c)) {
				hs.remove(c);				
			}else{
				hs.add(c);
			}				
		}
		return hs.size() < 2;
	}
	
	private static void swap(char[] s2, int i, int j) {
		char tmp = s2[i];
		s2[i] = s2[j];
		s2[j] = tmp;
	}
	
	public static int minswaps(char[] s1) {
		int result = 0;
		if(!isPalindrome(s1))
			return -1;
		int i = 0;
		int j = s1.length - 1;
		int k = j;
		while(i < j) {
			k = j;
			while(s1[i] != s1[k] && k > i)
				k--;
			if(s1[i] == s1[k] && i != k) {
				while(k < j) {
					swap(s1,k,k+1);
					k++;
					result++;
				}
				i++;
				j--;
			}else {
				swap(s1,i,i+1);
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Minimum Number of Swapping Neeeded - mamad - " + minswaps("mamad".toCharArray()));
		System.out.println("Minimum Number of Swapping Neeeded - asflkj - " + minswaps("asflkj".toCharArray()));
		System.out.println("Minimum Number of Swapping Neeeded - aabb - " + minswaps("aabb".toCharArray()));
		System.out.println("Minimum Number of Swapping Neeeded - ntiin - " + minswaps("ntiin".toCharArray()));
		System.out.println("Minimum Number of Swapping Neeeded - joshua - " + minswaps("joshua".toCharArray()));
		System.out.println("Minimum Number of Swapping Neeeded - masmas - " + minswaps("masmas".toCharArray()));
		
	}

}
