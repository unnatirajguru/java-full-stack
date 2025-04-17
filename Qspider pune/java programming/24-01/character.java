import java.util.Scanner;
class character
{
public static void main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a character:");
 char ch=sc.next().charAt(0);
 String op=((ch>='A' && ch<='Z')?("Uppercase"):((ch>='a' && ch<='z'))?("Lowercase"):((ch>='0' && ch<='9'))?("Charcter"):("Special charcters"));
 System.out.print(op);

}
}