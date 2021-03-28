package sampleSnippets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CommonWords {


/*
# Write a function top_k_words(phrase, k) that returns the K most common words in a given phrase.
# >>> example = 'once thrice twice thrice twice thrice'
# In the example phrase above, we have "once" once, "thrice" three times, and "twice" twice.
 
# If k=1, return the most common word, in this case "thrice".
# >>> top_k_words(phrase=example, k=1)
# ['thrice']
  
# If k=2, return the two most common words in order of most common to least common.
# >>> top_k_words(phrase=example, k=2)
# ['thrice', 'twice']
  
# If k=3, return the three most common words in order of most common to least common.
# >>> top_k_words(phrase=example, k=3)
# ['thrice', 'twice', 'once']
  
# If k is greater than the number of different words, return all the words in order of most common to least common.
# >>> top_k_words(phrase=example, k=4)
# ['thrice', 'twice', 'once']
 
# What do you think is the right thing to do if k=0?
*/

static void top_k_words(String Phrases , int k){
    
    String[] inputArray = Phrases.split(" ");
    HashMap<String , Integer> hm = new HashMap<String, Integer>();
    TreeMap<Integer, ArrayList<String>> sortedMap = new TreeMap<Integer, ArrayList<String>>(); 
    List<String> result = new ArrayList<>();
    List<List<String>> result1 = new ArrayList<>();
    
    for(int i = 0 ; i < inputArray.length ; i ++ ){
        if (hm.containsKey(inputArray[i])){
            hm.put(inputArray[i], hm.get(inputArray[i])+1);
        } else{
            hm.put(inputArray[i], 1);
        }
    }
    
    for (Map.Entry<String,Integer> entry : hm.entrySet()){
        if(sortedMap.containsKey(entry.getValue())){
        	ArrayList<String> values = sortedMap.get(entry.getValue());
        	values.add(entry.getKey());
        	Collections.sort(values);
        	sortedMap.put(entry.getValue(), values);
        }else{
        	ArrayList<String> values = new ArrayList<>();
        	values.add(entry.getKey());   	
        	sortedMap.put(entry.getValue(), values);
        }
    }
    
    int numberOfElement=sortedMap.size();
    
    for (int i = 0 ; i < k ; i++){
    	result1.add(sortedMap.get(numberOfElement-i));
    	result.add(sortedMap.get(numberOfElement-i).toString());
    }  
    System.out.println("Result - " + result1); 
    System.out.println("Single List Result - " + result);
}

 public static void main(String[] args) {
        String example = "once thrice fours twice fours six thrice twice thrice fours thrice six";
        top_k_words(example, 3);
   }
}