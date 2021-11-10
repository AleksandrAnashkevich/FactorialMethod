package factorialMethod.impl;

import factorialMethod.FactorialMethod;

import java.math.BigInteger;

public class CycleFactorialMethod implements FactorialMethod {
    public BigInteger count(int n) {
        long value = 1;
        for (int i = 2; i <= n; i++) {
            value = value * i;
        }
        return BigInteger.valueOf(value);
    }
}
