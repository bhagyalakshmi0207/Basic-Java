import java.util.*;
public class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int n=sc.nextInt();
        boolean isprime =true;
        if(n<2){
            isprime= false;
        }
        for(int i=2;i<n;i++){
            if (n%i==0)
            {
                isprime=false;
                break;
            }
        }
       
        if(isprime){
            System.out.println("Prime");
        }else{
            System.out.println("Not a Prime");

        }
    }
}

