package org.soliddemo.liskov;

public class Parrot extends Bird
{
    @Override
    public void fly()
    {
        System.out.println("Parrot is flying");
    }
}
