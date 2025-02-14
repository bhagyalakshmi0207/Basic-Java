/*public class Array2D{
    public static void main(String[] args){
        int arr[][]=new int[2][];
        arr[0]=new int[3];//row-col 1st
        arr[1]=new int[2];// row-col 2nd
        //Intializing the array
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        //Display the values of array
        System.out.println("Contents of 2D Jagged Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  
        }

    }
}
*/

public class Array2D{
    public static void main(String[] args){
        int r=4;
        int arr[][]=new int[r][];
        for(int i=0;i<arr.length;i++){
            arr[i]=new int[i+1];
        }
        
        //Intializing the array
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=count++;
            }
        }
        //Display the values of array
        System.out.println("Contents of 2D Jagged Array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();  
        }

    }
}