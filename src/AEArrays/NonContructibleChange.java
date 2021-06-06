package AEArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NonContructibleChange {

    public static int nCC(int[] coins){
        Arrays.sort(coins);
        int change = 0;
        int minimumSum=Integer.MAX_VALUE;
        for (int i = 0 ; i < coins.length ; i++){
            if( coins[i] <= (change+1)) {
                change += coins[i];
            }else{
                return change+1;
            }
        }
        return change+1;
    }

    public static void main(String[] args){
        int[] coins = {5,7,1,1,2,3,22};
        System.out.println("Output - " + nCC(coins));
//        Sorted 1 , 1 , 2 , 3 , 5 , 7 , 22
    }
}
