package Fibonacci;
/**
 * @author enayalaborn
 * @Version 1.1.1
 * @Date 31 May 2026
 * This class is a single-threaded implementation of the Fibonacci sequence, 
 * the purpose is a demonstration of which program would perform better? Please see class "FibonacciMulti"
 */
public class FibonacciMulti {

    public static void main(String[] args) {
        Thread t1 = new Thread(() {
            System.out.println("Thread1 doing work...");
        });

        Thread t2 = new Thread(() {
            System.out.println("Thread 2 doing work...");
        });

        t1.start(); 
        t2.start(); 

    }
    }

