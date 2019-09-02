import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        double radius[] = new double[5];
		double area[] = new double[5];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < radius.length; i++) {
			System.out.format("      Enter Radius (%d) >> ", i + 1);
			radius[i] = input.nextDouble();
			area[i] = radius[i]*radius[i]*Math.PI;
		}

		for (int i = 0; i < radius.length; i++) {
			System.out.format("\n     Area of Radius %.2f is %.3f", radius[i], area[i]);
		}
		input.close();

    }
}