package org.prem.tut.package_1;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Hello I  started ");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello I ended");
    }
}
