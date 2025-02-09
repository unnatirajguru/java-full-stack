import java.util.Scanner;
class BMI
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a  weight(kg): ");
 double Weight= sc.nextFloat();

 System.out.println("Enter a height(m): ");
 double height= sc.nextFloat();
 double kg= Weight*0.45359237;
 double h1= height*0.0254;
 double BMI= kg/(h1*h1);
System.out.println("BMI is: "+BMI);
  
}
}