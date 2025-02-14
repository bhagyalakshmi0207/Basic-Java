
import java.util.Arrays;

public class Bubble{
    public static void main(String[]args){
        
        int temp=0;
        int[] n={6,3,4,2,5};
        System.out.println(Arrays.toString(n));
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length-1-i;j++){
                if(n[j]>n[j+1]){
                   temp = n[j];
                   n[j]=n[j+1];
                   n[j+1]=temp;

                }
            }
        }System.out.println("Bubble sort:"+ Arrays.toString(n));
    }
}

//Bubblesort time complexity - O(n^2)