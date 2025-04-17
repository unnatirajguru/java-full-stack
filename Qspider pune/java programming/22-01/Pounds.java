import java.util.Scanner;
class Pounds
{ 
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the no. of pounds");
 double pounds=sc.nextDouble();
 double kg= pounds*0.454;
 System.out.println("kilograms are"+kg);
}
}
