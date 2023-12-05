package org.soliddemo.singleresponsibility.singleResponsibilityCorrectedCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository
{
    public void saveUser(User newUser)
    {
        String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, user, password))
        {

            String insertQuery = "INSERT INTO User (first_name, last_name, birth_date, nic_number) VALUES (?, ?, ?, ?)";

            // Create a prepared statement
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery))
            {

                // Set parameters for the prepared statement
                preparedStatement.setString(1, newUser.getFirstName());
                preparedStatement.setString(2, newUser.getLastName());
                preparedStatement.setDate(3,newUser.getBirthDate());
                preparedStatement.setLong(4, newUser.getNicNumber());

                // Execute the query
                preparedStatement.execute();

                System.out.println("Data saved successfully!");
            }

        } catch (SQLException e)
        {
            System.out.println("Exception has occurred while saving the User" + e);
        }
    }
}
