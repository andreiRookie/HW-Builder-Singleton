package org.example;

public class BinOpsImpl implements BinOps {

    private ILogger logger = LoggerLazy.getInstance();
    @Override
    public String sum(String a, String b) {
        int aAsInt = Integer.parseInt(a, 2);
        logger.log("String: \'" + a + "\' as int: \'" + aAsInt + "\'");

        int bAsInt = Integer.parseInt(b, 2);
        logger.log("String: \'" + b + "\' as int: \'" + bAsInt + "\'");

        int sum = aAsInt + bAsInt;
        String result = Integer.toBinaryString(sum);
        logger.log("Sum: \'" + sum + "\' as String: \'" + result + "\'");

        return result;
    }

    @Override
    public String mult(String a, String b) {
        int aAsInt = Integer.parseInt(a, 2);
        logger.log("String: \'" + a + "\' as int: \'" + aAsInt + "\'");

        int bAsInt = Integer.parseInt(b, 2);
        logger.log("String: \'" + b + "\' as int: \'" + bAsInt + "\'");

        int mult = aAsInt * bAsInt;
        String result = Integer.toBinaryString(mult);
        logger.log("Mult: \'" + mult + "\' as String: \'" + result + "\'");

        return result;
    }
}
