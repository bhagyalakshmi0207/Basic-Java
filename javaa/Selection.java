
import java.util.Arrays;


public class Selection{
    public static void main(String[]args){
        
        int temp=0;
        int[] n={6,3,4,2,5};
        System.out.println(Arrays.toString(n));
        for (int i = 0; i < n.length; i++) {
            int min_index=i;
            for(int j=i+1;j<n.length;j++){
                if(n[j]<n[min_index]){
                    min_index=j;
                }
            }
            temp=n[min_index];
            n[min_index]=n[i];
            n[i]=temp;
            
        }System.out.println("Selection Sort:"+Arrays.toString(n));

    }
}