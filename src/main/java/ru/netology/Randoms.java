package ru.netology;

import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        random = new Random();
    }

    public Random getRandom() {
        return random;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new Iterator(getMax() - getMin());
    }

    class Iterator implements java.util.Iterator<Integer> {
        int index;

        public Iterator(int index) {
            this.index = index;
        }

        @Override
        public boolean hasNext() {
            return index <= getMax();
        }

        @Override
        public Integer next() {
            return getRandom().nextInt(index + 1) + getMin();
        }
    }
}
