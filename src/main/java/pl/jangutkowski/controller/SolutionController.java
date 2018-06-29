package pl.jangutkowski.controller;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import pl.jangutkowski.model.Solution;
import java.util.List;

@WebServlet("/panel")
public class SolutionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
           List<Solution> solutions = Solution.loadAll();
           request.setAttribute("solutions",solutions);
           request.getRequestDispatcher("/solutions.jsp").forward(request,response);
        }catch (SQLException e){e.printStackTrace();}
    }
}
