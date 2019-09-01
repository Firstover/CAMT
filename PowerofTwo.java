import java.util.Scanner;

public class PowerofTwo {

    public static int p(int power) {
        return power == 0 ? 1 : 2 * p(power - 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
	System.out.format("Result is %d",p(input.nextInt()));
	input.close();
    }
    
}
