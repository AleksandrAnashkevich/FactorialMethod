package factorialMethod.impl;

import com.google.common.math.BigIntegerMath;
import factorialMethod.FactorialMethod;

import java.math.BigInteger;

public class GuavaFactorialMethod implements FactorialMethod {
    @Override
    public BigInteger count(int n) {
        return BigIntegerMath.factorial(n);
    }
}
