import java.util.Scanner;
import java.util.Random;
class RandomInRange
{
	public static void main(String[]args)
	{
		Scanner in= new Scanner(System.in);
		System.out.print("Enter the lower limit:");
		int lower= in.nextInt();
		in.nextLine();
		int upper = 0;
		new RandomInRange(lower,upper);
	}

public RandomInRange(int lower, int upper)
{
	int rng=(lower>upper)?0 : lower + new Random(System.currentTimeMillis()).nextInt((upper-lower)+1);
	System.out.println("Number generated is:" + rng);
	}
}
