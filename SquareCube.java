public class SquareCube {
public static void main(String[]args)
{
	final int LOWER=0;
	final int UPPER=10;
	
	System.out.println("Number\t\t\tSquare");
	System.out.println("\tCube");
	
	for(int i=LOWER; i!=UPPER; i++)
	{
		
		System.out.println(i+"\t\t\t"+ (int)Math.pow(1, 2));
		System.out.println("\t"+(int)Math.pow(i, 3));
	}
}
}
