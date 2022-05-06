package main;

import java.util.Arrays;

public class AQueue implements ArrayQueue {

    private int[] array;

    @Override
    public void create(int groesse) {
        int gr;
        if (groesse == 0) {
            gr = 10;
        } else {
            gr = Math.min(groesse, 99);
        }
        array = new int[gr];
    }

    @Override
    public boolean isEmpty() {
        boolean r = true;
        for (int j : array) {
            if (j != 0) {
                r = false;
                break;
            }
        }
        return r;
    }

    @Override
    public int remove() {
        int r = array[0];
        for (int i = 0; i < array.length; i++) {
            int b = 0;
            try {
                b = array[i + 1];
            } catch (ArrayIndexOutOfBoundsException e) {
                e.getMessage();
            }
            array[i] = b;
        }
        return r;
    }

    @Override
    public boolean add(int zahl) {
        boolean r = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                try {
                    array[i] = zahl;
                } catch (ArrayIndexOutOfBoundsException e) {
                    e.getMessage();
                }
                r = true;
                break;
            }
        }

        return r;
    }

    @Override
    public String show() {
        return Arrays.toString(array);
    }
}
