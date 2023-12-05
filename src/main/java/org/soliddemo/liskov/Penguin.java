package org.soliddemo.liskov;

import java.io.UncheckedIOException;

public class Penguin extends Bird
{
    @Override
    public void fly()
    {
        throw new UnsupportedOperationException("Not Implemented the fly method");
        //System.out.println("Penguin cannot fly");
    }
}
