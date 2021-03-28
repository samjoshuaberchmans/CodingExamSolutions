package sampleSnippets;

import java.util.Stack;

public class WordMachine2 {
	
    public static final int MAX = 1000000000;
    public static final int MIN = -1000000000;
	public static Stack<Integer> stacks = new Stack<>();
	
	public static void push(int i){
		withinRange(i);
		System.out.println("Going to push - " + i);
		System.out.println("Before Pushing - " + stacks.toString());
		stacks.push(i);
		System.out.println("After Pushing - " + stacks.toString());
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
		System.out.println("Inside Add - " + stacks.toString());
		push(stacks.pop()+stacks.pop());
		System.out.println("After Add- " + stacks.toString());
	}
	
	public static void sub(){
		hasElements(2);
		System.out.println("Inside sub - " + stacks.toString());
		push(stacks.pop()-stacks.pop());
		System.out.println("After sub - " + stacks.toString());
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
	
	public static int ProcessWorkLine(String s){
		String[] arrays = s.split(" ");
		
		for (int j = 0 ; j < arrays.length ; j++){
			System.out.println("Running ------ " + arrays[j]);
			if (arrays[j].equals("+")){
				System.out.println("Addition");
				add();
			} else if (arrays[j].equals("-")){
				System.out.println("Subtraction");
				sub();
			}else if (arrays[j].equals("DUP")){
				System.out.println("DUP");
				dup();
			}else if (arrays[j].equals("POP")){
				System.out.println("POP");
				pop();	
			}else{
				push(Integer.parseInt(arrays[j]));
			}
						
			System.out.println("For loop result ========= " + stacks.toString());
		}
		return stacks.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String input1 = "12 DUP 4 POP 5 DUP + DUP + -";
//		String input2 = "4 5 6 - 7 +";
//		String input3 = "5 DUP 6 + -";
		String input4 = "3 DUP 5 - -";
		
//		System.out.println("Input1 - " + input1 + " --- " + ProcessWorkLine(input1));
//		System.out.println("Input2 - " + input2 + " --- " + ProcessWorkLine(input2));
//		System.out.println("Input3 - " + input3 + " --- " + ProcessWorkLine(input3));
		System.out.println("Input4 - " + input4 + " --- " + ProcessWorkLine(input4));
		;
	}
}
