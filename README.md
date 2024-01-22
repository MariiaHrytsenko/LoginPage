1. Project Structure
   The project consists of the following main components:
   - Web Pages:
      - WEB-INF: A directory containing configuration files and application libraries.
         - lib: A directory containing application libraries (JAR), such as `mysql-connector-j-8.2.0.jar` and `mysql-connector-java-8.0.23.jar`.
         - Views: A directory containing JavaServer Pages (JSP) files, such as `studentsdetails.jsp` and `studentsregister.jsp`.
   - Source Packages:
      - net.javaguides.registration.controller: A package containing controllers, mainly `StudentsServlet.java`.
      - net.javaguides.registration.dao: A package containing the data access class, `StudentsDao.java`.
      - net.javaguides.registration.model: A package containing data models, such as `Students.java`, and utilities, e.g., `EmailValidator.java`.

2. Description of JSP Files
   - studentsdetails.jsp:
     - JSP file displaying information about a successful student registration.
   - studentsregister.jsp:
     - JSP file containing the registration form for students.

3. Description of Java Classes
   - StudentsServlet.java:
     - The main controller handling HTTP requests related to student registration.
     - Provides the registration form (`doGet`) and processes submitted data, saving it to the database (`doPost`).
   - StudentsDao.java:
     - Data access class responsible for communicating with the MySQL database.
     - Contains the `registerStudents` method, which adds a new student to the database.
   - Students.java:
     - Class representing a student object, with fields such as name, surname, email, password, and degree.

4. Database Configuration
   - The application uses a MySQL database.
   - Connection settings with the database are found in the `StudentsDao` class (`jdbc:mysql://localhost:3306/students?useSSL=false`, "root", "mh724257").

5. Running the Project
   - The application can be run on the Apache Tomcat server.
   - The registration form is accessible at `http://localhost:8080/register`.

6. Troubleshooting
   - If the application does not work correctly, check the browser's developer console and Tomcat server logs for potential errors.
   - After each successful login, you must change the second parameter in this case to 4 `preparedStatement.setInt(1, 4);` [row 25, Source Packages/net.javaguides.registration.dao/StudentsDao.java] - path to the specified line.
