public class Conditionals1{
    public static void main(String args[]){
        int a=20;
        int b=40;
        // if conditional statements
        if(a<b)
        {
            System.out.println("Mininum no is a");
            if(a>b)
            {
                System.out.println("Negative no");
            }
            else
            {
                System.out.println("Positive no");
            } 
        }
        else if(a==b)
        {
            System.out.println("A and B are equal");
        }
        else
        {
            System.out.println("Maximum no is b");
        }
    }
}


