import java.util.Scanner;
public class methods {
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
 
   System.out.println("Enter the first number: ");
   int num1 = input.nextInt();

   System.out.println("Enter the second number: ");
   int num2 = input.nextInt();

   System.out.println("Enter the third number: ");
   int num3 = input.nextInt();
   
   findLargestSmallest(num1, num2, num3);
  }

  public static void findLargestSmallest(int num1, int num2, int num3){
   int largest = num1, smallest = num1;

   if (num2 > largest){
      largest = num2;
   }

   if (num3 > largest){
      largest = num3;
   }

   if (num2 > smallest){
      largest = num2;
   }

   if (num3 > smallest){
      largest = num3;
   }

   System.out.println("The smallest number: " + smallest);
   
   System.out.println("The largest number: " + largest);
  
   System.out.println(largest + " is your largest number and " + smallest + " is your smallest number.");
  }
}
  