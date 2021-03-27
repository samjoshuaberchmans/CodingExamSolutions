package projectCCPA;
import java.io.*;

public class HourGlass {

	static int R = 5;
	static int C = 5;

	    // Complete the hourglassSum function below.
	    static int hourglassSum(int[][] arr) {
	        
	        int[][] arr1 = new int[6][6];
	        int finalMax = 0;
	        int sum = 0;
	        
	        for ( int i = 0 ; i <= (R-2) ; i++){
	           
	            for (int j = 0 ; j <= (C-2) ; j++){
	                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
	                             arr[i+1][j+1] + 
	                            arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
	                arr1[i][j]=sum;
	                if (i == 0 && j == 0){
	                	finalMax=sum;
	                }
	                finalMax = Math.max(finalMax,sum);
	            }
	        }   
	        return finalMax;
	    }

	   

	    public static void main(String[] args) throws IOException {
	    	
	        int [][] arr = {{0,-4,-6,0,-7,-6},
                    {-1,-2,-6,-8,-3,-1},
                    {-8,-4,-2,-8,-8,-6},
                    {-3,-1,-2,-5,-7,-4},
                    {-3,-5,-3,-6,-6,-6},
                    {-3,-6,0,-8,-6,-7}};
	        
	        int [][] arr1 = {{-1,-1,0,-9,-2,-2},
                    {-2,-1,-6,-8,-2,-5},
                    {-1,-1,-1,-2,-3,-4},
                    {-1,-9,-2,-4,-4,-5},
                    {-7,-3,-3,-2,-9,-9},
                    {-1,-3,-1,-2,-4,-5}};
	        int result = hourglassSum(arr);
	        System.out.println("Result - " + result);

	        int result1 = hourglassSum(arr1);
	        System.out.println("Result - " + result1);
	    }
}
