import java.io.*;
class Counter {
    static int count;
    Counter() {
        count++;
    }
    static void display() {
        System.out.println("count=" + count);
    }
}

class Static_methodex {
    public static void main(String args[]) {
        Counter c1 = new Counter();
        Counter.display();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter.display();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        Counter.display();
    }
} 
