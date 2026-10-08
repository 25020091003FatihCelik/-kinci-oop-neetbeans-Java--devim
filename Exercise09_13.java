import java.util.Scanner;

public class Exercise09_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] array = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = input.nextDouble();
            }
        }

        Location loc = Location.locateLargest(array);
        System.out.println("The location of the largest element is " 
            + loc.maxValue + " at (" + loc.row + ", " + loc.column + ")");
        
        input.close();
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;

    public static Location locateLargest(double[][] a) {
        Location loc = new Location();
        loc.maxValue = a[0][0];
        loc.row = 0;
        loc.column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > loc.maxValue) {
                    loc.maxValue = a[i][j];
                    loc.row = i;
                    loc.column = j;
                }
            }
        }
        return loc;
    }
}
