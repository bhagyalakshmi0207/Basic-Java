

 // Array index position allocation
public class Arrays{
    public static void main(String[] args) {
        // int[] arr=new int[10];
        int[] arr={2,3,5};
        arr[0]=7;
        System.out.println(arr[0]);
        System.out.println(java.util.Arrays.toString(arr)); // for printing an array we use Arrays.toString() method
    }
}
 
/* 
public class Arrays{
    public static void main(String[]args){
        int val=1;
        int[] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=val; 
             System.out.println(arr[i]); // printing the element upto 10 times
        }
       // Example: printing the first element
         //System.out.print(arr[0]);  

    }
}
    */

// public class Arrays{
//     public static void main(String[] args) {
//         // int[] arr=new int[10];
//         int[] ar={2,3,5};
//         for (int i = 0; i < ar.length; i++) {    
//             System.out.print(ar[i]+" ");
//         }
//     }
// }
