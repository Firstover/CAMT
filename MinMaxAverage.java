import java.util.Scanner;

public class MinMaxAverage {
    public static void main(String[] args) {
        double arr[] = new double[5], min = 0, max = 0, average = 0;
		Scanner input = new Scanner(System.in);
		 
		// Input
		for (int i = 0; i < arr.length; i++) {
			System.out.format("Enter Number (%d) >> ", i + 1);
			arr[i] = input.nextDouble();
		}

		// Process
		min = arr[0];
		max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min) {
				min = arr[i];
			}
			if (arr[i] >= max) {
				max = arr[i];
			}
			average += arr[i];
		}
		average /= arr.length;

		// Output
        System.out.format("Min : %.2f \nMax : %.2f \nAverage : %.2f", min, max, average);
        input.close();
    }
}