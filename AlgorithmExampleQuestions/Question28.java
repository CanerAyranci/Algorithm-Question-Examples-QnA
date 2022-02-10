package AlgorithmExampleQuestions;

public class Question28 {
    
    // Write a method which calculates the addition of every elements row by row

    public static void main(String[] args) {
        
        // Declaring matrix
        int[][] matrix = { { 1, 2, 3} , { 1, 3, 6} };

        // Calling our method
        addRow(matrix);

    }

    // Declaring method
    public static void addRow(int[][] matrix){

        // Declaring an integer varaible to hold addition
        int addition = 0;

        // For loop for rows
        for(int i=0; i<matrix.length; i++){

            // For loop for columns
            for(int j=0; j<matrix[0].length; j++){

                // Calculating additions
                addition += matrix[i][j];

            }

            // After every row we are printing the addition and setting the value back to 0 for next row
            System.out.println(addition);
            addition = 0;

        }

    }

}
