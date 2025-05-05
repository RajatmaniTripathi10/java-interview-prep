
import java.util.Scanner;

/*Coding Exercise: Longest Word Finder

You have been given an incomplete StringMagic class that contains a method findLongestWord. Your task is to complete this method.

The method should find the longest word in a given sentence. It receives a sentence as a string input and returns the longest word as a string output.

In case the sentence is empty, the method should return an empty string.

Here is the method signature:

public String findLongestWord(String sentence)


Example 1: Consider a sentence: "A quick brown fox jumps over the lazy dog". "quick" is the longest word with a length of 5.

Example 2: Consider a sentence: "Java is an object oriented programming language" function should return "programming". 
*/

public class findLongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Longest Word : "+longest(str));
    }   
    public static String longest(String str){
        if(str==null || str.isEmpty()){
            return "";
        }
        String [] words=str.split(" ");
        String longestWord="";
        for(String word:words){
            if(word.length()>longestWord.length()){
                longestWord=word;
            }
        }
        return longestWord;
    }
}
