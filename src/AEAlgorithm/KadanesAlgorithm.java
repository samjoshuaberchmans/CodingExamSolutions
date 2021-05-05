package AEAlgorithm;

public class KadanesAlgorithm {

    public static int KadaneAlgorithm(int[] array){
        int sum=Integer.MIN_VALUE;
        int maxSum=Integer.MIN_VALUE;

        for(int i = 0 ; i < array.length ; i++){
            if(sum < 0){
                sum=array[i];
            }else{
                sum+=array[i];
            }
            maxSum=Integer.max(sum,maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args){
        int[] array = {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
        System.out.println("Out For Array - " + KadaneAlgorithm(array));
    }
}
