import java.util.*;
interface AdvancedArithmetic{
//public is by default here...
  public int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{

    //mandatory to write public access modifier when overriding interface's function
    public int divisor_sum(int n){
        int total_sum = 0;
        int temp_n = n;
        int i = 1;
        total_sum = temp_n+i;
        
        for(i=2;i<temp_n;i++){
            if(n%i==0){
                temp_n = n/i;
                total_sum+=temp_n+i;
            }
        }
        return total_sum;
    }
}

public class FactorSum      {
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

