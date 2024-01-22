package net.javaguides.registration.conroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.javaguides.registration.dao.StudentsDao;
import net.javaguides.registration.model.Students;

/**
 * @email Ramesh Fadatare
 */

@WebServlet("/register")
public class StudentsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private StudentsDao studentsDao;

    public void init() {
        studentsDao = new StudentsDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    response.getWriter().append("Served at: ").append(request.getContextPath());
      
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/studentsregiter.jsp");
        dispatcher.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String studentName = request.getParameter("studentName");
        String studentSurname = request.getParameter("studentSurname");
        String studentEmail = request.getParameter("studentEmail");
        String studentPassword = request.getParameter("studentPassword");
        String studentDegree = request.getParameter("studentDegree");

        Students students = new Students();
        students.setStudentName(studentName);
        students.setStudentSurname(studentSurname);
        students.setStudentEmail(studentEmail);
        students.setStudentPassword(studentPassword);
        students.setStudentDegree(studentDegree);

        try {
            studentsDao.registerStudents(students);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/studentsdetails.jsp");
        dispatcher.forward(request, response);
    }
}