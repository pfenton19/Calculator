import java.util.Scanner;

   public class Calculate {
       public static void main(String args[]){

           Scanner scanner= new Scanner(System.in);
           double fnum, snum, answer;
           char choice;

           System.out.println("Enter the first number:");

           fnum = scanner.nextDouble();

           System.out.println("Enter the second number:");

           snum = scanner.nextDouble();

           System.out.println("Enter a operation:");

           System.out.println("If addition press +");
           System.out.println("If subraction press -");
           System.out.println("If multiplication press *");
           System.out.println("If division press /");

           choice = scanner.next().charAt(0);

           switch(choice)
           {
               case '+':
               {
                   System.out.println("The answer is:"+ (fnum + snum));
                   break;
                }
                case '-':
                {
                    System.out.println("The answer is:" + (fnum - snum));
                    break;
                }
                case '*':
                {
                    System.out.println("The answer is:" + (fnum * snum));
                    break;
                }
                case '/':
                {
                    System.out.println("The answer is:"+ (fnum / snum));
                    break;
                }
            }
        }
    }
