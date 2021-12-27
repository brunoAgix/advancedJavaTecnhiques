package binaryOperations;

public final class Main {
    public static void main(String[] args) {
        BinaryOperation add = (a, b) -> a + b;
        System.out.println( add.apply(2, 3));
    }
}
