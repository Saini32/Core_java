class Calculator {
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    void add(float a, float b) {
        System.out.println("Sum of two floats: " + (a + b));
    }

    void add(int a, int b, float c, float d) {
        System.out.println("Sum of two integers and two floats: " + (a + b + c + d));
    }
}

public class Method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5, 10);
        calc.add(1, 2, 3);
        calc.add(1.5f, 2.5f);
        calc.add(4, 5, 2.5f, 3.5f);
    }
}
