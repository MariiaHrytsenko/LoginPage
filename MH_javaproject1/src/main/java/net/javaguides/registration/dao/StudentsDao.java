package net.javaguides.registration.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.javaguides.registration.model.Students;

public class StudentsDao {

    public int registerStudents(Students students) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO students" +
                "  (studentID, studentName, studentSurname, studentEmail, studentPassword, studentDegree) VALUES " +
                " (?, ?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

         try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/students?useSSL=false", "root", "mh724257");

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, students.getStudentName());
            preparedStatement.setString(3, students.getStudentSurname());
            preparedStatement.setString(4, students.getStudentEmail());
            preparedStatement.setString(5, students.getStudentPassword());
            preparedStatement.setString(6, students.getStudentDegree());

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return result;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}