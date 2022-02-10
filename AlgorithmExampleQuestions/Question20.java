package AlgorithmExampleQuestions;

public class Question20 {
    
    // Write a method which checks if the integer array is in order ot not

    public static void main(String[] args) {
        
        // Declaring integer array
        int[] array = { 1, 2, 3, 9, 6, 7, 0};

        // Calling method
        orderofArray(array);

    }

    // Declaring method
    public static void orderofArray(int[] array){
        
        // Declaring a key to change the process by order situation
        boolean key = true;

        // For loop to reach each number in array
        for(int i=0; i<array.length - 1; i++){

            // If the number at i is higher than number at i + 1 this means array is not in order
            // so we are changing our key to false and breaking the loop
            if( array[i] > array[i + 1]){

                key = false;
                break;

            }

        }

        // By the key we are printing in order or not in order messages
        if(key){

            System.out.println("This array is in order");

        } else {

            System.out.println("This array is not in order");

        }
    }

}
