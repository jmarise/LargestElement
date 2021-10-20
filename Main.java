import java.util.Scanner;

public class Main {
    private static int [] LocateLargest (double [][] a, int rows, int  column){

    int [] biggestNumberPosition = new int[2];

    double max = 0;

    for (int i = 0; i < rows; i++){
        for (int j = 0; j < column; j++){
            if(a[i][j] >max ){
                max = a[i][j];
                biggestNumberPosition[0]= i;
                biggestNumberPosition[1]= j;
            }
        }

    }

    return biggestNumberPosition;

     }
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the array:");
        int rows = userInput.nextInt();
        int column = userInput.nextInt();
        double [][] array = new double[rows][column];

        System.out.printf("Enter %d rows and %d columns for the array: \n", array.length, array[0].length);

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = userInput.nextDouble();

            }
        }

        int [] results = LocateLargest(array , rows, column);



        System.out.printf("The largest number is in location: [%d][%d] ",  results[0], results[1]);



    }
}