package ArrayExamples;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MinimumSwapTpMakeEqualStrings {

    public static String returnSortedString(String input){
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }

    public static boolean CheckIfTheyMatch(char[] input1 , char[] input2){
        if(String.valueOf(input1).equals(String.valueOf(input2))){
            return true;
        }
        return false;
    }

    public static int minimumSwap(String s1 , String s2){
        int count=0;
        if(returnSortedString(s1) != returnSortedString(s2)){
            return -1;
        } else {
            char[] input1 = s1.toCharArray();
            char[] input2 = s2.toCharArray();
            for (int i = 0 ; i < input1.length ; i++){
                for(int j = 0 ; j < input2.length ; j++){

                }

            }

        }

        return count;
    }

    public static void main (String[] args){
        String s1 = "xx";
        String s2 = "yy";

        String s11 = "xy";
        String s12 = "yx";

        String s21 = "xx";
        String s22 = "xy";

        String s31 = "xxyyxyxyxx";
        String s32 = "xyyxyxxxyx";
    }
}
