import java.util.Scanner;
class Findyears
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter no. of minutes");
 long minutes= sc.nextLong();
 long days= minutes/1440;
 System.out.println("days are: "+days);
 long year=days/365;
 System.out.println("years are: "+year);
}
}	