package sampleSnippets;

class MagicNumbers 
{ 
   public static boolean isMagic(int n) 
   { 
       int sum = 0; 
       
       // Note that the loop continues  
       // if n is 0 and sum is non-zero. 
       // It stops when n becomes 0 and 
       // sum becomes single digit. 
       while (n > 0 || sum > 9) 
       { 
           if (n == 0) 
           { 
        	   System.out.println("1");
               n = sum; 
               sum = 0; 
           } 
           System.out.println("Before Sum Value - " + sum);
           sum += n % 10; 
           System.out.println("After Sum Value - " + sum);
           System.out.println("Before n value - " + n);
           n /= 10;
           System.out.println("After n value - " + n);
       } 
       
       // Return true if sum becomes 1. 
       return (sum == 1); 
   } 
    
   // Driver code 
   public static void main(String args[]) 
    { 
     int n = 19; 
     if (isMagic(n)) 
        System.out.println("Magic Number"); 
           
     else
        System.out.println("Not a magic Number"); 
    } 
} 
