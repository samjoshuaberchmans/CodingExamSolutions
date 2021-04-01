package leetcodeSolutionPractice;

import java.util.Arrays;

public class MinimumDeletionFrequenciesUnique {
	
	public static int minDeletions(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        
        Arrays.sort(freq);
//        for (int i = 0 ;i < 26 ; i++){
//        System.out.println("Frequency - "+ i + " - " + freq[i] );}
        int exp = freq[25];
        System.out.println("Initial Exp - " + exp);
        int res = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            if (freq[i] > exp) {
            	System.out.println("Freq - " + i + " - " + freq[i] + " - exp - " + exp + " - result - " + res);
                res += freq[i] - exp;
                System.out.println("Result After calculation - " + res);
            } else {
                exp = freq[i];
                System.out.println("else - exp - " + exp  + " - Freq - " + freq[i]);
            }
            if (exp > 0) {
                exp--; // Lowest exp is zero, cannot be negative
            }
        }
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbcc";
		
		System.out.println("Minimum Number of Deleted required - " + minDeletions(s));

	}

}
