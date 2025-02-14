public class Operators{
    public static void main(String args[]){
        int a =10;
        int b =12;
        // Arithmetic Operators(+,-,*,/,%)
        int c=a/b;
        int d= a%b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        //Unary Operators(a--,a++)
        a--;
        System.out.println(a);
        // Pre and post decrement operators - 2 
        int e= --a+b;
        System.out.println(e);
        //Assignment Operators(+=,-=,*=,/=)
        a-=b;
        System.out.println(a);
        //Relational Operators(<,>,<=,>=,!=,==)
        System.out.println(a<=b);
        System.out.println(a!=b);
        //Logical Operators(OR-||, AND=&&, NOT=!)
        System.out.println((a>=b)&&(a!=b));
        System.out.println(!(a>b));
        //Ternary Operator(Base upon conditions)
        int min=(a<b)?a:b;
        System.out.println("The min no is: "+min);
        //Bitwise operators(|,&,<<-left shift it moves 2 steps towards left , >> - It moves 2 steps towards right)
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a<<b);
        System.out.println(a>>b);

        System.out.println(a);
    }
}
