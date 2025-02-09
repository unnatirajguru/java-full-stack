import java.util.Scanner;
class CurrConverter
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println();
 System.out.println(" **** CURRENCY CONVERTER ****");
 System.out.println();
 System.out.println("Enter the Amount(INR): ");
 float inr= sc.nextFloat();
 System.out.println();
 
System.out.println("  LIST OF CURRENCY ");
System.out.println("1. USD ");
System.out.println("2. EUR ");
System.out.println("3. GBP ");
System.out.println("4. PKR ");
System.out.println();
System.out.println(" Enter the Currency: ");
String curr=sc.next().toUpperCase();

float concurr=0;
if (curr.equals("USD")){
    concurr = inr/86.56f;
   System.out.println(inr+" INR = "+ concurr+ " USD");
}
else if (curr.equals("EUR")){
    concurr = inr/90.25f;
   System.out.println(inr+" INR = "+ concurr+ " EUR");
}
else if (curr.equals("GBP")){
    concurr = inr/107.652f;
   System.out.println(inr+" INR = "+ concurr+ " GBP");
}
else if (curr.equals("PKR")){
    concurr = inr/0.3100f;
   System.out.println(inr+" INR = "+ concurr+ " PKR");
}
else
{
 System.out.println("  INVALID OPTION   ");

}
}
}



















 
 