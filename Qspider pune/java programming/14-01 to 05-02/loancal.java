import java.util.Scanner;
class loancal
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("      LOAN CALCULATOR     ");
 System.out.println();
 System.out.println(" 	Enter the amount:  ");
 float amount= sc.nextFloat();
 System.out.println(" Enter the ROI ");
 float roi= sc.nextFloat();
 System.out.println(" Enter the Tenure (months): ");
 int month= sc.nextInt();
 String str= (month/12)+"."+(month%12);
 float con= Float.parseFloat(str);
 
 System.out.println();
 System.out.println("LOAN CALCULATION");
 System.out.println("Principle Amount : "+amount);
 System.out.println("ROI : "+roi + "%");
 System.out.println("Tenure : "+ month+ "month");

 float intYear= amount*roi/100;
 float totalInter= intYear*con;
 System.out.println("Interest : "+ totalInter);
 float outstanding = amount+totalInter;
 System.out.println();
 System.out.println("Total Outstanding Amount : "+(outstanding)); 
 System.out.println("Emi : "+(outstanding/month)+"rs");
}
}

 

 

 
 


 