import java.util.Scanner;
class CtoF
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a temperature in celsius");
 float celsius=sc.nextFloat();
 float F=(9/5)*celsius+32;
 System.out.println("Celsius to Fahrenheit: "+F);
}
}

 


 