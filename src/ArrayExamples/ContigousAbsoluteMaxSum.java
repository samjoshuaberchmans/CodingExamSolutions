package ArrayExamples;

public class ContigousAbsoluteMaxSum {
    public static int maxAbsoluteSum(int[] nums){
        int result=0;
        int sum1 = 0 , sum2 = 0;

        for(int v : nums ){
            sum1+=v;
            sum2+=v;
            result=Math.max(result,sum1);
            result=Math.max(result,-sum2);
            if(sum1<0)
                sum1 = 0;
            if(sum2>0)
                sum2=0;
        }
        return result;
    }

    public static void main (String[] args){
        int[] number1={1,-3,2,3,-4};
        int[] number2={2,-5,1,-4,3,-2};
//        int[] number3={};

        System.out.println("Number 1 - " + maxAbsoluteSum(number1));
        System.out.println("Number 2 - " + maxAbsoluteSum(number2));
    }
}
