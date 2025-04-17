import java.util.Scanner;
class Productofdigits
{
    public static void main(String[]args)
       {
              int num =3456;
              int mul=1;
              int rem=num%10;
              mul=mul*rem;
              num = num/10;
 
             rem =num%10;
             mul = mul*rem;
             num = num/10;
        
            
             rem =num%10;
             mul = mul*rem;
             num = num/10;
        
              
             rem =num%10;
             mul= mul*rem;
             num = num/10;
 System.out.println("mul is:"+ mul);
}
}
