import java.util.Scanner;
public class TwoDArrays{
    public static void main(String args[]){
        // datatype arrayname[][]=new datatype[rows][cols]
        int arr[][]=new int[2][3];
        Scanner s=new Scanner(System.in);
        for(int i=0;i<2;i++){
            // for 2D Arrays it contains 2 loops (one is main loop and another is subloop)
            for(int j=0;j<3;j++){
               System.out.println("Entered a element at row = "+(i+1)+" and column ="+(j+1));
               arr[i][j]=s.nextInt();
               System.out.print(arr[i][j]+" "); 
            } 
        }
        
            // Here this S.o.pln() indicates the matrix format 
            System.out.println("");
        }
    }
