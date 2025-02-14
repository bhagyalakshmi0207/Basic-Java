/*  import java.util.*;
public class Factorial{
    //functions for factorial values

    public static void Factoria(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;  
        }System.out.println(fact);
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Factoria(n);
    
    }

}

/*  //factorial - n(n-1)(n-2).... Simple factorial 
       
        //int n=5;
        int fact=1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
            //System.out.println(fact);  // for all the elements upto the value
        }
        System.out.println(fact);     // for only the single element
    }

}
*/ 

//Add of two numbers using functions
import java.util.*;
public class Factorial{
    public static int Add/*prod*/(int a, int b){
        int c=a+b;
        //int c= a*b;  //- For Multiplication
        return c;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //int c=Add(a,b);
        //System.out.println(c);
        System.out.println("The addition of 2 no is:" + Add(a,b));
        //System.out.println("The product of 2 no is:" + prod(a,b));


    }

}