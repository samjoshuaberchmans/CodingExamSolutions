package sampleSnippets;

public class RemoveStringDuplicate {
	
	public static String returnDedupedString(char[] input){
		String returnValue ="";
		int length = input.length;
		for (int i = 0 ; i < length ; i++){
			if (i == 0 ) {
				returnValue=String.valueOf(input[i]);
			}
//			CharSequence inputValue = String.valueOf(input[i]);
			if (!returnValue.contains(String.valueOf(input[i])) )  {
				returnValue+=String.valueOf(input[i]);
			}
		}
		return returnValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char Str[] = "sam joshua berchmans".toCharArray();	
		System.out.println("Input " + Str.toString() + " output " + returnDedupedString(Str));

	}

}
