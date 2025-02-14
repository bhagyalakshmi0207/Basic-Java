public class Break{
    public static void main(String args[]){
        int i=0;
        while(i<5){
            if(i==3){
             i++;
             //break;
             continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Completed");
    }
}