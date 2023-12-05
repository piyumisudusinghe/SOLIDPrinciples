package org.soliddemo.singleresponsibility.singleResponsibilityCorrectedCode;

public class UserAuthenticator
{
    public boolean authenticateUSer(User user, String userName, String pwd)
    {
        return user.getUsername().equals(userName) && user.getPassword().equals(pwd);
    }
}
