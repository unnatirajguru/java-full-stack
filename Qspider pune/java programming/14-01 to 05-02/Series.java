import java.util.Scanner;
class Series
{
 public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println("Series of ALPHABETS");
 int a=1;
 for(char ch='A';ch<='Z';ch+=a)
 {
  System.out.println("characters: "+ch);
  a++;
}
}
}
