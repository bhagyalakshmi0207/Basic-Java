import java.util.*;
public class No{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a+b>50){
            System.out.println(a-b);
        }
        else if(a+b<50){
            System.out.println(a*b);
        }else{
            System.out.println(a+b);
        }
        
    }
}