package org.example;


public class MainIterator {
    public static void main(String[] args) {

        ILogger logger = LoggerDC.getInstance();

//        MyIterator<Integer> myIterator = new Randoms(10, 10_000_000).iterator();
//
//        while (myIterator.hasNext()) {
//            int r = myIterator.next();
//            logger.log("Случайное число: " + r);
//
//            if (r == myIterator.next()) {
//                logger.log("Дважды выпало число " + r + ", давайте на этом закончим");
//                break;
//            }
//        }


        for (int r : new Randoms(10, 1000)) {
            logger.log("Случайное число: " + r);
            if (r == 100) {
                logger.log("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}