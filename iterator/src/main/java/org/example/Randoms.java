package org.example;

import org.example.iterrible.Iterrible;
import java.util.Random;
import org.example.iterrible.MyIterator;

public class Randoms implements Iterrible<Integer> {

    protected Random random;
    protected int min;
    protected int max;
    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public MyIterator<Integer> iterator() {

        return new MyIterator<>() {
            @Override
            public Integer next() {
                return random.nextInt(min, max);
            }

            @Override
            public boolean hasNext() {
                return true;
            }
        };
    }
}
