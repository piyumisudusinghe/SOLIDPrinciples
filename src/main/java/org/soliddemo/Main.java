package org.soliddemo;

import org.soliddemo.di.EmailSender;
import org.soliddemo.di.NotificationService;
import org.soliddemo.di.SMSSender;
import org.soliddemo.liskov.Bird;
import org.soliddemo.liskov.BirdUtil;
import org.soliddemo.liskov.Parrot;
import org.soliddemo.liskov.Penguin;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Liskov Substitution Principle code
//        Bird bird = new Bird();
//        Parrot parrot = new Parrot();
//        Penguin penguin = new Penguin();
//
//        BirdUtil.makeBirdFly(bird);
//        BirdUtil.makeBirdFly(parrot);
//        BirdUtil.makeBirdFly(penguin);


        //Dependency Inversion Principle code
        EmailSender emailSender = new EmailSender();
        SMSSender smsSender = new SMSSender();

        NotificationService notificationService1 = new NotificationService(emailSender);
        notificationService1.sendNotification("sending an email");

        NotificationService notificationService2 = new NotificationService(smsSender);
        notificationService2.sendNotification("sending a SMS");

    }
}