import java.util.Scanner;
import java.util.Random;
public class RandomInRange
{
     public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in); 
        
        System.out.print("Enter lower limit : ");
        int lower = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter upper limit : ");
        int upper = sc.nextInt();
        sc.nextLine();

        
        new RandomInRange(lower, upper); 
     } 
     
     public RandomInRange(int lower, int upper) 
     {
     
           int range = (lower > upper) ? 0 : lower + new Random(System.currentTimeMillis()).nextInt((upper - lower) + 1);
           
           System.out.println("The Random Number is : " + range); 
     } 
    } 
