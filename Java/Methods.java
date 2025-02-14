//returntype Functionname(parameters){}
public class Methods{
    //void=returntype; main=functionname; (String args[])=parameters
    public static void main(String args[]){
        Methods m = new Methods();
        m.sayHello();
        m.addNumbers(5,4);
        m.addNumbers(2,5);
        m.addNumbers(7,4);
        int k = m.multiplyNumbers(3,2);
        System.out.println(k);

    }
    //sayHello is a part of Methods class so we have to create a methods obj
    void sayHello(){
            System.out.println("Hello");
        }
    void addNumbers(int a ,int b){
            System.out.println(a+b);
        }
    // Written type 
    int multiplyNumbers(int a, int b){
            int x=a*b;
            return x;
        }
    
}