package projectCCPA;

public class ReplaceDoubleString {
	  public static void main(String args[]) {
	    String str = "   Hello Geeks  .  Welcome ,    Do you love Geeks , Geeks  ? ";
	    System.out.println(str.replaceAll("\\s+"," ").trim());
	  }
	}