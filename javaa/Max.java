import java.util.*;
class Max{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={5,34,56,76,1};
        int n=arr.length;
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            }
            System.out.println(max);
        }
        
    }
