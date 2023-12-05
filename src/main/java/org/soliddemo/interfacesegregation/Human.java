package org.soliddemo.interfacesegregation;

//public class Human implements Worker
//{
//    @Override
//    public void work() {
//        System.out.println("Human is working");
//    }
//
//    @Override
//    public void eat()
//    {
//        System.out.println("Human is eating");
//    }
//}

public class Human implements Workable,Eatable
{
    @Override
    public void work() {
        System.out.println("Human is working");
    }

    @Override
    public void eat()
    {
        System.out.println("Human is eating");
    }
}
