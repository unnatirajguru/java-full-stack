import java.util.Scanner;
class vowels
{
 public static void  main(String[]args)
{
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter a vowel");
 char ch= sc.next().charAt(0);
 String op=(ch=='a'  || ch=='e'|| ch=='i'||ch=='o'|| ch=='u')?("character is vowel"):("charater is consonant");
 System.out.println(op);
}
}