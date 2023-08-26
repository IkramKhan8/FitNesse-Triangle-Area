package org.example;

public class Main {
    public static void main(String[] args)
    {
        TriangleArea cp = new TriangleArea();
        cp.setBase(3.0);
        cp.setHeight(5.0);
        //cp.calculate();

        System.out.println(cp.calculate());
    }

}