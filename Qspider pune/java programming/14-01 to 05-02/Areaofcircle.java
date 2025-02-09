import java.util.Scanner;
class Areaofcircle
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a Radius(cm):");
 float radius= sc.nextFloat();
 final float pi= 22/7;
 float AOC=pi*radius*radius;
 System.out.println("Area of circle is: "+AOC);
}
}

 

 
