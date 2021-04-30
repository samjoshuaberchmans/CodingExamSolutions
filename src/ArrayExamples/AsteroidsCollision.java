package ArrayExamples;

import java.util.Stack;

public class AsteroidsCollision {

//    static Stack<Integer> asteroidCollections = new Stack<>();

    public static int[] checkCollision(int[] arr){
        Stack<Integer> asteroidCollections = new Stack<>();
//        int[] result = new int[arr.length];
        for(int i = arr.length-1 ; i >= 0  ; i--){
            asteroidCollections.push(arr[i]);
            if(asteroidCollections.size() > 1){
                int stackProcessingSize=asteroidCollections.size();
                while(stackProcessingSize > 1 ) {  // Needed to loop within the collided or non collided stack to make the available asteroids to collide
                    int intTop = asteroidCollections.pop();
                    int intSecondTop = asteroidCollections.pop();
                    if ((intTop > 0 && intSecondTop > 0) || (intTop < 0 && intSecondTop < 0)) { // If the asteroids are travelling in same directions
                        asteroidCollections.push(intSecondTop);
                        asteroidCollections.push(intTop);
                        stackProcessingSize--;
                    } else if (intTop > 0 && intSecondTop < 0) { // If asteroids are colliding
                        if (intTop != Math.abs(intSecondTop)) { // If the value is not equal then we need to find the max. Using absoute since - is only direction, but not minus value
                            if (Math.abs(intSecondTop) > intTop) { // If the asteroid travelling on the left is higher then we need to keep the negative one inside the stack.
                                asteroidCollections.push(Integer.max(intTop, Math.abs(intSecondTop)) * -1);
                            } else { // Else the one moving to right is higher value and it will stay in stack.
                                asteroidCollections.push(Integer.max(intTop, Math.abs(intSecondTop)));
                            }
                        } // No need for else as once the values are taken out, we no need to insert them if they are equal.
                        stackProcessingSize=asteroidCollections.size(); // Here we cannot use -- as after a collision if only 3 asteroids are there , 2 might go , and the size might still reflect 2 , where as the stack is having only 1 record. to handle this we have kept size taking.
                    } else if (intTop < 0 && intSecondTop > 0) {
                        asteroidCollections.push(intSecondTop);
                        asteroidCollections.push(intTop);
                        stackProcessingSize--;
                    } else{
                        stackProcessingSize--;
                    }
                }
            }
        }
        int stackSize = asteroidCollections.size();  //Size is needed prior as when we do pop in loop the size of stack reduced in each for loop
        int[] result = new int[stackSize];
        if(asteroidCollections.size() > 0) {
            for (int i = 0; i <= stackSize-1; i++) {
                result[i] = asteroidCollections.pop();
            }
        }
        return result;
    }

    public static void evaluvateResultAndPrint(int[] inArray){
        int[] result = checkCollision(inArray);
        if(result.length > 0) {
            for (int j : result) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }else {
                System.out.println("All collided");
        }
    }

    public static void main(String[] args){
        int[] input1 = {5,10,-5};
        int[] input2 = {8,-8};
        int[] input3 = {10,2,-5};
        int[] input4 = {-2,-1,1,2};
        int[] input5 = {-2,2,-1,-2};  // Expected output is [-2] , but code gives - [-2 , 2 -2]
        int[] input6 = {-2,1,-1,-2};
        System.out.print("Input 1 Out - ");
        evaluvateResultAndPrint(input1);
        System.out.print("Input 2 Out - ");
        evaluvateResultAndPrint(input2);
        System.out.print("Input 3 Out - ");
        evaluvateResultAndPrint(input3);
        System.out.print("Input 4 Out - ");
        evaluvateResultAndPrint(input4);
        System.out.print("Input 5 Out - ");
        evaluvateResultAndPrint(input5);
        System.out.print("Input 6 Out - ");
        evaluvateResultAndPrint(input6);
    }
}
