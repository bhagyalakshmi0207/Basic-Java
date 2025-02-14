public class Conditionals2{
    public static void main(String args[]){
        int a = -54;
        int b = 55;
       
        System.out.println(a + " " + b); 
        // Switch statements
        switch(a+b)
        {
            case 0:System.out.println("The sum is Zero");
            break;
            case 1:System.out.println("The sum is One");
            break;
            case 2:System.out.println("The sum is Eighty Nine");
            break;
            default:System.out.println("No values");
            break;
        }
    }
}