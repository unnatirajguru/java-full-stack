import java.util.Scanner;
class Season
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter a Month: ");
 String mon= sc.next();
 String result=(mon.equals("jan")||mon.equals("dec")||mon.equals("nov")||mon.equals("oct"))?("Winter"):
               ((mon.equals("feb")||mon.equals("mar")||mon.equals("apr")||mon.equals("may")))?
               ("Summer"):((mon.equals("jun")||mon.equals("july")||mon.equals("aug")||mon.equals("sep")))?("Monsoon"):("Invalid");
 System.out.print(result);

 }
}