package AlgorithmExampleQuestions;

public class Question10 {
    
    // Write a method which returns parameter String reversed.

    public static void main(String[] args) {
        
        // Declaring String
        String word = "Solast";
        
        // Calling method and printing result
        String result = reverser(word);
        System.out.println(result);

    }

    // Declaring method
    public static String reverser(String word){

        // We are declaring a String here to put chars inside it one by one
        String reversedWord = "";
        
        // Opening a for to pick chars in the word
        for(int i=0; i<word.length(); i++){

            // Filling the blank String with char by char
            // Cause of we are adding next char front of the old one word is being reversed
            reversedWord = word.charAt(i) + reversedWord;

        }

        // Returning reversed version of word
        return reversedWord;

    }

}
