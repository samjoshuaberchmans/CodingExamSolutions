package AEArrays;

import java.util.Arrays;

public class NonContructibleChange {

    public static int nCC(int[] coins){
        Arrays.sort(coins);
        int change = 0;
        for (int coin : coins) {
            if (coin <= (change + 1)) {
                change += coin;
            } else {
                return change + 1;
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
