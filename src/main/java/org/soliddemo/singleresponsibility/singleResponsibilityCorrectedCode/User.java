package org.soliddemo.singleresponsibility.singleResponsibilityCorrectedCode;

import java.sql.Date;

public class User
{

    private String firstName;
    private String lastName;
    private Date birthDate;
    private long nicNumber;
    private String username;
    private String password;

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public long getNicNumber()
    {
        return nicNumber;
    }

    public void setNicNumber(long nicNumber)
    {
        this.nicNumber = nicNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
