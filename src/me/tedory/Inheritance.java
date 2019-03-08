package me.tedory;

public class Inheritance extends Calculation {

    private void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: "+z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        Inheritance demo = new Inheritance();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
    }
}

class Calculation {
    int z;

    void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers: "+z);
    }

    void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers: "+z);
    }
}


