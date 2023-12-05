package org.soliddemo.interfacesegregation;

//public class Robot implements Worker{
//    @Override
//    public void work()
//    {
//        System.out.println("Robot is working");
//    }
//
//    @Override
//    public void eat()
//    {
//        System.out.println("Robot is eating");
//    }
//}

public class Robot implements Workable
{
    @Override
    public void work()
    {
        System.out.println("Robot is working");
    }
}
