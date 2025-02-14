public class Strings{
    public static void main(String[]args){
        //it can be modified without creating a new object each time.
        StringBuilder a=new StringBuilder("Bhagya");
        
        //Etther we can use a StringBuilder or StringBuffer

        //StringBuffer a=new StringBuffer("Bhagya");
        a.append("Lakshmi");
        System.out.println(a);
        a.insert(0,"S.");
        System.out.println(a);
        a.replace(8,15,"Lucky");//replace(starting index,ending index,replace letters)
        System.out.println(a);
        a.delete(0,2); // delete(starting index and ending)
        System.out.println(a);
        a.reverse();
        System.out.println(a);
        System.out.println(a.toString());

    }
}