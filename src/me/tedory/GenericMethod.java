package me.tedory;

public class GenericMethod {

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3, 4};
        Character[] chaArr = {'a', 'b', 'c', 'd'};

        printMe(intArr);
        printMe(chaArr);

    }

    //Generic Method
    public static <T> void printMe(T[] a) {
        for (T b: a) {
            System.out.printf("%s ", b);
        }
        System.out.println();
    }
}
