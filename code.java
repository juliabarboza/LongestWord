import java.util.*; 
import java.io.*;

class Main {  
  public static String LongestWord(String sen) { 
  
  
    int biggestword = 0;
    String theword = "";
   String[] splitword = sen.replaceAll("[^a-zA-Z1-9 ]", "").split(" ");
    for (int i = 0; i < splitword.length; i++)
    {
        if(biggestword < splitword[i].length())
        {
            biggestword = splitword[i].length();
        }
    }
    for (int i = 0; i < splitword.length; i++)
    {
        if (splitword[i].length() == biggestword)
        {
            return splitword[i];
            
        }
    }
    
    return sen;
   
    
    
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LongestWord(s.nextLine())); 
  }   
  
}
