import java.util.*;
public class Table{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        /* 
        int sum=0;
    //for natural numbers
        for(int i=1;i<=n;i++){
           sum=sum+i;
        }
        System.out.println(sum);  
        */
        
    //tables in java
        for(int i=1;i<=10;i++){
            //System.out.println(n*i);
            System.out.println(n +" * " +i + " = "+n*i );
        }

    }
}