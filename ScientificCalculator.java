import java.util.*;

class ScientificCalculator{
	public static void main(String agrs[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Select operation that you want to do.\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n");
		int n = sc.nextInt();

		System.out.println("Enter the 1st number.");
		int x = sc.nextInt();
		System.out.println("Enter the 2nd number.");
		int y = sc.nextInt();

		switch(n){
			case 1:
				System.out.println(addition(x,y));
				break;
			case 2:
				System.out.println(subtraction(x,y));
				break;
			case 3:
				System.out.println(multiplication(x,y));
				break;
			case 4:
				System.out.println(division(x,y));
				break;
			case 5:
				System.out.println(remainder(x,y));
				break;
		}

	}

	static int addition(int x, int y){
		return x+y;
	}

	static int subtraction(int x, int y){
		return x-y;
	}

	static int multiplication(int x, int y){
		return x*y;
	}

	static int division(int x, int y){
		return x/y;
	}

	static int remainder(int x, int y){
		return x%y;
	}
}