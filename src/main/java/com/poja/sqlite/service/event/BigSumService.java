package com.poja.sqlite.service.event;
public class BigIntegerService {

    public BigInteger addBigIntegers(String num1, String num2) {

        BigInteger bigInteger1 = new BigInteger(num1);
        BigInteger bigInteger2 = new BigInteger(num2);

        return bigInteger1.add(bigInteger2);
    }
}
