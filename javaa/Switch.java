import java.util.*;
class Switch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        // switch(s){
        //     case "Mango":
        //        System.out.println("King of fruit");
        //        break;
        //     case "Apple":
        //        System.out.println("Sweeter");
        //        break;
        //     default:
        //        System.out.println("Valid fruit");
        //}


        /*This is the enhanced  version of the switch statement it has no break and it clear to see */
        switch(s){
            case "Mango" -> System.out.println("King of fruit");
            case "Apple" -> System.out.println("Sweeter");
            default -> System.out.println("Valid fruit");
        }
    }
}