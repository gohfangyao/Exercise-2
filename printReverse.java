import java.util.Scanner;
class PrintReverse
{
	public static void main(String[]args)
	{
		System.out.print("Enter a string to be reversed:");
		new PrintReverse(new Scanner(System.in).nextLine());
	}

public PrintReverse(String raw)
{
	for(int i= raw.length()-1; i>=0; i--)
		System.out.print(raw.charAt(i));
	System.out.println();
}
}
