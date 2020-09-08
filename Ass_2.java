//Create a menu card as calculator - select from following options
import java.util.Scanner;
public class Ass_2
{
	public static void main(String[] args)
	{
		System.out.println("*****SELECTION*****");
		System.out.println("Enter 1 : MAX VALUE");
		System.out.println("Enter 2 : MIN VALUE");
		System.out.println("Enter 3 : Square Root");
		System.out.println("Enter 4 : Cube Root");
		System.out.println("Enter 5 : A^B");
		System.out.println("Enter 6 : Integer Addition");
		System.out.println("Enter 7 : Integer Subtraction");
		System.out.println("Enter 8 : Integer Multiply");
		System.out.println("Enter 9 : Radians To Degrees");
		System.out.println("Enter 10 : Sine value");
		System.out.println("Enter 11 : Logaritherm value");
		System.out.println("Enter 12 : To Quit");

		System.out.println("Enter Your Choice : ");
		Scanner pp = new Scanner(System.in);
		int sel = pp.nextInt();

		switch(sel)
		{
			case 1: max();
					break;
			case 2: min();
					break;
			case 3: squareRoot();
					break;
			case 4: cubeRoot();
					break;
			case 5: power();
					break;
			case 6: sum();
					break;
			case 7: subtraction();
					break;
			case 8: multiply();
					break;
			case 9: toDeg();
					break;
			case 10:sine();
					break;
			case 11:logarithm();
					break;
			case 12:System.out.println("EXITING");
					System.exit(0);
					break;
			default:System.out.println("Incorrect input!!! Please re-enter choice from our menu");
		}
	}

	//Method for max
	public static void max()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = pp.nextInt();
		System.out.println("Enter the second number : ");
		int y = pp.nextInt();
		System.out.println("Maximum of two numbers is : " + Math.max(x,y));
	}

	//Method for min
	public static void min()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = pp.nextInt();
		System.out.println("Enter the second number : ");
		int y = pp.nextInt();
		System.out.println("Minimum of two numbers is : " + Math.min(x,y));
	}

	//Method for Square root
	public static void squareRoot()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = pp.nextInt();
		System.out.println("Square root of " + x + " is : " + Math.sqrt(x));
	}

	//Method for Cube root
	public static void cubeRoot()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = pp.nextInt();
		System.out.println("Cube root of " + x + " is : " + Math.cbrt(x));
	}

	//Method for Power
	public static void power()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the base number : ");
		int x = pp.nextInt();
		System.out.println("Enter the power number : ");
		int y = pp.nextInt();
		System.out.println(x + " to the power of " + y + " is : " + Math.pow(x,y));
	}

	//Method for sum
	public static void sum()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = pp.nextInt();
		System.out.println("Enter the second number : ");
		int y = pp.nextInt();
		System.out.println("Sum of the numbers is : " + Math.addExact(x,y));
	}

	//Method for subtraction
	public static void subtraction()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = pp.nextInt();
		System.out.println("Enter the second number : ");
		int y = pp.nextInt();
		System.out.println("Difference of two numbers is : " + Math.subtractExact(x,y));
	}

	//Method for multiply
	public static void multiply()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = pp.nextInt();
		System.out.println("Enter the second number : ");
		int y = pp.nextInt();
		System.out.println("Product of two numbers is : " + Math.multiplyExact(x,y));
	}

	//Method for to degrees
	public static void toDeg()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the value in radians : ");
		double x = pp.nextDouble();

		System.out.println("Value in degrees is : " + Math.toDegrees(x));
	}

	//Method for Sine
	public static void sine()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the number : ");
		double x = pp.nextDouble();
		System.out.println("Sine value of number is : " + Math.sin(x));
	}

	//Method for logarithm value
	public static void logarithm()
	{
		Scanner pp = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int x = pp.nextInt();
		System.out.println("log of number is : " + Math.log(x));
	}
}