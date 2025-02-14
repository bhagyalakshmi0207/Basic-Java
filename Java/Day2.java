import java.util.Scanner;
public class Day2{
    public static void main(String args[]){
        // String ("a") doesn't allow in char('a') only allowed.
        char ch ='b';
        int num =10;
        int p;
        System.out.println(num);
        System.out.println(ch);
        System.out.println("Bhagya Siddavatam");
        System.out.println("Variable ch is "+num);
        System.out.println("Please Enter a number");
        Scanner s = new Scanner(System.in);
        p = s.nextInt();
        System.out.println("The entered no is "+p);
    }
}    

