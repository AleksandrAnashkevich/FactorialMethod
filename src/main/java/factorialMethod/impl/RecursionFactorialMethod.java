package factorialMethod.impl;

import factorialMethod.FactorialMethod;

import java.math.BigInteger;

public class RecursionFactorialMethod implements FactorialMethod {
    public BigInteger count(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        return BigInteger.valueOf(n).multiply(count(n - 1));
    }
}
