package org.soliddemo.singleresponsibility;

import java.sql.*;


public class User {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private long nicNumber;
    private String username;
    private String password;

    public boolean authenticateUSer(String userName, String pwd)
    {
        return this.username.equals(userName) && this.password.equals(pwd);
    }

    public void saveUser()
    {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, user, password)){

            String insertQuery = "INSERT INTO User (first_name, last_name, birth_date, nic_number) VALUES (?, ?, ?, ?)";

            // Create a prepared statement
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {

                // Set parameters for the prepared statement
                preparedStatement.setString(1, firstName);
                preparedStatement.setString(2, lastName);
                preparedStatement.setDate(3,birthDate);
                preparedStatement.setLong(4, nicNumber);

                // Execute the query
                preparedStatement.execute();

                System.out.println("Data saved successfully!");
            }

        } catch (SQLException e) {
            System.out.println("Exception has occurred while saving the User" + e);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public long getNicNumber() {
        return nicNumber;
    }

    public void setNicNumber(long nicNumber) {
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
