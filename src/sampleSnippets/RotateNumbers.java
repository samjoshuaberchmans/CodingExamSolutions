package sampleSnippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateNumbers {
	
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        List<Integer> toRotate = new ArrayList<Integer>();
        toRotate = arr;
//        Rotate rotates from Right , if passed negative value it will rotate left. So i am multiplying by -1 to negate the value.
        Collections.rotate(toRotate,(d*=-1));
        return toRotate;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] inputArray = {1,2,3,4,5};
//		Convert Array to List
		List<Integer> inputList = new ArrayList<>();
		for (int i : inputArray){
			inputList.add(i);
		}
		
		System.out.println("Rotated List - " + rotateLeft(2,inputList));
//		System.out.println("Rotated List - " + rotateLeft(2,Arrays.asList(inputArray)));

	}

}
