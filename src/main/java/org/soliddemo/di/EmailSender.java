package org.soliddemo.di;

public class EmailSender implements MessageSender
{
    @Override
    public void sendMessage(String message)
    {
        System.out.println(message);
    }
}
