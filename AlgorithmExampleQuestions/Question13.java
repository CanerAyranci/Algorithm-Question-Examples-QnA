package AlgorithmExampleQuestions;

public class Question13 {
    
    // Write a method to count "aa" strings in a word
    // ( In the question it's not explained if we are going to count "aaa" String
    // as 2 "aa" or one but I'll be going to count it 2 cause we can split it like "a aa" and "aa a"
    // but dont worry after the code I'll be explaining how to do it too in a commet
    // check 49th row if you are interested)

    public static void main(String[] args) {
    
        // Declaring String
        String word = "Soaalaaast";

        // Calling method and printing result
        int result = aaCounter(word);
        System.out.println(result);
    }

    // Declaring method
    public static int aaCounter(String word){

        // Declaring an integer to count "aa" Strings
        int counter = 0;

        // For loop to reach every each char in String
        // For loop is lasting one last than word.length() cause we will be looking for the char at i
        // and the other char after i ( which is i + 1) to be aa. If we make it word.length() i + 1 is
        // goin to cause an "out of bounds" error
        for(int i=0; i<word.length() -1; i++){

            // Checking if char at i and i + 1 is 'a'
            if(word.charAt(i) == 'a' && word.charAt(i + 1) == 'a'){

                // If the condition is right counter++
                counter++;

            }

        }

        // Returning counter 
        return counter;

    }

}

    // NOTE: So if you don't want to count "aaa" as two "aa" String at the 33th row int the if
    // condition you need to add one more condition like " word.charAt(i + 2) == 'a' " but dont forget to
    // change for loops range one more less so you wont be getting " out of bounds " error