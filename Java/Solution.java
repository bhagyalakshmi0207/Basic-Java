import java.util.Scanner;
class Solution{
	
    public static void main(String args[]) {
		char ch;
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		if(ch>='A'&& ch<='Z')
		{
			System.out.println(1);
		}
		else if(ch>='a' && ch<='z'){
			System.out.println(0);
		}
		else{
			System.out.println(-1);
		}	
	}
}