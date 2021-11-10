import factorialMethod.FactorialMethod;
import factorialMethod.impl.CycleFactorialMethod;
import factorialMethod.impl.GuavaFactorialMethod;
import factorialMethod.impl.RecursionFactorialMethod;
import factorialMethod.impl.StreamFactorialMethod;


public class FactorialApplication {
    public static void main(String[] args) {
        FactorialMethod method1 = new CycleFactorialMethod();
        System.out.println(method1.count(5));
        FactorialMethod method2 = new RecursionFactorialMethod();
        System.out.println(method2.count(5));
        FactorialMethod method3 = new StreamFactorialMethod();
        System.out.println(method3.count(5));
        FactorialMethod method4 = new GuavaFactorialMethod();
        System.out.println(method4.count(5));


    }
}
