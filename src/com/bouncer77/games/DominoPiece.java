package com.bouncer77.games;

/**
 * Костяшка домино расположенная в порядке возрастания поле
 * Т.е. значение поля a всегда меньше значения поля b
 * */
public class DominoPiece {

    private final int a;
    private final int b;

    public DominoPiece(int a, int b) {
        if (a < b) {
            this.a = a;
            this.b = b;
        } else {
            this.a = b;
            this.b = a;
        }

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DominoPiece that = (DominoPiece) o;

        if (a != that.a) return false;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }
}
