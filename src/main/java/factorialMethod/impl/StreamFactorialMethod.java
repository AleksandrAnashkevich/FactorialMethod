package factorialMethod.impl;

import factorialMethod.FactorialMethod;

import java.math.BigInteger;
import java.util.stream.IntStream;

public class StreamFactorialMethod implements FactorialMethod {
    public BigInteger count(int n) {
        if (n < 2) {
            return BigInteger.valueOf(1);
        }
        else {
            return IntStream.rangeClosed(2, n).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
        }
    }
}
