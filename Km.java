import java.util.Scanner;
public class Km
{
  public static void main(String args[])
   {
     int kmph;
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value");
     kmph = sc.nextInt();

    float mph = (kmph*0.6213712f);
   
     System.out.println("mph =" + mph);
   }
} 