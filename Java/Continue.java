public class Continue{
    public static void main(String args[]){
        int i=0;
        while(i<3){
            if(i==1){
            // wether we have to place the i++ here because for continue the loop 
              i++;
              continue;
            }
            System.out.println(i);
            // In the absence of this i++ here it will show the same output
            i++;
        }
        System.out.println("After loop");
    }
}
//for(int i=0; i<5; i++){
// if(i==2){
//break; (or) continue;
// S.O.P(i);
//}
//S.O.P("After loop");}