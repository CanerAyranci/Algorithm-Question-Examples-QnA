package AlgorithmExampleQuestions;

public class Question18 {
    
    // Write a method which calculates the addition of numbers in an array

    public static void main(String[] args) {
        
        // Declaring integer array
        int[] array = { 1, 2, 3,};

        // Calling our method and printing result
        int result = addArray(array);
        System.out.println(result);

    }

    // Declaring method
    public static int addArray(int[] array){

        // Declaring an integer method to hold addition of numbers in array
        int addition = 0;

        // For loop to reach every number inside the array
        for(int i=0; i<array.length; i++){

            // Addition of array elements
            addition += array[i];

        }

        // Returning the addition
        return addition;

    }

}
