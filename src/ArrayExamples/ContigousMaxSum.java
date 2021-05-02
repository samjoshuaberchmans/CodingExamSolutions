package ArrayExamples;

public class ContigousMaxSum {

    public static int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) throw new IllegalArgumentException("values are null/empty...!");

        int maxSum = Integer.MIN_VALUE, sumSoFar = 0;
        for(int index=0;index<nums.length;index++) {
            sumSoFar += nums[index];
            //The initial assumption here is that the first value itself gives us the max sum unless we get a better value higher than the one seen before
            maxSum = Math.max(maxSum, sumSoFar);

            //If sum<0, we don't want to include that field. And since we need a sum where elements have to be contiguous, we set the sum = 0;
            if(sumSoFar < 0) sumSoFar = 0;
        }
        return maxSum;
    }

    public static void main(String[] args){

        int[] in1 = {1,3,-10,20}; // Expected 20
        int[] in2 = {1,3,-10,2}; //Expected 4
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println("int 1 - " + maxSubArray(in1));
        System.out.println("int 2 - " + maxSubArray(in2));
        System.out.println("int 2 - " + maxSubArray(nums));
//        List<Integer> inList1 = Arrays.asList(in1);
//        List<Integer> inList2 = Arrays.asList(in2);

    }
}
