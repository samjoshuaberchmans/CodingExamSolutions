package projectCCPA;

//import java.util.Scanner;

public class MaskString {

	public static String replaceString(String input){
		return input.replaceAll("[^@. ]", "#");
	}
	
	public static String replaceNumber(String input){
		return input.replaceAll("[^-(). ]", "#");
	}

	public static String replaceAddress(String input){
		return input.replaceAll("[^ ]", "#");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    String s = "nileshkemse@gmail.com";
//	    System.out.println(s.replaceAll("(^[^@]{3}|(?!^)\\G)[^@]", "$1*"));
	       
//	    Scanner console = new Scanner(System.in);
//	    String str = console.next();
	    String[] emailID = {"bsamuel@gmail.com","s.b12@gmail.com","Vinu123@yahoo.co.in","Sam Joshua","Berchmans","Mc'Donalds"};
	    
	    String[] addressID = {"380 Mt Prospect Ave","52 Dafrack dr","100 Vail Rd",""};
	    
	    String[] phoneNu = {"469 602 8964","9734456768","+14696028964","(469)-602-8964"};
//	    String out = s.replaceAll("[^@.]", "X");
//	    System.out.println(out);
//	    console.close();
	    
	    for (int i = 0 ; i < emailID.length ; i++){
	    	System.out.println("Given Input - " + emailID[i] + " -- Masked is -- " + replaceString(emailID[i]));
	    }
	    
	    for (int i = 0 ; i < addressID.length ; i++){
	    	System.out.println("Given Input - " + addressID[i] + " -- Masked is -- " + replaceAddress(addressID[i]));
	    }
	    
	    for (int i = 0 ; i < phoneNu.length ; i++){
	    	System.out.println("Given Input - " + phoneNu[i] + " -- Masked is -- " + replaceNumber(phoneNu[i]));
	    }
//	    s= s.replaceAll("(?<=.{0}).(?=.*@)", "*");
//	    s = s.replaceAll("(?<=.{3}).(?=[^@]*?@)", "#");
//	    s=s.replaceAll("(?<=.)[^@](?=[^@]*?@)|(?:(?<=@.)|(?!^)\\G(?=[^@]*$)).(?=.*\\.)", "*");
//	    StringBuilder sb = new StringBuilder(s);
//	    System.out.println("Length - " + sb.length());
//	    for (int i = 0; i < sb.length() && sb.charAt(i) != '@'; ++i) {
//	      sb.setCharAt(i, '*');
//	    }
//	    s = sb.toString();
//	    System.out.println(s);
	}

}
