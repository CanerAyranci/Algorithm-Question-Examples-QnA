package AlgorithmExampleQuestions;

import java.util.UUID;

public class Question11 {
    
    // Write a method which turns lowercases into uppercases in a String
    
    // Before we start to achive writing this kind of methods you should
    // memorize ASCİİ values of chars
    // In ASCİİ table uppercases are between 64-91
    // In ASCİİ table lowercases are between 96-123
    // So make the lowercases uppercases you should know the ASCİİ value
    // difference between them is "32"

    public static void main(String[] args) {
        
        // Declaring String
        String word = "Solast";

        // Calling our method and printing result
        String result = uppercaser(word);
        System.out.println(result);

    }

    // Declaring method
    public static String uppercaser(String word){

        // Declaring a String to hold uppercase version of word
        String uppercaseWord = "";

        // Declaring for loop to reach each char in word
        for(int i=0; i<word.length(); i++){

            // Checking if the char is lowercase or uppercase
            if(word.charAt(i) > 96 && word.charAt(i) < 123){

                // If the char is lowercase we are making it uppercase

                // HOW: So first you have to change char type to int by using (int) front of the varaible
                // then we are lowering its value by 32 to make the value same letters uppercase value
                // after setting the value we use (char) front of that value to tell the computer that we are going to use
                // the char which has that ASCİİ value and add it to our String
                
                char letter = (char) ( (int) word.charAt(i) - 32);
                uppercaseWord += letter;

            } else {

                //If the char is already uppercase without any process we are directly adding char to our String
                uppercaseWord+=word.charAt(i);

            }

        }

        // Returning uppercase version of word
        return uppercaseWord;

    }

}


    // NOTE: If you are looking for changing lowercases to uppercase, uppercases to lowercase it's actually the same procces
    // only difference is at the 49th row in else part we are adding chars value 32 to make it lowercase and returning the new String