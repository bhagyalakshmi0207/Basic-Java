public class Const{
    public static void main(String[]args){
        int a=1;
        int b=16;

        for(int i=0;i*i<=b;i++){
            if(i*i>=a && i*i<=b){
            //if(i*i<a){ //- for printing the values < the numbers
                System.out.println(i*i);
            }

        }

    }
}