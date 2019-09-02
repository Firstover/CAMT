// import java.util.*;

// public class AllCode {

// 	public static void clearScreen() {

// 		for (int i = 0; i <= 50; i++) {
// 			System.out.println();
// 		}

// 	}

//	public static int max(int x, int y) {
//		return x>y?x:y;
//	}

//	public static int AI(int x) {
//		return x==0?1:2*AI(x-1);
//	}

// 	public static int aaa(int x) {
// 		return x == 0 || x == 1 ? 1 : x * aaa(x - 1);
// 	}

// 	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		System.out.print(aaa(input.nextInt()));
// 		input.close();

//		clearScreen();
//		Scanner input = new Scanner(System.in);
//		System.out.format(">> %d", AI(input.nextInt()));
//		input.close();

//		clearScreen();
//		Scanner input = new Scanner(System.in);
//		System.out.format("Largest Number is %d", max(input.nextInt(), input.nextInt()));
//		input.close();

//		double radius[] = new double[5];
//		double area[] = new double[5];
//		Scanner input = new Scanner(System.in);
//		clearScreen();
//		for (int i = 0; i < radius.length; i++) {
//			System.out.format("      Enter Radius (%d) >> ", i + 1);
//			radius[i] = input.nextDouble();
//			area[i] = radius[i]*radius[i]*Math.PI;
//		}
//		clearScreen();
//		System.out.println("****************************************");
//		for (int i = 0; i < radius.length; i++) {
//
//			System.out.format("\n     Area of Radius %.2f is %.3f", radius[i], area[i]);
//		}
//		System.out.println("\n\n****************************************");
//		input.close();

//		double arr[] = new double[5], min = 0, max = 0, average = 0;
//		Scanner input = new Scanner(System.in);
//		 
//		// input
//		for (int i = 0; i < arr.length; i++) {
//			System.out.format("Enter Number (%d) >> ", i + 1);
//			arr[i] = input.nextDouble();
//		}
//
//		// process
//		min = arr[0];
//		max = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] <= min) {
//				min = arr[i];
//			}
//			if (arr[i] >= max) {
//				max = arr[i];
//			}
//			average += arr[i];
//		}
//		average /= arr.length;
//
//		// output
//		System.out.format("Min : %.2f \nMax : %.2f \nAverage : %.2f", min, max, average);

//		int[] arr = { 0, 11, 2, 33, 4, 55, 6, 77, 8, 99 };
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
//
//		// code--------------------------------
//		int[] temp = new int[10];
//		for (int i = 0; i < arr.length; i++) {
//			temp[i] = arr[(arr.length - 1) - i];
//		}
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = temp[i];
//		}
//		// code--------------------------------
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

//		Scanner input = new Scanner(System.in);
//		int a = input.nextInt();
//		String[] b = new String[a];
//		for (int i = 1; i <= b.length; i++) {
//			System.out.print("Enter Num " + i + " >> ");
//			b[i - 1] = input.next();
//		}
//		System.out.print("[");
//		for (int i = 0; i < b.length; i++) {
//			System.out.print(b[i] + ",");
//		}
//		System.out.print("]");
//		input.close();

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter : ");
//		int n = input.nextInt();
//		for (int counter = 1; counter <= n; counter++) {
//			if (n % counter == 0) {
//				System.out.println(counter);
//			}
//		}
//		int counter = 1;
//		while (counter <= n) {
//			if (n % counter == 0) {
//				System.out.println(counter);
//			}
//			counter++;
//		}

//		Scanner input = new Scanner(System.in);
//		int n = 0;
//		int temp = (int)(1000*Math.random());
//		System.out.println(temp);
//		for(int count = 1; count <= 3; count++) {
//			System.out.print("Enter guess number "+ count + ": ");
//			n = input.nextInt();
//			if(n < temp) {
//				System.out.println("You number too small");
//			}
//			if(n > temp) {
//				System.out.println("You number too large");
//			}
//			if(n == temp) {
//				System.out.println("You guess correct!");
//				break;
//			}
//		}

//		Random rand = new Random();
//		int n = 0;
//		n = rand.nextInt(50);
//		for(int count = 0; count < 5; count++) {
//			n = rand.nextInt(50);
//			System.out.println(n);
//			System.out.println((int)(100*Math.random()));
//			System.out.println("");
//		}

//		try {
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter Power of 2 : ");
//			double num = input.nextInt();
//			double temp = 2;
//			int i = 1;
//			for (; i < num; i++) {
//				temp *= 2;
//			}
//			System.out.println("For Output : " + temp);
//			while (i < num) {
//				temp *= 2;
//				i++;
//			}
//			System.out.println("While Output : " + temp);
//		} catch (Exception e) {
//			System.out.println("Invalid Input");
//		}

//		try {
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter Number : ");
//			double num = input.nextInt();
//			double temp = 1;
//			int a = 1;
//			for (; a <= num; a++) {
//				temp *= a;
//			}
//			System.out.println("For : " + temp);
//			
//			a = 1;
//			temp = 1;
//			while(a <= num) {
//				temp *= a;
//				a++;
//			}
//			System.out.println("While : " + temp);
//		} catch (Exception e) {
//			System.out.println("Invalid");
//		}

//		try {
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter Number Min : ");
//			int a = input.nextInt();
//			System.out.print("Enter Number Max : ");
//			int max = input.nextInt();
//			int temp = 0;
//			for (; a <= max; a++) {
//				temp += a;
//			}
//			System.out.println("Total Number : " + temp);
//		} catch (Exception e) {
//			System.out.println("Invalid Input");
//		}

//		try {
//			int c1 = 0, c2 = 0;
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter Star : ");
//			int max = input.nextInt();
//			for (c1 = 1; c1 <= max; c1++) {
//				for (c2 = 1; c2 < c1; c2++) {
//					System.out.print(" ");
//				}
//				System.out.println(c1);
//			}
//		} catch (Exception e) {
//			System.out.println("Invalid Input");
//		}

//		try {
//			int c1 = 0, c2 = 0;
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter Star : ");
//			int max = input.nextInt();
//			while (c1 < max) {
//				c2 = 0;
//				while (c2 <= (max-c1-1)) {
//					System.out.print("*");
//					c2++;
//				}
//				System.out.println();
//				c1++;
//			}	
//			input.close();
//		} catch(Exception e) {
//			System.out.println("Invalid Input");
//		}

//		Scanner input = new Scanner(System.in);
//		int sum = 0;
//		int count = 1;
//		while(true) {
//			for(int i = 1; i<=10; i++) {
//				System.out.print("(Sum : " + sum + ") Please Enter Integer " + i + ": ");
//				sum += input.nextInt();
//				if(sum >= 50) {
//					break;
//				}
//			}
//			if(sum >= 50) {
//				break;
//			} else {
//				sum = 0;
//			}
//		}
//		System.out.println("Sum is " + sum);

//		double n;
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter Guess Number : ");
//		n = input.nextDouble();
//		while(true) {
//			System.out.print("Enter Again : ");
//			n = input.nextDouble();
//			if(n == 9) {
//				break;
//			}
//		}
//		System.out.println("Oh nice!");

//		double income = 0.0, tax = 0.0;
//		Scanner input = new Scanner(System.in);
//
//		System.out.print("Please enter income : ");
//		income = input.nextDouble();
//		// -----------------------------------------------------------
//		if (income <= 100000) {
//			tax += income * 0.05;
//		} else {
//			tax += 100000 * 0.05;
//			income -= 100000;
//			if (income <= 100000) {
//				tax += income * 0.1;
//			} else {
//				tax += 100000 * 0.1;
//				income -= 100000;
//			} 
//		} 
//		
//		
//		// ----------------------
//
//		System.out.println("You have to pay tax : " + tax);

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter Score : ");
//		double score = input.nextDouble();
//		if(score > 100) {
//			System.out.println("You hacked Score!");
//		} else if(score >= 80) {
//			System.out.println("A");
//		} else if(score >= 70) {
//			System.out.println("B");
//		} else if(score >= 60) {
//			System.out.println("C");
//		} else if(score >= 50) {
//			System.out.println("D");
//		} else if(score < 50 && score >= 0) {
//			System.out.println("F");
//		} else {
//			System.out.println("Your Score got hacked!");
//		}

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter User (student) or (staff) >> ");
//		String typeofUser = input.next();
//		double totalprice;
//		double netprice;
//		switch (typeofUser) {
//		case "student":
//			System.out.print("Please Enter Total Price : ");
//			totalprice = input.nextDouble();
//			netprice = totalprice*0.9;
//			System.out.println("Net Price : " + netprice);
//			break;
//		case "staff":
//			System.out.print("Please Enter Total Price : ");
//			totalprice = input.nextDouble();
//			netprice = totalprice*1.05;
//			System.out.println("Net Price : " + netprice);
//			break;
//		default:
//			System.out.println("No Matches User");
//		}

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter your Score >> ");
//		double score = input.nextDouble();
//		if (score > 100) {
//			System.out.println("Error");
//		}
//		if (score > 60 && score <= 100) {
//			System.out.println("You Pass!");
//		}
//		if (score <= 60 && score >= 0) {
//			System.out.println("You Fail!");
//		}
//		if (score < 0) {
//			System.out.println("Error");
//		}

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter (1-100) >> ");
//		int a = input.nextInt();
//		int[] arr = new int[a];
//		int result;
//		for(int i = 1;i<=a;i++) {
//			System.out.print("Enter Num " + i + " >> ");
//			arr[i-1] = input.nextInt();
//		}
//		
//		for(int j = 0;j<arr.length;j++) {
//			for(int k = j + 1;k<arr.length;k++) {
//				int temp = 0;
//				if(arr[j]>arr[k]) {
//					temp = arr[j];
//					arr[j]= arr[k];
//					arr[k] = temp;
//				}
//			}
//		}
//		for(int l =0;l<arr.length;l++) {
//			System.out.print(arr[l]+" ");
//		}
//		

//		Scanner input = new Scanner(System.in);
//		double totalCredit = 0;
//		double totalScore = 0;
//		double GPA = 0;
//		double[] arr = new double[5];
//		int c = 0;
//		
//		for (int i = 0; i < 5; i++) {
//			if (c == 0) {
//				System.out.print("Enter Thai Grade >> ");
//				arr[i] = input.nextDouble() * 3;
//			} else if (c == 1) {
//				System.out.print("Enter English Grade >> ");
//				arr[i] = input.nextDouble() * 3;
//			} else if (c == 2) {
//				System.out.print("Enter Society Grade >> ");
//				arr[i] = input.nextDouble() * 3;
//			} else if (c == 3) {
//				System.out.print("Enter Math Grade >> ");
//				arr[i] = input.nextDouble() * 3;
//			} else if (c == 4) {
//				System.out.print("Enter Chemistry Grade >> ");
//				arr[i] = input.nextDouble() * 2;
//			}
//			totalScore = totalScore + arr[i];
//			c++;
//		}
//
//		totalCredit = 3 + 3 + 3 + 3 + 2;
//		GPA = totalScore / totalCredit;
//
//		System.out.println("\nYour GPA is " +GPA);
//		if(GPA >= 4) {
//			System.out.println("A");
//		} else if(GPA >= 3) {
//			System.out.println("B");
//		} else if(GPA >= 2) {
//			System.out.println("C");
//		} else if(GPA >= 1) {
//			System.out.println("E");
//		} else {
//			System.out.println("F");
//		}

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter Product Price >> ");
//		float price = input.nextFloat();
//		float tax = 0.07f;
//		float pricextax = price + price * tax;
//		System.out.println("\n\n***********************************************\n");
//		System.out.println("  Product Price is " + price + " baht");
//		System.out.println("  Product Price include tax is " + pricextax + " baht");
//		System.out.println("\n***********************************************\n");

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter FirstName >> ");
//		String First = input.next();
//		System.out.print("Enter LastName >> ");
//		String Last = input.next();
//		System.out.print("Enter Age >> ");
//		int Age = input.nextInt();
//		System.out.print("Enter Birthday >> ");
//		String Birth = input.next();
//		System.out.print("Enter School >> ");
//		String School = input.next();
//		System.out.println("\n\n*******************************************\n");
//		System.out.println("	Name : " + First + " " +Last);
//		System.out.println("	Age : " + Age);
//		System.out.println("	Birthday : " + Birth);
//		System.out.println("	School : " + School);
//		System.out.println("\n*******************************************");

//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter Radius >> ");
//		float r = input.nextFloat();
//		float pi = 3.14f;
//		System.out.println("\n\n*******************************************\n");
//		System.out.println("   Area of Circle with r as " + r + " is " + pi * r * r);
//		System.out.println("\n*******************************************");
//		int num1 = 1;
//		int num2 = 1;
//		int temp = 0;
//		for(int i = 0; i <= 5; i++) {
//			temp = num1;
//			num1 = num2;
//			num2 = num1 + temp;
//			System.out.print(temp + " ");
//		}
	

