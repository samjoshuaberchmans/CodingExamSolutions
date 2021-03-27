package projectCCPA;

import java.util.Stack;

public class WordMachine {
	
    public static final int MAX = 1000000000;
    public static final int MIN = -1000000000;
	public static Stack<Integer> stacks = new Stack<>();
	
	public static void push(int i){
		withinRange(i);
//		System.out.println("Going to push - " + i);
//		System.out.println("Before Pushing - " + stacks.toString());
		stacks.push(i);
//		System.out.println("After Pushing - " + stacks.toString());
	}
	
	public static int pop(){
		return stacks.pop();
	}
	
	public static void dup(){
		hasElements(1);
		push(stacks.peek());
	}
	
	public static void add(){
		hasElements(2);
//		System.out.println("Inside Add - " + stacks.toString());
		push(stacks.pop()+stacks.pop());
//		System.out.println("After Add- " + stacks.toString());
	}
	
	public static void sub(){
		hasElements(2);
//		System.out.println("Inside sub - " + stacks.toString());
		push(stacks.pop()-stacks.pop());
//		System.out.println("After sub - " + stacks.toString());
	}
	
	public static int hasElements(int i){
		if(stacks.size() < i ){
			throw new IllegalArgumentException("Not having many elements");
		}
		return i;
	}
	
	public static int withinRange(int i){
		if(i<MIN || i > MAX){
			throw new IllegalArgumentException("Input over the Flow");
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "12 DUP 4 POP 5 DUP + DUP + -";
		
		String[] arrays = input.split(" ");
		
		for (int j = 0 ; j < arrays.length ; j++){
			switch(arrays[j]){
				case "+" :
					add();
					break;
				
				case "-" :
					sub();
					break;
					
				case "DUP" :
					dup();
					break;
				
				case "POP" :
					pop();
					break;
				
					default :
//						System.out.println("Default");
						push(Integer.parseInt(arrays[j]));
						break;
			}
//			System.out.println("For loop result - " + stacks.toString());
		}
		System.out.println("Last Char - " + stacks.peek());
	}
}
