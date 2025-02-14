import java.util.*;
public class Asses{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


  // -program to find the sum of digits of a number

        int sum=0;
        int n=sc.nextInt();
        int r;
        while(n>0){
        // for (int i = 0; i <=3; i++) {
            r=n%10;
            sum=sum+r;
            n=n/10;
            
            }
            System.out.println(sum);
        

/*  // -calculator program in Java that takes 2 numbers as input and performs the operations

        int a =sc.nextInt();
        int b=sc.nextInt();
        int choice=sc.nextInt();
        switch (choice) {
            case 1:System.out.println("Addition:" + (a+b));
                break;
            case 2:System.out.println("Subraction:" + (a-b));
                break;
            case 3:System.out.println("Multiplication:" + (a*b));
                break;
            case 4:System.out.println("Division:" + (a/b));
                break;
            case 5:System.out.println("Modulus:" + (a%b));
                break;

            default:
                throw new AssertionError();
        }
*/

/*  //- program to generate fibonacci series from any two given numbers.

        int a=5;
        int b=10;
        System.out.print(a +", "+b);
        for(int i=3;i<=5;i++){
            int c=a+b;
            System.out.print(", "+c);
            a=b;
            b=c;
        }

/*  //- program to generate fibonacci series program in Java
        
        int a=0;
        int b=1;
        for(int i=1;i<=10;i++){
            int c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
*/


    }
}