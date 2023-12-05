package org.soliddemo.di;

public class NotificationService
{
//    private EmailSender emailSender;
//    private SMSSender smsSender;
//
//    public NotificationService() {
//        this.emailSender = new EmailSender();
//        this.smsSender = new SMSSender();
//    }
//
//    public void sendSMSNotification(String message) {
//        smsSender.sendMessage(message);
//    }
//
//    public void sendEmailNotification(String message) {
//        emailSender.sendMessage(message);
//    }

    private  MessageSender messageSender;

    public NotificationService(MessageSender messageSender)
    {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message)
    {
        this.messageSender.sendMessage(message);
    }
}
