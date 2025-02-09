import java.util.Scanner;
class Areaofcylinder
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the radius of a cylinder:");
 float radius= sc.nextFloat();
 System.out.println("Enter the height of cylinder:");
 float height= sc.nextFloat();
 float AOCY= 22/7*radius*radius;
 System.out.println("Area of cylinder : "+AOCY);
float VOCY= AOCY*height;
System.out.println("Volume of cylinder : "+VOCY);
 }
}
