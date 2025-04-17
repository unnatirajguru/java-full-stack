import java.util.Scanner;
class calculatetips
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter the bill: ");
 float bill= sc.nextFloat();
 System.out.println("Enter the Tiprate: ");
 float Tiprate= sc.nextFloat();
 float ST= bill*Tiprate/100;
 float totalbill=bill+Tiprate;
System.out.println("total bill: "+totalbill);
System.out.println("Tiprate: "+Tiprate);


}
}



 