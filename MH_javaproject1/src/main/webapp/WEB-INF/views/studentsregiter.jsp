<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<div>
    <h1>Students Register Form</h1>
    <form action="<%= request.getContextPath() %>/register" method="post">
        <table>
            <tr>
                <td>First Name</td>
                <td><label>
                    <input type="text" name="studentName">
                </label></td>
            </tr>
            <tr>
                <td>Last Name</td>
                <td><label>
                    <input type="text" name="studentSurname">
                </label></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><label>
                    <input type="text" name="studentEmail" />
                </label></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><label>
                    <input type="password" name="studentPassword" />
                </label></td>
            </tr>
            <tr>
                <td>Degree</td>
                <td><label>
                    <input type="text" name="studentDegree" />
                </label></td>
            </tr>
        </table>
        <input type="submit" value="Submit" />
    </form>
</div>
</body>
</html>