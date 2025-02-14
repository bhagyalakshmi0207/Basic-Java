import java.util.Scanner;
public class Arrays{
    public static void main(String args[]){
        // Syntax
        //datatype arrayname[]; (or) datatype[] arrayname;
        //datatype arrayname[]=new datatype[size]; - Object Syntax
        int arr[]=new int[10];
        Scanner s= new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter the marks"+(i+1));
            arr[i]=s.nextInt();
            System.out.println(arr[i]+" ");
        }
        
    }
}
//Functions - 4 (Arrays used in 4 func)
//1.returntype(datatype[]) - int[] fun{}
//2.Parameters (datatype name[]) - void fun(int arr[]){}
//3.passing parameters(name[]) - fun(arr){}
//4.receiving return data(datatype name[]) - int brr[]=fun()