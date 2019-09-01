import java.util.Scanner;

public class Factorial {

    public static int findfact(int fact) {
        return fact == 0 || fact == 1 ? 1 : fact * findfact(fact - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Factorial of : ");
	System.out.format("Factorial is %d",findfact(input.nextInt()));
	input.close();
    }
    
}
