import java.util.Scanner;
class Areaofrectangle
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a length(cm):");
 float length= sc.nextFloat();
 System.out.println("Enter a breadth(cm):");
 float breadth= sc.nextFloat();
 float AOR= length*breadth;
 System.out.println("Area of rectangle: "+AOR);
 }
}
  
